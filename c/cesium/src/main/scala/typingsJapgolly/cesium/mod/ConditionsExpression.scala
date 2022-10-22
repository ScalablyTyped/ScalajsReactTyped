package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ConditionsExpression")
@js.native
open class ConditionsExpression () extends StObject {
  def this(conditionsExpression: Any) = this()
  def this(conditionsExpression: Any, defines: Any) = this()
  def this(conditionsExpression: Unit, defines: Any) = this()
  
  /**
    * Gets the conditions expression defined in the 3D Tiles Styling language.
    */
  val conditionsExpression: Any = js.native
  
  /**
    * Evaluates the result of an expression, optionally using the provided feature's properties. If the result of
    * the expression in the
    * {@link https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling|3D Tiles Styling language}
    * is of type <code>Boolean</code>, <code>Number</code>, or <code>String</code>, the corresponding JavaScript
    * primitive type will be returned. If the result is a <code>RegExp</code>, a Javascript <code>RegExp</code>
    * object will be returned. If the result is a <code>Cartesian2</code>, <code>Cartesian3</code>, or <code>Cartesian4</code>,
    * a {@link Cartesian2}, {@link Cartesian3}, or {@link Cartesian4} object will be returned. If the <code>result</code> argument is
    * a {@link Color}, the {@link Cartesian4} value is converted to a {@link Color} and then returned.
    * @param feature - The feature whose properties may be used as variables in the expression.
    * @param [result] - The object onto which to store the result.
    * @returns The result of evaluating the expression.
    */
  def evaluate(feature: Cesium3DTileFeature): Boolean | Double | String | js.RegExp | Cartesian2 | Cartesian3 | Cartesian4 | Color = js.native
  def evaluate(feature: Cesium3DTileFeature, result: Any): Boolean | Double | String | js.RegExp | Cartesian2 | Cartesian3 | Cartesian4 | Color = js.native
  
  /**
    * Evaluates the result of a Color expression, using the values defined by a feature.
    * <p>
    * This is equivalent to {@link ConditionsExpression#evaluate} but always returns a {@link Color} object.
    * </p>
    * @param feature - The feature whose properties may be used as variables in the expression.
    * @param [result] - The object in which to store the result
    * @returns The modified result parameter or a new Color instance if one was not provided.
    */
  def evaluateColor(feature: Cesium3DTileFeature): Color = js.native
  def evaluateColor(feature: Cesium3DTileFeature, result: Color): Color = js.native
}
