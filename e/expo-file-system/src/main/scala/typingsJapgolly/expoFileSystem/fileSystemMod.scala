package typingsJapgolly.expoFileSystem

import typingsJapgolly.expoFileSystem.fileSystemTypesMod.DownloadOptions
import typingsJapgolly.expoFileSystem.fileSystemTypesMod.DownloadPauseState
import typingsJapgolly.expoFileSystem.fileSystemTypesMod.DownloadProgressCallback
import typingsJapgolly.expoFileSystem.fileSystemTypesMod.DownloadResult
import typingsJapgolly.expoFileSystem.fileSystemTypesMod.FileInfo
import typingsJapgolly.expoFileSystem.fileSystemTypesMod.ReadingOptions
import typingsJapgolly.expoFileSystem.fileSystemTypesMod.WritingOptions
import typingsJapgolly.unimodulesCore.mod.EventEmitter
import typingsJapgolly.unimodulesReactNativeAdapter.eventEmitterMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-file-system/build/FileSystem", JSImport.Namespace)
@js.native
object fileSystemMod extends js.Object {
  @js.native
  class DownloadResumable protected () extends js.Object {
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
    var _callback: js.UndefOr[DownloadProgressCallback] = js.native
    var _emitter: EventEmitter = js.native
    var _fileUri: String = js.native
    var _options: DownloadOptions = js.native
    var _resumeData: js.UndefOr[String] = js.native
    var _subscription: js.UndefOr[Subscription | Null] = js.native
    var _url: String = js.native
    var _uuid: String = js.native
    def _addSubscription(): Unit = js.native
    def _removeSubscription(): Unit = js.native
    def downloadAsync(): js.Promise[js.UndefOr[DownloadResult]] = js.native
    def pauseAsync(): js.Promise[DownloadPauseState] = js.native
    def resumeAsync(): js.Promise[js.UndefOr[DownloadResult]] = js.native
    def savable(): DownloadPauseState = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(bundleDirectory) */ val bundledAssets: String | Null = js.native
  val cacheDirectory: String | Null = js.native
  val documentDirectory: String | Null = js.native
  def copyAsync(options: AnonFrom): js.Promise[Unit] = js.native
  def createDownloadResumable(uri: String, fileUri: String): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): DownloadResumable = js.native
  def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback): DownloadResumable = js.native
  def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ): DownloadResumable = js.native
  def deleteAsync(fileUri: String): js.Promise[Unit] = js.native
  def deleteAsync(fileUri: String, options: AnonIdempotent): js.Promise[Unit] = js.native
  def downloadAsync(uri: String, fileUri: String): js.Promise[DownloadResult] = js.native
  def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[DownloadResult] = js.native
  def getContentUriAsync(fileUri: String): js.Promise[String] = js.native
  def getFreeDiskStorageAsync(): js.Promise[Double] = js.native
  def getInfoAsync(fileUri: String): js.Promise[FileInfo] = js.native
  def getInfoAsync(fileUri: String, options: AnonMd5): js.Promise[FileInfo] = js.native
  def getTotalDiskCapacityAsync(): js.Promise[Double] = js.native
  def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = js.native
  def makeDirectoryAsync(fileUri: String, options: AnonIntermediates): js.Promise[Unit] = js.native
  def moveAsync(options: AnonFrom): js.Promise[Unit] = js.native
  def readAsStringAsync(fileUri: String): js.Promise[String] = js.native
  def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = js.native
  def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = js.native
  def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = js.native
  def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = js.native
  @js.native
  object EncodingType extends js.Object {
    /* "base64" */ val Base64: typingsJapgolly.expoFileSystem.fileSystemTypesMod.EncodingType.Base64 with String = js.native
    /* "utf8" */ val UTF8: typingsJapgolly.expoFileSystem.fileSystemTypesMod.EncodingType.UTF8 with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expoFileSystem.fileSystemTypesMod.EncodingType with String] = js.native
  }
  
}

