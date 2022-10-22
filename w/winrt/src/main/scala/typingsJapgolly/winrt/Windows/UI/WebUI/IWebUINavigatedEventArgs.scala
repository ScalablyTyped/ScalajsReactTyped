package typingsJapgolly.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebUINavigatedEventArgs extends StObject {
  
  var navigatedOperation: WebUINavigatedOperation
}
object IWebUINavigatedEventArgs {
  
  inline def apply(navigatedOperation: WebUINavigatedOperation): IWebUINavigatedEventArgs = {
    val __obj = js.Dynamic.literal(navigatedOperation = navigatedOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUINavigatedEventArgs]
  }
  
  extension [Self <: IWebUINavigatedEventArgs](x: Self) {
    
    inline def setNavigatedOperation(value: WebUINavigatedOperation): Self = StObject.set(x, "navigatedOperation", value.asInstanceOf[js.Any])
  }
}
