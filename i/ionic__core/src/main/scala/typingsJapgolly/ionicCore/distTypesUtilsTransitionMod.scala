package typingsJapgolly.ionicCore

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.NavOptions
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTransitionMod {
  
  @JSImport("@ionic/core/dist/types/utils/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepReady(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepReady")().asInstanceOf[js.Promise[Unit]]
  inline def deepReady(el: Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepReady")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getIonPageElement(element: HTMLElement): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getIonPageElement")(element.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def lifecycle(el: HTMLElement, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lifecycle")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lifecycle(el: Unit, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lifecycle")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPageHidden(el: HTMLElement, hidden: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPageHidden")(el.asInstanceOf[js.Any], hidden.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transition(opts: TransitionOptions): js.Promise[TransitionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("transition")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TransitionResult]]
  
  trait TransitionOptions
    extends StObject
       with NavOptions {
    
    var baseEl: Any
    
    var enteringEl: HTMLElement
    
    var leavingEl: js.UndefOr[HTMLElement] = js.undefined
    
    var progressCallback: js.UndefOr[js.Function1[/* ani */ js.UndefOr[Animation], Unit]] = js.undefined
  }
  object TransitionOptions {
    
    inline def apply(baseEl: Any, enteringEl: HTMLElement): TransitionOptions = {
      val __obj = js.Dynamic.literal(baseEl = baseEl.asInstanceOf[js.Any], enteringEl = enteringEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionOptions]
    }
    
    extension [Self <: TransitionOptions](x: Self) {
      
      inline def setBaseEl(value: Any): Self = StObject.set(x, "baseEl", value.asInstanceOf[js.Any])
      
      inline def setEnteringEl(value: HTMLElement): Self = StObject.set(x, "enteringEl", value.asInstanceOf[js.Any])
      
      inline def setLeavingEl(value: HTMLElement): Self = StObject.set(x, "leavingEl", value.asInstanceOf[js.Any])
      
      inline def setLeavingElUndefined: Self = StObject.set(x, "leavingEl", js.undefined)
      
      inline def setProgressCallback(value: /* ani */ js.UndefOr[Animation] => Callback): Self = StObject.set(x, "progressCallback", js.Any.fromFunction1((t0: /* ani */ js.UndefOr[Animation]) => value(t0).runNow()))
      
      inline def setProgressCallbackUndefined: Self = StObject.set(x, "progressCallback", js.undefined)
    }
  }
  
  trait TransitionResult extends StObject {
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    var hasCompleted: Boolean
  }
  object TransitionResult {
    
    inline def apply(hasCompleted: Boolean): TransitionResult = {
      val __obj = js.Dynamic.literal(hasCompleted = hasCompleted.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionResult]
    }
    
    extension [Self <: TransitionResult](x: Self) {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setHasCompleted(value: Boolean): Self = StObject.set(x, "hasCompleted", value.asInstanceOf[js.Any])
    }
  }
}
