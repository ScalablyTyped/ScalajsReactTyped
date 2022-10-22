package typingsJapgolly.reactBurgerMenu.components

import typingsJapgolly.reactBurgerMenu.mod.Props
import typingsJapgolly.reactBurgerMenu.mod.push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Push {
  
  @JSImport("react-burger-menu", "push")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Push.type): SharedBuilder_Props_1809302565[push] = new SharedBuilder_Props_1809302565[push](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1809302565[push] = new SharedBuilder_Props_1809302565[push](js.Array(this.component, p.asInstanceOf[js.Any]))
}
