package typingsJapgolly.chevrotainTypes.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManySepMethodOpts[T] extends StObject {
  
  /**
    * The grammar to process in each iteration.
    */
  def DEF(): T
  /**
    * The grammar to process in each iteration.
    */
  @JSName("DEF")
  var DEF_Original: GrammarAction[T]
  
  /**
    * @see DSLMethodOpts.MAX_LOOKAHEAD
    */
  var MAX_LOOKAHEAD: js.UndefOr[Double] = js.undefined
  
  /**
    * The separator between each iteration.
    */
  var SEP: TokenType
}
object ManySepMethodOpts {
  
  inline def apply[T](DEF: CallbackTo[T], SEP: TokenType): ManySepMethodOpts[T] = {
    val __obj = js.Dynamic.literal(DEF = DEF.toJsFn, SEP = SEP.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManySepMethodOpts[T]]
  }
  
  extension [Self <: ManySepMethodOpts[?], T](x: Self & ManySepMethodOpts[T]) {
    
    inline def setDEF(value: CallbackTo[T]): Self = StObject.set(x, "DEF", value.toJsFn)
    
    inline def setMAX_LOOKAHEAD(value: Double): Self = StObject.set(x, "MAX_LOOKAHEAD", value.asInstanceOf[js.Any])
    
    inline def setMAX_LOOKAHEADUndefined: Self = StObject.set(x, "MAX_LOOKAHEAD", js.undefined)
    
    inline def setSEP(value: TokenType): Self = StObject.set(x, "SEP", value.asInstanceOf[js.Any])
  }
}
