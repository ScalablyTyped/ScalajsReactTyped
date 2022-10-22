package typingsJapgolly.reactMotionLoop.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import typingsJapgolly.reactMotionLoop.mod.ReactMotionLoopProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMotionLoop {
  
  inline def apply(styleFrom: Style, styleTo: Style): Builder = {
    val __props = js.Dynamic.literal(styleFrom = styleFrom.asInstanceOf[js.Any], styleTo = styleTo.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactMotionLoopProps]))
  }
  
  @JSImport("react-motion-loop", "ReactMotionLoop")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMotionLoop.mod.ReactMotionLoop] {
    
    inline def children(value: /* interpolatedStyle */ PlainStyle => Element): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def defaultStyle(value: PlainStyle): this.type = set("defaultStyle", value.asInstanceOf[js.Any])
    
    inline def onRest(value: Callback): this.type = set("onRest", value.toJsFn)
    
    inline def style(value: Style): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactMotionLoopProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
