package typingsJapgolly.jsoneditor.mod

import typingsJapgolly.jsoneditor.AnonEnd
import typingsJapgolly.jsoneditor.AnonPath
import typingsJapgolly.jsoneditor.AnonStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditor extends js.Object {
  var compact: js.UndefOr[js.Function0[Unit]] = js.native
  var format: js.UndefOr[js.Function0[Unit]] = js.native
  var repair: js.UndefOr[js.Function0[Unit]] = js.native
  def collapseAll(): Unit = js.native
  def destroy(): Unit = js.native
  def expandAll(): Unit = js.native
  def focus(): Unit = js.native
  def get(): js.Any = js.native
  def getMode(): JSONEditorMode = js.native
  def getName(): js.UndefOr[String] = js.native
  def getNodesByRange(start: AnonPath, end: AnonPath): js.Array[SerializableNode] = js.native
  def getSelection(): AnonEnd = js.native
  def getText(): String = js.native
  def getTextSelection(): AnonStart = js.native
  def refresh(): Unit = js.native
  def set(json: js.Any): Unit = js.native
  def setMode(mode: JSONEditorMode): Unit = js.native
  def setName(): Unit = js.native
  def setName(name: String): Unit = js.native
  def setSchema(schema: js.Object): Unit = js.native
  def setSchema(schema: js.Object, schemaRefs: js.Object): Unit = js.native
  def setSelection(start: AnonPath, end: AnonPath): Unit = js.native
  def setText(jsonString: String): Unit = js.native
  def setTextSelection(start: SelectionPosition, end: SelectionPosition): Unit = js.native
  def update(json: js.Any): Unit = js.native
  def updateText(jsonString: String): Unit = js.native
}

