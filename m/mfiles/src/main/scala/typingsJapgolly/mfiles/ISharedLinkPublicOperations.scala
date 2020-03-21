package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedLinkPublicOperations extends js.Object {
  def DownloadSharedFileInBlocks_Begin(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession
  def DownloadSharedFileInBlocks_Begin_32bit(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession
  def DownloadSharedFileInBlocks_ReadBlock(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def DownloadSharedFileInBlocks_ReadBlock_32bit(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def GetSharedLinkInfo(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): ISharedFileInfo
}

object ISharedLinkPublicOperations {
  @scala.inline
  def apply(
    DownloadSharedFileInBlocks_Begin: (String, String, INamedValues) => CallbackTo[IFileDownloadSession],
    DownloadSharedFileInBlocks_Begin_32bit: (String, String, INamedValues) => CallbackTo[IFileDownloadSession],
    DownloadSharedFileInBlocks_ReadBlock: (String, String, Double, Double, Double) => CallbackTo[js.Array[Double]],
    DownloadSharedFileInBlocks_ReadBlock_32bit: (String, String, Double, Double, Double) => CallbackTo[js.Array[Double]],
    GetSharedLinkInfo: (String, String, INamedValues) => CallbackTo[ISharedFileInfo]
  ): ISharedLinkPublicOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DownloadSharedFileInBlocks_Begin")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.mfiles.INamedValues) => DownloadSharedFileInBlocks_Begin(t0, t1, t2).runNow()))
    __obj.updateDynamic("DownloadSharedFileInBlocks_Begin_32bit")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.mfiles.INamedValues) => DownloadSharedFileInBlocks_Begin_32bit(t0, t1, t2).runNow()))
    __obj.updateDynamic("DownloadSharedFileInBlocks_ReadBlock")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: scala.Double, t4: scala.Double) => DownloadSharedFileInBlocks_ReadBlock(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("DownloadSharedFileInBlocks_ReadBlock_32bit")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: scala.Double, t4: scala.Double) => DownloadSharedFileInBlocks_ReadBlock_32bit(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("GetSharedLinkInfo")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.mfiles.INamedValues) => GetSharedLinkInfo(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISharedLinkPublicOperations]
  }
}

