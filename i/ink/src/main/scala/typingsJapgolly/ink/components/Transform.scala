package typingsJapgolly.ink.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ink.buildComponentsTransformMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transform {
  
  inline def apply(transform: String => String): Default[js.Object] = {
    val __props = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("ink", "Transform")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
