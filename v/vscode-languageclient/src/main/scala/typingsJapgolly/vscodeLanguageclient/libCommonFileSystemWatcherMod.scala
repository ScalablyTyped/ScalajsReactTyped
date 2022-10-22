package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.FileSystemWatcher
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeWatchedFilesRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.FileEvent
import typingsJapgolly.vscodeLanguageserverProtocol.mod.RegistrationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonFileSystemWatcherMod {
  
  @JSImport("vscode-languageclient/lib/common/fileSystemWatcher", "FileSystemWatcherFeature")
  @js.native
  open class FileSystemWatcherFeature protected ()
    extends StObject
       with DynamicFeature[DidChangeWatchedFilesRegistrationOptions] {
    def this(
      client: FeatureClient[js.Object, js.Object],
      notifyFileEvent: js.Function1[/* event */ FileEvent, Unit]
    ) = this()
    
    /* private */ val _client: Any = js.native
    
    /* private */ val _notifyFileEvent: Any = js.native
    
    /* private */ val _watchers: Any = js.native
    
    /* private */ var hookListeners: Any = js.native
    
    def registerRaw(id: String, fileSystemWatchers: js.Array[FileSystemWatcher]): Unit = js.native
    
    @JSName("registrationType")
    def registrationType_MFileSystemWatcherFeature: RegistrationType[DidChangeWatchedFilesRegistrationOptions] = js.native
  }
}
