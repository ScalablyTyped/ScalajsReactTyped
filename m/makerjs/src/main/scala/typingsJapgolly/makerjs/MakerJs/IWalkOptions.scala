package typingsJapgolly.makerjs.MakerJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.walk().
  */
trait IWalkOptions extends StObject {
  
  /**
    * Callback for every child model in every model, after all of its children have been walked.
    */
  var afterChildWalk: js.UndefOr[IWalkModelCallback] = js.undefined
  
  /**
    * Callback for every child model in every model. Return false to stop walking down further models.
    */
  var beforeChildWalk: js.UndefOr[IWalkModelCancellableCallback] = js.undefined
  
  /**
    * Callback for every path in every model.
    */
  var onPath: js.UndefOr[IWalkPathCallback] = js.undefined
}
object IWalkOptions {
  
  inline def apply(): IWalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWalkOptions]
  }
  
  extension [Self <: IWalkOptions](x: Self) {
    
    inline def setAfterChildWalk(value: /* context */ IWalkModel => Callback): Self = StObject.set(x, "afterChildWalk", js.Any.fromFunction1((t0: /* context */ IWalkModel) => value(t0).runNow()))
    
    inline def setAfterChildWalkUndefined: Self = StObject.set(x, "afterChildWalk", js.undefined)
    
    inline def setBeforeChildWalk(value: /* context */ IWalkModel => Boolean): Self = StObject.set(x, "beforeChildWalk", js.Any.fromFunction1(value))
    
    inline def setBeforeChildWalkUndefined: Self = StObject.set(x, "beforeChildWalk", js.undefined)
    
    inline def setOnPath(value: /* context */ IWalkPath => Callback): Self = StObject.set(x, "onPath", js.Any.fromFunction1((t0: /* context */ IWalkPath) => value(t0).runNow()))
    
    inline def setOnPathUndefined: Self = StObject.set(x, "onPath", js.undefined)
  }
}
