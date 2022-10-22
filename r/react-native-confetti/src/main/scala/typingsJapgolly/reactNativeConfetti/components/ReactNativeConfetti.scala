package typingsJapgolly.reactNativeConfetti.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeConfetti.mod.ConfettiProps
import typingsJapgolly.reactNativeConfetti.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeConfetti {
  
  @JSImport("react-native-confetti", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def bsize(value: Double): this.type = set("bsize", value.asInstanceOf[js.Any])
    
    inline def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def confettiCount(value: Double): this.type = set("confettiCount", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def untilStopped(value: Boolean): this.type = set("untilStopped", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeConfetti.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ConfettiProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
