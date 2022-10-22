package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.BreakStatement_
  - typingsJapgolly.babelTypes.libMod.ContinueStatement_
  - typingsJapgolly.babelTypes.libMod.ReturnStatement_
  - typingsJapgolly.babelTypes.libMod.ThrowStatement_
*/
trait CompletionStatement extends StObject
object CompletionStatement {
  
  inline def BreakStatement_(): typingsJapgolly.babelTypes.libMod.BreakStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BreakStatement_]
  }
  
  inline def ContinueStatement_(): typingsJapgolly.babelTypes.libMod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ContinueStatement_]
  }
  
  inline def ReturnStatement_(): typingsJapgolly.babelTypes.libMod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ReturnStatement_]
  }
  
  inline def ThrowStatement_(argument: Expression): typingsJapgolly.babelTypes.libMod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ThrowStatement_]
  }
}
