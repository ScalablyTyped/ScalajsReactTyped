package typingsJapgolly.expoFileSystem.fileSystemTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.expoFileSystem.expoFileSystemStrings.ExponentFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExponentFileSystemModule extends js.Object {
  val bundleDirectory: String | Null
  val bundledAssets: String | Null
  val cacheDirectory: String | Null
  val copyAsync: js.UndefOr[PlatformMethod] = js.undefined
  val deleteAsync: js.UndefOr[PlatformMethod] = js.undefined
  val documentDirectory: String | Null
  val downloadAsync: js.UndefOr[PlatformMethod] = js.undefined
  val downloadResumablePauseAsync: js.UndefOr[PlatformMethod] = js.undefined
  val downloadResumableStartAsync: js.UndefOr[PlatformMethod] = js.undefined
  val getContentUriAsync: js.UndefOr[PlatformMethod] = js.undefined
  val getFreeDiskStorageAsync: js.UndefOr[PlatformMethod] = js.undefined
  val getInfoAsync: js.UndefOr[PlatformMethod] = js.undefined
  val getTotalDiskCapacityAsync: js.UndefOr[PlatformMethod] = js.undefined
  val makeDirectoryAsync: js.UndefOr[PlatformMethod] = js.undefined
  val moveAsync: js.UndefOr[PlatformMethod] = js.undefined
  val name: ExponentFileSystem
  val readAsStringAsync: js.UndefOr[PlatformMethod] = js.undefined
  val readDirectoryAsync: js.UndefOr[PlatformMethod] = js.undefined
  var startObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  val writeAsStringAsync: js.UndefOr[PlatformMethod] = js.undefined
  def addListener(eventName: String): Unit
  def removeListeners(count: Double): Unit
}

object ExponentFileSystemModule {
  @scala.inline
  def apply(
    addListener: String => Callback,
    name: ExponentFileSystem,
    removeListeners: Double => Callback,
    bundleDirectory: String = null,
    bundledAssets: String = null,
    cacheDirectory: String = null,
    copyAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    deleteAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    documentDirectory: String = null,
    downloadAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    downloadResumablePauseAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    downloadResumableStartAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    getContentUriAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    getFreeDiskStorageAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    getInfoAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    getTotalDiskCapacityAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    makeDirectoryAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    moveAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    readAsStringAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    readDirectoryAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null,
    startObserving: js.UndefOr[Callback] = js.undefined,
    stopObserving: js.UndefOr[Callback] = js.undefined,
    writeAsStringAsync: /* repeated */ js.Any => CallbackTo[js.Promise[js.Any]] = null
  ): ExponentFileSystemModule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: java.lang.String) => addListener(t0).runNow()))
    __obj.updateDynamic("removeListeners")(js.Any.fromFunction1((t0: scala.Double) => removeListeners(t0).runNow()))
    if (bundleDirectory != null) __obj.updateDynamic("bundleDirectory")(bundleDirectory.asInstanceOf[js.Any])
    if (bundledAssets != null) __obj.updateDynamic("bundledAssets")(bundledAssets.asInstanceOf[js.Any])
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory.asInstanceOf[js.Any])
    if (copyAsync != null) __obj.updateDynamic("copyAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => copyAsync(t0).runNow()))
    if (deleteAsync != null) __obj.updateDynamic("deleteAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => deleteAsync(t0).runNow()))
    if (documentDirectory != null) __obj.updateDynamic("documentDirectory")(documentDirectory.asInstanceOf[js.Any])
    if (downloadAsync != null) __obj.updateDynamic("downloadAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => downloadAsync(t0).runNow()))
    if (downloadResumablePauseAsync != null) __obj.updateDynamic("downloadResumablePauseAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => downloadResumablePauseAsync(t0).runNow()))
    if (downloadResumableStartAsync != null) __obj.updateDynamic("downloadResumableStartAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => downloadResumableStartAsync(t0).runNow()))
    if (getContentUriAsync != null) __obj.updateDynamic("getContentUriAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getContentUriAsync(t0).runNow()))
    if (getFreeDiskStorageAsync != null) __obj.updateDynamic("getFreeDiskStorageAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getFreeDiskStorageAsync(t0).runNow()))
    if (getInfoAsync != null) __obj.updateDynamic("getInfoAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getInfoAsync(t0).runNow()))
    if (getTotalDiskCapacityAsync != null) __obj.updateDynamic("getTotalDiskCapacityAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getTotalDiskCapacityAsync(t0).runNow()))
    if (makeDirectoryAsync != null) __obj.updateDynamic("makeDirectoryAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => makeDirectoryAsync(t0).runNow()))
    if (moveAsync != null) __obj.updateDynamic("moveAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => moveAsync(t0).runNow()))
    if (readAsStringAsync != null) __obj.updateDynamic("readAsStringAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => readAsStringAsync(t0).runNow()))
    if (readDirectoryAsync != null) __obj.updateDynamic("readDirectoryAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => readDirectoryAsync(t0).runNow()))
    startObserving.foreach(p => __obj.updateDynamic("startObserving")(p.toJsFn))
    stopObserving.foreach(p => __obj.updateDynamic("stopObserving")(p.toJsFn))
    if (writeAsStringAsync != null) __obj.updateDynamic("writeAsStringAsync")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => writeAsStringAsync(t0).runNow()))
    __obj.asInstanceOf[ExponentFileSystemModule]
  }
}

