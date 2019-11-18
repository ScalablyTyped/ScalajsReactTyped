package typingsJapgolly.three

import typingsJapgolly.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnvMap extends js.Object {
  var envMap: IUniform
  var flipEnvMap: IUniform
  var maxMipLevel: IUniform
  var reflectivity: IUniform
  var refractionRatio: IUniform
}

object Anon_EnvMap {
  @scala.inline
  def apply(
    envMap: IUniform,
    flipEnvMap: IUniform,
    maxMipLevel: IUniform,
    reflectivity: IUniform,
    refractionRatio: IUniform
  ): Anon_EnvMap = {
    val __obj = js.Dynamic.literal(envMap = envMap.asInstanceOf[js.Any], flipEnvMap = flipEnvMap.asInstanceOf[js.Any], maxMipLevel = maxMipLevel.asInstanceOf[js.Any], reflectivity = reflectivity.asInstanceOf[js.Any], refractionRatio = refractionRatio.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EnvMap]
  }
}

