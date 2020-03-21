package typingsJapgolly.ckeditor.CKEDITOR.editor

import japgolly.scalajs.react.Callback
import typingsJapgolly.ckeditor.CKEDITOR.eventInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait eventObject extends js.Object {
  var activeEnterModeChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var activeFilterChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterInsertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterPaste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterPasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterSetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var ariaEditorHelpLabel: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var ariaWidget: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var autogrow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeDestroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeGetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeModeUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeSetMode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var blur: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var configLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var contentDirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var contentDom: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var contentDomInvalidated: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var contentDomUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var customConfigLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dataFiltered: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dataReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var destroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dialogHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dialogShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var doubleclick: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var elementsPathUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var fileUploadRequest: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var fileUploadResponse: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var floatingSpaceLayout: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var focus: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var getData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var getSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var insertElement: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var insertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var insertText: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var instanceReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var key: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var langLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var loadSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var loaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var lockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var maximize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var menuShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var mode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var notificationHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var notificationShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var notificationUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var paste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var pasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var pluginsLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var readOnly: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var removeFormatCleanup: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var required: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var resize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var save: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var saveSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var selectionChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var setData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var stylesSet: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var template: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var toDataFormat: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var toHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var unlockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var updateSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var widgetDefinition: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
}

