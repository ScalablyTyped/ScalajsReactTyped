package typingsJapgolly.inkGradient.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.inkGradient.mod.GradientProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkGradient {
  
  @JSImport("ink-gradient", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: InkGradient.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GradientProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
