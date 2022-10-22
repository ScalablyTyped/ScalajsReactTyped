package typingsJapgolly.reactElemental.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.LoadingBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoadingBar {
  
  @JSImport("react-elemental", "LoadingBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactElemental.mod.LoadingBar] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def thickness(value: Double): this.type = set("thickness", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LoadingBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoadingBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
