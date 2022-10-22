package typingsJapgolly.reactColor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactColor.anon.PartialClassesany
import typingsJapgolly.reactColor.libComponentsCommonHueMod.HueProps
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.reactColorStrings.horizontal
import typingsJapgolly.reactColor.reactColorStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hue {
  
  inline def apply(onChange: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (onChange(t0, t1)).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[HueProps]))
  }
  
  @JSImport("react-color/lib/components/common", "Hue")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactColor.libComponentsCommonMod.Hue] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def pointer(value: VdomNode): this.type = set("pointer", value.rawNode.asInstanceOf[js.Any])
    
    inline def pointerNull: this.type = set("pointer", null)
    
    inline def pointerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("pointer", js.Array(value*))
    
    inline def pointerVdomElement(value: VdomElement): this.type = set("pointer", value.rawElement.asInstanceOf[js.Any])
    
    inline def styles(value: PartialClassesany): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HueProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
