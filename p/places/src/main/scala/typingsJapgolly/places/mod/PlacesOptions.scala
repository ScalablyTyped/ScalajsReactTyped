package typingsJapgolly.places.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacesOptions extends js.Object {
  var apiKey: String
  var appId: String
  var container: String | HTMLInputElement | NodeList | Element
}

object PlacesOptions {
  @scala.inline
  def apply(apiKey: String, appId: String, container: String | HTMLInputElement | NodeList | Element): PlacesOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlacesOptions]
  }
}

