package typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientExtension
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationCondition
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationInlineFragment
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream
*/
trait NormalizationNode extends StObject
object NormalizationNode {
  
  inline def NormalizationClientExtension(kind: String, selections: js.Array[NormalizationSelection]): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientExtension]
  }
  
  inline def NormalizationCondition(
    condition: String,
    kind: String,
    passingValue: Boolean,
    selections: js.Array[NormalizationSelection]
  ): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationCondition]
  }
  
  inline def NormalizationDefer(kind: String, label: String, selections: js.Array[NormalizationSelection]): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer]
  }
  
  inline def NormalizationInlineFragment(kind: String, selections: js.Array[NormalizationSelection], `type`: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationInlineFragment]
  }
  
  inline def NormalizationLinkedField(kind: String, name: String, plural: Boolean, selections: js.Array[NormalizationSelection]): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField]
  }
  
  inline def NormalizationOperation(
    argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation]
  }
  
  inline def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation]
  }
  
  inline def NormalizationStream(kind: String, label: String, selections: js.Array[NormalizationSelection]): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream]
  }
}
