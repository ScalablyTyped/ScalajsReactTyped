package typingsJapgolly.grommet.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Disabled
import typingsJapgolly.grommet.anon.Max
import typingsJapgolly.grommet.es6ComponentsButtonMod.ButtonExtendedProps
import typingsJapgolly.grommet.es6ComponentsTipMod.TipProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.FillType
import typingsJapgolly.grommet.es6UtilsMod.GapType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.HoverIndicatorType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PolymorphicType
import typingsJapgolly.grommet.grommetStrings._blank
import typingsJapgolly.grommet.grommetStrings._parent
import typingsJapgolly.grommet.grommetStrings._self
import typingsJapgolly.grommet.grommetStrings._top
import typingsJapgolly.grommet.grommetStrings.around
import typingsJapgolly.grommet.grommetStrings.between
import typingsJapgolly.grommet.grommetStrings.button
import typingsJapgolly.grommet.grommetStrings.center
import typingsJapgolly.grommet.grommetStrings.end
import typingsJapgolly.grommet.grommetStrings.evenly
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.reset
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.start
import typingsJapgolly.grommet.grommetStrings.stretch
import typingsJapgolly.grommet.grommetStrings.submit
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  @JSImport("grommet/es6", "Button")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def as(value: PolymorphicType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def badge(value: Boolean | Double | Max | Element): this.type = set("badge", value.asInstanceOf[js.Any])
    
    inline def badgeVdomElement(value: VdomElement): this.type = set("badge", value.rawElement.asInstanceOf[js.Any])
    
    inline def children(value: Node | (js.Function1[/* hasDisabledHoverFocus */ Disabled, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* hasDisabledHoverFocus */ Disabled => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def color(value: ColorType): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fill(value: FillType): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def focusIndicator(value: Boolean): this.type = set("focusIndicator", value.asInstanceOf[js.Any])
    
    inline def gap(value: GapType): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def hoverIndicator(value: HoverIndicatorType): this.type = set("hoverIndicator", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def justify(value: around | between | center | end | evenly | start | stretch): this.type = set("justify", value.asInstanceOf[js.Any])
    
    inline def kind(value: String): this.type = set("kind", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def plain(value: Boolean): this.type = set("plain", value.asInstanceOf[js.Any])
    
    inline def primary(value: Boolean): this.type = set("primary", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def target(value: _self | _blank | _parent | _top | String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def tip(value: TipProps | String): this.type = set("tip", value.asInstanceOf[js.Any])
    
    inline def `type`(value: button | reset | submit): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Button.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ButtonExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
