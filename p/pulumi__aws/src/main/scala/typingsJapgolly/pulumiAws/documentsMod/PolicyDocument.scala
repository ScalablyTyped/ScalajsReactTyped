package typingsJapgolly.pulumiAws.documentsMod

import typingsJapgolly.pulumiAws.pulumiAwsStrings.`2008-10-17`
import typingsJapgolly.pulumiAws.pulumiAwsStrings.`2012-10-17`
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDocument extends js.Object {
  var Id: js.UndefOr[Input[String]] = js.native
  var Statement: Input[js.Array[Input[PolicyStatement]]] = js.native
  var Version: Input[`2008-10-17` | `2012-10-17`] = js.native
}

object PolicyDocument {
  @scala.inline
  def apply(
    Statement: Input[js.Array[Input[PolicyStatement]]],
    Version: Input[`2008-10-17` | `2012-10-17`],
    Id: Input[String] = null
  ): PolicyDocument = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDocument]
  }
}

