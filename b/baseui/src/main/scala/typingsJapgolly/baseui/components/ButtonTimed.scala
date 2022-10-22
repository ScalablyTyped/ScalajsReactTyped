package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.reset
import typingsJapgolly.baseui.baseuiStrings.submit
import typingsJapgolly.baseui.buttonTimedTypesMod.ButtonTimedOverrides
import typingsJapgolly.baseui.buttonTimedTypesMod.ButtonTimedProps
import typingsJapgolly.baseui.buttonTypesMod.CustomColors
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonTimed {
  
  inline def apply(initialTime: Double, onClick: js.UndefOr[ReactEventFrom[HTMLButtonElement]] => Any): Builder = {
    val __props = js.Dynamic.literal(initialTime = initialTime.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonTimedProps]))
  }
  
  @JSImport("baseui/button-timed", "ButtonTimed")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def colors(value: CustomColors): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def endEnhancer(value: Node | ComponentType[Any]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    
    inline def endEnhancerNull: this.type = set("endEnhancer", null)
    
    inline def endEnhancerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("endEnhancer", js.Array(value*))
    
    inline def endEnhancerVdomElement(value: VdomElement): this.type = set("endEnhancer", value.rawElement.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    inline def overrides(value: ButtonTimedOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def paused(value: Boolean): this.type = set("paused", value.asInstanceOf[js.Any])
    
    inline def startEnhancer(value: Node | ComponentType[Any]): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
    
    inline def startEnhancerNull: this.type = set("startEnhancer", null)
    
    inline def startEnhancerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("startEnhancer", js.Array(value*))
    
    inline def startEnhancerVdomElement(value: VdomElement): this.type = set("startEnhancer", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(value: submit | reset | button): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonTimedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
