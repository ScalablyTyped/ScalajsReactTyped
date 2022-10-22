package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the $doCheck lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
trait IDoCheck extends StObject {
  
  /**
    * Called on each turn of the digest cycle. Provides an opportunity to detect and act on changes.
    * Any actions that you wish to take in response to the changes that you detect must be invoked from this hook;
    * implementing this has no effect on when `$onChanges` is called. For example, this hook could be useful if you wish
    * to perform a deep equality check, or to check a `Dat`e object, changes to which would not be detected by Angular's
    * change detector and thus not trigger `$onChanges`. This hook is invoked with no arguments; if detecting changes,
    * you must store the previous value(s) for comparison to the current values.
    */
  @JSName("$doCheck")
  def $doCheck(): Unit
}
object IDoCheck {
  
  inline def apply($doCheck: Callback): IDoCheck = {
    val __obj = js.Dynamic.literal($doCheck = $doCheck.toJsFn)
    __obj.asInstanceOf[IDoCheck]
  }
  
  extension [Self <: IDoCheck](x: Self) {
    
    inline def set$doCheck(value: Callback): Self = StObject.set(x, "$doCheck", value.toJsFn)
  }
}
