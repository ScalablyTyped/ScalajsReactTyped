package typingsJapgolly.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationLiteral
  - typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationVariable
*/
trait NormalizationArgument extends js.Object

object NormalizationArgument {
  @scala.inline
  def NormalizationLiteral(kind: String, name: String, value: js.Any, `type`: String = null): NormalizationArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationArgument]
  }
  @scala.inline
  def NormalizationVariable(kind: String, name: String, variableName: String, `type`: String = null): NormalizationArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationArgument]
  }
}

