package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressComponents.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@wordpress/components/slot-fill", "Provider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Provider.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: `1`): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
