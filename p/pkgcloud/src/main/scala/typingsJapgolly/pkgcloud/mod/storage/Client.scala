package typingsJapgolly.pkgcloud.mod.storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.processMod._Global_.NodeJS.ReadStream
import typingsJapgolly.node.processMod._Global_.NodeJS.WriteStream
import typingsJapgolly.pkgcloud.mod.ClientError
import typingsJapgolly.pkgcloud.mod.ProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var config: ProviderOptions
  var protocol: String
  var provider: String
  def createContainer(options: js.Any, callback: js.Function2[/* err */ ClientError, /* container */ Container, _]): Unit
  def destroyContainer(containerName: String, callback: js.Function1[/* err */ ClientError, _]): Unit
  def download(options: StorageDownloadOptions): ReadStream
  def getContainer(containerName: String, callback: js.Function2[/* err */ ClientError, /* container */ Container, _]): Unit
  def getContainers(callback: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], _]): Unit
  def getFile(
    containerName: String,
    file: String,
    callback: js.Function2[/* err */ ClientError, /* file */ File, _]
  ): Unit
  def getFiles(
    containerName: String,
    callback: js.Function2[/* err */ ClientError, /* files */ js.Array[File], _]
  ): Unit
  // Logs
  def on(
    eventName: String,
    callback: js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], _]
  ): Unit
  def removeFile(containerName: String, file: String, callback: js.Function1[/* err */ ClientError, _]): Unit
  def upload(options: StorageUploadOptions): WriteStream
}

object Client {
  @scala.inline
  def apply(
    config: ProviderOptions,
    createContainer: (js.Any, js.Function2[/* err */ ClientError, /* container */ Container, js.Any]) => Callback,
    destroyContainer: (String, js.Function1[/* err */ ClientError, js.Any]) => Callback,
    download: StorageDownloadOptions => CallbackTo[ReadStream],
    getContainer: (String, js.Function2[/* err */ ClientError, /* container */ Container, js.Any]) => Callback,
    getContainers: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], js.Any] => Callback,
    getFile: (String, String, js.Function2[/* err */ ClientError, /* file */ File, js.Any]) => Callback,
    getFiles: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], js.Any]) => Callback,
    on: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], js.Any]) => Callback,
    protocol: String,
    provider: String,
    removeFile: (String, String, js.Function1[/* err */ ClientError, js.Any]) => Callback,
    upload: StorageUploadOptions => CallbackTo[WriteStream]
  ): Client = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.updateDynamic("createContainer")(js.Any.fromFunction2((t0: js.Any, t1: js.Function2[
  /* err */ typingsJapgolly.pkgcloud.mod.ClientError, 
  /* container */ typingsJapgolly.pkgcloud.mod.storage.Container, 
  js.Any]) => createContainer(t0, t1).runNow()))
    __obj.updateDynamic("destroyContainer")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ typingsJapgolly.pkgcloud.mod.ClientError, js.Any]) => destroyContainer(t0, t1).runNow()))
    __obj.updateDynamic("download")(js.Any.fromFunction1((t0: typingsJapgolly.pkgcloud.mod.storage.StorageDownloadOptions) => download(t0).runNow()))
    __obj.updateDynamic("getContainer")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* err */ typingsJapgolly.pkgcloud.mod.ClientError, 
  /* container */ typingsJapgolly.pkgcloud.mod.storage.Container, 
  js.Any]) => getContainer(t0, t1).runNow()))
    __obj.updateDynamic("getContainers")(js.Any.fromFunction1((t0: js.Function2[
  /* err */ typingsJapgolly.pkgcloud.mod.ClientError, 
  /* containers */ js.Array[typingsJapgolly.pkgcloud.mod.storage.Container], 
  js.Any]) => getContainers(t0).runNow()))
    __obj.updateDynamic("getFile")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function2[
  /* err */ typingsJapgolly.pkgcloud.mod.ClientError, 
  /* file */ typingsJapgolly.pkgcloud.mod.storage.File, 
  js.Any]) => getFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("getFiles")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* err */ typingsJapgolly.pkgcloud.mod.ClientError, 
  /* files */ js.Array[typingsJapgolly.pkgcloud.mod.storage.File], 
  js.Any]) => getFiles(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* message */ java.lang.String, /* object */ js.UndefOr[js.Any], js.Any]) => on(t0, t1).runNow()))
    __obj.updateDynamic("removeFile")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function1[/* err */ typingsJapgolly.pkgcloud.mod.ClientError, js.Any]) => removeFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("upload")(js.Any.fromFunction1((t0: typingsJapgolly.pkgcloud.mod.storage.StorageUploadOptions) => upload(t0).runNow()))
    __obj.asInstanceOf[Client]
  }
}

