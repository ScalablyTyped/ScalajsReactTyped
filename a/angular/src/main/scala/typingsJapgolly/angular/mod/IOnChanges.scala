package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the $onChanges lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
trait IOnChanges extends StObject {
  
  /**
    * Called whenever one-way bindings are updated. The onChangesObj is a hash whose keys are the names of the bound
    * properties that have changed, and the values are an {@link IChangesObject} object  of the form
    * { currentValue, previousValue, isFirstChange() }. Use this hook to trigger updates within a component such as
    * cloning the bound value to prevent accidental mutation of the outer value.
    */
  @JSName("$onChanges")
  def $onChanges(onChangesObj: IOnChangesObject): Unit
}
object IOnChanges {
  
  inline def apply($onChanges: IOnChangesObject => Callback): IOnChanges = {
    val __obj = js.Dynamic.literal($onChanges = js.Any.fromFunction1((t0: IOnChangesObject) => $onChanges(t0).runNow()))
    __obj.asInstanceOf[IOnChanges]
  }
  
  extension [Self <: IOnChanges](x: Self) {
    
    inline def set$onChanges(value: IOnChangesObject => Callback): Self = StObject.set(x, "$onChanges", js.Any.fromFunction1((t0: IOnChangesObject) => value(t0).runNow()))
  }
}
