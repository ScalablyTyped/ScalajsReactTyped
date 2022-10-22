package typingsJapgolly.geolib

import typingsJapgolly.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esIsPointInLineMod {
  
  @JSImport("geolib/es/isPointInLine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(point: GeolibInputCoordinates, lineStart: GeolibInputCoordinates, lineEnd: GeolibInputCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], lineStart.asInstanceOf[js.Any], lineEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
