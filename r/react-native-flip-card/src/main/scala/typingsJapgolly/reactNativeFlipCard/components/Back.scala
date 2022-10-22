package typingsJapgolly.reactNativeFlipCard.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeFlipCard.mod.BackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Back {
  
  inline def apply(chilren: js.Array[Element], flipHorizontal: Boolean, flipVertical: Boolean, perspective: Double): Default[typingsJapgolly.reactNativeFlipCard.mod.Back] = {
    val __props = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any], flipHorizontal = flipHorizontal.asInstanceOf[js.Any], flipVertical = flipVertical.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactNativeFlipCard.mod.Back](js.Array(this.component, __props.asInstanceOf[BackProps]))
  }
  
  @JSImport("react-native-flip-card", "Back")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BackProps): Default[typingsJapgolly.reactNativeFlipCard.mod.Back] = new Default[typingsJapgolly.reactNativeFlipCard.mod.Back](js.Array(this.component, p.asInstanceOf[js.Any]))
}
