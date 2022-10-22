package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativePaper.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppbarBackIcon {
  
  inline def apply(color: String, size: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Size]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarBackIcon", "AppbarBackIcon")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Size): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
