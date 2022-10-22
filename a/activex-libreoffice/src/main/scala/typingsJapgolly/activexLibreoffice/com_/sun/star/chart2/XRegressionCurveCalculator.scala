package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRegressionCurveCalculator
  extends StObject
     with XInterface {
  
  /**
    * Returns the value of the correlation coefficient for the given regression. This value is often denoted as **r** or **R** .
    *
    * The value of **r** is signed. Often **r**<sup>2</sup> is used instead of **r** to denote a regression curve's accuracy.
    * @returns The return value is the fraction of the variance in the data that is explained by the regression.
    */
  val CorrelationCoefficient: Double
  
  /**
    * Retrieve a string showing the regression curve's function with calculated parameters.
    * @returns The string returned contains the regression curve's formula in a form `"f(x) = ..."` , where the calculated parts are filled out. For a linear re
    */
  val Representation: String
  
  /**
    * Returns the value of the correlation coefficient for the given regression. This value is often denoted as **r** or **R** .
    *
    * The value of **r** is signed. Often **r**<sup>2</sup> is used instead of **r** to denote a regression curve's accuracy.
    * @returns The return value is the fraction of the variance in the data that is explained by the regression.
    */
  def getCorrelationCoefficient(): Double
  
  /**
    * calculates the value of the regression curve for **x** .
    * @param x The abscissa value for which the value of the regression curve should be calculated. All numbers that are part of the domain of the regression
    * @returns If **x** is element of the domain of the regression curve function, the result is its value.
    * @throws com::sun::star::lang::IllegalArgumentException If **x** is not part of the domain of the regression function.
    */
  def getCurveValue(x: Double): Double
  
  /**
    * calculate multiple points of a regression curve at once. Note that this method may optimize the output by returning less points, e.g. for a line you
    * may get only two resulting points instead of nPointCount() points. This is only allowed if the parameter bMaySkipPointsInCalculation() is set to
    * `TRUE` .
    *
    * It is important that a renderer takes the scalings into account. When one of these parameters is unknown, no optimization must be done.
    * @param min the abscissa value for the starting point.
    * @param max the abscissa value for the ending point.
    * @param nPointCount the number of points to calculate.
    * @param bMaySkipPointsInCalculation determines whether it is allowed to skip points in the calculation. When this parameter is `TRUE` it is assumed that
    * @param xScalingX a scaling that is used for the values in x-direction
    * @param xScalingY a scaling that is used for the values in y-direction
    */
  def getCurveValues(
    min: Double,
    max: Double,
    nPointCount: Double,
    xScalingX: XScaling,
    xScalingY: XScaling,
    bMaySkipPointsInCalculation: Boolean
  ): SafeArray[RealPoint2D]
  
  /**
    * Returns a representation using the given number format for formatting all numbers contained in the formula. Wrap equation to fit in nFormulaLength
    * characters
    * @see getRepresentation
    */
  def getFormattedRepresentation(xNumFmtSupplier: XNumberFormatsSupplier, nNumberFormatKey: Double, nFormulaLength: Double): String
  
  /**
    * Retrieve a string showing the regression curve's function with calculated parameters.
    * @returns The string returned contains the regression curve's formula in a form `"f(x) = ..."` , where the calculated parts are filled out. For a linear re
    */
  def getRepresentation(): String
  
  /**
    * recalculates the parameters of the internal regression curve according to the **x** - and **y** -values given.
    * @param aXValues All x-values that represent the measurement points on which the regression is based
    * @param aYValues All y-values that represent the measurement points on which the regression is based
    */
  def recalculateRegression(aXValues: SeqEquiv[Double], aYValues: SeqEquiv[Double]): Unit
  
  /**
    * set calculation properties for curve calculation.
    * @param degree Degree of polynomial regression curve, value should be greater than zero If the curve is not polynomial, this property has no effect.
    * @param period Period of a moving average regression curve, value should greater or equal to 2 If the curve is not moving average regression curve, this
    * @param forceIntercept Should force the intercept value.
    * @param interceptValue Intercept value.
    */
  def setRegressionProperties(degree: Double, forceIntercept: Boolean, interceptValue: Double, period: Double): Unit
  
  /**
    * Set the names of X and Y variables of the equation to replace "x" and "f(x)" in representation
    * @param aXName string of the name of X variable
    * @param aYName string of the name of Y variable
    */
  def setXYNames(aXName: String, aYName: String): Unit
}
object XRegressionCurveCalculator {
  
