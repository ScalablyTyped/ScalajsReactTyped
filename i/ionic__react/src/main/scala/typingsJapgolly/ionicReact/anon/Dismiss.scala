package typingsJapgolly.ionicReact.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicReact.distTypesHooksHookOverlayOptionsMod.HookOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismiss[OptionsType] extends StObject {
  
  def dismiss(): js.Promise[Unit]
  
  def present(options: OptionsType & HookOverlayOptions): js.Promise[Unit]
}
object Dismiss {
  
  inline def apply[OptionsType](
    dismiss: CallbackTo[js.Promise[Unit]],
    present: OptionsType & HookOverlayOptions => js.Promise[Unit]
  ): Dismiss[OptionsType] = {
    val __obj = js.Dynamic.literal(dismiss = dismiss.toJsFn, present = js.Any.fromFunction1(present))
    __obj.asInstanceOf[Dismiss[OptionsType]]
  }
  
  extension [Self <: Dismiss[?], OptionsType](x: Self & Dismiss[OptionsType]) {
    
    inline def setDismiss(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "dismiss", value.toJsFn)
    
    inline def setPresent(value: OptionsType & HookOverlayOptions => js.Promise[Unit]): Self = StObject.set(x, "present", js.Any.fromFunction1(value))
  }
}
