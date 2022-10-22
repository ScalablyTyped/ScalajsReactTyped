package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings.active
import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.butt
import typingsJapgolly.antd.antdStrings.exception
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.normal
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.antd.antdStrings.round
import typingsJapgolly.antd.antdStrings.square
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.top
import typingsJapgolly.antd.libProgressProgressMod.ProgressGradient
import typingsJapgolly.antd.libProgressProgressMod.ProgressProps
import typingsJapgolly.antd.libProgressProgressMod.ProgressSize
import typingsJapgolly.antd.libProgressProgressMod.ProgressType
import typingsJapgolly.antd.libProgressProgressMod.SuccessProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Progress {
  
  @JSImport("antd", "Progress")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def format(
      value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("format", js.Any.fromFunction2(value))
    
    inline def gapDegree(value: Double): this.type = set("gapDegree", value.asInstanceOf[js.Any])
    
    inline def gapPosition(value: top | bottom | left | right): this.type = set("gapPosition", value.asInstanceOf[js.Any])
    
    inline def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def showInfo(value: Boolean): this.type = set("showInfo", value.asInstanceOf[js.Any])
    
    inline def size(value: ProgressSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: normal | exception | active | success): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def steps(value: Double): this.type = set("steps", value.asInstanceOf[js.Any])
    
    inline def strokeColor(value: String | js.Array[String] | ProgressGradient): this.type = set("strokeColor", value.asInstanceOf[js.Any])
    
    inline def strokeColorVarargs(value: String*): this.type = set("strokeColor", js.Array(value*))
    
    inline def strokeLinecap(value: butt | square | round): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def success(value: SuccessProps): this.type = set("success", value.asInstanceOf[js.Any])
    
    inline def successPercent(value: Double): this.type = set("successPercent", value.asInstanceOf[js.Any])
    
    inline def trailColor(value: String): this.type = set("trailColor", value.asInstanceOf[js.Any])
    
    inline def `type`(value: ProgressType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Progress.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
