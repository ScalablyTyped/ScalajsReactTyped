package typingsJapgolly.reactNativeVectorIcons.components

import typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps
import typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FontAwesome5 {
  
  inline def apply(name: String): SharedBuilder_FontAwesome5IconProps_1260805263[default] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_FontAwesome5IconProps_1260805263[default](js.Array(this.component, __props.asInstanceOf[FontAwesome5IconProps]))
  }
  
  @JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FontAwesome5IconProps): SharedBuilder_FontAwesome5IconProps_1260805263[default] = new SharedBuilder_FontAwesome5IconProps_1260805263[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
