package typingsJapgolly.rxAngular

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.rxCore.Rx.IScheduler
import typingsJapgolly.rxLite.Rx.SchedulerStatic
import typingsJapgolly.rxLiteAggregates.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx_ {
  
  trait IObservable[T] extends StObject {
    
    def safeApply($scope: IScope, callback: js.Function1[/* data */ T, Unit]): Observable[T]
  }
  object IObservable {
    
    inline def apply[T](safeApply: (IScope, js.Function1[/* data */ T, Unit]) => Observable[T]): IObservable[T] = {
      val __obj = js.Dynamic.literal(safeApply = js.Any.fromFunction2(safeApply))
      __obj.asInstanceOf[IObservable[T]]
    }
    
    extension [Self <: IObservable[?], T](x: Self & IObservable[T]) {
      
      inline def setSafeApply(value: (IScope, js.Function1[/* data */ T, Unit]) => Observable[T]): Self = StObject.set(x, "safeApply", js.Any.fromFunction2(value))
    }
  }
  
  type ScopeScheduler = IScheduler
  
  @js.native
  trait ScopeSchedulerStatic
    extends StObject
       with SchedulerStatic
       with Instantiable1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ /* $scope */ Any, 
          ScopeScheduler
        ]
}
