package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libAffixMod.AffixProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Affix {
  
  @JSImport("antd", "Affix")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antd.libAffixMod.Affix] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def offsetBottom(value: Double): this.type = set("offsetBottom", value.asInstanceOf[js.Any])
    
    inline def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* affixed */ js.UndefOr[Boolean] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* affixed */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def target(value: CallbackTo[Window | HTMLElement | Null]): this.type = set("target", value.toJsFn)
  }
  
  implicit def make(companion: Affix.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AffixProps & RefAttributes[typingsJapgolly.antd.libAffixMod.Affix]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
