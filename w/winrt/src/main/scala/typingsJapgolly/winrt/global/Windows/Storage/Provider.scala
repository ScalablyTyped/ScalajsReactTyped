package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileOptions
import typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileTarget
import typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus
import typingsJapgolly.winrt.Windows.Storage.Provider.ReadActivationMode
import typingsJapgolly.winrt.Windows.Storage.Provider.UIStatus
import typingsJapgolly.winrt.Windows.Storage.Provider.WriteActivationMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSGlobal("Windows.Storage.Provider.CachedFileOptions")
  @js.native
  object CachedFileOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileOptions & Double] = js.native
    
    /* 3 */ val denyAccessWhenOffline: typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileOptions.denyAccessWhenOffline & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileOptions.none & Double = js.native
    
    /* 1 */ val requireUpdateOnAccess: typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileOptions.requireUpdateOnAccess & Double = js.native
    
    /* 2 */ val useCachedFileWhenOffline: typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileOptions.useCachedFileWhenOffline & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.CachedFileTarget")
  @js.native
  object CachedFileTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileTarget & Double] = js.native
    
    /* 0 */ val local: typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileTarget.local & Double = js.native
    
    /* 1 */ val remote: typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileTarget.remote & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
  @js.native
  open class CachedFileUpdater ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileUpdater
  /* static members */
  object CachedFileUpdater {
    
    @JSGlobal("Windows.Storage.Provider.CachedFileUpdater")
    @js.native
    val ^ : js.Any = js.native
    
    inline def setUpdateInformation(
      file: IStorageFile,
      contentId: String,
      readMode: ReadActivationMode,
      writeMode: WriteActivationMode,
      options: CachedFileOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdateInformation")(file.asInstanceOf[js.Any], contentId.asInstanceOf[js.Any], readMode.asInstanceOf[js.Any], writeMode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Windows.Storage.Provider.CachedFileUpdaterUI")
  @js.native
  open class CachedFileUpdaterUI ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileUpdaterUI {
    
    /* CompleteClass */
    var onfileupdaterequested: Any = js.native
    
    /* CompleteClass */
    var onuirequested: Any = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /* CompleteClass */
    var uIStatus: UIStatus = js.native
    
    /* CompleteClass */
    var updateTarget: CachedFileTarget = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.FileUpdateRequest")
  @js.native
  open class FileUpdateRequest ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateRequest {
    
    /* CompleteClass */
    var contentId: String = js.native
    
    /* CompleteClass */
    var file: typingsJapgolly.winrt.Windows.Storage.StorageFile = js.native
    
    /* CompleteClass */
    override def getDeferral(): typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateRequestDeferral = js.native
    
    /* CompleteClass */
    var status: FileUpdateStatus = js.native
    
    /* CompleteClass */
    override def updateLocalFile(value: IStorageFile): Unit = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.FileUpdateRequestDeferral")
  @js.native
  open class FileUpdateRequestDeferral ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateRequestDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.FileUpdateRequestedEventArgs")
  @js.native
  open class FileUpdateRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateRequestedEventArgs {
    
    /* CompleteClass */
    var request: typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateRequest = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.FileUpdateStatus")
  @js.native
  object FileUpdateStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus & Double] = js.native
    
    /* 1 */ val complete: typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus.complete & Double = js.native
    
    /* 5 */ val completeAndRenamed: typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus.completeAndRenamed & Double = js.native
    
    /* 3 */ val currentlyUnavailable: typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus.currentlyUnavailable & Double = js.native
    
    /* 4 */ val failed: typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus.failed & Double = js.native
    
    /* 0 */ val incomplete: typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus.incomplete & Double = js.native
    
    /* 2 */ val userInputNeeded: typingsJapgolly.winrt.Windows.Storage.Provider.FileUpdateStatus.userInputNeeded & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.ReadActivationMode")
  @js.native
  object ReadActivationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Provider.ReadActivationMode & Double] = js.native
    
    /* 1 */ val beforeAccess: typingsJapgolly.winrt.Windows.Storage.Provider.ReadActivationMode.beforeAccess & Double = js.native
    
    /* 0 */ val notNeeded: typingsJapgolly.winrt.Windows.Storage.Provider.ReadActivationMode.notNeeded & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.UIStatus")
  @js.native
  object UIStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Provider.UIStatus & Double] = js.native
    
    /* 3 */ val complete: typingsJapgolly.winrt.Windows.Storage.Provider.UIStatus.complete & Double = js.native
    
    /* 1 */ val hidden: typingsJapgolly.winrt.Windows.Storage.Provider.UIStatus.hidden & Double = js.native
    
    /* 0 */ val unavailable: typingsJapgolly.winrt.Windows.Storage.Provider.UIStatus.unavailable & Double = js.native
    
    /* 2 */ val visible: typingsJapgolly.winrt.Windows.Storage.Provider.UIStatus.visible & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Provider.WriteActivationMode")
  @js.native
  object WriteActivationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Provider.WriteActivationMode & Double] = js.native
    
    /* 2 */ val afterWrite: typingsJapgolly.winrt.Windows.Storage.Provider.WriteActivationMode.afterWrite & Double = js.native
    
    /* 1 */ val notNeeded: typingsJapgolly.winrt.Windows.Storage.Provider.WriteActivationMode.notNeeded & Double = js.native
    
    /* 0 */ val readOnly: typingsJapgolly.winrt.Windows.Storage.Provider.WriteActivationMode.readOnly & Double = js.native
  }
}
