package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressComponents.anon.ChildrenReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropZoneProvider {
  
  @JSImport("@wordpress/components", "DropZoneProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DropZoneProvider.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ChildrenReactNode): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
