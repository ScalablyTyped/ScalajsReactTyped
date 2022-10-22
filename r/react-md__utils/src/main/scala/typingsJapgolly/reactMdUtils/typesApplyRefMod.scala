package typingsJapgolly.reactMdUtils

import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApplyRefMod {
  
  @JSImport("@react-md/utils/types/applyRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyRef[E](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")().asInstanceOf[Unit]
  inline def applyRef[E](instance: E): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyRef[E](instance: E, ref: Ref[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyRef[E](instance: Null, ref: Ref[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
