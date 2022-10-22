package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionMod.InnerAccordionProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.bordered
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.borderless
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.multiple
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.single
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerAccordion {
  
  @JSImport("@orbit-ui/react-components", "InnerAccordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean | Double): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def defaultExpandedKeys(value: js.Array[String]): this.type = set("defaultExpandedKeys", value.asInstanceOf[js.Any])
    
    inline def defaultExpandedKeysVarargs(value: String*): this.type = set("defaultExpandedKeys", js.Array(value*))
    
    inline def expandedKeys(value: js.Array[String]): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
    
    inline def expandedKeysNull: this.type = set("expandedKeys", null)
    
    inline def expandedKeysVarargs(value: String*): this.type = set("expandedKeys", js.Array(value*))
    
    inline def expansionMode(value: single | multiple): this.type = set("expansionMode", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onExpansionChange(value: (/* event */ ReactEventFrom[Element], /* keys */ js.Array[String]) => Callback): this.type = set("onExpansionChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* keys */ js.Array[String]) => (value(t0, t1)).runNow()))
    
    inline def variant(value: borderless | bordered): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InnerAccordion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerAccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
