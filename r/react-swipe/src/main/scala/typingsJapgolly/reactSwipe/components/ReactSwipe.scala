package typingsJapgolly.reactSwipe.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSwipe.mod.Props
import typingsJapgolly.reactSwipe.mod.Style
import typingsJapgolly.reactSwipe.mod.^
import typingsJapgolly.swipe.SwipeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSwipe {
  
  @JSImport("react-swipe", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def childCount(value: Double): this.type = set("childCount", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def style(value: Style): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def swipeOptions(value: SwipeOptions): this.type = set("swipeOptions", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSwipe.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
