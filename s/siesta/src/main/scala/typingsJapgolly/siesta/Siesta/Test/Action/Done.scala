package typingsJapgolly.siesta.Siesta.Test.Action

import typingsJapgolly.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait Done
  extends StObject
     with IAction {
  
  var delay: js.UndefOr[Double] = js.undefined
}
object Done {
  
  inline def apply(): Done = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Done]
  }
  
  extension [Self <: Done](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
