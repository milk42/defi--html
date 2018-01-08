
window.onload = function ()
{
	console.log('carousel init ok');
    $('.carousel').carousel();
};




/*INDEX JAVASCRIPT GOOGLE*/

function regular_map() {
    var var_location = new google.maps.LatLng(45.382062, 6.721232);

    var var_mapoptions = {
        center: var_location,
        zoom: 14
    };

    var var_map = new google.maps.Map(document.getElementById("map-container-5"),
        var_mapoptions);

    var var_marker = new google.maps.Marker({
        position: var_location,
        map: var_map,
        title: "New York"
    });
}

// Custom map
function custom_map() {

    var var_location = new google.maps.LatLng(45.382062, 6.721232);

    var var_mapoptions = {
        center: var_location,
        zoom: 14,
        styles: [
            {
                "featureType": "administrative",
                "elementType": "all",
                "stylers": [
                    {
                        "visibility": "off"
                    }
                ]
            },
            {
                "featureType": "poi",
                "elementType": "all",
                "stylers": [
                    {
                        "visibility": "simplified"
                    }
                ]
            },
            {
                "featureType": "road",
                "elementType": "all",
                "stylers": [
                    {
                        "visibility": "simplified"
                    }
                ]
            },
            {
                "featureType": "water",
                "elementType": "all",
                "stylers": [
                    {
                        "visibility": "simplified"
                    }
                ]
            },
            {
                "featureType": "transit",
                "elementType": "all",
                "stylers": [
                    {
                        "visibility": "simplified"
                    }
                ]
            },
            {
                "featureType": "landscape",
                "elementType": "all",
                "stylers": [
                    {
                        "visibility": "simplified"
                    }
                ]
            },
            {
                "featureType": "road.highway",
                "elementType": "all",
                "stylers": [
                    {
                        "visibility": "off"
                    }
                ]
            },
            {
                "featureType": "road.local",
                "elementType": "all",
                "stylers": [
                    {
                        "visibility": "on"
                    }
                ]
            },
            {
                "featureType": "road.highway",
                "elementType": "geometry",
                "stylers": [
                    {
                        "visibility": "on"
                    }
                ]
            },
            {
                "featureType": "road.arterial",
                "elementType": "all",
                "stylers": [
                    {
                        "visibility": "off"
                    }
                ]
            },
            {
                "featureType": "water",
                "elementType": "all",
                "stylers": [
                    {
                        "color": "#5f94ff"
                    },
                    {
                        "lightness": 26
                    },
                    {
                        "gamma": 5.86
                    }
                ]
            },
            {
                "featureType": "road.highway",
                "elementType": "all",
                "stylers": [
                    {
                        "weight": 0.6
                    },
                    {
                        "saturation": -85
                    },
                    {
                        "lightness": 61
                    }
                ]
            },
            {
                "featureType": "landscape",
                "elementType": "all",
                "stylers": [
                    {
                        "hue": "#0066ff"
                    },
                    {
                        "saturation": 74
                    },
                    {
                        "lightness": 100
                    }
                ]
            }
        ]
    };

    var var_map = new google.maps.Map(document.getElementById("map-container-6"),
        var_mapoptions);

    var var_marker = new google.maps.Marker({
        position: var_location,
        map: var_map,
        title: "New York"
    });
}

google.maps.event.addDomListener(window, 'load', regular_map);
google.maps.event.addDomListener(window, 'load', custom_map);


/*REGION*/


/* Initialize tooltip component*/
$(function () {
  $('[data-toggle="tooltip"]').tooltip()
})


/*fin REGION*/


/*FORMULAIRE*/
/*Fonction CALCULER JAVASCRIPT*/
       
//            var patinoire = document.getElementById("patinoire");
//
//            function Calculer(){
//                document.formulaire.retour_calcul.data-price = patinoire.data-price;
//                /*condition pour recupérer uniquement les éléments cochés*/
//
//            }

        
            
            
			   /*script date*/
			  
			      $(document).ready(function(){
			        var date_input=$('input[name="dateDepart"]'); /*our date input has the name "date"*/
			        var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
			        var options={
			          format: 'dd/mm/yyyy',
			          container: container,
			          todayHighlight: true,
			          autoclose: true,
			        };
			        dateDepart_input.datepicker(options);
			      })  
			 
/*fin  FORMULAIRE*/		      
