package typingsJapgolly.pulumiAws.xssMatchSetMod

import typingsJapgolly.pulumiAws.inputMod.wafregional.XssMatchSetXssMatchTuple
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XssMatchSetArgs extends js.Object {
  /**
    * The name of the set
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The parts of web requests that you want to inspect for cross-site scripting attacks.
    */
  val xssMatchTuples: js.UndefOr[Input[js.Array[Input[XssMatchSetXssMatchTuple]]]] = js.native
}

object XssMatchSetArgs {
  @scala.inline
  def apply(
    name: Input[String] = null,
    xssMatchTuples: Input[js.Array[Input[XssMatchSetXssMatchTuple]]] = null
  ): XssMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (xssMatchTuples != null) __obj.updateDynamic("xssMatchTuples")(xssMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetArgs]
  }
}

