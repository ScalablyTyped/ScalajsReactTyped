package typingsJapgolly.relayCompiler.iRMod

import typingsJapgolly.relayCompiler.schemaMod.TypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayCompiler.iRMod.ListValue
  - typingsJapgolly.relayCompiler.iRMod.Literal
  - typingsJapgolly.relayCompiler.iRMod.ObjectValue
  - typingsJapgolly.relayCompiler.iRMod.Variable
*/
trait ArgumentValue extends js.Object

object ArgumentValue {
  @scala.inline
  def ListValue(
    items: js.Array[ArgumentValue],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.ListValue,
    loc: Location,
    metadata: Metadata = null
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
  @scala.inline
  def Literal(kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Literal, loc: Location, value: js.Any): ArgumentValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArgumentValue]
  }
  @scala.inline
  def ObjectValue(
    fields: js.Array[ObjectFieldValue],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.ObjectValue,
    loc: Location
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArgumentValue]
  }
  @scala.inline
  def Variable(
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Variable,
    loc: Location,
    variableName: String,
    `type`: TypeID = null
  ): ArgumentValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentValue]
  }
}

