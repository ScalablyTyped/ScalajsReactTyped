package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactOnsenui.anon.DataSource
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  inline def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassName & DataSource[T]]))
  }
  
  @JSImport("react-onsenui", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.List[T]] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataSource(value: js.Array[T]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    
    inline def dataSourceVarargs(value: T*): this.type = set("dataSource", js.Array(value*))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    
    inline def renderFooter(value: CallbackTo[js.UndefOr[Element]]): this.type = set("renderFooter", value.toJsFn)
    
    inline def renderHeader(value: CallbackTo[js.UndefOr[Element]]): this.type = set("renderHeader", value.toJsFn)
    
    inline def renderRow(value: (T, /* index */ js.UndefOr[Double]) => js.UndefOr[Element]): this.type = set("renderRow", js.Any.fromFunction2(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T](companion: List.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: HTMLAttributesidclassName & DataSource[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
