package typingsJapgolly.extjs.Ext.dd

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDDTarget
  extends StObject
     with IDragDrop {
  
  /** [Method] toString method
    * @returns String string representation of the dd obj
    */
  @JSName("toString")
  var toString_FIDDTarget: js.UndefOr[js.Function0[String]] = js.undefined
}
object IDDTarget {
  
  inline def apply(): IDDTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDDTarget]
  }
  
  extension [Self <: IDDTarget](x: Self) {
    
    inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
  }
}
