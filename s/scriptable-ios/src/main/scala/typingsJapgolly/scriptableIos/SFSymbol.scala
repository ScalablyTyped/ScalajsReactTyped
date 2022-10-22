package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Representation of an SF symbol._
  * @see https://docs.scriptable.app/sfsymbol
  */
trait SFSymbol extends StObject {
  
  /**
    * _Configures the symbol to use a black weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyblackweight
    */
  def applyBlackWeight(): Unit
  
  /**
    * _Configures the symbol to use a bold weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyboldweight
    */
  def applyBoldWeight(): Unit
  
  /**
    * _Configures the symbol with the specified font information._
    * @see https://docs.scriptable.app/sfsymbol/#-applyfont
    */
  def applyFont(font: Font): Unit
  
  /**
    * _Configures the symbol to use a heavy weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyheavyweight
    */
  def applyHeavyWeight(): Unit
  
  /**
    * _Configures the symbol to use a light weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applylightweight
    */
  def applyLightWeight(): Unit
  
  /**
    * _Configures the symbol to use a medium weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applymediumweight
    */
  def applyMediumWeight(): Unit
  
  /**
    * _Configures the symbol to use a regular weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyregularweight
    */
  def applyRegularWeight(): Unit
  
  /**
    * _Configures the symbol to use a semibold weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applysemiboldweight
    */
  def applySemiboldWeight(): Unit
  
  /**
    * _Configures the symbol to use a thin weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applythinweight
    */
  def applyThinWeight(): Unit
  
  /**
    * _Configures the symbol to use an ultra light weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyultralightweight
    */
  def applyUltraLightWeight(): Unit
  
  /**
    * _Convert the symbol to an image._
    * @see https://docs.scriptable.app/sfsymbol/#image
    */
  var image: Image
}
object SFSymbol {
  
  inline def apply(
    applyBlackWeight: Callback,
    applyBoldWeight: Callback,
    applyFont: Font => Callback,
    applyHeavyWeight: Callback,
    applyLightWeight: Callback,
    applyMediumWeight: Callback,
    applyRegularWeight: Callback,
    applySemiboldWeight: Callback,
    applyThinWeight: Callback,
    applyUltraLightWeight: Callback,
    image: Image
  ): SFSymbol = {
    val __obj = js.Dynamic.literal(applyBlackWeight = applyBlackWeight.toJsFn, applyBoldWeight = applyBoldWeight.toJsFn, applyFont = js.Any.fromFunction1((t0: Font) => applyFont(t0).runNow()), applyHeavyWeight = applyHeavyWeight.toJsFn, applyLightWeight = applyLightWeight.toJsFn, applyMediumWeight = applyMediumWeight.toJsFn, applyRegularWeight = applyRegularWeight.toJsFn, applySemiboldWeight = applySemiboldWeight.toJsFn, applyThinWeight = applyThinWeight.toJsFn, applyUltraLightWeight = applyUltraLightWeight.toJsFn, image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSymbol]
  }
  
  extension [Self <: SFSymbol](x: Self) {
    
    inline def setApplyBlackWeight(value: Callback): Self = StObject.set(x, "applyBlackWeight", value.toJsFn)
    
    inline def setApplyBoldWeight(value: Callback): Self = StObject.set(x, "applyBoldWeight", value.toJsFn)
    
    inline def setApplyFont(value: Font => Callback): Self = StObject.set(x, "applyFont", js.Any.fromFunction1((t0: Font) => value(t0).runNow()))
    
    inline def setApplyHeavyWeight(value: Callback): Self = StObject.set(x, "applyHeavyWeight", value.toJsFn)
    
    inline def setApplyLightWeight(value: Callback): Self = StObject.set(x, "applyLightWeight", value.toJsFn)
    
    inline def setApplyMediumWeight(value: Callback): Self = StObject.set(x, "applyMediumWeight", value.toJsFn)
    
    inline def setApplyRegularWeight(value: Callback): Self = StObject.set(x, "applyRegularWeight", value.toJsFn)
    
    inline def setApplySemiboldWeight(value: Callback): Self = StObject.set(x, "applySemiboldWeight", value.toJsFn)
    
    inline def setApplyThinWeight(value: Callback): Self = StObject.set(x, "applyThinWeight", value.toJsFn)
    
    inline def setApplyUltraLightWeight(value: Callback): Self = StObject.set(x, "applyUltraLightWeight", value.toJsFn)
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
