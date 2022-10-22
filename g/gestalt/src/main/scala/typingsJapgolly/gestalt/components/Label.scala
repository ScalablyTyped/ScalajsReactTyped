package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.LabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Label {
  
  inline def apply(htmlFor: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[LabelProps]))
  }
  
  @JSImport("gestalt", "Label")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LabelProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
