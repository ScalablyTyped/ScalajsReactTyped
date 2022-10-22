package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeConsumer {
  
  inline def apply(children: ThemeProps[js.Object] => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[ThemeProps[js.Object]]]))
  }
  
  @JSImport("react-native-elements", "ThemeConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[ThemeProps[js.Object]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
