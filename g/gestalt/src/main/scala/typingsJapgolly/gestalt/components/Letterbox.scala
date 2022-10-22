package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.LetterboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Letterbox {
  
  inline def apply(contentAspectRatio: Double, height: Double, width: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(contentAspectRatio = contentAspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[LetterboxProps]))
  }
  
  @JSImport("gestalt", "Letterbox")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LetterboxProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
