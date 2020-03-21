package typingsJapgolly.ckeditorCkeditor5Engine.mod.conversion

import typingsJapgolly.ckeditorCkeditor5Engine.AnonIsPhantom
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.Element
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.Position
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.Range
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/conversion/mapper
@JSImport("@ckeditor/ckeditor5-engine", "conversion.Mapper")
@js.native
class Mapper () extends js.Object {
  def bindElementToMarker(element: Element, name: String): Unit = js.native
  def bindElements(modelElement: typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Element, viewElement: Element): Unit = js.native
  def clearBindings(): Unit = js.native
  def getModelLength(viewNode: Element): Double = js.native
  def markerNameToElements(name: String): Set[Element] | Null = js.native
  def registerViewToModelLength(viewElementName: String, lengthCallback: js.Function): Unit = js.native
  def toModelElement(viewElement: Element): js.UndefOr[typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Element] = js.native
  def toModelPosition(viewPosition: Position): typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Position = js.native
  def toModelRange(viewRange: Range): typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Range = js.native
  def toViewElement(modelElement: typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Element): js.UndefOr[Element] = js.native
  def toViewPosition(modelPosition: typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Position): Position = js.native
  def toViewPosition(modelPosition: typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Position, options: AnonIsPhantom): Position = js.native
  def toViewRange(modelRange: typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Range): Range = js.native
  def unbindElementsFromMarkerName(name: String): Unit = js.native
  def unbindModelElement(modelElement: typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Element): Unit = js.native
  def unbindViewElement(viewElement: Element): Unit = js.native
}

