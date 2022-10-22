package typingsJapgolly.victoryCore.components

import typingsJapgolly.victoryCore.esVictoryPrimitivesTypesMod.VictoryPrimitiveShapeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rect {
  
  @JSImport("victory-core/es", "Rect")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Rect.type): SharedBuilder_VictoryPrimitiveShapeProps1665464111 = new SharedBuilder_VictoryPrimitiveShapeProps1665464111(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryPrimitiveShapeProps): SharedBuilder_VictoryPrimitiveShapeProps1665464111 = new SharedBuilder_VictoryPrimitiveShapeProps1665464111(js.Array(this.component, p.asInstanceOf[js.Any]))
}
