package typingsJapgolly.geolib

import typingsJapgolly.geolib.anon.Latitude
import typingsJapgolly.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetCenterOfBoundsMod {
  
  @JSImport("geolib/es/getCenterOfBounds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(coords: js.Array[GeolibInputCoordinates]): Latitude = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(coords.asInstanceOf[js.Any]).asInstanceOf[Latitude]
}
