var prevScrollpos = window.pageYOffset;
let navElement = document.getElementById("nav");
function updateNav() {
  var currentScrollPos = window.pageYOffset;
  console.log(currentScrollPos);
  if (currentScrollPos >= 230) {
    navElement.style = "background-color: var(--nav-dark); color: var(--nav-link) !important;";
  } else {
    navElement.style = "background-color: transparent; color: whitesmoke !important;";
  }
  prevScrollpos = currentScrollPos;
}

window.addEventListener('load', updateNav);
window.addEventListener('scroll', updateNav);
// window.onload = updateNav();
// window.onscroll = updateNav();



