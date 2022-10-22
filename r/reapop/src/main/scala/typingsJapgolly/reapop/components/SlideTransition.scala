package typingsJapgolly.reapop.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reapop.distComponentsSlideTransitionMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object SlideTransition {
  
  def apply(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("reapop", "SlideTransition")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SlideTransition.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
