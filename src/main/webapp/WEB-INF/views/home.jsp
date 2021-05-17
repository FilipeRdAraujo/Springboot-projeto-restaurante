<%@ page contentType="text/html; charset=UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ page isELIgnored="false" %>

            <!DOCTYPE html>
            <html lang="pt-br">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">

                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
                    integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
                    crossorigin="anonymous">
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
                    crossorigin="anonymous"></script>
                <script src="https://kit.fontawesome.com/6697f5eca6.js" crossorigin="anonymous"></script>

                <link rel="stylesheet" href="assets/css/style.css">
                <title>Home</title>
            </head>

            <body>
                <div class="container-fluid">
                    <nav id="nav" class="nav raleway-font d-grid">
                        <a class="nav-item" href="">HOME</a>
                        <a class="nav-item" href="">ABOUT</a>
                        <a id="nav-brand" class="nav-brand" href="#">
                            <img src="assets/svg/logo.svg" alt="">
                        </a>
                        <a class="nav-item" href="">MENU</a>
                        <a class="nav-item" href="">CONTACT</a>
                    </nav>
                    <header id="header" class="row">
                        <div class="col-md d-grid vh-80 text-light text-center">
                            <div class="grid-center">
                                <h1 class="cursive-font">A Generic Restaurant</h1>
                                <p class="raleway-font">YEAH IT'S PRETTY GENERIC</p>
                            </div>
                        </div>
                    </header>
                    <section class="row vh-20"></section>
                    <section class="row">
                        <div class="col-md raleway-font text-center p-5">
                            <h2>About</h2>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quis consequuntur earum
                                reprehenderit veniam
                                voluptatum nobis eligendi, voluptate facere inventore assumenda quas minima voluptas est
                                nesciunt
                                rerum nisi dolore illum ab.</p>
                            <div id="about-cards" class="d-grid">
                                <div>
                                    <i class="fas fa-seedling"></i>
                                    <h3 class="mt-3">Healthy</h3>
                                    <p>We have options for each type of customer, both for those who like fried food and
                                        for those
                                        who want to lead a healthier life.</p>
                                </div>
                                <div>
                                    <i class="fas fa-hands-wash"></i>
                                    <h3 class="mt-3">Always clean</h3>
                                    <p>From the plates to the tables, we keep our cutlery and the like very clean.</p>
                                </div>
                                <div>
                                    <i class="fas fa-shipping-fast"></i>
                                    <h3 class="mt-3">Fast shipping</h3>
                                    <p>We have the best and fastest shipping, your food will arrive warm as if it were
                                        out of the
                                        oven.</p>
                                </div>
                            </div>
                        </div>
                    </section>
                    <section class="row vh-20"></section>
                    <section class="row">
                        <div class="col-md raleway-font p-5">
                            <div class="text-center">
                                <h2>Menu</h2>
                                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Provident sed ea
                                    dignissimos excepturi laborum natus a consequatur delectus beatae reprehenderit iste
                                    dicta
                                    corrupti
                                    repellat, vero explicabo quas tenetur voluptates minima?</p>
                            </div>
                            <div class="card-columns">
                                <c:forEach items="${categories}" var="category">
                                    <div style="background: linear-gradient(90deg, #91684a, #493323);"
                                        class="card mb-3 text-white">
                                        <img class="card-img card-style"
                                            src="${category.strCategoryThumb}" alt="Card category image">
                                        <div class="card-img-overlay">
                                            <h5 class="card-title text-card-shadow">${category.strCategory}</h5>
                                            <p class="card-text text-card-shadow">${category.strCategoryDescription}</p>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>

                        <!-- <div class="col-md">
                <div id="carousel-1" class="carousel slide" data-bs-ride="carousel">
                    <div class="carousel-indicators">
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0"
                            class="active" aria-current="true" aria-label="Slide 1"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
                            aria-label="Slide 2"></button>
                    </div>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="http://www.bombaybrasseriebirmingham.co.uk/wp-content/uploads/2014/05/indian-food-served-on-table.jpg"
                                class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="https://pickyourtrail.com/blog/wp-content/uploads/2020/05/ultimatebali.jpg"
                                class="d-block w-100" alt="...">
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
                        data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
                        data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button>
                </div>
            </div> -->
                    </section>
                    <section class="row vh-20"></section>
                    <section class="row">
                        <div class="col-md raleway-font p-5">
                            <h2>Contact</h2>
                            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Iusto cum ratione deserunt,
                                nemo aliquam
                                aliquid mollitia maxime commodi eos sequi. Explicabo, mollitia ipsa velit corporis nulla
                                culpa ut
                                esse unde!</p>
                        </div>
                        <div class="col-md raleway-font p-5">
                            <h2>Form</h2>
                            <div class="form-group mb-3">
                                <label for="exampleInputEmail1">Email address</label>
                                <input type="email" class="form-control" id="exampleInputEmail1"
                                    aria-describedby="emailHelp" placeholder="Enter email">
                            </div>
                            <div class="form-group mb-3">
                                <label for="exampleInputPassword1">Message</label>
                                <!-- <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"> -->
                                <textarea style="max-height: 120px;" name="textarea" id="inputtextarea"
                                    class="form-control" cols="30" rows="10"></textarea>
                            </div>
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </section>
                    <section class="row vh-20"></section>
                    <section id="footer-wave" class="row">
                        <div class="col-md p-5"></div>
                    </section>
                    <footer id="footer" class="row">
                        <div class="col-md raleway-font text-light p-5">
                            <h2>Footer aqui :D</h2>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis minima molestias
                                eligendi vero
                                perspiciatis neque magnam nesciunt ad id qui velit eaque quae perferendis, animi
                                temporibus
                                consequatur obcaecati commodi sed?</p>
                        </div>
                    </footer>
                </div>
                <script src="assets/js/carousel.js"></script>
                <script src="assets/js/navbar.js"></script>
            </body>

            </html>