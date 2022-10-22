package typingsJapgolly.jupyterlabServices

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabServices.libKernelspecRestapiMod.ISpecModels
import typingsJapgolly.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typingsJapgolly.jupyterlabServices.libServerconnectionMod.ServerConnection.NetworkError
import typingsJapgolly.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelspecKernelspecMod {
  
  trait IManager
    extends StObject
       with typingsJapgolly.jupyterlabServices.libBasemanagerMod.IManager {
    
    /**
      * Force a refresh of the specs from the server.
      *
      * @returns A promise that resolves when the specs are fetched.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    def refreshSpecs(): js.Promise[Unit]
    
    /**
      * The kernel spec models.
      *
      * #### Notes
      * The value will be null until the manager is ready.
      */
    val specs: ISpecModels | Null
    
    /**
      * A signal emitted when the kernel specs change.
      */
    var specsChanged: ISignal[IManager, ISpecModels]
  }
  object IManager {
    
    inline def apply(
      connectionFailure: ISignal[typingsJapgolly.jupyterlabServices.libBasemanagerMod.IManager, NetworkError],
      dispose: Callback,
      disposed: ISignal[IManager, Unit],
      isDisposed: Boolean,
      isReady: Boolean,
      ready: js.Promise[Unit],
      refreshSpecs: CallbackTo[js.Promise[Unit]],
      serverSettings: ISettings,
      specsChanged: ISignal[IManager, ISpecModels]
    ): IManager = {
      val __obj = js.Dynamic.literal(connectionFailure = connectionFailure.asInstanceOf[js.Any], dispose = dispose.toJsFn, disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], refreshSpecs = refreshSpecs.toJsFn, serverSettings = serverSettings.asInstanceOf[js.Any], specsChanged = specsChanged.asInstanceOf[js.Any], specs = null)
      __obj.asInstanceOf[IManager]
    }
    
    extension [Self <: IManager](x: Self) {
      
      inline def setRefreshSpecs(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "refreshSpecs", value.toJsFn)
      
      inline def setSpecs(value: ISpecModels): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsChanged(value: ISignal[IManager, ISpecModels]): Self = StObject.set(x, "specsChanged", value.asInstanceOf[js.Any])
      
      inline def setSpecsNull: Self = StObject.set(x, "specs", null)
    }
  }
}
