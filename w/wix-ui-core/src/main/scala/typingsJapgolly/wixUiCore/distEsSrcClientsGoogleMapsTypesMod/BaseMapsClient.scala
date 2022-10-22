package typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseMapsClient[GeocodeResult] extends StObject {
  
  def autocomplete(apiKey: String, lang: String, request: Any): js.Promise[js.Array[Address]] = js.native
  def autocomplete(apiKey: String, lang: String, request: Any, instance: String): js.Promise[js.Array[Address]] = js.native
  
  def geocode(apiKey: String, lang: String, request: Any): js.Promise[js.Array[GeocodeResult]] = js.native
  def geocode(apiKey: String, lang: String, request: Any, instance: String): js.Promise[js.Array[GeocodeResult]] = js.native
  
  var name: String = js.native
}
