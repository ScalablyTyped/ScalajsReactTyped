package typingsJapgolly.formol.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.formol.mod.InlinerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Inliner {
  
  @JSImport("formol", "Inliner")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Inliner.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InlinerProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
