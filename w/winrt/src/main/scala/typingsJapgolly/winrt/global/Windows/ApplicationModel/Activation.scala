package typingsJapgolly.winrt.global.Windows.ApplicationModel

import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
import typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import typingsJapgolly.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageItem
import typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
import typingsJapgolly.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Activation {
  
  @JSGlobal("Windows.ApplicationModel.Activation.ActivationKind")
  @js.native
  object ActivationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind & Double
      ] = js.native
    
    /* 13 */ val appointmentsProvider: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.appointmentsProvider & Double = js.native
    
    /* 7 */ val cachedFileUpdater: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.cachedFileUpdater & Double = js.native
    
    /* 11 */ val cameraSettings: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.cameraSettings & Double = js.native
    
    /* 25 */ val componentUI: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.componentUI & Double = js.native
    
    /* 14 */ val contact: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.contact & Double = js.native
    
    /* 8 */ val contactPicker: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.contactPicker & Double = js.native
    
    /* 9 */ val device: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.device & Double = js.native
    
    /* 29 */ val dialReceiver: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.dialReceiver & Double = js.native
    
    /* 3 */ val file: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.file & Double = js.native
    
    /* 5 */ val fileOpenPicker: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileOpenPicker & Double = js.native
    
    /* 6 */ val fileSavePicker: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileSavePicker & Double = js.native
    
    /* 0 */ val launch: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.launch & Double = js.native
    
    /* 17 */ val lockScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreen & Double = js.native
    
    /* 15 */ val lockScreenCall: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreenCall & Double = js.native
    
    /* 20 */ val pickFileContinuation: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFileContinuation & Double = js.native
    
    /* 22 */ val pickFolderContinuation: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFolderContinuation & Double = js.native
    
    /* 21 */ val pickSaveFileContinuation: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickSaveFileContinuation & Double = js.native
    
    /* 18 */ val pickerReturned: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickerReturned & Double = js.native
    
    /* 28 */ val print3DWorkflow: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.print3DWorkflow & Double = js.native
    
    /* 10 */ val printTaskSettings: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.printTaskSettings & Double = js.native
    
    /* 4 */ val protocol: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocol & Double = js.native
    
    /* 26 */ val protocolForResults: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocolForResults & Double = js.native
    
    /* 12 */ val restrictedLaunch: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.restrictedLaunch & Double = js.native
    
    /* 1 */ val search: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.search & Double = js.native
    
    /* 2 */ val shareTarget: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.shareTarget & Double = js.native
    
    /* 27 */ val toastNotification: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.toastNotification & Double = js.native
    
    /* 16 */ val voiceCommand: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.voiceCommand & Double = js.native
    
    /* 19 */ val walletAction: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.walletAction & Double = js.native
    
    /* 24 */ val webAccountProvider: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAccountProvider & Double = js.native
    
    /* 23 */ val webAuthenticationBrokerContinuation: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAuthenticationBrokerContinuation & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
  @js.native
  object ApplicationExecutionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState & Double
      ] = js.native
    
    /* 4 */ val closedByUser: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.closedByUser & Double = js.native
    
    /* 0 */ val notRunning: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.notRunning & Double = js.native
    
    /* 1 */ val running: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.running & Double = js.native
    
    /* 2 */ val suspended: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.suspended & Double = js.native
    
    /* 3 */ val terminated: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.terminated & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs")
  @js.native
  open class CachedFileUpdaterActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs {
    
    /* CompleteClass */
    var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs")
  @js.native
  open class CameraSettingsActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs {
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var videoDeviceController: Any = js.native
    
    /* CompleteClass */
    var videoDeviceExtension: Any = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs")
  @js.native
  open class ContactPickerActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs {
    
    /* CompleteClass */
    var contactPickerUI: ContactPickerUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.DeviceActivatedEventArgs")
  @js.native
  open class DeviceActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.DeviceActivatedEventArgs {
    
    /* CompleteClass */
    var deviceInformationId: String = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var verb: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.FileActivatedEventArgs")
  @js.native
  open class FileActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.FileActivatedEventArgs {
    
    /* CompleteClass */
    var files: IVectorView[IStorageItem] = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var verb: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs")
  @js.native
  open class FileOpenPickerActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs {
    
    /* CompleteClass */
    var fileOpenPickerUI: FileOpenPickerUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs")
  @js.native
  open class FileSavePickerActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs {
    
    /* CompleteClass */
    var fileSavePickerUI: FileSavePickerUI = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.LaunchActivatedEventArgs")
  @js.native
  open class LaunchActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.LaunchActivatedEventArgs {
    
    /* CompleteClass */
    var arguments: String = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var tileId: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs")
  @js.native
  open class PrintTaskSettingsActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs {
    
    /* CompleteClass */
    var configuration: PrintTaskConfiguration = js.native
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs")
  @js.native
  open class ProtocolActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs {
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
    
    /* CompleteClass */
    var uri: Uri = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.SearchActivatedEventArgs")
  @js.native
  open class SearchActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SearchActivatedEventArgs {
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var queryText: String = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs")
  @js.native
  open class ShareTargetActivatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs {
    
    /* CompleteClass */
    var kind: ActivationKind = js.native
    
    /* CompleteClass */
    var previousExecutionState: ApplicationExecutionState = js.native
    
    /* CompleteClass */
    var shareOperation: ShareOperation = js.native
    
    /* CompleteClass */
    var splashScreen: typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Activation.SplashScreen")
  @js.native
  open class SplashScreen ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Activation.SplashScreen {
    
    /* CompleteClass */
    var imageLocation: Rect = js.native
    
    /* CompleteClass */
    var ondismissed: Any = js.native
  }
}
