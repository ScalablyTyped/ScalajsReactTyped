package typingsJapgolly.reactMotion.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactMotion.mod.MotionProps
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Motion {
  
  inline def apply(style: Style): Builder = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MotionProps]))
  }
  
  @JSImport("react-motion", "Motion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMotion.mod.Motion] {
    
    inline def children(value: /* interpolatedStyle */ PlainStyle => Element): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def defaultStyle(value: PlainStyle): this.type = set("defaultStyle", value.asInstanceOf[js.Any])
    
    inline def onRest(value: Callback): this.type = set("onRest", value.toJsFn)
  }
  
  def withProps(p: MotionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
