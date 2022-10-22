package typingsJapgolly.relayRuntime.libUtilReaderNodeMod

import typingsJapgolly.relayRuntime.anon.FragmentRefs
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderCondition
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderClientEdge
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderClientExtension
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderDefer
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderField
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderActorChange
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFlightField
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragmentSpread
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragmentSpread
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineFragment
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderModuleImport
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderStream
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRequiredField
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRelayResolver
*/
trait ReaderSelection extends StObject
object ReaderSelection {
  
  inline def ReaderActorChange(fragmentSpread: ReaderFragmentSpread, kind: String, name: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderActorChange = {
    val __obj = js.Dynamic.literal(fragmentSpread = fragmentSpread.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderActorChange]
  }
  
  inline def ReaderClientEdge(
    backingField: ReaderRelayResolver | ReaderClientExtension,
    kind: String,
    linkedField: ReaderLinkedField,
    operation: ConcreteRequest
  ): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderClientEdge = {
    val __obj = js.Dynamic.literal(backingField = backingField.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], linkedField = linkedField.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderClientEdge]
  }
  
  inline def ReaderClientExtension(kind: String, selections: js.Array[ReaderSelection]): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderClientExtension]
  }
  
  inline def ReaderCondition(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderCondition]
  }
  
  inline def ReaderDefer(kind: String, selections: js.Array[ReaderSelection]): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderDefer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderDefer]
  }
  
  inline def ReaderFlightField(kind: String, name: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFlightField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFlightField]
  }
  
  inline def ReaderFragmentSpread(kind: String, name: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragmentSpread]
  }
  
  inline def ReaderInlineDataFragmentSpread(kind: String, name: String, selections: js.Array[ReaderSelection]): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragmentSpread]
  }
  
  inline def ReaderInlineFragment(kind: String, selections: js.Array[ReaderSelection], `type`: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderInlineFragment]
  }
  
  inline def ReaderLinkedField(kind: String, name: String, plural: Boolean, selections: js.Array[ReaderSelection]): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderLinkedField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderLinkedField]
  }
  
  inline def ReaderModuleImport(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderModuleImport]
  }
  
  inline def ReaderRelayResolver(fragment: ReaderFragmentSpread, kind: String, name: String, resolverModule: FragmentRefs => Any): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRelayResolver = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolverModule = js.Any.fromFunction1(resolverModule))
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRelayResolver]
  }
  
  inline def ReaderRequiredField(action: RequiredFieldAction, field: ReaderField, kind: String, path: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRequiredField = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRequiredField]
  }
  
  inline def ReaderScalarField(kind: String, name: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderScalarField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderScalarField]
  }
  
  inline def ReaderStream(kind: String, selections: js.Array[ReaderSelection]): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderStream]
  }
}
