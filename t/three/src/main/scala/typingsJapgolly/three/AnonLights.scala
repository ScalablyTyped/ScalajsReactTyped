package typingsJapgolly.three

import typingsJapgolly.three.lightMod.Light
import typingsJapgolly.three.webGLLightsMod.WebGLLights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLights extends js.Object {
  var lights: WebGLLights
  var lightsArray: js.Array[Light]
  var shadowsArray: js.Array[Light]
}

object AnonLights {
  @scala.inline
  def apply(lights: WebGLLights, lightsArray: js.Array[Light], shadowsArray: js.Array[Light]): AnonLights = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any], lightsArray = lightsArray.asInstanceOf[js.Any], shadowsArray = shadowsArray.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLights]
  }
}

