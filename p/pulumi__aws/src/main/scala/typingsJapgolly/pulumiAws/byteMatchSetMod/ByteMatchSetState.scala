package typingsJapgolly.pulumiAws.byteMatchSetMod

import typingsJapgolly.pulumiAws.inputMod.wafregional.ByteMatchSetByteMatchTuple
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSetState extends js.Object {
  /**
    * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
    */
  val byteMatchTuples: js.UndefOr[Input[js.Array[Input[ByteMatchSetByteMatchTuple]]]] = js.native
  /**
    * The name or description of the ByteMatchSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ByteMatchSetState {
  @scala.inline
  def apply(
    byteMatchTuples: Input[js.Array[Input[ByteMatchSetByteMatchTuple]]] = null,
    name: Input[String] = null
  ): ByteMatchSetState = {
    val __obj = js.Dynamic.literal()
    if (byteMatchTuples != null) __obj.updateDynamic("byteMatchTuples")(byteMatchTuples.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetState]
  }
}

