package typingsJapgolly.expressValidator.anon

import typingsJapgolly.expressValidator.srcBaseMod.ValidationError
import typingsJapgolly.expressValidator.srcContextMod.ReadonlyContext
import typingsJapgolly.expressValidator.srcValidationResultMod.ErrorFormatter
import typingsJapgolly.expressValidator.srcValidationResultMod.Result
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined express-validator.express-validator/src/validation-result.Result<any> & {  context :express-validator.express-validator/src/context.ReadonlyContext} */
@js.native
trait ResultanycontextReadonlyC extends StObject {
  
  def array(): js.Array[Any] = js.native
  def array(options: OnlyFirstError): js.Array[Any] = js.native
  
  var context: ReadonlyContext = js.native
  
  /* private */ val errors: Any = js.native
  
  def formatWith[T2](formatter: ErrorFormatter[T2]): Result[T2] = js.native
  
  /* private */ var formatter: Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  def mapped(): Record[String, Any] = js.native
  
  def `throw`(): Unit = js.native
}
