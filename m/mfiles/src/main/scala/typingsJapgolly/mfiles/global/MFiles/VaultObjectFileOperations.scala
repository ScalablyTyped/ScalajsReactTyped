package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IFileDownloadSession
import typingsJapgolly.mfiles.IFileVer
import typingsJapgolly.mfiles.IOCROptions
import typingsJapgolly.mfiles.IOCRPageResults
import typingsJapgolly.mfiles.IOCRPages
import typingsJapgolly.mfiles.IObjID
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjectFiles
import typingsJapgolly.mfiles.IObjectVersion
import typingsJapgolly.mfiles.IVaultObjectFileOperations
import typingsJapgolly.mfiles.MFiles.MFFileFormat
import typingsJapgolly.mfiles.MFiles.MFFileOpenMethod
import typingsJapgolly.mfiles.MFiles.MFLatestSpecificBehavior
import typingsJapgolly.mfiles.MFiles.MFOCRZoneRecognitionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultObjectFileOperations")
@js.native
open class VaultObjectFileOperations ()
  extends StObject
     with IVaultObjectFileOperations {
  
  /* CompleteClass */
  override def AddEmptyFile(ObjVer: IObjVer, Title: String, Extension: String): IFileVer = js.native
  
  /* CompleteClass */
  override def AddFile(ObjVer: IObjVer, Title: String, Extension: String, SourcePath: String): IFileVer = js.native
  
  /* CompleteClass */
  override def CloseUploadSession(UploadID: Double): Unit = js.native
  
  /* CompleteClass */
  override def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean
  ): IObjectVersion = js.native
  
  /* CompleteClass */
  override def DownloadFile(File: Double, FileVersion: Double, FilePath: String): Unit = js.native
  
  /* CompleteClass */
  override def DownloadFileAsDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double): String = js.native
  
  /* CompleteClass */
  override def DownloadFileEx(File: Double, FileVersion: Double, FilePath: String, FileFormat: MFFileFormat): Unit = js.native
  
  /* CompleteClass */
  override def DownloadFileInBlocks_Begin(File: Double, FileVersion: Double): IFileDownloadSession = js.native
  
  /* CompleteClass */
  override def DownloadFileInBlocks_BeginEx(File: Double, FileVersion: Double, FileFormat: MFFileFormat): IFileDownloadSession = js.native
  
  /* CompleteClass */
  override def DownloadFileInBlocks_BeginEx_32bit(File: Double, FileVersion: Double, FileFormat: MFFileFormat): IFileDownloadSession = js.native
  
  /* CompleteClass */
  override def DownloadFileInBlocks_Begin_32bit(File: Double, FileVersion: Double): IFileDownloadSession = js.native
  
  /* CompleteClass */
  override def DownloadFileInBlocks_ReadBlock(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def DownloadFileInBlocks_ReadBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def GetFileSize(FileVer: IFileVer): Double = js.native
  
  /* CompleteClass */
  override def GetFileSize_32bit(FileVer: IFileVer): Double = js.native
  
  /* CompleteClass */
  override def GetFiles(ObjVer: IObjVer): IObjectFiles = js.native
  
  /* CompleteClass */
  override def GetFilesForModificationInEventHandler(ObjVer: IObjVer): IObjectFiles = js.native
  
  /* CompleteClass */
  override def GetLatestFileVersion(FileID: Double, AllowCheckedOut: Boolean): IFileVer = js.native
  
  /* CompleteClass */
  override def GetObjIDOfFile(FileID: Double): IObjID = js.native
  
  /* CompleteClass */
  override def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean
  ): String = js.native
  
  /* CompleteClass */
  override def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean
  ): String = js.native
  
  /* CompleteClass */
  override def OpenFileInDefaultApplication(ParentWindow: Double, ObjVer: IObjVer, FileVer: IFileVer, FileOpenMethod: MFFileOpenMethod): Unit = js.native
  
  /* CompleteClass */
  override def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean
  ): IOCRPageResults = js.native
  
  /* CompleteClass */
  override def RemoveFile(ObjVer: IObjVer, FileVer: IFileVer): IObjectVersion = js.native
  
  /* CompleteClass */
  override def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean
  ): IObjectVersion = js.native
  
  /* CompleteClass */
  override def UpdateMetadataInFile(ObjVer: IObjVer, File: Double, FailOnUnsupportedFiles: Boolean): IObjectVersion = js.native
  
  /* CompleteClass */
  override def UploadFile(File: Double, FileVersion: Double, FilePath: String): Unit = js.native
  
  /* CompleteClass */
  override def UploadFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  
  /* CompleteClass */
  override def UploadFileBlockBegin(): Double = js.native
  
  /* CompleteClass */
  override def UploadFileBlockBegin_32bit(): Double = js.native
  
  /* CompleteClass */
  override def UploadFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  
  /* CompleteClass */
  override def UploadFileCommit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit = js.native
  
  /* CompleteClass */
  override def UploadFileCommit_32bit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit = js.native
  
  /* CompleteClass */
  override def UploadFromDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double, DataURI: String): Unit = js.native
  
  /* CompleteClass */
  override def UploadTemporaryFile(FilePath: String): Double = js.native
  
  /* CompleteClass */
  override def UploadTemporaryFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  
  /* CompleteClass */
  override def UploadTemporaryFileBlockBegin(FileExtension: String): Double = js.native
  
  /* CompleteClass */
  override def UploadTemporaryFileBlockBegin_32bit(FileExtension: String): Double = js.native
  
  /* CompleteClass */
  override def UploadTemporaryFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  
  /* CompleteClass */
  override def UploadTemporaryFileCommit(UploadID: Double, LogicalSize: Double): Unit = js.native
  
  /* CompleteClass */
  override def UploadTemporaryFileCommit_32bit(UploadID: Double, LogicalSize: Double): Unit = js.native
}
