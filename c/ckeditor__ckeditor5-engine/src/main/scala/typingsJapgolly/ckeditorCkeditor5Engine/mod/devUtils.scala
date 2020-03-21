package typingsJapgolly.ckeditorCkeditor5Engine.mod

import typingsJapgolly.ckeditorCkeditor5Engine.AnonBatchType
import typingsJapgolly.ckeditorCkeditor5Engine.AnonContext
import typingsJapgolly.ckeditorCkeditor5Engine.AnonConvertMarkers
import typingsJapgolly.ckeditorCkeditor5Engine.AnonError
import typingsJapgolly.ckeditorCkeditor5Engine.AnonIgnoreRoot
import typingsJapgolly.ckeditorCkeditor5Engine.AnonLastRangeBackward
import typingsJapgolly.ckeditorCkeditor5Engine.AnonRenderUIElements
import typingsJapgolly.ckeditorCkeditor5Engine.AnonRootName
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Batch
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Marker
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Model
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.RootElement
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Schema
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Selection
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.DocumentFragment
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.DocumentSelection
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.Element
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.Position
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.Range
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.Text
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "devUtils")
@js.native
object devUtils extends js.Object {
  // engine/dev-utils/enableenginedebug
  @js.native
  class DebugPlugin () extends js.Object
  
  // engine/dev-utils/operationreplayer
  @js.native
  class OperationReplayer () extends js.Object
  
  def disableEngineDebug(): Unit = js.native
  def enableEngineDebug(_logger: AnonError): DebugPlugin = js.native
  // engine/dev-utils/view
  def getData(view: View): String = js.native
  def getData(view: View, options: AnonRenderUIElements): String = js.native
  def parse(data: String, options: AnonLastRangeBackward): Text | Element | DocumentFragment | js.Object = js.native
  def setData(view: View, data: String, options: AnonRootName): Unit = js.native
  def stringify(node: DocumentFragment): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection, options: AnonIgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position, options: AnonIgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Element): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Text): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range, options: AnonIgnoreRoot): String = js.native
  // engine/dev-utils/model
  @js.native
  object devmodel extends js.Object {
    def getData(model: Model): String = js.native
    def getData(model: Model, options: AnonConvertMarkers): String = js.native
    def parse(data: String, schema: Schema, batch: Batch): typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Element | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Text | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.DocumentFragment | js.Object = js.native
    def parse(data: String, schema: Schema, batch: Batch, options: AnonContext): typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Element | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Text | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.DocumentFragment | js.Object = js.native
    def setData(model: String, data: js.Object, options: AnonBatchType): Unit = js.native
    def stringify(
      node: RootElement | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Element | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Text | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Position | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Range
    ): String = js.native
    def stringify(
      node: RootElement | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Element | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Text | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Position | typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Range,
      markers: js.Iterable[Marker]
    ): String = js.native
  }
  
}

