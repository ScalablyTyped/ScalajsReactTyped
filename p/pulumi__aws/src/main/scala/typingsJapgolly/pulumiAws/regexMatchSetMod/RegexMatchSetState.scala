package typingsJapgolly.pulumiAws.regexMatchSetMod

import typingsJapgolly.pulumiAws.inputMod.wafregional.RegexMatchSetRegexMatchTuple
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexMatchSetState extends js.Object {
  /**
    * The name or description of the Regex Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The regular expression pattern that you want AWS WAF to search for in web requests,
    * the location in requests that you want AWS WAF to search, and other settings. See below.
    */
  val regexMatchTuples: js.UndefOr[Input[js.Array[Input[RegexMatchSetRegexMatchTuple]]]] = js.native
}

object RegexMatchSetState {
  @scala.inline
  def apply(
    name: Input[String] = null,
    regexMatchTuples: Input[js.Array[Input[RegexMatchSetRegexMatchTuple]]] = null
  ): RegexMatchSetState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regexMatchTuples != null) __obj.updateDynamic("regexMatchTuples")(regexMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchSetState]
  }
}

