package typingsJapgolly.threeTdsLoader

import typingsJapgolly.three.AnonAlphaMap
import typingsJapgolly.three.AnonAmbientLightColor
import typingsJapgolly.three.AnonAoMap
import typingsJapgolly.three.AnonBumpMap
import typingsJapgolly.three.AnonDiffuse
import typingsJapgolly.three.AnonDisplacementBias
import typingsJapgolly.three.AnonEmissiveMap
import typingsJapgolly.three.AnonEnvMap
import typingsJapgolly.three.AnonFogColor
import typingsJapgolly.three.AnonGradientMap
import typingsJapgolly.three.AnonLightMap
import typingsJapgolly.three.AnonMetalnessMap
import typingsJapgolly.three.AnonNormalMap
import typingsJapgolly.three.AnonRoughnessMap
import typingsJapgolly.three.AnonSpecularMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAomap extends js.Object {
  var aomap: AnonAoMap
  var bumpmap: AnonBumpMap
  var common: AnonAlphaMap
  var displacementmap: AnonDisplacementBias
  var emissivemap: AnonEmissiveMap
  var envmap: AnonEnvMap
  var fog: AnonFogColor
  var gradientmap: AnonGradientMap
  var lightmap: AnonLightMap
  var lights: AnonAmbientLightColor
  var metalnessmap: AnonMetalnessMap
  var normalmap: AnonNormalMap
  var points: AnonDiffuse
  var roughnessmap: AnonRoughnessMap
  var specularmap: AnonSpecularMap
}

object AnonAomap {
  @scala.inline
  def apply(
    aomap: AnonAoMap,
    bumpmap: AnonBumpMap,
    common: AnonAlphaMap,
    displacementmap: AnonDisplacementBias,
    emissivemap: AnonEmissiveMap,
    envmap: AnonEnvMap,
    fog: AnonFogColor,
    gradientmap: AnonGradientMap,
    lightmap: AnonLightMap,
    lights: AnonAmbientLightColor,
    metalnessmap: AnonMetalnessMap,
    normalmap: AnonNormalMap,
    points: AnonDiffuse,
    roughnessmap: AnonRoughnessMap,
    specularmap: AnonSpecularMap
  ): AnonAomap = {
    val __obj = js.Dynamic.literal(aomap = aomap.asInstanceOf[js.Any], bumpmap = bumpmap.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], displacementmap = displacementmap.asInstanceOf[js.Any], emissivemap = emissivemap.asInstanceOf[js.Any], envmap = envmap.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], gradientmap = gradientmap.asInstanceOf[js.Any], lightmap = lightmap.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], metalnessmap = metalnessmap.asInstanceOf[js.Any], normalmap = normalmap.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], roughnessmap = roughnessmap.asInstanceOf[js.Any], specularmap = specularmap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAomap]
  }
}

