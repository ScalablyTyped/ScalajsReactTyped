package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.checkbox
import typingsJapgolly.baseui.baseuiStrings.circle
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.baseuiStrings.pill
import typingsJapgolly.baseui.baseuiStrings.primary
import typingsJapgolly.baseui.baseuiStrings.radio
import typingsJapgolly.baseui.baseuiStrings.round_
import typingsJapgolly.baseui.baseuiStrings.secondary
import typingsJapgolly.baseui.baseuiStrings.square
import typingsJapgolly.baseui.baseuiStrings.tertiary
import typingsJapgolly.baseui.buttonGroupTypesMod.ButtonGroupOverrides
import typingsJapgolly.baseui.buttonGroupTypesMod.ButtonGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  
  inline def apply(children: js.Array[Node]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonGroupProps]))
  }
  
  @JSImport("baseui/button-group", "ButtonGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.buttonGroupMod.ButtonGroup] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def kind(value: primary | secondary | tertiary): this.type = set("kind", value.asInstanceOf[js.Any])
    
    inline def mode(value: radio | checkbox): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* event */ ReactEventFrom[HTMLButtonElement], /* index */ Double) => Any): this.type = set("onClick", js.Any.fromFunction2(value))
    
    inline def overrides(value: ButtonGroupOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def selected(value: Double | js.Array[Double]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectedVarargs(value: Double*): this.type = set("selected", js.Array(value*))
    
    inline def shape(value: pill | default_ | square | round_ | circle): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
