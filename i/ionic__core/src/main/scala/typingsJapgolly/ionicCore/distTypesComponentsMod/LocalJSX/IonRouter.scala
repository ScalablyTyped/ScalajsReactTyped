package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonRouterCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRouter extends StObject {
  
  /**
    * Emitted when the route had changed
    */
  var onIonRouteDidChange: js.UndefOr[js.Function1[/* event */ IonRouterCustomEvent[RouterEventDetail], Unit]] = js.undefined
  
  /**
    * Event emitted when the route is about to change
    */
  var onIonRouteWillChange: js.UndefOr[js.Function1[/* event */ IonRouterCustomEvent[RouterEventDetail], Unit]] = js.undefined
  
  /**
    * The root path to use when matching URLs. By default, this is set to "/", but you can specify an alternate prefix for all URL paths.
    */
  var root: js.UndefOr[String] = js.undefined
  
  /**
    * The router can work in two "modes": - With hash: `/index.html#/path/to/page` - Without hash: `/path/to/page`  Using one or another might depend in the requirements of your app and/or where it's deployed.  Usually "hash-less" navigation works better for SEO and it's more user friendly too, but it might requires additional server-side configuration in order to properly work.  On the other side hash-navigation is much easier to deploy, it even works over the file protocol.  By default, this property is `true`, change to `false` to allow hash-less URLs.
    */
  var useHash: js.UndefOr[Boolean] = js.undefined
}
object IonRouter {
  
  inline def apply(): IonRouter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRouter]
  }
  
  extension [Self <: IonRouter](x: Self) {
    
    inline def setOnIonRouteDidChange(value: /* event */ IonRouterCustomEvent[RouterEventDetail] => Callback): Self = StObject.set(x, "onIonRouteDidChange", js.Any.fromFunction1((t0: /* event */ IonRouterCustomEvent[RouterEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonRouteDidChangeUndefined: Self = StObject.set(x, "onIonRouteDidChange", js.undefined)
    
    inline def setOnIonRouteWillChange(value: /* event */ IonRouterCustomEvent[RouterEventDetail] => Callback): Self = StObject.set(x, "onIonRouteWillChange", js.Any.fromFunction1((t0: /* event */ IonRouterCustomEvent[RouterEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonRouteWillChangeUndefined: Self = StObject.set(x, "onIonRouteWillChange", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
    
    inline def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
  }
}
