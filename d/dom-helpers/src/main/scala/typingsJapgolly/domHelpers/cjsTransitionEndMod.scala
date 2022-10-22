package typingsJapgolly.domHelpers

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.TransitionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsTransitionEndMod {
  
  @JSImport("dom-helpers/cjs/transitionEnd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement, handler: Listener): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(element: HTMLElement, handler: Listener, duration: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(element: HTMLElement, handler: Listener, duration: Double, padding: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(element: HTMLElement, handler: Listener, duration: Null, padding: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(element: HTMLElement, handler: Listener, duration: Unit, padding: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  type Listener = js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
}
