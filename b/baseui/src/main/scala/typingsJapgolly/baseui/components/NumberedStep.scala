package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.progressStepsTypesMod.NumberedStepOverrides
import typingsJapgolly.baseui.progressStepsTypesMod.NumberedStepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NumberedStep {
  
  @JSImport("baseui/progress-steps", "NumberedStep")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    
    inline def isCompleted(value: Boolean): this.type = set("isCompleted", value.asInstanceOf[js.Any])
    
    inline def isLast(value: Boolean): this.type = set("isLast", value.asInstanceOf[js.Any])
    
    inline def overrides(value: NumberedStepOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def step(value: VdomNode): this.type = set("step", value.rawNode.asInstanceOf[js.Any])
    
    inline def stepNull: this.type = set("step", null)
    
    inline def stepVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("step", js.Array(value*))
    
    inline def stepVdomElement(value: VdomElement): this.type = set("step", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NumberedStep.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NumberedStepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
