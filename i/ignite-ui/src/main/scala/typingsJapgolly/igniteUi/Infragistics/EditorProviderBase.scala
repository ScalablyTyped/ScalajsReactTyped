package typingsJapgolly.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.EditorProviderBase")
@js.native
class EditorProviderBase () extends js.Object {
  def attachErrorEvents(errorShowing: js.Object, errorShown: js.Object, errorHidden: js.Object): Unit = js.native
  /**
  	 * Call parent createEditor
  	 *
  	 * @param callbacks
  	 * @param key
  	 * @param editorOptions
  	 * @param tabIndex
  	 * @param format
  	 * @param element
  	 */
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit = js.native
  def destroy(): Unit = js.native
  def getEditor(): Unit = js.native
  def getValue(): Unit = js.native
  def isValid(): Unit = js.native
  def keyDown(evt: js.Object, ui: js.Object): Unit = js.native
  def refreshValue(): Unit = js.native
  def removeFromParent(): Unit = js.native
  def requestValidate(evt: js.Object): Unit = js.native
  def setFocus(): Unit = js.native
  def setSize(width: js.Object, height: js.Object): Unit = js.native
  def setValue(`val`: js.Object): Unit = js.native
  def textChanged(evt: js.Object, ui: js.Object): Unit = js.native
  def validate(): Unit = js.native
  def validator(): Unit = js.native
}

