package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFFileFormat
import typingsJapgolly.mfiles.MFiles.MFFileOpenMethod
import typingsJapgolly.mfiles.MFiles.MFLatestSpecificBehavior
import typingsJapgolly.mfiles.MFiles.MFOCRZoneRecognitionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultObjectFileOperations extends js.Object {
  def AddEmptyFile(ObjVer: IObjVer, Title: String, Extension: String): IFileVer
  def AddFile(ObjVer: IObjVer, Title: String, Extension: String, SourcePath: String): IFileVer
  def CloseUploadSession(UploadID: Double): Unit
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean
  ): IObjectVersion
  def DownloadFile(File: Double, FileVersion: Double, FilePath: String): Unit
  def DownloadFileAsDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double): String
  def DownloadFileEx(File: Double, FileVersion: Double, FilePath: String, FileFormat: MFFileFormat): Unit
  def DownloadFileInBlocks_Begin(File: Double, FileVersion: Double): IFileDownloadSession
  def DownloadFileInBlocks_BeginEx(File: Double, FileVersion: Double, FileFormat: MFFileFormat): IFileDownloadSession
  def DownloadFileInBlocks_BeginEx_32bit(File: Double, FileVersion: Double, FileFormat: MFFileFormat): IFileDownloadSession
  def DownloadFileInBlocks_Begin_32bit(File: Double, FileVersion: Double): IFileDownloadSession
  def DownloadFileInBlocks_ReadBlock(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def DownloadFileInBlocks_ReadBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def GetFileSize(FileVer: IFileVer): Double
  def GetFileSize_32bit(FileVer: IFileVer): Double
  def GetFiles(ObjVer: IObjVer): IObjectFiles
  def GetFilesForModificationInEventHandler(ObjVer: IObjVer): IObjectFiles
  def GetLatestFileVersion(FileID: Double, AllowCheckedOut: Boolean): IFileVer
  def GetObjIDOfFile(FileID: Double): IObjID
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean
  ): String
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean
  ): String
  def OpenFileInDefaultApplication(ParentWindow: Double, ObjVer: IObjVer, FileVer: IFileVer, FileOpenMethod: MFFileOpenMethod): Unit
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean
  ): IOCRPageResults
  def RemoveFile(ObjVer: IObjVer, FileVer: IFileVer): IObjectVersion
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean
  ): IObjectVersion
  def UpdateMetadataInFile(ObjVer: IObjVer, File: Double, FailOnUnsupportedFiles: Boolean): IObjectVersion
  def UploadFile(File: Double, FileVersion: Double, FilePath: String): Unit
  def UploadFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit
  def UploadFileBlockBegin(): Double
  def UploadFileBlockBegin_32bit(): Double
  def UploadFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit
  def UploadFileCommit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit
  def UploadFileCommit_32bit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit
  def UploadFromDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double, DataURI: String): Unit
  def UploadTemporaryFile(FilePath: String): Double
  def UploadTemporaryFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit
  def UploadTemporaryFileBlockBegin(FileExtension: String): Double
  def UploadTemporaryFileBlockBegin_32bit(FileExtension: String): Double
  def UploadTemporaryFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit
  def UploadTemporaryFileCommit(UploadID: Double, LogicalSize: Double): Unit
  def UploadTemporaryFileCommit_32bit(UploadID: Double, LogicalSize: Double): Unit
}

