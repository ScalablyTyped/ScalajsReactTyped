package typingsJapgolly.rnSwipeablePanel.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rnSwipeablePanel.distBarMod.BarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bar {
  
  @JSImport("rn-swipeable-panel/dist/Bar", "Bar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def barContainerStyle(value: js.Object): this.type = set("barContainerStyle", value.asInstanceOf[js.Any])
    
    inline def barStyle(value: js.Object): this.type = set("barStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Bar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
