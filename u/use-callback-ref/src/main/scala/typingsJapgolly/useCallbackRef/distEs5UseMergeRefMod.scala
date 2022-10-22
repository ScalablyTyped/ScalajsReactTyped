package typingsJapgolly.useCallbackRef

import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.useCallbackRef.distEs5TypesMod.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UseMergeRefMod {
  
  @JSImport("use-callback-ref/dist/es5/useMergeRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergeRefs")(refs.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T | Null]]
  inline def useMergeRefs[T](refs: js.Array[ReactRef[T]], defaultValue: T): MutableRefObject[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergeRefs")(refs.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Null]]
}
