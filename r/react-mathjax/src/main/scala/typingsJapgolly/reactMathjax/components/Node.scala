package typingsJapgolly.reactMathjax.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMathjax.anon.Formula
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Node {
  
  inline def apply(formula: String): Builder = {
    val __props = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Formula]))
  }
  
  @JSImport("react-mathjax", "default.Node")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMathjax.mod.default.Node] {
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def onRender(value: Callback): this.type = set("onRender", value.toJsFn)
  }
  
  def withProps(p: Formula): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