  inline def apply(
    CorrelationCoefficient: Double,
    Representation: String,
    acquire: Callback,
    getCorrelationCoefficient: CallbackTo[Double],
    getCurveValue: Double => Double,
    getCurveValues: (Double, Double, Double, XScaling, XScaling, Boolean) => SafeArray[RealPoint2D],
    getFormattedRepresentation: (XNumberFormatsSupplier, Double, Double) => String,
    getRepresentation: CallbackTo[String],
    queryInterface: `type` => Any,
    recalculateRegression: (SeqEquiv[Double], SeqEquiv[Double]) => Callback,
    release: Callback,
    setRegressionProperties: (Double, Boolean, Double, Double) => Callback,
    setXYNames: (String, String) => Callback
  ): XRegressionCurveCalculator = {
    val __obj = js.Dynamic.literal(CorrelationCoefficient = CorrelationCoefficient.asInstanceOf[js.Any], Representation = Representation.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCorrelationCoefficient = getCorrelationCoefficient.toJsFn, getCurveValue = js.Any.fromFunction1(getCurveValue), getCurveValues = js.Any.fromFunction6(getCurveValues), getFormattedRepresentation = js.Any.fromFunction3(getFormattedRepresentation), getRepresentation = getRepresentation.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), recalculateRegression = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: SeqEquiv[Double]) => (recalculateRegression(t0, t1)).runNow()), release = release.toJsFn, setRegressionProperties = js.Any.fromFunction4((t0: Double, t1: Boolean, t2: Double, t3: Double) => (setRegressionProperties(t0, t1, t2, t3)).runNow()), setXYNames = js.Any.fromFunction2((t0: String, t1: String) => (setXYNames(t0, t1)).runNow()))
    __obj.asInstanceOf[XRegressionCurveCalculator]
  }
  
  extension [Self <: XRegressionCurveCalculator](x: Self) {
    
    inline def setCorrelationCoefficient(value: Double): Self = StObject.set(x, "CorrelationCoefficient", value.asInstanceOf[js.Any])
    
    inline def setGetCorrelationCoefficient(value: CallbackTo[Double]): Self = StObject.set(x, "getCorrelationCoefficient", value.toJsFn)
    
    inline def setGetCurveValue(value: Double => Double): Self = StObject.set(x, "getCurveValue", js.Any.fromFunction1(value))
    
    inline def setGetCurveValues(value: (Double, Double, Double, XScaling, XScaling, Boolean) => SafeArray[RealPoint2D]): Self = StObject.set(x, "getCurveValues", js.Any.fromFunction6(value))
    
    inline def setGetFormattedRepresentation(value: (XNumberFormatsSupplier, Double, Double) => String): Self = StObject.set(x, "getFormattedRepresentation", js.Any.fromFunction3(value))
    
    inline def setGetRepresentation(value: CallbackTo[String]): Self = StObject.set(x, "getRepresentation", value.toJsFn)
    
    inline def setRecalculateRegression(value: (SeqEquiv[Double], SeqEquiv[Double]) => Callback): Self = StObject.set(x, "recalculateRegression", js.Any.fromFunction2((t0: SeqEquiv[Double], t1: SeqEquiv[Double]) => (value(t0, t1)).runNow()))
    
    inline def setRepresentation(value: String): Self = StObject.set(x, "Representation", value.asInstanceOf[js.Any])
    
    inline def setSetRegressionProperties(value: (Double, Boolean, Double, Double) => Callback): Self = StObject.set(x, "setRegressionProperties", js.Any.fromFunction4((t0: Double, t1: Boolean, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSetXYNames(value: (String, String) => Callback): Self = StObject.set(x, "setXYNames", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
