package typingsJapgolly.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.zdog.mod.VectorOptions
  - typingsJapgolly.zdog.mod.PathLineCommand
  - typingsJapgolly.zdog.mod.PathMoveCommand
  - typingsJapgolly.zdog.mod.PathArcCommand
  - typingsJapgolly.zdog.mod.PathBezierCommand
*/
trait PathCommand extends StObject
object PathCommand {
  
  inline def PathArcCommand(arc: js.Tuple2[VectorOptions, VectorOptions]): typingsJapgolly.zdog.mod.PathArcCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.zdog.mod.PathArcCommand]
  }
  
  inline def PathBezierCommand(bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): typingsJapgolly.zdog.mod.PathBezierCommand = {
    val __obj = js.Dynamic.literal(bezier = bezier.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.zdog.mod.PathBezierCommand]
  }
  
  inline def PathLineCommand(line: VectorOptions): typingsJapgolly.zdog.mod.PathLineCommand = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.zdog.mod.PathLineCommand]
  }
  
  inline def PathMoveCommand(move: VectorOptions): typingsJapgolly.zdog.mod.PathMoveCommand = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.zdog.mod.PathMoveCommand]
  }
  
  inline def VectorOptions(): typingsJapgolly.zdog.mod.VectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.zdog.mod.VectorOptions]
  }
}
