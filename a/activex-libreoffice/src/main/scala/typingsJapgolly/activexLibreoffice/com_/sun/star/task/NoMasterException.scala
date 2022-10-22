package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is thrown when a master password is needed but not available/correct. */
trait NoMasterException
  extends StObject
     with Exception {
  
  /** specifies the mode in which password should be queried. */
  var Mode: PasswordRequestMode
}
object NoMasterException {
  
  inline def apply(Context: XInterface, Message: String, Mode: PasswordRequestMode): NoMasterException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoMasterException]
  }
  
  extension [Self <: NoMasterException](x: Self) {
    
    inline def setMode(value: PasswordRequestMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
