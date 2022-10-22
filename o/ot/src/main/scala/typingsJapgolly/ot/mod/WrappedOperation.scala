package typingsJapgolly.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "WrappedOperation")
@js.native
open class WrappedOperation[T] protected () extends StObject {
  def this(operation: TextOperation) = this()
  def this(operation: TextOperation, meta: T) = this()
  
  @JSName("apply")
  def apply(doc: String): String = js.native
  
  def compose(operation: WrappedOperation[T]): WrappedOperation[T] = js.native
  
  def invert(doc: String): WrappedOperation[T] = js.native
  
  var meta: T = js.native
  
  var wrapped: TextOperation = js.native
}
/* static members */
object WrappedOperation {
  
  @JSImport("ot", "WrappedOperation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform[T](left: WrappedOperation[T], right: WrappedOperation[T]): WrappedOperation[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[WrappedOperation[T]]
}
