package typingsJapgolly.semanticUiProgress.anon

import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.RandomSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, 'max'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl>> */
trait PickImplmaxPartialPickImp
  extends StObject
     with Param {
  
  var max: Double & js.UndefOr[Double]
  
  var min: js.UndefOr[Double] = js.undefined
}
object PickImplmaxPartialPickImp {
  
  inline def apply(max: Double & js.UndefOr[Double]): PickImplmaxPartialPickImp = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxPartialPickImp]
  }
  
  extension [Self <: PickImplmaxPartialPickImp](x: Self) {
    
    inline def setMax(value: Double & js.UndefOr[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
