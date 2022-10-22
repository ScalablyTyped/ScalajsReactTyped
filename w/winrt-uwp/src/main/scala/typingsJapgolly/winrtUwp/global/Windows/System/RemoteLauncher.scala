package typingsJapgolly.winrtUwp.global.Windows.System

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starts the default app associated with the specified URI on a remote device. */
/* note: abstract class */ @JSGlobal("Windows.System.RemoteLauncher")
@js.native
open class RemoteLauncher ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.System.RemoteLauncher
object RemoteLauncher {
  
  @JSGlobal("Windows.System.RemoteLauncher")
  @js.native
  val ^ : js.Any = js.native
  
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device. */
  /* static member */
  inline def launchUriAsync(remoteSystemConnectionRequest: RemoteSystemConnectionRequest, uri: Uri): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.System.RemoteLaunchUriStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(remoteSystemConnectionRequest.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.System.RemoteLaunchUriStatus]]
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options. */
  /* static member */
  inline def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typingsJapgolly.winrtUwp.Windows.System.RemoteLauncherOptions
  ): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.System.RemoteLaunchUriStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(remoteSystemConnectionRequest.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.System.RemoteLaunchUriStatus]]
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options and input data. */
  /* static member */
  inline def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typingsJapgolly.winrtUwp.Windows.System.RemoteLauncherOptions,
    inputData: ValueSet
  ): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.System.RemoteLaunchUriStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(remoteSystemConnectionRequest.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], inputData.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.System.RemoteLaunchUriStatus]]
}
