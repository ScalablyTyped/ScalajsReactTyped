package typingsJapgolly.rcMenu.components

import typingsJapgolly.rcMenu.esDividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Divider {
  
  @JSImport("rc-menu", "Divider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Divider.type): SharedBuilder_DividerProps1979835233 = new SharedBuilder_DividerProps1979835233(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DividerProps): SharedBuilder_DividerProps1979835233 = new SharedBuilder_DividerProps1979835233(js.Array(this.component, p.asInstanceOf[js.Any]))
}
