package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.scrolltopScrolltopMod.ScrollTopProps
import typingsJapgolly.primereact.scrolltopScrolltopMod.ScrollTopScrollBehavior
import typingsJapgolly.primereact.scrolltopScrolltopMod.ScrollTopTargetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollTop {
  
  @JSImport("primereact", "ScrollTop")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.ScrollTop] {
    
    inline def behavior(value: ScrollTopScrollBehavior): this.type = set("behavior", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def icon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ScrollTopProps> */ Any
    ): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def onHide(value: Callback): this.type = set("onHide", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def target(value: ScrollTopTargetType): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
    
    inline def transitionOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
    ): this.type = set("transitionOptions", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScrollTop.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollTopProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
