package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.PartialProgressBarPropsRe
import typingsJapgolly.baseui.progressBarTypesMod.ProgressBarOverrides
import typingsJapgolly.baseui.progressBarTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressBar {
  
  @JSImport("baseui/progress-bar", "ProgressBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def getProgressLabel(value: (/* value */ Double, /* maxValue */ Double, /* minValue */ Double) => Node): this.type = set("getProgressLabel", js.Any.fromFunction3(value))
    
    inline def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    inline def maxValue(value: Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def minValue(value: Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    
    inline def overrides(value: ProgressBarOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def showLabel(value: Boolean): this.type = set("showLabel", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def steps(value: Double): this.type = set("steps", value.asInstanceOf[js.Any])
    
    inline def successValue(value: Double): this.type = set("successValue", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ProgressBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialProgressBarPropsRe): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
