package typingsJapgolly.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValue extends js.Object {
  /**
    * The unique identifier of a key value pair.
    */
  var Key: js.UndefOr[XmlString] = js.native
  /**
    * The value part of the identified key.
    */
  var Value: js.UndefOr[XmlString] = js.native
}

object KeyValue {
  @scala.inline
  def apply(Key: XmlString = null, Value: XmlString = null): KeyValue = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValue]
  }
}

