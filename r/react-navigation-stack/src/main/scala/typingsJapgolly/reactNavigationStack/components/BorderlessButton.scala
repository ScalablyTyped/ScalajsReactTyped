package typingsJapgolly.reactNavigationStack.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsBorderlessButtonMod.Props
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsBorderlessButtonMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BorderlessButton {
  
  inline def apply(pressOpacity: Double): Default[default] = {
    val __props = js.Dynamic.literal(pressOpacity = pressOpacity.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/BorderlessButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
