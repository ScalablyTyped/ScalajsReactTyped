package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFFileFormat
import typingsJapgolly.mfiles.MFiles.MFFileOpenMethod
import typingsJapgolly.mfiles.MFiles.MFLatestSpecificBehavior
import typingsJapgolly.mfiles.MFiles.MFOCRZoneRecognitionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultObjectFileOperations extends StObject {
  
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
  
  inline def apply(
    AddEmptyFile: (IObjVer, String, String) => IFileVer,
    AddFile: (IObjVer, String, String, String) => IFileVer,
    CloseUploadSession: Double => Callback,
    ConvertToPDF: (IObjVer, Double, Boolean, Boolean, Boolean, Boolean) => IObjectVersion,
    DownloadFile: (Double, Double, String) => Callback,
    DownloadFileAsDataURI: (IObjVer, Double, Double) => String,
    DownloadFileEx: (Double, Double, String, MFFileFormat) => Callback,
    DownloadFileInBlocks_Begin: (Double, Double) => IFileDownloadSession,
    DownloadFileInBlocks_BeginEx: (Double, Double, MFFileFormat) => IFileDownloadSession,
    DownloadFileInBlocks_BeginEx_32bit: (Double, Double, MFFileFormat) => IFileDownloadSession,
    DownloadFileInBlocks_Begin_32bit: (Double, Double) => IFileDownloadSession,
    DownloadFileInBlocks_ReadBlock: (Double, Double, Double) => js.Array[Double],
    DownloadFileInBlocks_ReadBlock_32bit: (Double, Double, Double) => js.Array[Double],
    GetFileSize: IFileVer => Double,
    GetFileSize_32bit: IFileVer => Double,
    GetFiles: IObjVer => IObjectFiles,
    GetFilesForModificationInEventHandler: IObjVer => IObjectFiles,
    GetLatestFileVersion: (Double, Boolean) => IFileVer,
    GetObjIDOfFile: Double => IObjID,
    GetPathInDefaultView: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean) => String,
    GetPathInDefaultViewEx: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean, Boolean) => String,
    OpenFileInDefaultApplication: (Double, IObjVer, IFileVer, MFFileOpenMethod) => Callback,
    PerformOCROperation: (IObjVer, IFileVer, IOCROptions, MFOCRZoneRecognitionMode, IOCRPages, Boolean) => IOCRPageResults,
    RemoveFile: (IObjVer, IFileVer) => IObjectVersion,
    RenameFile: (IObjVer, IFileVer, String, String, Boolean) => IObjectVersion,
    UpdateMetadataInFile: (IObjVer, Double, Boolean) => IObjectVersion,
    UploadFile: (Double, Double, String) => Callback,
    UploadFileBlock: (Double, Double, Double, js.Array[Double]) => Callback,
    UploadFileBlockBegin: CallbackTo[Double],
    UploadFileBlockBegin_32bit: CallbackTo[Double],
    UploadFileBlock_32bit: (Double, Double, Double, js.Array[Double]) => Callback,
    UploadFileCommit: (Double, Double, Double, Double) => Callback,
    UploadFileCommit_32bit: (Double, Double, Double, Double) => Callback,
    UploadFromDataURI: (IObjVer, Double, Double, String) => Callback,
    UploadTemporaryFile: String => Double,
    UploadTemporaryFileBlock: (Double, Double, Double, js.Array[Double]) => Callback,
    UploadTemporaryFileBlockBegin: String => Double,
    UploadTemporaryFileBlockBegin_32bit: String => Double,
    UploadTemporaryFileBlock_32bit: (Double, Double, Double, js.Array[Double]) => Callback,
    UploadTemporaryFileCommit: (Double, Double) => Callback,
    UploadTemporaryFileCommit_32bit: (Double, Double) => Callback
  ): IVaultObjectFileOperations = {
    val __obj = js.Dynamic.literal(AddEmptyFile = js.Any.fromFunction3(AddEmptyFile), AddFile = js.Any.fromFunction4(AddFile), CloseUploadSession = js.Any.fromFunction1((t0: Double) => CloseUploadSession(t0).runNow()), ConvertToPDF = js.Any.fromFunction6(ConvertToPDF), DownloadFile = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (DownloadFile(t0, t1, t2)).runNow()), DownloadFileAsDataURI = js.Any.fromFunction3(DownloadFileAsDataURI), DownloadFileEx = js.Any.fromFunction4((t0: Double, t1: Double, t2: String, t3: MFFileFormat) => (DownloadFileEx(t0, t1, t2, t3)).runNow()), DownloadFileInBlocks_Begin = js.Any.fromFunction2(DownloadFileInBlocks_Begin), DownloadFileInBlocks_BeginEx = js.Any.fromFunction3(DownloadFileInBlocks_BeginEx), DownloadFileInBlocks_BeginEx_32bit = js.Any.fromFunction3(DownloadFileInBlocks_BeginEx_32bit), DownloadFileInBlocks_Begin_32bit = js.Any.fromFunction2(DownloadFileInBlocks_Begin_32bit), DownloadFileInBlocks_ReadBlock = js.Any.fromFunction3(DownloadFileInBlocks_ReadBlock), DownloadFileInBlocks_ReadBlock_32bit = js.Any.fromFunction3(DownloadFileInBlocks_ReadBlock_32bit), GetFileSize = js.Any.fromFunction1(GetFileSize), GetFileSize_32bit = js.Any.fromFunction1(GetFileSize_32bit), GetFiles = js.Any.fromFunction1(GetFiles), GetFilesForModificationInEventHandler = js.Any.fromFunction1(GetFilesForModificationInEventHandler), GetLatestFileVersion = js.Any.fromFunction2(GetLatestFileVersion), GetObjIDOfFile = js.Any.fromFunction1(GetObjIDOfFile), GetPathInDefaultView = js.Any.fromFunction6(GetPathInDefaultView), GetPathInDefaultViewEx = js.Any.fromFunction7(GetPathInDefaultViewEx), OpenFileInDefaultApplication = js.Any.fromFunction4((t0: Double, t1: IObjVer, t2: IFileVer, t3: MFFileOpenMethod) => (OpenFileInDefaultApplication(t0, t1, t2, t3)).runNow()), PerformOCROperation = js.Any.fromFunction6(PerformOCROperation), RemoveFile = js.Any.fromFunction2(RemoveFile), RenameFile = js.Any.fromFunction5(RenameFile), UpdateMetadataInFile = js.Any.fromFunction3(UpdateMetadataInFile), UploadFile = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (UploadFile(t0, t1, t2)).runNow()), UploadFileBlock = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: js.Array[Double]) => (UploadFileBlock(t0, t1, t2, t3)).runNow()), UploadFileBlockBegin = UploadFileBlockBegin.toJsFn, UploadFileBlockBegin_32bit = UploadFileBlockBegin_32bit.toJsFn, UploadFileBlock_32bit = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: js.Array[Double]) => (UploadFileBlock_32bit(t0, t1, t2, t3)).runNow()), UploadFileCommit = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (UploadFileCommit(t0, t1, t2, t3)).runNow()), UploadFileCommit_32bit = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (UploadFileCommit_32bit(t0, t1, t2, t3)).runNow()), UploadFromDataURI = js.Any.fromFunction4((t0: IObjVer, t1: Double, t2: Double, t3: String) => (UploadFromDataURI(t0, t1, t2, t3)).runNow()), UploadTemporaryFile = js.Any.fromFunction1(UploadTemporaryFile), UploadTemporaryFileBlock = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: js.Array[Double]) => (UploadTemporaryFileBlock(t0, t1, t2, t3)).runNow()), UploadTemporaryFileBlockBegin = js.Any.fromFunction1(UploadTemporaryFileBlockBegin), UploadTemporaryFileBlockBegin_32bit = js.Any.fromFunction1(UploadTemporaryFileBlockBegin_32bit), UploadTemporaryFileBlock_32bit = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: js.Array[Double]) => (UploadTemporaryFileBlock_32bit(t0, t1, t2, t3)).runNow()), UploadTemporaryFileCommit = js.Any.fromFunction2((t0: Double, t1: Double) => (UploadTemporaryFileCommit(t0, t1)).runNow()), UploadTemporaryFileCommit_32bit = js.Any.fromFunction2((t0: Double, t1: Double) => (UploadTemporaryFileCommit_32bit(t0, t1)).runNow()))
    __obj.asInstanceOf[IVaultObjectFileOperations]
  }
  
  extension [Self <: IVaultObjectFileOperations](x: Self) {
    
    inline def setAddEmptyFile(value: (IObjVer, String, String) => IFileVer): Self = StObject.set(x, "AddEmptyFile", js.Any.fromFunction3(value))
    
    inline def setAddFile(value: (IObjVer, String, String, String) => IFileVer): Self = StObject.set(x, "AddFile", js.Any.fromFunction4(value))
    
    inline def setCloseUploadSession(value: Double => Callback): Self = StObject.set(x, "CloseUploadSession", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setConvertToPDF(value: (IObjVer, Double, Boolean, Boolean, Boolean, Boolean) => IObjectVersion): Self = StObject.set(x, "ConvertToPDF", js.Any.fromFunction6(value))
    
    inline def setDownloadFile(value: (Double, Double, String) => Callback): Self = StObject.set(x, "DownloadFile", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setDownloadFileAsDataURI(value: (IObjVer, Double, Double) => String): Self = StObject.set(x, "DownloadFileAsDataURI", js.Any.fromFunction3(value))
    
    inline def setDownloadFileEx(value: (Double, Double, String, MFFileFormat) => Callback): Self = StObject.set(x, "DownloadFileEx", js.Any.fromFunction4((t0: Double, t1: Double, t2: String, t3: MFFileFormat) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDownloadFileInBlocks_Begin(value: (Double, Double) => IFileDownloadSession): Self = StObject.set(x, "DownloadFileInBlocks_Begin", js.Any.fromFunction2(value))
    
    inline def setDownloadFileInBlocks_BeginEx(value: (Double, Double, MFFileFormat) => IFileDownloadSession): Self = StObject.set(x, "DownloadFileInBlocks_BeginEx", js.Any.fromFunction3(value))
    
    inline def setDownloadFileInBlocks_BeginEx_32bit(value: (Double, Double, MFFileFormat) => IFileDownloadSession): Self = StObject.set(x, "DownloadFileInBlocks_BeginEx_32bit", js.Any.fromFunction3(value))
    
    inline def setDownloadFileInBlocks_Begin_32bit(value: (Double, Double) => IFileDownloadSession): Self = StObject.set(x, "DownloadFileInBlocks_Begin_32bit", js.Any.fromFunction2(value))
    
    inline def setDownloadFileInBlocks_ReadBlock(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "DownloadFileInBlocks_ReadBlock", js.Any.fromFunction3(value))
    
    inline def setDownloadFileInBlocks_ReadBlock_32bit(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "DownloadFileInBlocks_ReadBlock_32bit", js.Any.fromFunction3(value))
    
    inline def setGetFileSize(value: IFileVer => Double): Self = StObject.set(x, "GetFileSize", js.Any.fromFunction1(value))
    
    inline def setGetFileSize_32bit(value: IFileVer => Double): Self = StObject.set(x, "GetFileSize_32bit", js.Any.fromFunction1(value))
    
    inline def setGetFiles(value: IObjVer => IObjectFiles): Self = StObject.set(x, "GetFiles", js.Any.fromFunction1(value))
    
    inline def setGetFilesForModificationInEventHandler(value: IObjVer => IObjectFiles): Self = StObject.set(x, "GetFilesForModificationInEventHandler", js.Any.fromFunction1(value))
    
    inline def setGetLatestFileVersion(value: (Double, Boolean) => IFileVer): Self = StObject.set(x, "GetLatestFileVersion", js.Any.fromFunction2(value))
    
    inline def setGetObjIDOfFile(value: Double => IObjID): Self = StObject.set(x, "GetObjIDOfFile", js.Any.fromFunction1(value))
    
    inline def setGetPathInDefaultView(value: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean) => String): Self = StObject.set(x, "GetPathInDefaultView", js.Any.fromFunction6(value))
    
    inline def setGetPathInDefaultViewEx(value: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean, Boolean) => String): Self = StObject.set(x, "GetPathInDefaultViewEx", js.Any.fromFunction7(value))
    
    inline def setOpenFileInDefaultApplication(value: (Double, IObjVer, IFileVer, MFFileOpenMethod) => Callback): Self = StObject.set(x, "OpenFileInDefaultApplication", js.Any.fromFunction4((t0: Double, t1: IObjVer, t2: IFileVer, t3: MFFileOpenMethod) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setPerformOCROperation(
      value: (IObjVer, IFileVer, IOCROptions, MFOCRZoneRecognitionMode, IOCRPages, Boolean) => IOCRPageResults
    ): Self = StObject.set(x, "PerformOCROperation", js.Any.fromFunction6(value))
    
    inline def setRemoveFile(value: (IObjVer, IFileVer) => IObjectVersion): Self = StObject.set(x, "RemoveFile", js.Any.fromFunction2(value))
    
    inline def setRenameFile(value: (IObjVer, IFileVer, String, String, Boolean) => IObjectVersion): Self = StObject.set(x, "RenameFile", js.Any.fromFunction5(value))
    
    inline def setUpdateMetadataInFile(value: (IObjVer, Double, Boolean) => IObjectVersion): Self = StObject.set(x, "UpdateMetadataInFile", js.Any.fromFunction3(value))
    
    inline def setUploadFile(value: (Double, Double, String) => Callback): Self = StObject.set(x, "UploadFile", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setUploadFileBlock(value: (Double, Double, Double, js.Array[Double]) => Callback): Self = StObject.set(x, "UploadFileBlock", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: js.Array[Double]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUploadFileBlockBegin(value: CallbackTo[Double]): Self = StObject.set(x, "UploadFileBlockBegin", value.toJsFn)
    
    inline def setUploadFileBlockBegin_32bit(value: CallbackTo[Double]): Self = StObject.set(x, "UploadFileBlockBegin_32bit", value.toJsFn)
    
    inline def setUploadFileBlock_32bit(value: (Double, Double, Double, js.Array[Double]) => Callback): Self = StObject.set(x, "UploadFileBlock_32bit", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: js.Array[Double]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUploadFileCommit(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "UploadFileCommit", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUploadFileCommit_32bit(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "UploadFileCommit_32bit", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUploadFromDataURI(value: (IObjVer, Double, Double, String) => Callback): Self = StObject.set(x, "UploadFromDataURI", js.Any.fromFunction4((t0: IObjVer, t1: Double, t2: Double, t3: String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUploadTemporaryFile(value: String => Double): Self = StObject.set(x, "UploadTemporaryFile", js.Any.fromFunction1(value))
    
    inline def setUploadTemporaryFileBlock(value: (Double, Double, Double, js.Array[Double]) => Callback): Self = StObject.set(x, "UploadTemporaryFileBlock", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: js.Array[Double]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUploadTemporaryFileBlockBegin(value: String => Double): Self = StObject.set(x, "UploadTemporaryFileBlockBegin", js.Any.fromFunction1(value))
    
    inline def setUploadTemporaryFileBlockBegin_32bit(value: String => Double): Self = StObject.set(x, "UploadTemporaryFileBlockBegin_32bit", js.Any.fromFunction1(value))
    
    inline def setUploadTemporaryFileBlock_32bit(value: (Double, Double, Double, js.Array[Double]) => Callback): Self = StObject.set(x, "UploadTemporaryFileBlock_32bit", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: js.Array[Double]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUploadTemporaryFileCommit(value: (Double, Double) => Callback): Self = StObject.set(x, "UploadTemporaryFileCommit", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUploadTemporaryFileCommit_32bit(value: (Double, Double) => Callback): Self = StObject.set(x, "UploadTemporaryFileCommit_32bit", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
