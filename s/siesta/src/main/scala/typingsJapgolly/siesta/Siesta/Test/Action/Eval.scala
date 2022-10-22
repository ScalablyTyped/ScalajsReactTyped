package typingsJapgolly.siesta.Siesta.Test.Action

import typingsJapgolly.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait Eval
  extends StObject
     with IAction {
  
  var options: js.UndefOr[Any] = js.undefined
}
object Eval {
  
  inline def apply(): Eval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eval]
  }
  
  extension [Self <: Eval](x: Self) {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
