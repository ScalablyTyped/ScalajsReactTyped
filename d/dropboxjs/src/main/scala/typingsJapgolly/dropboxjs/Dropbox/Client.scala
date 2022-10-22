package typingsJapgolly.dropboxjs.Dropbox

import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.dropboxjs.Dropbox.AuthDriver.IAuthDriver
import typingsJapgolly.dropboxjs.Dropbox.File.CopyReference
import typingsJapgolly.dropboxjs.Dropbox.File.ShareUrl
import typingsJapgolly.dropboxjs.Dropbox.File.Stat
import typingsJapgolly.dropboxjs.Dropbox.File.StatOptions
import typingsJapgolly.dropboxjs.Dropbox.Http.AppInfo
import typingsJapgolly.dropboxjs.Dropbox.Http.PollResult
import typingsJapgolly.dropboxjs.Dropbox.Http.PulledChanges
import typingsJapgolly.dropboxjs.Dropbox.Http.UploadCursor
import typingsJapgolly.dropboxjs.Dropbox.Util.EventSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends StObject {
  
  def appHash(): String = js.native
  
  def appInfo(appKey: String, callback: js.Function2[/* err */ ApiError, /* changes */ AppInfo, Unit]): XMLHttpRequest = js.native
  def appInfo(callback: js.Function2[/* err */ ApiError, /* changes */ AppInfo, Unit]): XMLHttpRequest = js.native
  
  def authDriver(driver: IAuthDriver): Client = js.native
  
  var authStep: Double = js.native
  
  // TODO check the error interface
  def authenticate(): Client = js.native
  def authenticate(callback: AuthenticateCallback): Client = js.native
  def authenticate(options: AuthenticateOptions): Client = js.native
  def authenticate(options: AuthenticateOptions, callback: AuthenticateCallback): Client = js.native
  
  def copy(from: String, toPath: String, callback: FileStatCallback): XMLHttpRequest = js.native
  def copy(from: CopyReference, toPath: String, callback: FileStatCallback): XMLHttpRequest = js.native
  
  def copyRef(path: String, callback: js.Function2[/* err */ ApiError, /* copyReference */ CopyReference, Unit]): XMLHttpRequest = js.native
  
  def credentials(): Credentials = js.native
  
  def delete(path: String, callback: FileStatCallback): Unit = js.native
  
  def delta(cursor: String, callback: js.Function2[/* err */ ApiError, /* changes */ PulledChanges, Unit]): Unit = js.native
  def delta(
    cursor: PulledChanges,
    callback: js.Function2[/* err */ ApiError, /* changes */ PulledChanges, Unit]
  ): Unit = js.native
  
  def dropboxUid(): String = js.native
  
  def findByName(
    path: String,
    namePattern: String,
    callback: js.Function2[/* err */ ApiError, /* resultStats */ js.Array[Stat], Unit]
  ): XMLHttpRequest = js.native
  def findByName(
    path: String,
    namePattern: String,
    options: FindByNameOptions,
    callback: js.Function2[/* err */ ApiError, /* resultStats */ js.Array[Stat], Unit]
  ): XMLHttpRequest = js.native
  
  def getAccountInfo(
    callback: js.Function3[/* err */ ApiError, /* accountInfo */ AccountInfo, /* AccountInfo */ AccountInfo, Unit]
  ): XMLHttpRequest = js.native
  def getAccountInfo(
    options: AccountInfoOptions,
    callback: js.Function3[/* err */ ApiError, /* accountInfo */ AccountInfo, /* AccountInfo */ AccountInfo, Unit]
  ): XMLHttpRequest = js.native
  
  def hasOauthRedirectUri(
    redirectUri: String,
    appKey: String,
    callback: js.Function2[/* err */ ApiError, /* hasOauthRedirectUri */ Boolean, Unit]
  ): XMLHttpRequest = js.native
  def hasOauthRedirectUri(
    redirectUri: String,
    appKey: AppInfo,
    callback: js.Function2[/* err */ ApiError, /* hasOauthRedirectUri */ Boolean, Unit]
  ): XMLHttpRequest = js.native
  def hasOauthRedirectUri(
    redirectUri: String,
    callback: js.Function2[/* err */ ApiError, /* hasOauthRedirectUri */ Boolean, Unit]
  ): XMLHttpRequest = js.native
  
  def history(path: String, callback: js.Function2[/* err */ ApiError, /* fileVersions */ js.Array[Stat], Unit]): XMLHttpRequest = js.native
  def history(
    path: String,
    options: HistoryOptions,
    callback: js.Function2[/* err */ ApiError, /* fileVersions */ js.Array[Stat], Unit]
  ): XMLHttpRequest = js.native
  
  def isAppDeveloper(
    userId: Any,
    appKey: Any,
    callbackcallback: js.Function2[/* err */ ApiError, /* isAppDeveloper */ Boolean, Unit]
  ): XMLHttpRequest = js.native
  // TODO check if this can better be described
  def isAppDeveloper(
    userId: Any,
    callbackcallback: js.Function2[/* err */ ApiError, /* isAppDeveloper */ Boolean, Unit]
  ): XMLHttpRequest = js.native
  
  def isAuthenticated(): Boolean = js.native
  
  def makeCopyReference(path: String, callback: js.Function2[/* err */ ApiError, /* copyReference */ CopyReference, Unit]): XMLHttpRequest = js.native
  
  def makeUrl(path: String, callback: js.Function2[/* err */ ApiError, /* shareUrl */ ShareUrl, Unit]): XMLHttpRequest = js.native
  def makeUrl(
    path: String,
    options: MakeURLOptions,
    callback: js.Function2[/* err */ ApiError, /* shareUrl */ ShareUrl, Unit]
  ): XMLHttpRequest = js.native
  
  def metadata(
    path: String,
    callback: js.Function3[/* err */ ApiError, /* stat */ Stat, /* folderEntries */ js.Array[Stat], Unit]
  ): Unit = js.native
  def metadata(
    path: String,
    options: StatOptions,
    callback: js.Function3[/* err */ ApiError, /* stat */ Stat, /* folderEntries */ js.Array[Stat], Unit]
  ): Unit = js.native
  
  def mkdir(path: String, callback: FileStatCallback): XMLHttpRequest = js.native
  
  def move(fromPath: String, toPath: String, callback: FileStatCallback): XMLHttpRequest = js.native
  
  var onAuthStepChange: EventSource = js.native
  
  var onError: EventSource = js.native
  
  var onXhr: EventSource = js.native
  
  def pollForChanges(
    cursor: String,
    options: js.Object,
    callback: js.Function2[/* err */ ApiError, /* changes */ PollResult, Unit]
  ): Unit = js.native
  def pollForChanges(
    cursor: PulledChanges,
    options: js.Object,
    callback: js.Function2[/* err */ ApiError, /* changes */ PollResult, Unit]
  ): Unit = js.native
  
  def pullChanges(callback: js.Function2[/* err */ ApiError, /* changes */ PulledChanges, Unit]): XMLHttpRequest = js.native
  def pullChanges(cursor: String, callback: js.Function2[/* err */ ApiError, /* changes */ PulledChanges, Unit]): XMLHttpRequest = js.native
  def pullChanges(
    cursor: PulledChanges,
    callback: js.Function2[/* err */ ApiError, /* changes */ PulledChanges, Unit]
  ): XMLHttpRequest = js.native
  
  def readFile(path: String, callback: ClientFileReadCallback): XMLHttpRequest = js.native
  def readFile(path: String, options: ClientFileReadOptions, callback: ClientFileReadCallback): XMLHttpRequest = js.native
  
  def readThumbnail(path: String, callback: ReadThumbnailCallback): XMLHttpRequest = js.native
  def readThumbnail(path: String, options: ReadThumbnailOptions, callback: ReadThumbnailCallback): XMLHttpRequest = js.native
  
  def readdir(
    path: String,
    callback: js.Function4[
      /* err */ ApiError, 
      /* filenames */ js.Array[String], 
      /* stat */ Stat, 
      /* folderEntries */ js.Array[Stat], 
      Unit
    ]
  ): XMLHttpRequest = js.native
  def readdir(
    path: String,
    options: ReadDirOptions,
    callback: js.Function4[
      /* err */ ApiError, 
      /* filenames */ js.Array[String], 
      /* stat */ Stat, 
      /* folderEntries */ js.Array[Stat], 
      Unit
    ]
  ): XMLHttpRequest = js.native
  
  def remove(path: String, callback: FileStatCallback): XMLHttpRequest = js.native
  
  def reset(): Client = js.native
  
  def restore(path: String, versionTag: String, callback: FileStatCallback): Unit = js.native
  
  def resumableUploadFinish(path: String, cursor: UploadCursor, callback: ClientFileWriteCallback): XMLHttpRequest = js.native
  def resumableUploadFinish(
    path: String,
    cursor: UploadCursor,
    options: ClientFileWriteOptions,
    callback: ClientFileWriteCallback
  ): XMLHttpRequest = js.native
  
  def resumableUploadStep(data: Any, callback: ResumableUploadStepCallback): XMLHttpRequest = js.native
  def resumableUploadStep(data: Any, cursor: UploadCursor, callback: ResumableUploadStepCallback): XMLHttpRequest = js.native
  
  def revertFile(path: String, versionTag: String, callback: FileStatCallback): XMLHttpRequest = js.native
  
  def revisions(
    path: String,
    options: HistoryOptions,
    callback: js.Function2[/* err */ ApiError, /* fileVersions */ js.Array[Stat], Unit]
  ): Unit = js.native
  
  def search(
    path: String,
    namePattern: String,
    options: FindByNameOptions,
    callback: js.Function2[/* err */ ApiError, /* resultStats */ js.Array[Stat], Unit]
  ): Unit = js.native
  
  def setCredentials(credentials: Credentials): Client = js.native
  
  def signOff(callback: js.Function1[/* err */ ApiError, Unit]): Unit = js.native
  def signOff(options: SingOutOptions, callback: js.Function1[/* err */ ApiError, Unit]): Unit = js.native
  
  def signOut(callback: js.Function1[/* err */ ApiError, Unit]): XMLHttpRequest = js.native
  def signOut(options: SingOutOptions, callback: js.Function1[/* err */ ApiError, Unit]): XMLHttpRequest = js.native
  
  def stat(
    path: String,
    callback: js.Function3[/* err */ ApiError, /* stat */ Stat, /* folderEntries */ js.Array[Stat], Unit]
  ): XMLHttpRequest = js.native
  def stat(
    path: String,
    options: StatOptions,
    callback: js.Function3[/* err */ ApiError, /* stat */ Stat, /* folderEntries */ js.Array[Stat], Unit]
  ): XMLHttpRequest = js.native
  
  def thumbnailUrl(path: String): String = js.native
  def thumbnailUrl(path: String, options: ThumbnailUrlOptions): String = js.native
  
  def unlink(path: String, callback: FileStatCallback): Unit = js.native
  
  def writeFile(path: String, data: Any, callback: ClientFileWriteCallback): XMLHttpRequest = js.native
  def writeFile(path: String, data: Any, options: ClientFileWriteOptions, callback: ClientFileWriteCallback): XMLHttpRequest = js.native
}
