package typingsJapgolly.reactAsync.components

import typingsJapgolly.reactAsync.mod.AsyncProps
import typingsJapgolly.reactAsync.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAsync {
  
  inline def apply[T](): SharedBuilder_AsyncProps_815169652[default[T], T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsyncProps_815169652[default[T], T](js.Array(this.component, __props.asInstanceOf[AsyncProps[T]]))
  }
  
  @JSImport("react-async", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make[T](companion: ReactAsync.type): SharedBuilder_AsyncProps_815169652[default[T], T] = new SharedBuilder_AsyncProps_815169652[default[T], T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: AsyncProps[T]): SharedBuilder_AsyncProps_815169652[default[T], T] = new SharedBuilder_AsyncProps_815169652[default[T], T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
