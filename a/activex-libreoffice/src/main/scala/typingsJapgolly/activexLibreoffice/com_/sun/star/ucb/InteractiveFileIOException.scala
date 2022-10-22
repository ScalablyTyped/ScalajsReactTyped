package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An input/output error while processing a file.
  *
  * This exception is deprecated. Use {@link InteractiveAugmentedIOException} instead.
  * @deprecated Deprecated
  */
trait InteractiveFileIOException
  extends StObject
     with InteractiveIOException {
  
  /** The file url where the i/o error occurred */
  var FileName: String
}
object InteractiveFileIOException {
  
  inline def apply(
    Classification: InteractionClassification,
    Code: IOErrorCode,
    Context: XInterface,
    FileName: String,
    Message: String
  ): InteractiveFileIOException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveFileIOException]
  }
  
  extension [Self <: InteractiveFileIOException](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
  }
}
