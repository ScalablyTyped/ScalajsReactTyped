package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libStepperInputNumberMod.InputNumberProps
import typingsJapgolly.antDesignReactNative.libStepperInputNumberMod.InputNumberState
import typingsJapgolly.antDesignReactNative.libStepperInputNumberMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object InputNumber {
  
  def apply[P /* <: InputNumberProps */, S /* <: InputNumberState */](p: P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@ant-design/react-native/lib/stepper/InputNumber", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: InputNumberProps */, S /* <: InputNumberState */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[P, S]]
  
  implicit def make[P /* <: InputNumberProps */, S /* <: InputNumberState */](companion: InputNumber.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}
