package typingsJapgolly.reactToastify

import typingsJapgolly.reactToastify.anon.ContainerRef
import typingsJapgolly.reactToastify.anon.EventHandlers
import typingsJapgolly.reactToastify.distTypesMod.ToastContainerProps
import typingsJapgolly.reactToastify.distTypesMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksMod {
  
  @JSImport("react-toastify/dist/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useToast(props: ToastProps): EventHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("useToast")(props.asInstanceOf[js.Any]).asInstanceOf[EventHandlers]
  
  inline def useToastContainer(props: ToastContainerProps): ContainerRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useToastContainer")(props.asInstanceOf[js.Any]).asInstanceOf[ContainerRef]
}
