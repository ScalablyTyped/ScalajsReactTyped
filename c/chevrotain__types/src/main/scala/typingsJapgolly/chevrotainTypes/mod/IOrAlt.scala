package typingsJapgolly.chevrotainTypes.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOrAlt[T] extends StObject {
  
  def ALT(): T
  
  var GATE: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /**
    * A Flag indicating that any ambiguities involving this
    * specific alternative Should be ignored.
    *
    * This flag will be **implicitly** enabled if a GATE is used
    * as the assumption is that the GATE is used to resolve an ambiguity.
    */
  var IGNORE_AMBIGUITIES: js.UndefOr[Boolean] = js.undefined
}
object IOrAlt {
  
  inline def apply[T](ALT: CallbackTo[T]): IOrAlt[T] = {
    val __obj = js.Dynamic.literal(ALT = ALT.toJsFn)
    __obj.asInstanceOf[IOrAlt[T]]
  }
  
  extension [Self <: IOrAlt[?], T](x: Self & IOrAlt[T]) {
    
    inline def setALT(value: CallbackTo[T]): Self = StObject.set(x, "ALT", value.toJsFn)
    
    inline def setGATE(value: CallbackTo[Boolean]): Self = StObject.set(x, "GATE", value.toJsFn)
    
    inline def setGATEUndefined: Self = StObject.set(x, "GATE", js.undefined)
    
    inline def setIGNORE_AMBIGUITIES(value: Boolean): Self = StObject.set(x, "IGNORE_AMBIGUITIES", value.asInstanceOf[js.Any])
    
    inline def setIGNORE_AMBIGUITIESUndefined: Self = StObject.set(x, "IGNORE_AMBIGUITIES", js.undefined)
  }
}
