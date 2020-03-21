package typingsJapgolly.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyUsage extends js.Object {
  /**
    * A string value that contains a Key Usage extension name.
    */
  var Name: js.UndefOr[KeyUsageName] = js.native
}

object KeyUsage {
  @scala.inline
  def apply(Name: KeyUsageName = null): KeyUsage = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyUsage]
  }
}

