package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativePaper.libTypescriptComponentsPortalPortalHostMod.Props
import typingsJapgolly.reactNativePaper.libTypescriptComponentsPortalPortalHostMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalHost {
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/PortalHost", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PortalHost.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
