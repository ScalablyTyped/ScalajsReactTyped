package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonNavCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.NavComponent
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.mod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonNav extends StObject {
  
  /**
    * If `true`, the nav should animate the transition of components.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimationBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * Event fired when the nav has changed components
    */
  var onIonNavDidChange: js.UndefOr[js.Function1[/* event */ IonNavCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Event fired when the nav will change components
    */
  var onIonNavWillChange: js.UndefOr[js.Function1[/* event */ IonNavCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Root NavComponent to load
    */
  var root: js.UndefOr[NavComponent] = js.undefined
  
  /**
    * Any parameters for the root component
    */
  var rootParams: js.UndefOr[ComponentProps[Null]] = js.undefined
  
  /**
    * If the nav component should allow for swipe-to-go-back.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.undefined
}
object IonNav {
  
  inline def apply(): IonNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonNav]
  }
  
  extension [Self <: IonNav](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "animation", js.Any.fromFunction2(value))
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setOnIonNavDidChange(value: /* event */ IonNavCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonNavDidChange", js.Any.fromFunction1((t0: /* event */ IonNavCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonNavDidChangeUndefined: Self = StObject.set(x, "onIonNavDidChange", js.undefined)
    
    inline def setOnIonNavWillChange(value: /* event */ IonNavCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonNavWillChange", js.Any.fromFunction1((t0: /* event */ IonNavCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonNavWillChangeUndefined: Self = StObject.set(x, "onIonNavWillChange", js.undefined)
    
    inline def setRoot(value: NavComponent): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootParams(value: ComponentProps[Null]): Self = StObject.set(x, "rootParams", value.asInstanceOf[js.Any])
    
    inline def setRootParamsUndefined: Self = StObject.set(x, "rootParams", js.undefined)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSwipeGesture(value: Boolean): Self = StObject.set(x, "swipeGesture", value.asInstanceOf[js.Any])
    
    inline def setSwipeGestureUndefined: Self = StObject.set(x, "swipeGesture", js.undefined)
  }
}
