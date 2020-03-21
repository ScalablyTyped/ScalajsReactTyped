package typingsJapgolly.winrt.Windows.Storage.Provider

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileUpdaterStatics extends js.Object {
  def setUpdateInformation(
    file: IStorageFile,
    contentId: String,
    readMode: ReadActivationMode,
    writeMode: WriteActivationMode,
    options: CachedFileOptions
  ): Unit
}

object ICachedFileUpdaterStatics {
  @scala.inline
  def apply(
    setUpdateInformation: (IStorageFile, String, ReadActivationMode, WriteActivationMode, CachedFileOptions) => Callback
  ): ICachedFileUpdaterStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setUpdateInformation")(js.Any.fromFunction5((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile, t1: java.lang.String, t2: typingsJapgolly.winrt.Windows.Storage.Provider.ReadActivationMode, t3: typingsJapgolly.winrt.Windows.Storage.Provider.WriteActivationMode, t4: typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileOptions) => setUpdateInformation(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[ICachedFileUpdaterStatics]
  }
}

