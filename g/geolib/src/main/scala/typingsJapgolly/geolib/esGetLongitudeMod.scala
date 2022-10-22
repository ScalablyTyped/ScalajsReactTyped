package typingsJapgolly.geolib

import typingsJapgolly.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetLongitudeMod {
  
  @JSImport("geolib/es/getLongitude", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(point: GeolibInputCoordinates): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default(point: GeolibInputCoordinates, raw: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[Any]
}
