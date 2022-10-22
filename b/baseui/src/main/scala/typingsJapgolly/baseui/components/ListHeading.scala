package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiInts.`1`
import typingsJapgolly.baseui.baseuiInts.`2`
import typingsJapgolly.baseui.listTypesMod.HeadingOverrides
import typingsJapgolly.baseui.listTypesMod.HeadingProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListHeading {
  
  @JSImport("baseui/list", "ListHeading")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLLIElement] {
    
    inline def endEnhancer(value: Node | ComponentType[js.Object]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    
    inline def endEnhancerDescription(value: Node | ComponentType[js.Object]): this.type = set("endEnhancerDescription", value.asInstanceOf[js.Any])
    
    inline def endEnhancerDescriptionNull: this.type = set("endEnhancerDescription", null)
    
    inline def endEnhancerDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("endEnhancerDescription", js.Array(value*))
    
    inline def endEnhancerDescriptionVdomElement(value: VdomElement): this.type = set("endEnhancerDescription", value.rawElement.asInstanceOf[js.Any])
    
    inline def endEnhancerNull: this.type = set("endEnhancer", null)
    
    inline def endEnhancerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("endEnhancer", js.Array(value*))
    
    inline def endEnhancerVdomElement(value: VdomElement): this.type = set("endEnhancer", value.rawElement.asInstanceOf[js.Any])
    
    inline def heading(value: Node | ComponentType[js.Object]): this.type = set("heading", value.asInstanceOf[js.Any])
    
    inline def headingNull: this.type = set("heading", null)
    
    inline def headingVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("heading", js.Array(value*))
    
    inline def headingVdomElement(value: VdomElement): this.type = set("heading", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxLines(value: `1` | `2`): this.type = set("maxLines", value.asInstanceOf[js.Any])
    
    inline def overrides(value: HeadingOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def subHeading(value: Node | ComponentType[js.Object]): this.type = set("subHeading", value.asInstanceOf[js.Any])
    
    inline def subHeadingNull: this.type = set("subHeading", null)
    
    inline def subHeadingVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subHeading", js.Array(value*))
    
    inline def subHeadingVdomElement(value: VdomElement): this.type = set("subHeading", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListHeading.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeadingProps & RefAttributes[HTMLLIElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
