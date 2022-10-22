package typingsJapgolly.ttest

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ttest.anon.OmitOptionsvarEqual
import typingsJapgolly.ttest.ttestStrings.`not equal`
import typingsJapgolly.ttest.ttestStrings.greater
import typingsJapgolly.ttest.ttestStrings.less
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(left: js.Array[Double]): TTest = ^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any]).asInstanceOf[TTest]
  inline def apply(left: js.Array[Double], options: OmitOptionsvarEqual): TTest = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TTest]
  inline def apply(left: js.Array[Double], right: js.Array[Double]): TTest = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TTest]
  inline def apply(left: js.Array[Double], right: js.Array[Double], options: Options): TTest = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TTest]
  
  @JSImport("ttest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var alternative: js.UndefOr[less | greater | (`not equal`)] = js.undefined
    
    var mu: js.UndefOr[Double] = js.undefined
    
    var varEqual: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setAlternative(value: less | greater | (`not equal`)): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
      
      inline def setMu(value: Double): Self = StObject.set(x, "mu", value.asInstanceOf[js.Any])
      
      inline def setMuUndefined: Self = StObject.set(x, "mu", js.undefined)
      
      inline def setVarEqual(value: Boolean): Self = StObject.set(x, "varEqual", value.asInstanceOf[js.Any])
      
      inline def setVarEqualUndefined: Self = StObject.set(x, "varEqual", js.undefined)
    }
  }
  
  trait TTest extends StObject {
    
    def confidence(): js.Array[Double]
    
    def freedom(): Double
    
    def pValue(): Double
    
    def testValue(): Double
    
    def valid(): Boolean
  }
  object TTest {
    
    inline def apply(
      confidence: CallbackTo[js.Array[Double]],
      freedom: CallbackTo[Double],
      pValue: CallbackTo[Double],
      testValue: CallbackTo[Double],
      valid: CallbackTo[Boolean]
    ): TTest = {
      val __obj = js.Dynamic.literal(confidence = confidence.toJsFn, freedom = freedom.toJsFn, pValue = pValue.toJsFn, testValue = testValue.toJsFn, valid = valid.toJsFn)
      __obj.asInstanceOf[TTest]
    }
    
    extension [Self <: TTest](x: Self) {
      
      inline def setConfidence(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "confidence", value.toJsFn)
      
      inline def setFreedom(value: CallbackTo[Double]): Self = StObject.set(x, "freedom", value.toJsFn)
      
      inline def setPValue(value: CallbackTo[Double]): Self = StObject.set(x, "pValue", value.toJsFn)
      
      inline def setTestValue(value: CallbackTo[Double]): Self = StObject.set(x, "testValue", value.toJsFn)
      
      inline def setValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "valid", value.toJsFn)
    }
  }
}
