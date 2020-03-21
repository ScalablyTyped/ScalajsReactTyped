package typingsJapgolly.senchaTouch.Ext.device.filesystem

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectoryEntry extends IEntry {
  /** [Method] Works the same way as getFile but creates or looks up a directory
  		* @param config Object
  		*/
  var getDirectory: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Requests a Directory from the Local File System
  		* @param config Object
  		*/
  var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Creates or looks up a file
  		* @param config Object The object which contains the following config options:
  		*/
  var getFile: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Lists all the entries in the directory
  		* @param config Object The object which contains the following config options:
  		*/
  var readEntries: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Works the same way as Ext device filesystem Entry remove but removes the directory and all of its contents if any
  		* @param config Object
  		*/
  var removeRecursively: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IDirectoryEntry {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    copyTo: /* config */ js.UndefOr[js.Any] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getDirectory: /* config */ js.UndefOr[js.Any] => Callback = null,
    getEntry: /* config */ js.UndefOr[js.Any] => Callback = null,
    getFile: /* config */ js.UndefOr[js.Any] => Callback = null,
    getFileSystem: js.UndefOr[CallbackTo[IFileSystem]] = js.undefined,
    getFullPath: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getParent: /* config */ js.UndefOr[js.Any] => Callback = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    isDirectory: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isFile: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    mixins: js.Any = null,
    moveTo: /* config */ js.UndefOr[js.Any] => Callback = null,
    platformConfig: js.Any = null,
    readEntries: /* config */ js.UndefOr[js.Any] => Callback = null,
    remove: /* config */ js.UndefOr[js.Any] => Callback = null,
    removeRecursively: /* config */ js.UndefOr[js.Any] => Callback = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IDirectoryEntry = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (copyTo != null) __obj.updateDynamic("copyTo")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => copyTo(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDirectory != null) __obj.updateDynamic("getDirectory")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => getDirectory(t0).runNow()))
    if (getEntry != null) __obj.updateDynamic("getEntry")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => getEntry(t0).runNow()))
    if (getFile != null) __obj.updateDynamic("getFile")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => getFile(t0).runNow()))
    getFileSystem.foreach(p => __obj.updateDynamic("getFileSystem")(p.toJsFn))
    getFullPath.foreach(p => __obj.updateDynamic("getFullPath")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => getParent(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    isDirectory.foreach(p => __obj.updateDynamic("isDirectory")(p.toJsFn))
    isFile.foreach(p => __obj.updateDynamic("isFile")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => moveTo(t0).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (readEntries != null) __obj.updateDynamic("readEntries")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => readEntries(t0).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => remove(t0).runNow()))
    if (removeRecursively != null) __obj.updateDynamic("removeRecursively")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => removeRecursively(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectoryEntry]
  }
}