object IVaultObjectFileOperations {
  @scala.inline
  def apply(
    AddEmptyFile: (IObjVer, String, String) => CallbackTo[IFileVer],
    AddFile: (IObjVer, String, String, String) => CallbackTo[IFileVer],
    CloseUploadSession: Double => Callback,
    ConvertToPDF: (IObjVer, Double, Boolean, Boolean, Boolean, Boolean) => CallbackTo[IObjectVersion],
    DownloadFile: (Double, Double, String) => Callback,
    DownloadFileAsDataURI: (IObjVer, Double, Double) => CallbackTo[String],
    DownloadFileEx: (Double, Double, String, MFFileFormat) => Callback,
    DownloadFileInBlocks_Begin: (Double, Double) => CallbackTo[IFileDownloadSession],
    DownloadFileInBlocks_BeginEx: (Double, Double, MFFileFormat) => CallbackTo[IFileDownloadSession],
    DownloadFileInBlocks_BeginEx_32bit: (Double, Double, MFFileFormat) => CallbackTo[IFileDownloadSession],
    DownloadFileInBlocks_Begin_32bit: (Double, Double) => CallbackTo[IFileDownloadSession],
    DownloadFileInBlocks_ReadBlock: (Double, Double, Double) => CallbackTo[js.Array[Double]],
    DownloadFileInBlocks_ReadBlock_32bit: (Double, Double, Double) => CallbackTo[js.Array[Double]],
    GetFileSize: IFileVer => CallbackTo[Double],
    GetFileSize_32bit: IFileVer => CallbackTo[Double],
    GetFiles: IObjVer => CallbackTo[IObjectFiles],
    GetFilesForModificationInEventHandler: IObjVer => CallbackTo[IObjectFiles],
    GetLatestFileVersion: (Double, Boolean) => CallbackTo[IFileVer],
    GetObjIDOfFile: Double => CallbackTo[IObjID],
    GetPathInDefaultView: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean) => CallbackTo[String],
    GetPathInDefaultViewEx: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean, Boolean) => CallbackTo[String],
    OpenFileInDefaultApplication: (Double, IObjVer, IFileVer, MFFileOpenMethod) => Callback,
    PerformOCROperation: (IObjVer, IFileVer, IOCROptions, MFOCRZoneRecognitionMode, IOCRPages, Boolean) => CallbackTo[IOCRPageResults],
    RemoveFile: (IObjVer, IFileVer) => CallbackTo[IObjectVersion],
    RenameFile: (IObjVer, IFileVer, String, String, Boolean) => CallbackTo[IObjectVersion],
    UpdateMetadataInFile: (IObjVer, Double, Boolean) => CallbackTo[IObjectVersion],
    UploadFile: (Double, Double, String) => Callback,
    UploadFileBlock: (Double, Double, Double, js.Array[Double]) => Callback,
    UploadFileBlockBegin: CallbackTo[Double],
    UploadFileBlockBegin_32bit: CallbackTo[Double],
    UploadFileBlock_32bit: (Double, Double, Double, js.Array[Double]) => Callback,
    UploadFileCommit: (Double, Double, Double, Double) => Callback,
    UploadFileCommit_32bit: (Double, Double, Double, Double) => Callback,
    UploadFromDataURI: (IObjVer, Double, Double, String) => Callback,
    UploadTemporaryFile: String => CallbackTo[Double],
    UploadTemporaryFileBlock: (Double, Double, Double, js.Array[Double]) => Callback,
    UploadTemporaryFileBlockBegin: String => CallbackTo[Double],
    UploadTemporaryFileBlockBegin_32bit: String => CallbackTo[Double],
    UploadTemporaryFileBlock_32bit: (Double, Double, Double, js.Array[Double]) => Callback,
    UploadTemporaryFileCommit: (Double, Double) => Callback,
    UploadTemporaryFileCommit_32bit: (Double, Double) => Callback
  ): IVaultObjectFileOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddEmptyFile")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IObjVer, t1: java.lang.String, t2: java.lang.String) => AddEmptyFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("AddFile")(js.Any.fromFunction4((t0: typingsJapgolly.mfiles.IObjVer, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => AddFile(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("CloseUploadSession")(js.Any.fromFunction1((t0: scala.Double) => CloseUploadSession(t0).runNow()))
    __obj.updateDynamic("ConvertToPDF")(js.Any.fromFunction6((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Double, t2: scala.Boolean, t3: scala.Boolean, t4: scala.Boolean, t5: scala.Boolean) => ConvertToPDF(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("DownloadFile")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: java.lang.String) => DownloadFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("DownloadFileAsDataURI")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Double, t2: scala.Double) => DownloadFileAsDataURI(t0, t1, t2).runNow()))
    __obj.updateDynamic("DownloadFileEx")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: java.lang.String, t3: typingsJapgolly.mfiles.MFiles.MFFileFormat) => DownloadFileEx(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("DownloadFileInBlocks_Begin")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => DownloadFileInBlocks_Begin(t0, t1).runNow()))
    __obj.updateDynamic("DownloadFileInBlocks_BeginEx")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: typingsJapgolly.mfiles.MFiles.MFFileFormat) => DownloadFileInBlocks_BeginEx(t0, t1, t2).runNow()))
    __obj.updateDynamic("DownloadFileInBlocks_BeginEx_32bit")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: typingsJapgolly.mfiles.MFiles.MFFileFormat) => DownloadFileInBlocks_BeginEx_32bit(t0, t1, t2).runNow()))
    __obj.updateDynamic("DownloadFileInBlocks_Begin_32bit")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => DownloadFileInBlocks_Begin_32bit(t0, t1).runNow()))
    __obj.updateDynamic("DownloadFileInBlocks_ReadBlock")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => DownloadFileInBlocks_ReadBlock(t0, t1, t2).runNow()))
    __obj.updateDynamic("DownloadFileInBlocks_ReadBlock_32bit")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => DownloadFileInBlocks_ReadBlock_32bit(t0, t1, t2).runNow()))
    __obj.updateDynamic("GetFileSize")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IFileVer) => GetFileSize(t0).runNow()))
    __obj.updateDynamic("GetFileSize_32bit")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IFileVer) => GetFileSize_32bit(t0).runNow()))
    __obj.updateDynamic("GetFiles")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => GetFiles(t0).runNow()))
    __obj.updateDynamic("GetFilesForModificationInEventHandler")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => GetFilesForModificationInEventHandler(t0).runNow()))
    __obj.updateDynamic("GetLatestFileVersion")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => GetLatestFileVersion(t0, t1).runNow()))
    __obj.updateDynamic("GetObjIDOfFile")(js.Any.fromFunction1((t0: scala.Double) => GetObjIDOfFile(t0).runNow()))
    __obj.updateDynamic("GetPathInDefaultView")(js.Any.fromFunction6((t0: typingsJapgolly.mfiles.IObjID, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: typingsJapgolly.mfiles.MFiles.MFLatestSpecificBehavior, t5: scala.Boolean) => GetPathInDefaultView(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("GetPathInDefaultViewEx")(js.Any.fromFunction7((t0: typingsJapgolly.mfiles.IObjID, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: typingsJapgolly.mfiles.MFiles.MFLatestSpecificBehavior, t5: scala.Boolean, t6: scala.Boolean) => GetPathInDefaultViewEx(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.updateDynamic("OpenFileInDefaultApplication")(js.Any.fromFunction4((t0: scala.Double, t1: typingsJapgolly.mfiles.IObjVer, t2: typingsJapgolly.mfiles.IFileVer, t3: typingsJapgolly.mfiles.MFiles.MFFileOpenMethod) => OpenFileInDefaultApplication(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("PerformOCROperation")(js.Any.fromFunction6((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IFileVer, t2: typingsJapgolly.mfiles.IOCROptions, t3: typingsJapgolly.mfiles.MFiles.MFOCRZoneRecognitionMode, t4: typingsJapgolly.mfiles.IOCRPages, t5: scala.Boolean) => PerformOCROperation(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("RemoveFile")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IFileVer) => RemoveFile(t0, t1).runNow()))
    __obj.updateDynamic("RenameFile")(js.Any.fromFunction5((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IFileVer, t2: java.lang.String, t3: java.lang.String, t4: scala.Boolean) => RenameFile(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("UpdateMetadataInFile")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Double, t2: scala.Boolean) => UpdateMetadataInFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("UploadFile")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: java.lang.String) => UploadFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("UploadFileBlock")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: js.Array[scala.Double]) => UploadFileBlock(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("UploadFileBlockBegin")(UploadFileBlockBegin.toJsFn)
    __obj.updateDynamic("UploadFileBlockBegin_32bit")(UploadFileBlockBegin_32bit.toJsFn)
    __obj.updateDynamic("UploadFileBlock_32bit")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: js.Array[scala.Double]) => UploadFileBlock_32bit(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("UploadFileCommit")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => UploadFileCommit(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("UploadFileCommit_32bit")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => UploadFileCommit_32bit(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("UploadFromDataURI")(js.Any.fromFunction4((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Double, t2: scala.Double, t3: java.lang.String) => UploadFromDataURI(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("UploadTemporaryFile")(js.Any.fromFunction1((t0: java.lang.String) => UploadTemporaryFile(t0).runNow()))
    __obj.updateDynamic("UploadTemporaryFileBlock")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: js.Array[scala.Double]) => UploadTemporaryFileBlock(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("UploadTemporaryFileBlockBegin")(js.Any.fromFunction1((t0: java.lang.String) => UploadTemporaryFileBlockBegin(t0).runNow()))
    __obj.updateDynamic("UploadTemporaryFileBlockBegin_32bit")(js.Any.fromFunction1((t0: java.lang.String) => UploadTemporaryFileBlockBegin_32bit(t0).runNow()))
    __obj.updateDynamic("UploadTemporaryFileBlock_32bit")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: js.Array[scala.Double]) => UploadTemporaryFileBlock_32bit(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("UploadTemporaryFileCommit")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => UploadTemporaryFileCommit(t0, t1).runNow()))
    __obj.updateDynamic("UploadTemporaryFileCommit_32bit")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => UploadTemporaryFileCommit_32bit(t0, t1).runNow()))
    __obj.asInstanceOf[IVaultObjectFileOperations]
  }
}

