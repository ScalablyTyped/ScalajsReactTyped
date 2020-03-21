package typingsJapgolly.glReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.glReact.AnonColor
import typingsJapgolly.glReact.AnonDst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProps extends js.Object {
  var backbuffering: js.UndefOr[Boolean] = js.undefined
  var blendFunc: js.UndefOr[AnonDst] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var clear: js.UndefOr[AnonColor] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var ignoreUnusedUniforms: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var onDraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shader: ShaderIdentifier | ShaderDefinition
  var sync: js.UndefOr[Boolean] = js.undefined
  var uniforms: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var uniformsOptions: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object NodeProps {
  @scala.inline
  def apply(
    shader: ShaderIdentifier | ShaderDefinition,
    backbuffering: js.UndefOr[Boolean] = js.undefined,
    blendFunc: AnonDst = null,
    children: js.Any = null,
    clear: AnonColor = null,
    height: Int | Double = null,
    ignoreUnusedUniforms: js.Array[String] | Boolean = null,
    onDraw: js.UndefOr[Callback] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined,
    uniforms: StringDictionary[js.Any] = null,
    uniformsOptions: js.Any = null,
    width: Int | Double = null
  ): NodeProps = {
    val __obj = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    if (!js.isUndefined(backbuffering)) __obj.updateDynamic("backbuffering")(backbuffering.asInstanceOf[js.Any])
    if (blendFunc != null) __obj.updateDynamic("blendFunc")(blendFunc.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (ignoreUnusedUniforms != null) __obj.updateDynamic("ignoreUnusedUniforms")(ignoreUnusedUniforms.asInstanceOf[js.Any])
    onDraw.foreach(p => __obj.updateDynamic("onDraw")(p.toJsFn))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    if (uniformsOptions != null) __obj.updateDynamic("uniformsOptions")(uniformsOptions.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProps]
  }
}

