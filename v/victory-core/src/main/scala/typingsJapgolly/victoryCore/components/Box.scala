package typingsJapgolly.victoryCore.components

import typingsJapgolly.victoryCore.esVictoryPrimitivesBorderMod.BorderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("victory-core/es", "Box")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Box.type): SharedBuilder_BorderProps_397880805 = new SharedBuilder_BorderProps_397880805(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BorderProps): SharedBuilder_BorderProps_397880805 = new SharedBuilder_BorderProps_397880805(js.Array(this.component, p.asInstanceOf[js.Any]))
}
