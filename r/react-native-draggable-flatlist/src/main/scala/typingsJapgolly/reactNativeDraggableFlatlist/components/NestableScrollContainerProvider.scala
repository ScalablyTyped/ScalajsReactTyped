package typingsJapgolly.reactNativeDraggableFlatlist.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeDraggableFlatlist.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NestableScrollContainerProvider {
  
  @JSImport("react-native-draggable-flatlist/lib/context/nestableScrollContainerContext", "NestableScrollContainerProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NestableScrollContainerProvider.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
