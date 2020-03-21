package typingsJapgolly.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateExitedEventDetails extends js.Object {
  /**
    * The name of the state. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: Name = js.native
  /**
    * The JSON output data of the state.
    */
  var output: js.UndefOr[SensitiveData] = js.native
}

object StateExitedEventDetails {
  @scala.inline
  def apply(name: Name, output: SensitiveData = null): StateExitedEventDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateExitedEventDetails]
  }
}

