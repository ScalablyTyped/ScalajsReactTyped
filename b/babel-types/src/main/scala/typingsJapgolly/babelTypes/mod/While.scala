package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.DoWhileStatement_
  - typingsJapgolly.babelTypes.mod.WhileStatement_
*/
trait While extends StObject
object While {
  
  inline def DoWhileStatement_(body: Statement, end: Double, loc: SourceLocation, start: Double, test: Expression): typingsJapgolly.babelTypes.mod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DoWhileStatement_]
  }
  
  inline def WhileStatement_(body: Statement, end: Double, loc: SourceLocation, start: Double, test: Expression): typingsJapgolly.babelTypes.mod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.WhileStatement_]
  }
}
