package typingsJapgolly.protonNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.protonNative.anon.BackgroundColor
import typingsJapgolly.protonNative.mod.StyledTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledText {
  
  @JSImport("proton-native", "StyledText")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.protonNative.mod.StyledText] {
    
    inline def style(value: BackgroundColor): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def x(value: Double | String): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double | String): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StyledText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StyledTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
