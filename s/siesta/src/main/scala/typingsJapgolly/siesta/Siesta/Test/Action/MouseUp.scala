package typingsJapgolly.siesta.Siesta.Test.Action

import typingsJapgolly.siesta.Siesta.Test.Action.Role.IHasTarget
import typingsJapgolly.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait MouseUp
  extends StObject
     with IAction
     with IHasTarget {
  
  var options: js.UndefOr[Any] = js.undefined
}
object MouseUp {
  
  inline def apply(): MouseUp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseUp]
  }
  
  extension [Self <: MouseUp](x: Self) {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
