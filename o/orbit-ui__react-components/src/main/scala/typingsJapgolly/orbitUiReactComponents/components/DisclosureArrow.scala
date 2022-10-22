package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distDisclosureSrcDisclosureArrowMod.InnerDisclosureArrowProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DisclosureArrow {
  
  @JSImport("@orbit-ui/react-components", "DisclosureArrow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `data-testid`(value: String): this.type = set("data-testid", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def size(value: `2xs` | xs | sm | md | lg | xl | inherit): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DisclosureArrow.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MergeWithAs[HTMLElement, InnerDisclosureArrowProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
