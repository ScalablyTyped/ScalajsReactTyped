package typingsJapgolly.winrt.Windows.Storage.BulkAccess

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typingsJapgolly.winrt.Windows.Storage.Search.IStorageQueryResultBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInformationFactoryFactory extends js.Object {
  def createWithMode(queryResult: IStorageQueryResultBase, mode: ThumbnailMode): FileInformationFactory
  def createWithModeAndSize(queryResult: IStorageQueryResultBase, mode: ThumbnailMode, requestedThumbnailSize: Double): FileInformationFactory
  def createWithModeAndSizeAndOptions(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions
  ): FileInformationFactory
  def createWithModeAndSizeAndOptionsAndFlags(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions,
    delayLoad: Boolean
  ): FileInformationFactory
}

object IFileInformationFactoryFactory {
  @scala.inline
  def apply(
    createWithMode: (IStorageQueryResultBase, ThumbnailMode) => CallbackTo[FileInformationFactory],
    createWithModeAndSize: (IStorageQueryResultBase, ThumbnailMode, Double) => CallbackTo[FileInformationFactory],
    createWithModeAndSizeAndOptions: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions) => CallbackTo[FileInformationFactory],
    createWithModeAndSizeAndOptionsAndFlags: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions, Boolean) => CallbackTo[FileInformationFactory]
  ): IFileInformationFactoryFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWithMode")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Storage.Search.IStorageQueryResultBase, t1: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode) => createWithMode(t0, t1).runNow()))
    __obj.updateDynamic("createWithModeAndSize")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.Search.IStorageQueryResultBase, t1: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode, t2: scala.Double) => createWithModeAndSize(t0, t1, t2).runNow()))
    __obj.updateDynamic("createWithModeAndSizeAndOptions")(js.Any.fromFunction4((t0: typingsJapgolly.winrt.Windows.Storage.Search.IStorageQueryResultBase, t1: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode, t2: scala.Double, t3: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions) => createWithModeAndSizeAndOptions(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("createWithModeAndSizeAndOptionsAndFlags")(js.Any.fromFunction5((t0: typingsJapgolly.winrt.Windows.Storage.Search.IStorageQueryResultBase, t1: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode, t2: scala.Double, t3: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions, t4: scala.Boolean) => createWithModeAndSizeAndOptionsAndFlags(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IFileInformationFactoryFactory]
  }
}

