package typingsJapgolly.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cipher extends js.Object {
  /**
    * The name of the cipher.
    */
  var Name: js.UndefOr[CipherName] = js.native
  /**
    * The priority of the cipher.
    */
  var Priority: js.UndefOr[CipherPriority] = js.native
}

object Cipher {
  @scala.inline
  def apply(Name: CipherName = null, Priority: Int | Double = null): Cipher = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cipher]
  }
}

