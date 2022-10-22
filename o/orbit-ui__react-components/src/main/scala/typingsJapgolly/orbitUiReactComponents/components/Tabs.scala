package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabsMod.InnerTabsProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  inline def apply(`aria-label`: String): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MergeWithAs[HTMLElement, InnerTabsProps]]))
  }
  
  @JSImport("@orbit-ui/react-components", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean | Double): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def `data-testid`(value: String): this.type = set("data-testid", value.asInstanceOf[js.Any])
    
    inline def defaultSelectedKey(value: String): this.type = set("defaultSelectedKey", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def manual(value: Boolean): this.type = set("manual", value.asInstanceOf[js.Any])
    
    inline def onSelectionChange(value: (/* event */ ReactEventFrom[Element], /* key */ String) => Callback): this.type = set("onSelectionChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* key */ String) => (value(t0, t1)).runNow()))
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def selectedKey(value: String): this.type = set("selectedKey", value.asInstanceOf[js.Any])
    
    inline def selectedKeyNull: this.type = set("selectedKey", null)
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MergeWithAs[HTMLElement, InnerTabsProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
