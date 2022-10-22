package typingsJapgolly.serviceWorkerUpdater

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.serviceWorkerUpdater.serviceWorkerUpdaterStrings.hasUpdate
import typingsJapgolly.serviceWorkerUpdater.serviceWorkerUpdaterStrings.updateHandler
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("service-worker-updater", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSWUpdateChecker(): UpdateHookResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useSWUpdateChecker")().asInstanceOf[UpdateHookResult]
  inline def useSWUpdateChecker(opts: CheckOptions): UpdateHookResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useSWUpdateChecker")(opts.asInstanceOf[js.Any]).asInstanceOf[UpdateHookResult]
  
  inline def withSWUpdateChecker[P /* <: InjectedUpdateProps */](WrappedComponent: ComponentType[P]): ComponentClassP[(Omit[P, hasUpdate | updateHandler]) & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSWUpdateChecker")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[(Omit[P, hasUpdate | updateHandler]) & js.Object]]
  inline def withSWUpdateChecker[P /* <: InjectedUpdateProps */](WrappedComponent: ComponentType[P], opts: CheckOptions): ComponentClassP[(Omit[P, hasUpdate | updateHandler]) & js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSWUpdateChecker")(WrappedComponent.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ComponentClassP[(Omit[P, hasUpdate | updateHandler]) & js.Object]]
  
  trait CheckOptions extends StObject {
    
    var checkInterval: js.UndefOr[Double] = js.undefined
    
    var updateOnLoad: js.UndefOr[Boolean] = js.undefined
  }
  object CheckOptions {
    
    inline def apply(): CheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckOptions]
    }
    
    extension [Self <: CheckOptions](x: Self) {
      
      inline def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
      
      inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
      
      inline def setUpdateOnLoad(value: Boolean): Self = StObject.set(x, "updateOnLoad", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnLoadUndefined: Self = StObject.set(x, "updateOnLoad", js.undefined)
    }
  }
  
  trait InjectedUpdateProps extends StObject {
    
    var hasUpdate: Boolean
    
    var updateHandler: UpdateHandler
  }
  object InjectedUpdateProps {
    
    inline def apply(hasUpdate: Boolean, updateHandler: Callback): InjectedUpdateProps = {
      val __obj = js.Dynamic.literal(hasUpdate = hasUpdate.asInstanceOf[js.Any], updateHandler = updateHandler.toJsFn)
      __obj.asInstanceOf[InjectedUpdateProps]
    }
    
    extension [Self <: InjectedUpdateProps](x: Self) {
      
      inline def setHasUpdate(value: Boolean): Self = StObject.set(x, "hasUpdate", value.asInstanceOf[js.Any])
      
      inline def setUpdateHandler(value: Callback): Self = StObject.set(x, "updateHandler", value.toJsFn)
    }
  }
  
  type UpdateHandler = js.Function0[Unit]
  
  type UpdateHookResult = js.Tuple2[/* hasUpdate */ Boolean, /* updateHandler */ UpdateHandler]
}
