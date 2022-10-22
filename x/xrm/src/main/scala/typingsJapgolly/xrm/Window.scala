package typingsJapgolly.xrm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.GlobalContext
import typingsJapgolly.xrm.Xrm.XrmStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  def GetGlobalContext(): GlobalContext
  
  var Xrm: XrmStatic
}
object Window {
  
  inline def apply(GetGlobalContext: CallbackTo[GlobalContext], Xrm: XrmStatic): Window = {
    val __obj = js.Dynamic.literal(GetGlobalContext = GetGlobalContext.toJsFn, Xrm = Xrm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setGetGlobalContext(value: CallbackTo[GlobalContext]): Self = StObject.set(x, "GetGlobalContext", value.toJsFn)
    
    inline def setXrm(value: XrmStatic): Self = StObject.set(x, "Xrm", value.asInstanceOf[js.Any])
  }
}
