package typingsJapgolly.glReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.glReact.AnonColor
import typingsJapgolly.glReact.AnonDst
import typingsJapgolly.glReact.mod.NodeProps
import typingsJapgolly.glReact.mod.ShaderDefinition
import typingsJapgolly.glReact.mod.ShaderIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Node {
  def apply(
    shader: ShaderIdentifier | ShaderDefinition,
    backbuffering: js.UndefOr[Boolean] = js.undefined,
    blendFunc: AnonDst = null,
    clear: AnonColor = null,
    height: Int | Double = null,
    ignoreUnusedUniforms: js.Array[String] | Boolean = null,
    onDraw: js.UndefOr[Callback] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined,
    uniforms: StringDictionary[js.Any] = null,
    uniformsOptions: js.Any = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[NodeProps, typingsJapgolly.glReact.mod.Node, Unit, NodeProps] = {
    val __obj = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(backbuffering)) __obj.updateDynamic("backbuffering")(backbuffering.asInstanceOf[js.Any])
    if (blendFunc != null) __obj.updateDynamic("blendFunc")(blendFunc.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (ignoreUnusedUniforms != null) __obj.updateDynamic("ignoreUnusedUniforms")(ignoreUnusedUniforms.asInstanceOf[js.Any])
    onDraw.foreach(p => __obj.updateDynamic("onDraw")(p.toJsFn))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    if (uniformsOptions != null) __obj.updateDynamic("uniformsOptions")(uniformsOptions.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.glReact.mod.NodeProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.glReact.mod.Node](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.glReact.mod.NodeProps])
  }
  @JSImport("gl-react", "Node")
  @js.native
  object componentImport extends js.Object
  
}

