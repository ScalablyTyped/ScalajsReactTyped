package typingsJapgolly.victoryCore.components

import typingsJapgolly.victoryCore.esVictoryPrimitivesBorderMod.BorderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Border {
  
  @JSImport("victory-core/es", "Border")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Border.type): SharedBuilder_BorderProps_397880805 = new SharedBuilder_BorderProps_397880805(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BorderProps): SharedBuilder_BorderProps_397880805 = new SharedBuilder_BorderProps_397880805(js.Array(this.component, p.asInstanceOf[js.Any]))
}
