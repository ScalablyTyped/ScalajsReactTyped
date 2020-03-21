package typingsJapgolly.senchaTouch.Ext.device.filesystem

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICordova extends IHTML5 {
  /** [Method] Downloads a file from the server saving it into the Local File System
  		* @param config Object
  		* @returns FileTransfer
  		*/
  var download: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method]
  		* @param config Object
  		*/
  var readMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Send a file to a server
  		* @param config Object
  		* @returns FileTransfer
  		*/
  var upload: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method]
  		* @param config Object
  		*/
  var writeMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ICordova {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    download: /* config */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    extend: String = null,
    getFileSystemSize: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getFileSystemType: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getReaderType: js.UndefOr[CallbackTo[String]] = js.undefined,
    getStringEncoding: js.UndefOr[CallbackTo[String]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    readMetadata: /* config */ js.UndefOr[js.Any] => Callback = null,
    requestFileSystem: /* config */ js.UndefOr[js.Any] => Callback = null,
    self: IClass = null,
    setFileSystemSize: /* fileSystemSize */ js.UndefOr[Double] => Callback = null,
    setFileSystemType: /* fileSystemType */ js.UndefOr[Double] => Callback = null,
    setReaderType: /* readerType */ js.UndefOr[String] => Callback = null,
    setStringEncoding: /* stringEncoding */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    upload: /* config */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    uses: Array = null,
    writeMetadata: /* config */ js.UndefOr[js.Any] => Callback = null
  ): ICordova = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (download != null) __obj.updateDynamic("download")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => download(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getFileSystemSize.foreach(p => __obj.updateDynamic("getFileSystemSize")(p.toJsFn))
    getFileSystemType.foreach(p => __obj.updateDynamic("getFileSystemType")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getReaderType.foreach(p => __obj.updateDynamic("getReaderType")(p.toJsFn))
    getStringEncoding.foreach(p => __obj.updateDynamic("getStringEncoding")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (readMetadata != null) __obj.updateDynamic("readMetadata")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => readMetadata(t0).runNow()))
    if (requestFileSystem != null) __obj.updateDynamic("requestFileSystem")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => requestFileSystem(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setFileSystemSize != null) __obj.updateDynamic("setFileSystemSize")(js.Any.fromFunction1((t0: /* fileSystemSize */ js.UndefOr[scala.Double]) => setFileSystemSize(t0).runNow()))
    if (setFileSystemType != null) __obj.updateDynamic("setFileSystemType")(js.Any.fromFunction1((t0: /* fileSystemType */ js.UndefOr[scala.Double]) => setFileSystemType(t0).runNow()))
    if (setReaderType != null) __obj.updateDynamic("setReaderType")(js.Any.fromFunction1((t0: /* readerType */ js.UndefOr[java.lang.String]) => setReaderType(t0).runNow()))
    if (setStringEncoding != null) __obj.updateDynamic("setStringEncoding")(js.Any.fromFunction1((t0: /* stringEncoding */ js.UndefOr[java.lang.String]) => setStringEncoding(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => upload(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (writeMetadata != null) __obj.updateDynamic("writeMetadata")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => writeMetadata(t0).runNow()))
    __obj.asInstanceOf[ICordova]
  }
}

