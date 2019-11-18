package typingsJapgolly.expoDashFileDashSystem

import typingsJapgolly.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadOptions
import typingsJapgolly.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadProgressCallback
import typingsJapgolly.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadResult
import typingsJapgolly.expoDashFileDashSystem.buildFileSystemDotTypesMod.FileInfo
import typingsJapgolly.expoDashFileDashSystem.buildFileSystemDotTypesMod.ReadingOptions
import typingsJapgolly.expoDashFileDashSystem.buildFileSystemDotTypesMod.WritingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-file-system", JSImport.Namespace)
@js.native
object expoDashFileDashSystemMod extends js.Object {
  @js.native
  class DownloadResumable protected ()
    extends typingsJapgolly.expoDashFileDashSystem.buildFileSystemMod.DownloadResumable {
    def this(url: String, fileUri: String) = this()
    def this(url: String, fileUri: String, options: DownloadOptions) = this()
    def this(url: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
    def this(
      url: String,
      fileUri: String,
      options: DownloadOptions,
      callback: DownloadProgressCallback,
      resumeData: String
    ) = this()
  }
  
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(bundleDirectory) */ val bundledAssets: String | Null = js.native
  val cacheDirectory: String | Null = js.native
  val documentDirectory: String | Null = js.native
  def copyAsync(options: Anon_From): js.Promise[Unit] = js.native
  def createDownloadResumable(uri: String, fileUri: String): typingsJapgolly.expoDashFileDashSystem.buildFileSystemMod.DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): typingsJapgolly.expoDashFileDashSystem.buildFileSystemMod.DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback): typingsJapgolly.expoDashFileDashSystem.buildFileSystemMod.DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ): typingsJapgolly.expoDashFileDashSystem.buildFileSystemMod.DownloadResumable = js.native
  def deleteAsync(fileUri: String): js.Promise[Unit] = js.native
  def deleteAsync(fileUri: String, options: Anon_Idempotent): js.Promise[Unit] = js.native
  def downloadAsync(uri: String, fileUri: String): js.Promise[DownloadResult] = js.native
  def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[DownloadResult] = js.native
  def getContentUriAsync(fileUri: String): js.Promise[String] = js.native
  def getFreeDiskStorageAsync(): js.Promise[Double] = js.native
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = js.native
  def getInfoAsync(fileUri: String, options: Anon_Md5): js.Promise[FileInfo] = js.native
  def getTotalDiskCapacityAsync(): js.Promise[Double] = js.native
  def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = js.native
  def makeDirectoryAsync(fileUri: String, options: Anon_Intermediates): js.Promise[Unit] = js.native
  def moveAsync(options: Anon_From): js.Promise[Unit] = js.native
  def readAsStringAsync(fileUri: String): js.Promise[String] = js.native
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = js.native
  def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = js.native
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = js.native
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = js.native
  @js.native
  object EncodingType extends js.Object {
    /* "base64" */ val Base64: typingsJapgolly.expoDashFileDashSystem.buildFileSystemDotTypesMod.EncodingType.Base64 with String = js.native
    /* "utf8" */ val UTF8: typingsJapgolly.expoDashFileDashSystem.buildFileSystemDotTypesMod.EncodingType.UTF8 with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.expoDashFileDashSystem.buildFileSystemDotTypesMod.EncodingType with String
      ] = js.native
  }
  
}

