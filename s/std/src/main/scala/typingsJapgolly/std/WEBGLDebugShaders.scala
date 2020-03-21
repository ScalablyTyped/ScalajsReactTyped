package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGLDebugShaders extends js.Object {
  def getTranslatedShaderSource(shader: org.scalajs.dom.raw.WebGLShader): java.lang.String
}

object WEBGLDebugShaders {
  @scala.inline
  def apply(getTranslatedShaderSource: org.scalajs.dom.raw.WebGLShader => CallbackTo[java.lang.String]): WEBGLDebugShaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTranslatedShaderSource")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.WebGLShader) => getTranslatedShaderSource(t0).runNow()))
    __obj.asInstanceOf[WEBGLDebugShaders]
  }
}

