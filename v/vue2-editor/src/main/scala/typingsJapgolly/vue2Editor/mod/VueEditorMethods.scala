package typingsJapgolly.vue2Editor.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueEditorMethods extends js.Object {
  def checkForCustomImageHandler(): Unit
  def customImageHandler(image: js.Any, callback: js.Any): Unit
  def emitImageInfo($event: Event_): Unit
  def handleInitialContent(): Unit
  def handleSelectionChange(range: js.Any, oldRange: js.Any): Unit
  def handleTextChange(): Unit
  def initializeEditor(): Unit
  def listenForEditorEvent(`type`: js.Any): Unit
  def prepareEditorConfig(editorConfig: js.Any): Unit
  def registerEditorEventListeners(): Unit
  def registerPrototypes(): Unit
  def setModules(): Unit
  def setupCustomImageHandler(): Unit
  def setupQuillEditor(): Unit
}

object VueEditorMethods {
  @scala.inline
  def apply(
    checkForCustomImageHandler: Callback,
    customImageHandler: (js.Any, js.Any) => Callback,
    emitImageInfo: Event_ => Callback,
    handleInitialContent: Callback,
    handleSelectionChange: (js.Any, js.Any) => Callback,
    handleTextChange: Callback,
    initializeEditor: Callback,
    listenForEditorEvent: js.Any => Callback,
    prepareEditorConfig: js.Any => Callback,
    registerEditorEventListeners: Callback,
    registerPrototypes: Callback,
    setModules: Callback,
    setupCustomImageHandler: Callback,
    setupQuillEditor: Callback
  ): VueEditorMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkForCustomImageHandler")(checkForCustomImageHandler.toJsFn)
    __obj.updateDynamic("customImageHandler")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => customImageHandler(t0, t1).runNow()))
    __obj.updateDynamic("emitImageInfo")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => emitImageInfo(t0).runNow()))
    __obj.updateDynamic("handleInitialContent")(handleInitialContent.toJsFn)
    __obj.updateDynamic("handleSelectionChange")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => handleSelectionChange(t0, t1).runNow()))
    __obj.updateDynamic("handleTextChange")(handleTextChange.toJsFn)
    __obj.updateDynamic("initializeEditor")(initializeEditor.toJsFn)
    __obj.updateDynamic("listenForEditorEvent")(js.Any.fromFunction1((t0: js.Any) => listenForEditorEvent(t0).runNow()))
    __obj.updateDynamic("prepareEditorConfig")(js.Any.fromFunction1((t0: js.Any) => prepareEditorConfig(t0).runNow()))
    __obj.updateDynamic("registerEditorEventListeners")(registerEditorEventListeners.toJsFn)
    __obj.updateDynamic("registerPrototypes")(registerPrototypes.toJsFn)
    __obj.updateDynamic("setModules")(setModules.toJsFn)
    __obj.updateDynamic("setupCustomImageHandler")(setupCustomImageHandler.toJsFn)
    __obj.updateDynamic("setupQuillEditor")(setupQuillEditor.toJsFn)
    __obj.asInstanceOf[VueEditorMethods]
  }
}

