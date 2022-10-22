package typingsJapgolly.reactExpandAnimated.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.TransitionTimingFunction
import typingsJapgolly.reactExpandAnimated.anon.Close
import typingsJapgolly.reactExpandAnimated.mod.ExpandProps
import typingsJapgolly.reactExpandAnimated.reactExpandAnimatedStrings.hack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactExpandAnimated {
  
  @JSImport("react-expand-animated", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def easing(value: TransitionTimingFunction): this.type = set("easing", value.asInstanceOf[js.Any])
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def styles(value: Close): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def tag(value: ElementType): this.type = set("tag", value.asInstanceOf[js.Any])
    
    inline def transitions(value: js.Array[hack]): this.type = set("transitions", value.asInstanceOf[js.Any])
    
    inline def transitionsVarargs(value: hack*): this.type = set("transitions", js.Array(value*))
  }
  
  implicit def make(companion: ReactExpandAnimated.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ExpandProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
