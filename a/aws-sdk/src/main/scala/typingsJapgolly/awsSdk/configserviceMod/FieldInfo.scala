package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldInfo extends js.Object {
  /**
    * Name of the field.
    */
  var Name: js.UndefOr[FieldName] = js.native
}

object FieldInfo {
  @scala.inline
  def apply(Name: FieldName = null): FieldInfo = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfo]
  }
}

