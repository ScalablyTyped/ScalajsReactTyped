package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrap.libCollapseMod.CollapseProps
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.height
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  @JSImport("react-bootstrap", "Collapse")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrap.mod.Collapse] {
    
    inline def dimension(value: height | width | js.Function0[String]): this.type = set("dimension", value.asInstanceOf[js.Any])
    
    inline def dimensionCallbackTo(value: CallbackTo[String]): this.type = set("dimension", value.toJsFn)
    
    inline def getDimensionValue(value: (/* dimension */ Double, /* element */ Element) => Double): this.type = set("getDimensionValue", js.Any.fromFunction2(value))
    
    inline def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
    
    inline def mountOnEnter(value: Boolean): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def onEnter(value: /* node */ HTMLElement => Any): this.type = set("onEnter", js.Any.fromFunction1(value))
    
    inline def onEntered(value: /* node */ HTMLElement => Any): this.type = set("onEntered", js.Any.fromFunction1(value))
    
    inline def onEntering(value: /* node */ HTMLElement => Any): this.type = set("onEntering", js.Any.fromFunction1(value))
    
    inline def onExit(value: /* node */ HTMLElement => Any): this.type = set("onExit", js.Any.fromFunction1(value))
    
    inline def onExited(value: /* node */ HTMLElement => Any): this.type = set("onExited", js.Any.fromFunction1(value))
    
    inline def onExiting(value: /* node */ HTMLElement => Any): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    inline def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def transitionAppear(value: Boolean): this.type = set("transitionAppear", value.asInstanceOf[js.Any])
    
    inline def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Collapse.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
