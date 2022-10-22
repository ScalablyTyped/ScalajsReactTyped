package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeMaterialUi.mod.ThemeConsumerProps
import typingsJapgolly.reactNativeMaterialUi.mod.ThemeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  inline def apply(children: ThemeProps => Element): Default[typingsJapgolly.reactNativeMaterialUi.mod.ThemeContext.Consumer] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[typingsJapgolly.reactNativeMaterialUi.mod.ThemeContext.Consumer](js.Array(this.component, __props.asInstanceOf[ThemeConsumerProps]))
  }
  
  @JSImport("react-native-material-ui", "ThemeContext.Consumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThemeConsumerProps): Default[typingsJapgolly.reactNativeMaterialUi.mod.ThemeContext.Consumer] = new Default[typingsJapgolly.reactNativeMaterialUi.mod.ThemeContext.Consumer](js.Array(this.component, p.asInstanceOf[js.Any]))
}
