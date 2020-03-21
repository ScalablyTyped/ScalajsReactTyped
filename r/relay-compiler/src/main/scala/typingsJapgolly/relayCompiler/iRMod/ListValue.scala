package typingsJapgolly.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListValue
  extends ArgumentValue
     with IR {
  var items: js.Array[ArgumentValue]
  var kind: typingsJapgolly.relayCompiler.relayCompilerStrings.ListValue
  var loc: Location
  var metadata: Metadata
}

object ListValue {
  @scala.inline
  def apply(
    items: js.Array[ArgumentValue],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.ListValue,
    loc: Location,
    metadata: Metadata = null
  ): ListValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListValue]
  }
}

