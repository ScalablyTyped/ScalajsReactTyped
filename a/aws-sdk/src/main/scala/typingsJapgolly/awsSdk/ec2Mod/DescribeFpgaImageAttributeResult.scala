package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFpgaImageAttributeResult extends js.Object {
  /**
    * Information about the attribute.
    */
  var FpgaImageAttribute: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.FpgaImageAttribute] = js.native
}

object DescribeFpgaImageAttributeResult {
  @scala.inline
  def apply(FpgaImageAttribute: FpgaImageAttribute = null): DescribeFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (FpgaImageAttribute != null) __obj.updateDynamic("FpgaImageAttribute")(FpgaImageAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFpgaImageAttributeResult]
  }
}

