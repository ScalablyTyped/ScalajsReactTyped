package typingsJapgolly.reactScrollRotate.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactScrollRotate.mod.ScrollRotateProps
import typingsJapgolly.reactScrollRotate.reactScrollRotateStrings.perc
import typingsJapgolly.reactScrollRotate.reactScrollRotateStrings.px
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollRotate {
  
  @JSImport("react-scroll-rotate", "ScrollRotate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactScrollRotate.mod.ScrollRotate] {
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def from(value: Double): this.type = set("from", value.asInstanceOf[js.Any])
    
    inline def loops(value: Double): this.type = set("loops", value.asInstanceOf[js.Any])
    
    inline def method(value: px | perc): this.type = set("method", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def throttle(value: Double): this.type = set("throttle", value.asInstanceOf[js.Any])
    
    inline def to(value: Double): this.type = set("to", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScrollRotate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollRotateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
