package typingsJapgolly.ol.postProcessingPassMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.ol.helperMod.UniformValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fragmentShader: js.UndefOr[String] = js.undefined
  var scaleRatio: js.UndefOr[Double] = js.undefined
  var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
  var vertexShader: js.UndefOr[String] = js.undefined
  var webGlContext: WebGLRenderingContext
}

object Options {
  @scala.inline
  def apply(
    webGlContext: WebGLRenderingContext,
    fragmentShader: String = null,
    scaleRatio: Int | Double = null,
    uniforms: StringDictionary[UniformValue] = null,
    vertexShader: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(webGlContext = webGlContext.asInstanceOf[js.Any])
    if (fragmentShader != null) __obj.updateDynamic("fragmentShader")(fragmentShader.asInstanceOf[js.Any])
    if (scaleRatio != null) __obj.updateDynamic("scaleRatio")(scaleRatio.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    if (vertexShader != null) __obj.updateDynamic("vertexShader")(vertexShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

