package typingsJapgolly.leafletAwesomeMarkers

import typingsJapgolly.leaflet.mod.BaseIconOptions
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.black
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.blue
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.cadetblue
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkgreen
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkpurple
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkred
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.fa
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.glyphicon
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.green
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.orange
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.purple
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.red
import typingsJapgolly.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object AwesomeMarkers {
    
    @JSImport("leaflet", "AwesomeMarkers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leaflet", "AwesomeMarkers.Icon")
    @js.native
    open class Icon_ ()
      extends typingsJapgolly.leaflet.mod.Icon_[AwesomeMarkersIconOptions] {
      def this(options: AwesomeMarkersIconOptions) = this()
    }
    
    inline def icon(options: AwesomeMarkersIconOptions): Icon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("icon")(options.asInstanceOf[js.Any]).asInstanceOf[Icon_]
    
    @JSImport("leaflet", "AwesomeMarkers.version")
    @js.native
    val version: String = js.native
    
    trait AwesomeMarkersIconOptions
      extends StObject
         with BaseIconOptions {
      
      /**
        * Additional classes in the created tag
        */
      var extraClasses: js.UndefOr[String] = js.undefined
      
      /**
        * Name of the icon. See glyphicons or font-awesome.
        */
      var icon: js.UndefOr[String] = js.undefined
      
      /**
        * Color of the icon. 'white', 'black' or css code (hex, rgba etc).
        */
      var iconColor: js.UndefOr[white | black | String] = js.undefined
      
      /**
        * Color of the marker
        */
      var markerColor: js.UndefOr[
            red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue
          ] = js.undefined
      
      /**
        * Select de icon library. 'fa' for font-awesome or 'glyphicon' for bootstrap 3.
        */
      var prefix: js.UndefOr[fa | glyphicon] = js.undefined
      
      /**
        * Make the icon spin. true or false. Font-awesome required
        */
      var spin: js.UndefOr[Boolean] = js.undefined
    }
    object AwesomeMarkersIconOptions {
      
      inline def apply(): AwesomeMarkersIconOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AwesomeMarkersIconOptions]
      }
      
      extension [Self <: AwesomeMarkersIconOptions](x: Self) {
        
        inline def setExtraClasses(value: String): Self = StObject.set(x, "extraClasses", value.asInstanceOf[js.Any])
        
        inline def setExtraClassesUndefined: Self = StObject.set(x, "extraClasses", js.undefined)
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconColor(value: white | black | String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
        
        inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setMarkerColor(value: red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
        
        inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
        
        inline def setPrefix(value: fa | glyphicon): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
        
        inline def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      }
    }
  }
}
