package typingsJapgolly.reactAsync.components

import typingsJapgolly.reactAsync.mod.AsyncCls
import typingsJapgolly.reactAsync.mod.AsyncProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Async {
  
  inline def apply[T](): SharedBuilder_AsyncProps_815169652[AsyncCls[T], T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsyncProps_815169652[AsyncCls[T], T](js.Array(this.component, __props.asInstanceOf[AsyncProps[T]]))
  }
  
  @JSImport("react-async", "Async")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[T](companion: Async.type): SharedBuilder_AsyncProps_815169652[AsyncCls[T], T] = new SharedBuilder_AsyncProps_815169652[AsyncCls[T], T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: AsyncProps[T]): SharedBuilder_AsyncProps_815169652[AsyncCls[T], T] = new SharedBuilder_AsyncProps_815169652[AsyncCls[T], T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
