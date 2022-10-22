package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxMod.CollectionNode
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxMod.InnerListboxProps
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxMod.SelectionMode
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerListbox {
  
  @JSImport("@orbit-ui/react-components", "InnerListbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean | Double): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def defaultFocusTarget(value: String): this.type = set("defaultFocusTarget", value.asInstanceOf[js.Any])
    
    inline def defaultSelectedKeys(value: js.Array[String]): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    inline def defaultSelectedKeysVarargs(value: String*): this.type = set("defaultSelectedKeys", js.Array(value*))
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def focusOnHover(value: Boolean): this.type = set("focusOnHover", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def nodes(value: js.Array[CollectionNode]): this.type = set("nodes", value.asInstanceOf[js.Any])
    
    inline def nodesVarargs(value: CollectionNode*): this.type = set("nodes", js.Array(value*))
    
    inline def onFocusChange(
      value: (/* event */ ReactEventFrom[Element], /* key */ String, /* activeElement */ HTMLElement) => Callback
    ): this.type = set("onFocusChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[Element], t1: /* key */ String, t2: /* activeElement */ HTMLElement) => (value(t0, t1, t2)).runNow()))
    
    inline def onSelectionChange(value: (/* event */ ReactEventFrom[Element], /* key */ js.Array[String]) => Callback): this.type = set("onSelectionChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* key */ js.Array[String]) => (value(t0, t1)).runNow()))
    
    inline def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    
    inline def selectedKeysNull: this.type = set("selectedKeys", null)
    
    inline def selectedKeysVarargs(value: String*): this.type = set("selectedKeys", js.Array(value*))
    
    inline def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def tabbable(value: Boolean): this.type = set("tabbable", value.asInstanceOf[js.Any])
    
    inline def useVirtualFocus(value: Boolean): this.type = set("useVirtualFocus", value.asInstanceOf[js.Any])
    
    inline def validationState(value: valid | invalid): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InnerListbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerListboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
