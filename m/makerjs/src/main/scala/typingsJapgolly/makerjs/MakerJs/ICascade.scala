package typingsJapgolly.makerjs.MakerJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A container that allows a series of functions to be called upon an object.
  */
trait ICascade extends StObject {
  
  /**
    * The initial context object of the cascade.
    */
  @JSName("$initial")
  var $initial: Any
  
  /**
    * Use the $original as the $result.
    */
  @JSName("$reset")
  def $reset(): this.type
  
  /**
    * The current final value of the cascade.
    */
  @JSName("$result")
  var $result: Any
}
object ICascade {
  
  inline def apply($initial: Any, $reset: CallbackTo[ICascade], $result: Any): ICascade = {
    val __obj = js.Dynamic.literal($initial = $initial.asInstanceOf[js.Any], $reset = $reset.toJsFn, $result = $result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICascade]
  }
  
  extension [Self <: ICascade](x: Self) {
    
    inline def set$initial(value: Any): Self = StObject.set(x, "$initial", value.asInstanceOf[js.Any])
    
    inline def set$reset(value: CallbackTo[ICascade]): Self = StObject.set(x, "$reset", value.toJsFn)
    
    inline def set$result(value: Any): Self = StObject.set(x, "$result", value.asInstanceOf[js.Any])
  }
}
