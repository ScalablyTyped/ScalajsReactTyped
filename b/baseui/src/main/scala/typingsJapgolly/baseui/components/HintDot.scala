package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.badgeTypesMod.BadgeOverrides
import typingsJapgolly.baseui.badgeTypesMod.Color
import typingsJapgolly.baseui.badgeTypesMod.HintDotProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HintDot {
  
  @JSImport("baseui/badge", "HintDot")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def horizontalOffset(value: String): this.type = set("horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def overrides(value: BadgeOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def verticalOffset(value: String): this.type = set("verticalOffset", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HintDot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HintDotProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
