package typingsJapgolly.reactTether.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTether.anon.Left
import typingsJapgolly.reactTether.anon.PartialCSSStyleDeclaratio
import typingsJapgolly.reactTether.mod.ReactTetherProps
import typingsJapgolly.reactTether.mod.default
import typingsJapgolly.tether.mod.ITetherConstraint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTether {
  
  inline def apply(attachment: String, renderTarget: RefHandle[Any] => Callback): Builder = {
    val __props = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], renderTarget = js.Any.fromFunction1((t0: RefHandle[Any]) => renderTarget(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactTetherProps]))
  }
  
  @JSImport("react-tether", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def bodyElement(value: HTMLElement): this.type = set("bodyElement", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classPrefix(value: String): this.type = set("classPrefix", value.asInstanceOf[js.Any])
    
    inline def constraints(value: js.Array[ITetherConstraint]): this.type = set("constraints", value.asInstanceOf[js.Any])
    
    inline def constraintsVarargs(value: ITetherConstraint*): this.type = set("constraints", js.Array(value*))
    
    inline def element(value: HTMLElement | String | Any): this.type = set("element", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def offset(value: String): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onRepositioned(value: /* event */ js.UndefOr[Left] => Callback): this.type = set("onRepositioned", js.Any.fromFunction1((t0: /* event */ js.UndefOr[Left]) => value(t0).runNow()))
    
    inline def onUpdate(value: /* event */ js.UndefOr[Left] => Callback): this.type = set("onUpdate", js.Any.fromFunction1((t0: /* event */ js.UndefOr[Left]) => value(t0).runNow()))
    
    inline def optimizations(value: Any): this.type = set("optimizations", value.asInstanceOf[js.Any])
    
    inline def renderElement(value: /* ref */ RefHandle[Any] => Callback): this.type = set("renderElement", js.Any.fromFunction1((t0: /* ref */ RefHandle[Any]) => value(t0).runNow()))
    
    inline def renderElementTag(value: String): this.type = set("renderElementTag", value.asInstanceOf[js.Any])
    
    inline def renderElementTo(value: String | HTMLElement): this.type = set("renderElementTo", value.asInstanceOf[js.Any])
    
    inline def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def target(value: HTMLElement | String | Any): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetAttachment(value: String): this.type = set("targetAttachment", value.asInstanceOf[js.Any])
    
    inline def targetModifier(value: String): this.type = set("targetModifier", value.asInstanceOf[js.Any])
    
    inline def targetOffset(value: String): this.type = set("targetOffset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactTetherProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
