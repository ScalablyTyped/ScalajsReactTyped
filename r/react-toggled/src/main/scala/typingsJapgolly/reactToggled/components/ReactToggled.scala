package typingsJapgolly.reactToggled.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToggled.mod.ReactToggledProps
import typingsJapgolly.reactToggled.mod.TogglerStateAndHelpers
import typingsJapgolly.reactToggled.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactToggled {
  
  inline def apply(children: /* options */ TogglerStateAndHelpers => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactToggledProps]))
  }
  
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def defaultOn(value: Boolean): this.type = set("defaultOn", value.asInstanceOf[js.Any])
    
    inline def on(value: Boolean): this.type = set("on", value.asInstanceOf[js.Any])
    
    inline def onToggle(value: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Callback): this.type = set("onToggle", js.Any.fromFunction2((t0: /* on */ Boolean, t1: /* object */ TogglerStateAndHelpers) => (value(t0, t1)).runNow()))
  }
  
  def withProps(p: ReactToggledProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
