package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonComponentDxFileManager
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonCopy
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonFileItem
import typingsJapgolly.devextreme.AnonMaxFileSize
import typingsJapgolly.devextreme.AnonMode
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.multiple
import typingsJapgolly.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFileManagerOptions extends WidgetOptions[dxFileManager] {
  /** Specifies the allowed upload file extensions. */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  /** Configures the context menu settings. */
  var contextMenu: js.UndefOr[dxFileManagerContextMenu] = js.undefined
  /** Specifies the path that is used when the FileManager is initialized. */
  var currentPath: js.UndefOr[String] = js.undefined
  /** Customizes columns in details view. Applies only if itemView.mode is "details". */
  var customizeDetailColumns: js.UndefOr[
    js.Function1[/* columns */ js.Array[dxDataGridColumn], js.Array[dxDataGridColumn]]
  ] = js.undefined
  /** Allows you to provide custom icons to be used as thumbnails. */
  var customizeThumbnail: js.UndefOr[js.Function1[/* fileItem */ js.Any, String]] = js.undefined
  /** Specifies the file provider. */
  var fileProvider: js.UndefOr[js.Any] = js.undefined
  /** Configures the file and folder view. */
  var itemView: js.UndefOr[AnonMode] = js.undefined
  /** A function that is executed when the current directory is changed. */
  var onCurrentDirectoryChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxFileManager, _]] = js.undefined
  /** A function that is executed when the selected file is opened. */
  var onSelectedFileOpened: js.UndefOr[js.Function1[/* e */ AnonFileItem, _]] = js.undefined
  /** Specifies actions that a user is allowed to perform on files and folders. */
  var permissions: js.UndefOr[AnonCopy] = js.undefined
  /** Specifies the root folder name. */
  var rootFolderName: js.UndefOr[String] = js.undefined
  /** Specifies whether a user can select a single or multiple files and folders in the item view simultaneously. */
  var selectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** Configures toolbar settings. */
  var toolbar: js.UndefOr[dxFileManagerToolbar] = js.undefined
  /** Configures upload settings. */
  var upload: js.UndefOr[AnonMaxFileSize] = js.undefined
}

object dxFileManagerOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowedFileExtensions: js.Array[String] = null,
    bindingOptions: js.Any = null,
    contextMenu: dxFileManagerContextMenu = null,
    currentPath: String = null,
    customizeDetailColumns: /* columns */ js.Array[dxDataGridColumn] => CallbackTo[js.Array[dxDataGridColumn]] = null,
    customizeThumbnail: /* fileItem */ js.Any => CallbackTo[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    fileProvider: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemView: AnonMode = null,
    onContentReady: /* e */ AnonComponentElement[dxFileManager] => CallbackTo[js.Any] = null,
    onCurrentDirectoryChanged: /* e */ AnonComponentDxFileManager => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxFileManager] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxFileManager] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxFileManager] => CallbackTo[js.Any] = null,
    onSelectedFileOpened: /* e */ AnonFileItem => CallbackTo[js.Any] = null,
    permissions: AnonCopy = null,
    rootFolderName: String = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionMode: multiple | single_ = null,
    tabIndex: Int | Double = null,
    toolbar: dxFileManagerToolbar = null,
    upload: AnonMaxFileSize = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFileManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (allowedFileExtensions != null) __obj.updateDynamic("allowedFileExtensions")(allowedFileExtensions.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (currentPath != null) __obj.updateDynamic("currentPath")(currentPath.asInstanceOf[js.Any])
    if (customizeDetailColumns != null) __obj.updateDynamic("customizeDetailColumns")(js.Any.fromFunction1((t0: /* columns */ js.Array[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGridColumn]) => customizeDetailColumns(t0).runNow()))
    if (customizeThumbnail != null) __obj.updateDynamic("customizeThumbnail")(js.Any.fromFunction1((t0: /* fileItem */ js.Any) => customizeThumbnail(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fileProvider != null) __obj.updateDynamic("fileProvider")(fileProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemView != null) __obj.updateDynamic("itemView")(itemView.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager]) => onContentReady(t0).runNow()))
    if (onCurrentDirectoryChanged != null) __obj.updateDynamic("onCurrentDirectoryChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxFileManager) => onCurrentDirectoryChanged(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager]) => onOptionChanged(t0).runNow()))
    if (onSelectedFileOpened != null) __obj.updateDynamic("onSelectedFileOpened")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFileItem) => onSelectedFileOpened(t0).runNow()))
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (rootFolderName != null) __obj.updateDynamic("rootFolderName")(rootFolderName.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileManagerOptions]
  }
}

