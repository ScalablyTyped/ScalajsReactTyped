package typingsJapgolly.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limit extends js.Object {
  /**
    * The maximum value of the limit.
    */
  var Max: js.UndefOr[typingsJapgolly.awsSdk.elbMod.Max] = js.native
  /**
    * The name of the limit. The possible values are:   classic-listeners   classic-load-balancers   classic-registered-instances  
    */
  var Name: js.UndefOr[typingsJapgolly.awsSdk.elbMod.Name] = js.native
}

object Limit {
  @scala.inline
  def apply(Max: Max = null, Name: Name = null): Limit = {
    val __obj = js.Dynamic.literal()
    if (Max != null) __obj.updateDynamic("Max")(Max.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

