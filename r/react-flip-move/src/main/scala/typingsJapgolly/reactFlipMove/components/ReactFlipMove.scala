package typingsJapgolly.reactFlipMove.components

import typingsJapgolly.reactFlipMove.mod.FlipMove.FlipMoveProps
import typingsJapgolly.reactFlipMove.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFlipMove {
  
  @JSImport("react-flip-move", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactFlipMove.type): SharedBuilder_FlipMoveProps_812144356[default] = new SharedBuilder_FlipMoveProps_812144356[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlipMoveProps): SharedBuilder_FlipMoveProps_812144356[default] = new SharedBuilder_FlipMoveProps_812144356[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
