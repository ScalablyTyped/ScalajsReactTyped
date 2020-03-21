package typingsJapgolly.reactTagcloud.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTagcloud.ReactTagCloud_.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagCloud {
  def apply(
    maxSize: Double,
    minSize: Double,
    tags: js.Array[_],
    className: String = null,
    colorOptions: js.Object = null,
    disableRandomColor: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    renderer: js.Function = null,
    shuffle: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TagCloudProps, typingsJapgolly.reactTagcloud.mod.TagCloud, Unit, TagCloudProps] = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colorOptions != null) __obj.updateDynamic("colorOptions")(colorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRandomColor)) __obj.updateDynamic("disableRandomColor")(disableRandomColor.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTagcloud.ReactTagCloud_.TagCloudProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTagcloud.mod.TagCloud](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTagcloud.ReactTagCloud_.TagCloudProps])(children: _*)
  }
  @JSImport("react-tagcloud", "TagCloud")
  @js.native
  object componentImport extends js.Object
  
}

