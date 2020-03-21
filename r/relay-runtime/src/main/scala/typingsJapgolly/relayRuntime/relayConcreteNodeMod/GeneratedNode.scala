package typingsJapgolly.relayRuntime.relayConcreteNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.AnonConnection
import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationOperation
import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationSelection
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderArgumentDefinition
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.readerNodeMod.ReaderSelection
import typingsJapgolly.relayRuntime.relayRuntimeStrings.InlineDataFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest
  - typingsJapgolly.relayRuntime.readerNodeMod.ReaderFragment
  - typingsJapgolly.relayRuntime.readerNodeMod.ReaderInlineDataFragment
  - typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
*/
trait GeneratedNode extends js.Object

object GeneratedNode {
  @scala.inline
  def ConcreteRequest(
    fragment: ReaderFragment,
    kind: String,
    operation: NormalizationOperation,
    params: RequestParameters
  ): GeneratedNode = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneratedNode]
  }
  @scala.inline
  def ReaderFragment(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String,
    metadata: AnonConnection = null
  ): GeneratedNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedNode]
  }
  @scala.inline
  def ReaderInlineDataFragment(kind: InlineDataFragment, name: String): GeneratedNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneratedNode]
  }
  @scala.inline
  def NormalizationSplitOperation(
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection],
    metadata: StringDictionary[js.Any] = null
  ): GeneratedNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedNode]
  }
}

