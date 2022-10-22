package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows the transformation of numeric values from one coordinate-system into an other. Values may be transformed using any mapping. */
trait XTransformation
  extends StObject
     with XInterface {
  
  /** the dimension of the input coordinate sequence that is to be transformed by the {@link transform()} method. */
  val SourceDimension: Double
  
  /** the dimension of the output coordinate sequence that is the result of the {@link transform()} method. */
  val TargetDimension: Double
  
  /** the dimension of the input coordinate sequence that is to be transformed by the {@link transform()} method. */
  def getSourceDimension(): Double
  
  /** the dimension of the output coordinate sequence that is the result of the {@link transform()} method. */
  def getTargetDimension(): Double
  
  /**
    * transforms the given input data tuple, given in the source coordinate system, according to the internal transformation rules, into a tuple of
    * transformed coordinates in the destination coordinate system.
    *
    * Note that both coordinate systems may have different dimensions, e.g., if a transformation does simply a projection into a lower-dimensional space.
    * @param aValues a source tuple of data that is to be transformed. The length of this sequence must be equivalent to the dimension of the source coordinat
    * @returns the transformed data tuple. The length of this sequence is equal to the dimension of the output coordinate system.
    * @throws com::sun::star::lang::IllegalArgumentException if the dimension of the input vector is not equal to the dimension given in {@link getSourceDimens
    */
  def transform(aValues: SeqEquiv[Double]): SafeArray[Double]
}
object XTransformation {
  
  inline def apply(
    SourceDimension: Double,
    TargetDimension: Double,
    acquire: Callback,
    getSourceDimension: CallbackTo[Double],
    getTargetDimension: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    transform: SeqEquiv[Double] => SafeArray[Double]
  ): XTransformation = {
    val __obj = js.Dynamic.literal(SourceDimension = SourceDimension.asInstanceOf[js.Any], TargetDimension = TargetDimension.asInstanceOf[js.Any], acquire = acquire.toJsFn, getSourceDimension = getSourceDimension.toJsFn, getTargetDimension = getTargetDimension.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[XTransformation]
  }
  
  extension [Self <: XTransformation](x: Self) {
    
    inline def setGetSourceDimension(value: CallbackTo[Double]): Self = StObject.set(x, "getSourceDimension", value.toJsFn)
    
    inline def setGetTargetDimension(value: CallbackTo[Double]): Self = StObject.set(x, "getTargetDimension", value.toJsFn)
    
    inline def setSourceDimension(value: Double): Self = StObject.set(x, "SourceDimension", value.asInstanceOf[js.Any])
    
    inline def setTargetDimension(value: Double): Self = StObject.set(x, "TargetDimension", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: SeqEquiv[Double] => SafeArray[Double]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
  }
}
