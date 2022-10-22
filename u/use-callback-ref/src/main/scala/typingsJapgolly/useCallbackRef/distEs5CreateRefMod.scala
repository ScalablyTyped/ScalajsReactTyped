package typingsJapgolly.useCallbackRef

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5CreateRefMod {
  
  @JSImport("use-callback-ref/dist/es5/createRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCallbackRef[T](callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Any]): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCallbackRef")(callback.asInstanceOf[js.Any]).asInstanceOf[RefHandle[T]]
}
