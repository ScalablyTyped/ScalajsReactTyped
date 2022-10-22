package typingsJapgolly.uifabricReactHooks

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseMergedRefsMod {
  
  @JSImport("@uifabric/react-hooks/lib/useMergedRefs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMergedRefs[T](refs: js.UndefOr[Ref[T]]*): RefObjectFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RefObjectFunction[T]]
  
  type RefObjectFunction[T] = RefHandle[T] & (js.Function1[/* value */ T, Unit])
}
