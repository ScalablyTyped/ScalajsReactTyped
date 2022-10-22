package typingsJapgolly.reactNativeLinearGradient.components

import typingsJapgolly.reactNativeLinearGradient.mod.LinearGradientProps
import typingsJapgolly.reactNativeLinearGradient.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeLinearGradient {
  
  inline def apply(colors: js.Array[String | Double]): SharedBuilder_LinearGradientProps1232983835[default] = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    new SharedBuilder_LinearGradientProps1232983835[default](js.Array(this.component, __props.asInstanceOf[LinearGradientProps]))
  }
  
  @JSImport("react-native-linear-gradient", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinearGradientProps): SharedBuilder_LinearGradientProps1232983835[default] = new SharedBuilder_LinearGradientProps1232983835[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
