package typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationCondition
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientComponent
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientExtension
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationDefer
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationField
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationFlightField
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationFragmentSpread
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationHandle
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationInlineFragment
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationModuleImport
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationActorChange
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationTypeDiscriminator
*/
trait NormalizationSelection extends StObject
object NormalizationSelection {
  
  inline def NormalizationActorChange(kind: String, linkedField: NormalizationLinkedField): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationActorChange = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], linkedField = linkedField.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationActorChange]
  }
  
  inline def NormalizationClientComponent(fragment: NormalizationNode, kind: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientComponent = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationClientComponent]
  }
  
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
  
  inline def NormalizationFlightField(kind: String, name: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationFlightField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationFlightField]
  }
  
  inline def NormalizationFragmentSpread(fragment: NormalizationSplitOperation, kind: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationFragmentSpread = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationFragmentSpread]
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
  
  inline def NormalizationLinkedHandle(handle: String, key: String, kind: String, name: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedHandle]
  }
  
  inline def NormalizationModuleImport(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationModuleImport]
  }
  
  inline def NormalizationScalarField(kind: String, name: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarField]
  }
  
  inline def NormalizationScalarHandle(handle: String, key: String, kind: String, name: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarHandle]
  }
  
  inline def NormalizationStream(kind: String, label: String, selections: js.Array[NormalizationSelection]): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationStream]
  }
  
  inline def NormalizationTypeDiscriminator(abstractKey: String, kind: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationTypeDiscriminator = {
    val __obj = js.Dynamic.literal(abstractKey = abstractKey.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationTypeDiscriminator]
  }
}
