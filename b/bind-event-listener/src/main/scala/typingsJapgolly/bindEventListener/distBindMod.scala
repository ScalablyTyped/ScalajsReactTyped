package typingsJapgolly.bindEventListener

import org.scalajs.dom.EventTarget
import typingsJapgolly.bindEventListener.distTypesMod.Binding
import typingsJapgolly.bindEventListener.distTypesMod.UnbindFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBindMod {
  
  @JSImport("bind-event-listener/dist/bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind[Target /* <: EventTarget */, Type /* <: String */](target: Target, hasTypeListenerOptions: Binding[Target, Type]): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], hasTypeListenerOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
}
