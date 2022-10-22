package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IOException that carries a legacy error code (not only I/O related). */
trait ErrorCodeIOException
  extends StObject
     with Exception {
  
  /** specifies the error code; see tools/errcode.hxx for details. */
  var ErrCode: Double
}
object ErrorCodeIOException {
  
  inline def apply(Context: XInterface, ErrCode: Double, Message: String): ErrorCodeIOException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrCode = ErrCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeIOException]
  }
  
  extension [Self <: ErrorCodeIOException](x: Self) {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "ErrCode", value.asInstanceOf[js.Any])
  }
}
