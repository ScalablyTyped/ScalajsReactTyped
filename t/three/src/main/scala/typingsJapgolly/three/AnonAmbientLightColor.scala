package typingsJapgolly.three

import typingsJapgolly.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmbientLightColor extends js.Object {
  var ambientLightColor: IUniform
  var directionalLights: AnonProperties
  var directionalShadowMap: IUniform
  var directionalShadowMatrix: IUniform
  var hemisphereLights: AnonPropertiesAnonDirection
  var pointLights: AnonPropertiesValue
  var pointShadowMap: IUniform
  var pointShadowMatrix: IUniform
  var rectAreaLights: AnonPropertiesAnonHeight
  var spotLights: AnonValue
  var spotShadowMap: IUniform
  var spotShadowMatrix: IUniform
}

object AnonAmbientLightColor {
  @scala.inline
  def apply(
    ambientLightColor: IUniform,
    directionalLights: AnonProperties,
    directionalShadowMap: IUniform,
    directionalShadowMatrix: IUniform,
    hemisphereLights: AnonPropertiesAnonDirection,
    pointLights: AnonPropertiesValue,
    pointShadowMap: IUniform,
    pointShadowMatrix: IUniform,
    rectAreaLights: AnonPropertiesAnonHeight,
    spotLights: AnonValue,
    spotShadowMap: IUniform,
    spotShadowMatrix: IUniform
  ): AnonAmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor.asInstanceOf[js.Any], directionalLights = directionalLights.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hemisphereLights = hemisphereLights.asInstanceOf[js.Any], pointLights = pointLights.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], rectAreaLights = rectAreaLights.asInstanceOf[js.Any], spotLights = spotLights.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any], spotShadowMatrix = spotShadowMatrix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmbientLightColor]
  }
}

