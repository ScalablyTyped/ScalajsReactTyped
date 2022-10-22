package typingsJapgolly.reactNativeFlipCard.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeFlipCard.mod.FaceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Face {
  
  inline def apply(chilren: js.Array[Element]): Default[typingsJapgolly.reactNativeFlipCard.mod.Face] = {
    val __props = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactNativeFlipCard.mod.Face](js.Array(this.component, __props.asInstanceOf[FaceProps]))
  }
  
  @JSImport("react-native-flip-card", "Face")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FaceProps): Default[typingsJapgolly.reactNativeFlipCard.mod.Face] = new Default[typingsJapgolly.reactNativeFlipCard.mod.Face](js.Array(this.component, p.asInstanceOf[js.Any]))
}
