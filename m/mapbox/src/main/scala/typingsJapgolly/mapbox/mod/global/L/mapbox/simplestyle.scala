package typingsJapgolly.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//////////////////////////////////////////////////////////////////////
////////////////////////////// SIMPLESTYLE ///////////////////////////
//////////////////////////////////////////////////////////////////////
object simplestyle {
  
  @JSGlobal("L.mapbox.simplestyle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Given a GeoJSON Feature with optional simplestyle-spec properties, return an options object formatted to be used as Leaflet Path options.
    */
  inline def style(feature: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(feature.asInstanceOf[js.Any]).asInstanceOf[Any]
}
