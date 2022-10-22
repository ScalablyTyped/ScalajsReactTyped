package typingsJapgolly.useCallbackRef

import typingsJapgolly.useCallbackRef.distEs5TypesMod.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5AssignRefMod {
  
  @JSImport("use-callback-ref/dist/es5/assignRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignRef[T](ref: ReactRef[T]): ReactRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any]).asInstanceOf[ReactRef[T]]
  inline def assignRef[T](ref: ReactRef[T], value: T): ReactRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReactRef[T]]
}
