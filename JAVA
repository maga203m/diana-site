function showTime() {
    document.getElementById('currentTime').innerHTML =
        new Date().toLocaleTimeString("ru-RU", {
            timeZone: "Asia/Tashkent"
        });
}

showTime();

setInterval(function () {
    showTime();
}, 1000);
