package typingsJapgolly.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPropertyEvent extends js.Object {
  var feature: Feature
  var name: String
  var newValue: js.Any
  var oldValue: js.Any
}

object SetPropertyEvent {
  @scala.inline
  def apply(feature: Feature, name: String, newValue: js.Any, oldValue: js.Any): SetPropertyEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetPropertyEvent]
  }
}

