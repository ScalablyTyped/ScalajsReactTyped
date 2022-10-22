package typingsJapgolly.useCallbackRef

import typingsJapgolly.useCallbackRef.distEs5TypesMod.ReactRef
import typingsJapgolly.useCallbackRef.distEs5TypesMod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5TransformRefMod {
  
  @JSImport("use-callback-ref/dist/es5/transformRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T | Null, K]): RefObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRef")(ref.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[RefObject[T]]
}
