package typingsJapgolly.reactBulmaComponents.components

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBulmaComponents.anon.ResponsiveModifiersonlyBo
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`1`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`2`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`3`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`4`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`5`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`6`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`column-reverse`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`flex-end`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`flex-start`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`row-reverse`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`sans-serif`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`space-around`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`space-between`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`space-evenly`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`wrap-reverse`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.auto
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.baseline
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.bold
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.capitalized
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.center
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.code
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.column
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.dark
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.end
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.input
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.justify
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.left
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.light
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.lowercase
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.monospace
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.normal
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.nowrap
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.primary
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.renderAs
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.right
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.row
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.secondary
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.semibold
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.start
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.stretch
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.uppercase
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.wrap
import typingsJapgolly.reactBulmaComponents.srcComponentsFormMod.CheckboxProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.DisplayModifier
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.OmitKeys
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ResponsiveModifiers
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.SpacingSize
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  @JSImport("react-bulma-components", "Form.Checkbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def alignContent(
      value: `flex-start` | `flex-end` | center | `space-around` | `space-between` | `space-evenly` | stretch | start | end | baseline
    ): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    inline def alignItems(value: auto | `flex-start` | `flex-end` | center | baseline | stretch): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearfix(value: Boolean): this.type = set("clearfix", value.asInstanceOf[js.Any])
    
    inline def clipped(value: Boolean): this.type = set("clipped", value.asInstanceOf[js.Any])
    
    inline def colorVariant(value: light | dark | String): this.type = set("colorVariant", value.asInstanceOf[js.Any])
    
    inline def desktop(value: ResponsiveModifiersonlyBo): this.type = set("desktop", value.asInstanceOf[js.Any])
    
    inline def display(value: DisplayModifier): this.type = set("display", value.asInstanceOf[js.Any])
    
    inline def domRef(value: RefHandle[input]): this.type = set("domRef", value.asInstanceOf[js.Any])
    
    inline def flexDirection(value: row | `row-reverse` | column | `column-reverse`): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    
    inline def flexWrap(value: nowrap | wrap | `wrap-reverse`): this.type = set("flexWrap", value.asInstanceOf[js.Any])
    
    inline def fullhd(value: ResponsiveModifiers): this.type = set("fullhd", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def invisible(value: Boolean): this.type = set("invisible", value.asInstanceOf[js.Any])
    
    inline def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
    
    inline def justifyContent(
      value: `flex-start` | `flex-end` | center | `space-around` | `space-between` | `space-evenly` | start | end | left | right
    ): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    inline def m(value: SpacingSize): this.type = set("m", value.asInstanceOf[js.Any])
    
    inline def marginless(value: Boolean): this.type = set("marginless", value.asInstanceOf[js.Any])
    
    inline def mb(value: SpacingSize): this.type = set("mb", value.asInstanceOf[js.Any])
    
    inline def ml(value: SpacingSize): this.type = set("ml", value.asInstanceOf[js.Any])
    
    inline def mobile(value: ResponsiveModifiers): this.type = set("mobile", value.asInstanceOf[js.Any])
    
    inline def mr(value: SpacingSize): this.type = set("mr", value.asInstanceOf[js.Any])
    
    inline def mt(value: SpacingSize): this.type = set("mt", value.asInstanceOf[js.Any])
    
    inline def mx(value: SpacingSize): this.type = set("mx", value.asInstanceOf[js.Any])
    
    inline def my(value: SpacingSize): this.type = set("my", value.asInstanceOf[js.Any])
    
    inline def overlay(value: Boolean): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    inline def p(value: SpacingSize): this.type = set("p", value.asInstanceOf[js.Any])
    
    inline def paddingless(value: Boolean): this.type = set("paddingless", value.asInstanceOf[js.Any])
    
    inline def pb(value: SpacingSize): this.type = set("pb", value.asInstanceOf[js.Any])
    
    inline def pl(value: SpacingSize): this.type = set("pl", value.asInstanceOf[js.Any])
    
    inline def pr(value: SpacingSize): this.type = set("pr", value.asInstanceOf[js.Any])
    
    inline def pt(value: SpacingSize): this.type = set("pt", value.asInstanceOf[js.Any])
    
    inline def pull(value: left | right): this.type = set("pull", value.asInstanceOf[js.Any])
    
    inline def px(value: SpacingSize): this.type = set("px", value.asInstanceOf[js.Any])
    
    inline def py(value: SpacingSize): this.type = set("py", value.asInstanceOf[js.Any])
    
    inline def radiusless(value: Boolean): this.type = set("radiusless", value.asInstanceOf[js.Any])
    
    inline def renderAs(value: input): this.type = set("renderAs", value.asInstanceOf[js.Any])
    
    inline def shadowless(value: Boolean): this.type = set("shadowless", value.asInstanceOf[js.Any])
    
    inline def srOnly(value: Boolean): this.type = set("srOnly", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tablet(value: ResponsiveModifiersonlyBo): this.type = set("tablet", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: center | justify | left | right | String): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    
    inline def textFamily(value: `sans-serif` | monospace | primary | secondary | code | String): this.type = set("textFamily", value.asInstanceOf[js.Any])
    
    inline def textSize(value: `1` | `2` | `3` | `4` | `5` | `6` | Number | String): this.type = set("textSize", value.asInstanceOf[js.Any])
    
    inline def textTransform(value: capitalized | lowercase | uppercase): this.type = set("textTransform", value.asInstanceOf[js.Any])
    
    inline def textWeight(value: light | normal | semibold | bold): this.type = set("textWeight", value.asInstanceOf[js.Any])
    
    inline def touch(value: ResponsiveModifiers): this.type = set("touch", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: Boolean): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def untilFullhd(value: ResponsiveModifiers): this.type = set("untilFullhd", value.asInstanceOf[js.Any])
    
    inline def untilWidescreen(value: ResponsiveModifiers): this.type = set("untilWidescreen", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def widescreen(value: ResponsiveModifiersonlyBo): this.type = set("widescreen", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Checkbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OmitKeys[CheckboxProps & (ElementProps[CheckboxProps, input]), renderAs]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
