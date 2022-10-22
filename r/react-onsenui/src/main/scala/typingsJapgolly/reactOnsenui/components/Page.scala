package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.anon.ContentStyle
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSImport("react-onsenui", "Page")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.Page] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: Any): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    
    inline def onHide(value: Callback): this.type = set("onHide", value.toJsFn)
    
    inline def onInfiniteScroll(value: /* doneCallback */ js.Function0[Unit] => Callback): this.type = set("onInfiniteScroll", js.Any.fromFunction1((t0: /* doneCallback */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def onInit(value: Callback): this.type = set("onInit", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def renderBottomToolbar(value: Callback): this.type = set("renderBottomToolbar", value.toJsFn)
    
    inline def renderFixed(value: Callback): this.type = set("renderFixed", value.toJsFn)
    
    inline def renderModal(value: Callback): this.type = set("renderModal", value.toJsFn)
    
    inline def renderToolbar(value: Callback): this.type = set("renderToolbar", value.toJsFn)
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Page.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributesidclassName & ContentStyle): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
