package typingsJapgolly.minappEnv.anon

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.minappEnv.DB.GeoPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call
  extends StObject
     with Instantiable2[/* longitude */ Double, /* latitide */ Double, GeoPoint] {
  
  def apply(longitude: Double, latitide: Double): GeoPoint = js.native
}
