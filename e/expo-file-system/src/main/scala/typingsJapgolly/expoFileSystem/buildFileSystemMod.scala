package typingsJapgolly.expoFileSystem

import typingsJapgolly.expoFileSystem.anon.From
import typingsJapgolly.expoFileSystem.anon.Idempotent
import typingsJapgolly.expoFileSystem.anon.Intermediates
import typingsJapgolly.expoFileSystem.anon.Md5
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.DownloadOptions
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.DownloadPauseState
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.DownloadProgressData
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileInfo
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemDownloadResult
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemNetworkTaskProgressCallback
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemRequestDirectoryPermissionsResult
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadOptions
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadResult
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.ReadingOptions
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.UploadProgressData
import typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.WritingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFileSystemMod {
  
  @JSImport("expo-file-system/build/FileSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "DownloadResumable")
  @js.native
  open class DownloadResumable protected () extends FileSystemCancellableNetworkTask[DownloadProgressData] {
    def this(url: String, _fileUri: String) = this()
    def this(url: String, _fileUri: String, options: DownloadOptions) = this()
    def this(
      url: String,
      _fileUri: String,
      options: Unit,
      callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData]
    ) = this()
    def this(
      url: String,
      _fileUri: String,
      options: DownloadOptions,
      callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData]
    ) = this()
    def this(url: String, _fileUri: String, options: Unit, callback: Unit, resumeData: String) = this()
    def this(
      url: String,
      _fileUri: String,
      options: Unit,
      callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData],
      resumeData: String
    ) = this()
    def this(url: String, _fileUri: String, options: DownloadOptions, callback: Unit, resumeData: String) = this()
    def this(
      url: String,
      _fileUri: String,
      options: DownloadOptions,
      callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData],
      resumeData: String
    ) = this()
    
    /* private */ var _fileUri: Any = js.native
    
    /* private */ var callback: Any = js.native
    
    def downloadAsync(): js.Promise[js.UndefOr[FileSystemDownloadResult]] = js.native
    
    def fileUri: String = js.native
    
    /* private */ var options: Any = js.native
    
    def pauseAsync(): js.Promise[DownloadPauseState] = js.native
    
    def resumeAsync(): js.Promise[js.UndefOr[FileSystemDownloadResult]] = js.native
    
    /* private */ var resumeData: Any = js.native
    
    def savable(): DownloadPauseState = js.native
    
    /* private */ var url: Any = js.native
  }
  
  @JSImport("expo-file-system/build/FileSystem", "EncodingType")
  @js.native
  object EncodingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.EncodingType & String] = js.native
    
    /* "base64" */ val Base64: typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.EncodingType.Base64 & String = js.native
    
    /* "utf8" */ val UTF8: typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.EncodingType.UTF8 & String = js.native
  }
  
  /* note: abstract class */ @JSImport("expo-file-system/build/FileSystem", "FileSystemCancellableNetworkTask")
  @js.native
  open class FileSystemCancellableNetworkTask[T /* <: DownloadProgressData | UploadProgressData */] () extends StObject {
    
    /* private */ var _uuid: Any = js.native
    
    /* protected */ def addSubscription(): Unit = js.native
    
    def cancelAsync(): js.Promise[Unit] = js.native
    
    /* private */ var emitter: Any = js.native
    
    /* protected */ def getCallback(): js.UndefOr[FileSystemNetworkTaskProgressCallback[T]] = js.native
    
    /* protected */ def getEventName(): String = js.native
    
    /* protected */ def isTaskCancelled(): Boolean = js.native
    
    /* protected */ def removeSubscription(): Unit = js.native
    
    /* private */ var subscription: Any = js.native
    
    /* protected */ var taskWasCanceled: Boolean = js.native
    
    /* protected */ def uuid: String = js.native
  }
  
  @JSImport("expo-file-system/build/FileSystem", "FileSystemSessionType")
  @js.native
  object FileSystemSessionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemSessionType & Double
      ] = js.native
    
    /* 0 */ val BACKGROUND: typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemSessionType.BACKGROUND & Double = js.native
    
    /* 1 */ val FOREGROUND: typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemSessionType.FOREGROUND & Double = js.native
  }
  
  @JSImport("expo-file-system/build/FileSystem", "FileSystemUploadType")
  @js.native
  object FileSystemUploadType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadType & Double
      ] = js.native
    
    /* 0 */ val BINARY_CONTENT: typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadType.BINARY_CONTENT & Double = js.native
    
    /* 1 */ val MULTIPART: typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod.FileSystemUploadType.MULTIPART & Double = js.native
  }
  
  object StorageAccessFramework {
    
    @JSImport("expo-file-system/build/FileSystem", "StorageAccessFramework")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_FileSystem.copyAsync` */
    inline def copyAsync(options: From): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def createFileAsync(parentUri: String, fileName: String, mimeType: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileAsync")(parentUri.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /* was `typeof imported_FileSystem.deleteAsync` */
    inline def deleteAsync(fileUri: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def deleteAsync(fileUri: String, options: Idempotent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def getUriForDirectoryInRoot(folderName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUriForDirectoryInRoot")(folderName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def makeDirectoryAsync(parentUri: String, dirName: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectoryAsync")(parentUri.asInstanceOf[js.Any], dirName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /* was `typeof imported_FileSystem.moveAsync` */
    inline def moveAsync(options: From): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /* was `typeof imported_FileSystem.readAsStringAsync` */
    inline def readAsStringAsync(fileUri: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def readDirectoryAsync(dirUri: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDirectoryAsync")(dirUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    
    inline def requestDirectoryPermissionsAsync(): js.Promise[FileSystemRequestDirectoryPermissionsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestDirectoryPermissionsAsync")().asInstanceOf[js.Promise[FileSystemRequestDirectoryPermissionsResult]]
    inline def requestDirectoryPermissionsAsync(initialFileUrl: String): js.Promise[FileSystemRequestDirectoryPermissionsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestDirectoryPermissionsAsync")(initialFileUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileSystemRequestDirectoryPermissionsResult]]
    
    /* was `typeof imported_FileSystem.writeAsStringAsync` */
    inline def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("expo-file-system/build/FileSystem", "UploadTask")
  @js.native
  open class UploadTask protected () extends FileSystemCancellableNetworkTask[UploadProgressData] {
    def this(url: String, fileUri: String) = this()
    def this(url: String, fileUri: String, options: FileSystemUploadOptions) = this()
    def this(
      url: String,
      fileUri: String,
      options: Unit,
      callback: FileSystemNetworkTaskProgressCallback[UploadProgressData]
    ) = this()
    def this(
      url: String,
      fileUri: String,
      options: FileSystemUploadOptions,
      callback: FileSystemNetworkTaskProgressCallback[UploadProgressData]
    ) = this()
    
    /* private */ var callback: Any = js.native
    
    /* private */ var fileUri: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def uploadAsync(): js.Promise[js.UndefOr[FileSystemUploadResult]] = js.native
    
    /* private */ var url: Any = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(bundleDirectory) */ @JSImport("expo-file-system/build/FileSystem", "bundledAssets")
  @js.native
  val bundledAssets: String | Null = js.native
  
  @JSImport("expo-file-system/build/FileSystem", "cacheDirectory")
  @js.native
  val cacheDirectory: String | Null = js.native
  
  inline def copyAsync(options: From): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def createDownloadResumable(uri: String, fileUri: String): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(uri: String, fileUri: String, options: Unit, callback: Unit, resumeData: String): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: Unit,
    callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData]
  ): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: Unit,
    callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData],
    resumeData: String
  ): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(uri: String, fileUri: String, options: DownloadOptions, callback: Unit, resumeData: String): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData]
  ): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  inline def createDownloadResumable(
    uri: String,
    fileUri: String,
    options: DownloadOptions,
    callback: FileSystemNetworkTaskProgressCallback[DownloadProgressData],
    resumeData: String
  ): DownloadResumable = (^.asInstanceOf[js.Dynamic].applyDynamic("createDownloadResumable")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], resumeData.asInstanceOf[js.Any])).asInstanceOf[DownloadResumable]
  
  inline def createUploadTask(url: String, fileUri: String): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadTask")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def createUploadTask(
    url: String,
    fileUri: String,
    options: Unit,
    callback: FileSystemNetworkTaskProgressCallback[UploadProgressData]
  ): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadTask")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def createUploadTask(url: String, fileUri: String, options: FileSystemUploadOptions): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadTask")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def createUploadTask(
    url: String,
    fileUri: String,
    options: FileSystemUploadOptions,
    callback: FileSystemNetworkTaskProgressCallback[UploadProgressData]
  ): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadTask")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  
  inline def deleteAsync(fileUri: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def deleteAsync(fileUri: String, options: Idempotent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteLegacyDocumentDirectoryAndroid(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteLegacyDocumentDirectoryAndroid")().asInstanceOf[js.Promise[Unit]]
  
  @JSImport("expo-file-system/build/FileSystem", "documentDirectory")
  @js.native
  val documentDirectory: String | Null = js.native
  
  inline def downloadAsync(uri: String, fileUri: String): js.Promise[FileSystemDownloadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadAsync")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemDownloadResult]]
  inline def downloadAsync(uri: String, fileUri: String, options: DownloadOptions): js.Promise[FileSystemDownloadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadAsync")(uri.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemDownloadResult]]
  
  inline def getContentUriAsync(fileUri: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentUriAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getFreeDiskStorageAsync(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeDiskStorageAsync")().asInstanceOf[js.Promise[Double]]
  
  inline def getInfoAsync(fileUri: String): js.Promise[FileInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfoAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileInfo]]
  inline def getInfoAsync(fileUri: String, options: Md5): js.Promise[FileInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfoAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileInfo]]
  
  inline def getTotalDiskCapacityAsync(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalDiskCapacityAsync")().asInstanceOf[js.Promise[Double]]
  
  inline def makeDirectoryAsync(fileUri: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectoryAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def makeDirectoryAsync(fileUri: String, options: Intermediates): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectoryAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def moveAsync(options: From): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def readAsStringAsync(fileUri: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def readAsStringAsync(fileUri: String, options: ReadingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsStringAsync")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def readDirectoryAsync(fileUri: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDirectoryAsync")(fileUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def uploadAsync(url: String, fileUri: String): js.Promise[FileSystemUploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadAsync")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemUploadResult]]
  inline def uploadAsync(url: String, fileUri: String, options: FileSystemUploadOptions): js.Promise[FileSystemUploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadAsync")(url.asInstanceOf[js.Any], fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystemUploadResult]]
  
  inline def writeAsStringAsync(fileUri: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeAsStringAsync(fileUri: String, contents: String, options: WritingOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsStringAsync")(fileUri.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
