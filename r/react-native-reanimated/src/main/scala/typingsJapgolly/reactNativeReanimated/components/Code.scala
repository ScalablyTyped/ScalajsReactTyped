package typingsJapgolly.reactNativeReanimated.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeReanimated.mod.Animated.AnimatedNode
import typingsJapgolly.reactNativeReanimated.mod.Animated.CodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Code {
  
  @JSImport("react-native-reanimated", "default.Code")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeReanimated.mod.default.Code] {
    
    inline def children(value: CallbackTo[AnimatedNode[Double]]): this.type = set("children", value.toJsFn)
    
    inline def dependencies(value: js.Array[Any]): this.type = set("dependencies", value.asInstanceOf[js.Any])
    
    inline def dependenciesVarargs(value: Any*): this.type = set("dependencies", js.Array(value*))
    
    inline def exec(value: AnimatedNode[Double]): this.type = set("exec", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Code.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
