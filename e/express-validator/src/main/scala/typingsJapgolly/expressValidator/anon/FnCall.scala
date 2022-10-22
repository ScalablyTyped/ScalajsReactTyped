package typingsJapgolly.expressValidator.anon

import typingsJapgolly.expressValidator.srcValidationResultMod.ResultFactory
import typingsJapgolly.expressValidator.srcValidationResultMod.ResultFactoryBuilderOptions
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[T](): ResultFactory[T] = js.native
  def apply[T](options: Partial[ResultFactoryBuilderOptions[T]]): ResultFactory[T] = js.native
}