object eventObject {
  @scala.inline
  def apply(
    activeEnterModeChange: /* evt */ eventInfo => Callback = null,
    activeFilterChange: /* evt */ eventInfo => Callback = null,
    afterCommandExec: /* evt */ eventInfo => Callback = null,
    afterInsertHtml: /* evt */ eventInfo => Callback = null,
    afterPaste: /* evt */ eventInfo => Callback = null,
    afterPasteFromWord: /* evt */ eventInfo => Callback = null,
    afterSetData: /* evt */ eventInfo => Callback = null,
    afterUndoImage: /* evt */ eventInfo => Callback = null,
    ariaEditorHelpLabel: /* evt */ eventInfo => Callback = null,
    ariaWidget: /* evt */ eventInfo => Callback = null,
    autogrow: /* evt */ eventInfo => Callback = null,
    beforeCommandExec: /* evt */ eventInfo => Callback = null,
    beforeDestroy: /* evt */ eventInfo => Callback = null,
    beforeGetData: /* evt */ eventInfo => Callback = null,
    beforeModeUnload: /* evt */ eventInfo => Callback = null,
    beforeSetMode: /* evt */ eventInfo => Callback = null,
    beforeUndoImage: /* evt */ eventInfo => Callback = null,
    blur: /* evt */ eventInfo => Callback = null,
    change: /* evt */ eventInfo => Callback = null,
    configLoaded: /* evt */ eventInfo => Callback = null,
    contentDirChanged: /* evt */ eventInfo => Callback = null,
    contentDom: /* evt */ eventInfo => Callback = null,
    contentDomInvalidated: /* evt */ eventInfo => Callback = null,
    contentDomUnload: /* evt */ eventInfo => Callback = null,
    customConfigLoaded: /* evt */ eventInfo => Callback = null,
    dataFiltered: /* evt */ eventInfo => Callback = null,
    dataReady: /* evt */ eventInfo => Callback = null,
    destroy: /* evt */ eventInfo => Callback = null,
    dialogHide: /* evt */ eventInfo => Callback = null,
    dialogShow: /* evt */ eventInfo => Callback = null,
    dirChanged: /* evt */ eventInfo => Callback = null,
    doubleclick: /* evt */ eventInfo => Callback = null,
    dragend: /* evt */ eventInfo => Callback = null,
    dragstart: /* evt */ eventInfo => Callback = null,
    drop: /* evt */ eventInfo => Callback = null,
    elementsPathUpdate: /* evt */ eventInfo => Callback = null,
    fileUploadRequest: /* evt */ eventInfo => Callback = null,
    fileUploadResponse: /* evt */ eventInfo => Callback = null,
    floatingSpaceLayout: /* evt */ eventInfo => Callback = null,
    focus: /* evt */ eventInfo => Callback = null,
    getData: /* evt */ eventInfo => Callback = null,
    getSnapshot: /* evt */ eventInfo => Callback = null,
    insertElement: /* evt */ eventInfo => Callback = null,
    insertHtml: /* evt */ eventInfo => Callback = null,
    insertText: /* evt */ eventInfo => Callback = null,
    instanceReady: /* evt */ eventInfo => Callback = null,
    key: /* evt */ eventInfo => Callback = null,
    langLoaded: /* evt */ eventInfo => Callback = null,
    loadSnapshot: /* evt */ eventInfo => Callback = null,
    loaded: /* evt */ eventInfo => Callback = null,
    lockSnapshot: /* evt */ eventInfo => Callback = null,
    maximize: /* evt */ eventInfo => Callback = null,
    menuShow: /* evt */ eventInfo => Callback = null,
    mode: /* evt */ eventInfo => Callback = null,
    notificationHide: /* evt */ eventInfo => Callback = null,
    notificationShow: /* evt */ eventInfo => Callback = null,
    notificationUpdate: /* evt */ eventInfo => Callback = null,
    paste: /* evt */ eventInfo => Callback = null,
    pasteFromWord: /* evt */ eventInfo => Callback = null,
    pluginsLoaded: /* evt */ eventInfo => Callback = null,
    readOnly: /* evt */ eventInfo => Callback = null,
    removeFormatCleanup: /* evt */ eventInfo => Callback = null,
    required: /* evt */ eventInfo => Callback = null,
    resize: /* evt */ eventInfo => Callback = null,
    save: /* evt */ eventInfo => Callback = null,
    saveSnapshot: /* evt */ eventInfo => Callback = null,
    selectionChange: /* evt */ eventInfo => Callback = null,
    setData: /* evt */ eventInfo => Callback = null,
    stylesSet: /* evt */ eventInfo => Callback = null,
    template: /* evt */ eventInfo => Callback = null,
    toDataFormat: /* evt */ eventInfo => Callback = null,
    toHtml: /* evt */ eventInfo => Callback = null,
    unlockSnapshot: /* evt */ eventInfo => Callback = null,
    updateSnapshot: /* evt */ eventInfo => Callback = null,
    widgetDefinition: /* evt */ eventInfo => Callback = null
  ): eventObject = {
    val __obj = js.Dynamic.literal()
    if (activeEnterModeChange != null) __obj.updateDynamic("activeEnterModeChange")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => activeEnterModeChange(t0).runNow()))
    if (activeFilterChange != null) __obj.updateDynamic("activeFilterChange")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => activeFilterChange(t0).runNow()))
    if (afterCommandExec != null) __obj.updateDynamic("afterCommandExec")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => afterCommandExec(t0).runNow()))
    if (afterInsertHtml != null) __obj.updateDynamic("afterInsertHtml")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => afterInsertHtml(t0).runNow()))
    if (afterPaste != null) __obj.updateDynamic("afterPaste")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => afterPaste(t0).runNow()))
    if (afterPasteFromWord != null) __obj.updateDynamic("afterPasteFromWord")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => afterPasteFromWord(t0).runNow()))
    if (afterSetData != null) __obj.updateDynamic("afterSetData")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => afterSetData(t0).runNow()))
    if (afterUndoImage != null) __obj.updateDynamic("afterUndoImage")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => afterUndoImage(t0).runNow()))
    if (ariaEditorHelpLabel != null) __obj.updateDynamic("ariaEditorHelpLabel")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => ariaEditorHelpLabel(t0).runNow()))
    if (ariaWidget != null) __obj.updateDynamic("ariaWidget")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => ariaWidget(t0).runNow()))
    if (autogrow != null) __obj.updateDynamic("autogrow")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => autogrow(t0).runNow()))
    if (beforeCommandExec != null) __obj.updateDynamic("beforeCommandExec")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => beforeCommandExec(t0).runNow()))
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => beforeDestroy(t0).runNow()))
    if (beforeGetData != null) __obj.updateDynamic("beforeGetData")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => beforeGetData(t0).runNow()))
    if (beforeModeUnload != null) __obj.updateDynamic("beforeModeUnload")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => beforeModeUnload(t0).runNow()))
    if (beforeSetMode != null) __obj.updateDynamic("beforeSetMode")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => beforeSetMode(t0).runNow()))
    if (beforeUndoImage != null) __obj.updateDynamic("beforeUndoImage")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => beforeUndoImage(t0).runNow()))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => blur(t0).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => change(t0).runNow()))
    if (configLoaded != null) __obj.updateDynamic("configLoaded")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => configLoaded(t0).runNow()))
    if (contentDirChanged != null) __obj.updateDynamic("contentDirChanged")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => contentDirChanged(t0).runNow()))
    if (contentDom != null) __obj.updateDynamic("contentDom")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => contentDom(t0).runNow()))
    if (contentDomInvalidated != null) __obj.updateDynamic("contentDomInvalidated")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => contentDomInvalidated(t0).runNow()))
    if (contentDomUnload != null) __obj.updateDynamic("contentDomUnload")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => contentDomUnload(t0).runNow()))
    if (customConfigLoaded != null) __obj.updateDynamic("customConfigLoaded")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => customConfigLoaded(t0).runNow()))
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => dataFiltered(t0).runNow()))
    if (dataReady != null) __obj.updateDynamic("dataReady")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => dataReady(t0).runNow()))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => destroy(t0).runNow()))
    if (dialogHide != null) __obj.updateDynamic("dialogHide")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => dialogHide(t0).runNow()))
    if (dialogShow != null) __obj.updateDynamic("dialogShow")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => dialogShow(t0).runNow()))
    if (dirChanged != null) __obj.updateDynamic("dirChanged")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => dirChanged(t0).runNow()))
    if (doubleclick != null) __obj.updateDynamic("doubleclick")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => doubleclick(t0).runNow()))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => dragend(t0).runNow()))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => dragstart(t0).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => drop(t0).runNow()))
    if (elementsPathUpdate != null) __obj.updateDynamic("elementsPathUpdate")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => elementsPathUpdate(t0).runNow()))
    if (fileUploadRequest != null) __obj.updateDynamic("fileUploadRequest")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => fileUploadRequest(t0).runNow()))
    if (fileUploadResponse != null) __obj.updateDynamic("fileUploadResponse")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => fileUploadResponse(t0).runNow()))
    if (floatingSpaceLayout != null) __obj.updateDynamic("floatingSpaceLayout")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => floatingSpaceLayout(t0).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => focus(t0).runNow()))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => getData(t0).runNow()))
    if (getSnapshot != null) __obj.updateDynamic("getSnapshot")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => getSnapshot(t0).runNow()))
    if (insertElement != null) __obj.updateDynamic("insertElement")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => insertElement(t0).runNow()))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => insertHtml(t0).runNow()))
    if (insertText != null) __obj.updateDynamic("insertText")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => insertText(t0).runNow()))
    if (instanceReady != null) __obj.updateDynamic("instanceReady")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => instanceReady(t0).runNow()))
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => key(t0).runNow()))
    if (langLoaded != null) __obj.updateDynamic("langLoaded")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => langLoaded(t0).runNow()))
    if (loadSnapshot != null) __obj.updateDynamic("loadSnapshot")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => loadSnapshot(t0).runNow()))
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => loaded(t0).runNow()))
    if (lockSnapshot != null) __obj.updateDynamic("lockSnapshot")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => lockSnapshot(t0).runNow()))
    if (maximize != null) __obj.updateDynamic("maximize")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => maximize(t0).runNow()))
    if (menuShow != null) __obj.updateDynamic("menuShow")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => menuShow(t0).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => mode(t0).runNow()))
    if (notificationHide != null) __obj.updateDynamic("notificationHide")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => notificationHide(t0).runNow()))
    if (notificationShow != null) __obj.updateDynamic("notificationShow")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => notificationShow(t0).runNow()))
    if (notificationUpdate != null) __obj.updateDynamic("notificationUpdate")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => notificationUpdate(t0).runNow()))
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => paste(t0).runNow()))
    if (pasteFromWord != null) __obj.updateDynamic("pasteFromWord")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => pasteFromWord(t0).runNow()))
    if (pluginsLoaded != null) __obj.updateDynamic("pluginsLoaded")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => pluginsLoaded(t0).runNow()))
    if (readOnly != null) __obj.updateDynamic("readOnly")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => readOnly(t0).runNow()))
    if (removeFormatCleanup != null) __obj.updateDynamic("removeFormatCleanup")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => removeFormatCleanup(t0).runNow()))
    if (required != null) __obj.updateDynamic("required")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => required(t0).runNow()))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => resize(t0).runNow()))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => save(t0).runNow()))
    if (saveSnapshot != null) __obj.updateDynamic("saveSnapshot")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => saveSnapshot(t0).runNow()))
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => selectionChange(t0).runNow()))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => setData(t0).runNow()))
    if (stylesSet != null) __obj.updateDynamic("stylesSet")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => stylesSet(t0).runNow()))
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => template(t0).runNow()))
    if (toDataFormat != null) __obj.updateDynamic("toDataFormat")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => toDataFormat(t0).runNow()))
    if (toHtml != null) __obj.updateDynamic("toHtml")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => toHtml(t0).runNow()))
    if (unlockSnapshot != null) __obj.updateDynamic("unlockSnapshot")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => unlockSnapshot(t0).runNow()))
    if (updateSnapshot != null) __obj.updateDynamic("updateSnapshot")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => updateSnapshot(t0).runNow()))
    if (widgetDefinition != null) __obj.updateDynamic("widgetDefinition")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.ckeditor.CKEDITOR.eventInfo) => widgetDefinition(t0).runNow()))
    __obj.asInstanceOf[eventObject]
  }
}

