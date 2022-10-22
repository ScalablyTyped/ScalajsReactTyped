package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.`0`
import typingsJapgolly.baseui.baseuiStrings.change_
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
import typingsJapgolly.baseui.buttonGroupTypesMod.State
import typingsJapgolly.baseui.buttonGroupTypesMod.StatefulButtonGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulButtonGroup {
  
  inline def apply(children: js.Array[Node]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulButtonGroupProps]))
  }
  
  @JSImport("baseui/button-group", "StatefulButtonGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def initialState(value: `0`): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def kind(value: primary | secondary | tertiary): this.type = set("kind", value.asInstanceOf[js.Any])
    
    inline def mode(value: radio | checkbox): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* event */ ReactEventFrom[HTMLButtonElement], /* index */ Double) => Any): this.type = set("onClick", js.Any.fromFunction2(value))
    
    inline def overrides(value: ButtonGroupOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def shape(value: pill | default_ | square | round_ | circle): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def stateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulButtonGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
