package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a message box. */
trait XMessageBox extends StObject {
  
  /** the caption text. */
  var CaptionText: String
  
  /** the message text. */
  var MessageText: String
  
  /**
    * shows the message box.
    * @returns one of {@link MessageBoxResults} .
    */
  def execute(): Double
}
object XMessageBox {
  
  inline def apply(CaptionText: String, MessageText: String, execute: CallbackTo[Double]): XMessageBox = {
    val __obj = js.Dynamic.literal(CaptionText = CaptionText.asInstanceOf[js.Any], MessageText = MessageText.asInstanceOf[js.Any], execute = execute.toJsFn)
    __obj.asInstanceOf[XMessageBox]
  }
  
  extension [Self <: XMessageBox](x: Self) {
    
    inline def setCaptionText(value: String): Self = StObject.set(x, "CaptionText", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: CallbackTo[Double]): Self = StObject.set(x, "execute", value.toJsFn)
    
    inline def setMessageText(value: String): Self = StObject.set(x, "MessageText", value.asInstanceOf[js.Any])
  }
}
