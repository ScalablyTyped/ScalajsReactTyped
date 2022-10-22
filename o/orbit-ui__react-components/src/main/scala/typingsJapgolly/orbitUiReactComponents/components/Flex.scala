package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distLayoutSrcFlexMod.InnerFlexProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`0`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`10`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`11`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`12`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`13`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`1`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`2`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`3`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`4`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`5`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`6`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`7`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`8`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`9`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`first baseline`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`last baseline`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`safe center`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`self-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`self-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`space-around`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`space-between`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`space-evenly`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`unsafe center`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`wrap-reverse`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.baseline
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.center
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.column
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.left
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.nowrap
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.right
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.row
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.start
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.stretch
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flex {
  
  @JSImport("@orbit-ui/react-components", "Flex")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def alignContent(
      value: start | end | center | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
    ): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    inline def alignItems(
      value: start | end | center | stretch | `self-start` | `self-end` | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
    ): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def `data-testid`(value: String): this.type = set("data-testid", value.asInstanceOf[js.Any])
    
    inline def direction(value: row | column): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def gap(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
    ): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def justifyContent(
      value: start | end | center | left | right | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
    ): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def wrap(
      value: nowrap | typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.wrap | `wrap-reverse`
    ): this.type = set("wrap", value.asInstanceOf[js.Any])
    
    inline def wrapChildren(value: Boolean): this.type = set("wrapChildren", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Flex.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MergeWithAs[HTMLElement, InnerFlexProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
