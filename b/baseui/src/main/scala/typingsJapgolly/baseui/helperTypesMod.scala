package typingsJapgolly.baseui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTypesMod {
  
  trait HelperStepsProps extends StObject {
    
    var index: Double
    
    var length: Double
    
    def onFinish(): Any
    
    def onNext(): Any
    
    def onPrev(): Any
  }
  object HelperStepsProps {
    
    inline def apply(
      index: Double,
      length: Double,
      onFinish: CallbackTo[Any],
      onNext: CallbackTo[Any],
      onPrev: CallbackTo[Any]
    ): HelperStepsProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onFinish = onFinish.toJsFn, onNext = onNext.toJsFn, onPrev = onPrev.toJsFn)
      __obj.asInstanceOf[HelperStepsProps]
    }
    
    extension [Self <: HelperStepsProps](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOnFinish(value: CallbackTo[Any]): Self = StObject.set(x, "onFinish", value.toJsFn)
      
      inline def setOnNext(value: CallbackTo[Any]): Self = StObject.set(x, "onNext", value.toJsFn)
      
      inline def setOnPrev(value: CallbackTo[Any]): Self = StObject.set(x, "onPrev", value.toJsFn)
    }
  }
}
