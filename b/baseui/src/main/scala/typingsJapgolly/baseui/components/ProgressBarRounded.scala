package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.progressBarTypesMod.ProgressBarRoundedOverrides
import typingsJapgolly.baseui.progressBarTypesMod.ProgressBarRoundedProps
import typingsJapgolly.baseui.progressBarTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressBarRounded {
  
  @JSImport("baseui/progress-bar", "ProgressBarRounded")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def overrides(value: ProgressBarRoundedOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def progress(value: Double): this.type = set("progress", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ProgressBarRounded.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProgressBarRoundedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
