package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this request specifies the mode in which the password should be asked
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a document password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @since OOo 1.1.2
  */
trait DocumentPasswordRequest
  extends StObject
     with PasswordRequest {
  
  /** the name of the document (more properly, the URL of the document) */
  var Name: String
}
object DocumentPasswordRequest {
  
  inline def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    Mode: PasswordRequestMode,
    Name: String
  ): DocumentPasswordRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPasswordRequest]
  }
  
  extension [Self <: DocumentPasswordRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
