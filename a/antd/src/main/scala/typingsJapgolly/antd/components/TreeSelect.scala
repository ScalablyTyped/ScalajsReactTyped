package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.sizeContextMod.SizeType
import typingsJapgolly.antd.treeSelectMod.TreeSelectProps
import typingsJapgolly.antd.treeSelectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeSelect {
  def apply[T](
    bordered: js.UndefOr[Boolean] = js.undefined,
    size: SizeType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TreeSelectProps[T], default[T], Unit, TreeSelectProps[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.treeSelectMod.TreeSelectProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.treeSelectMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.treeSelectMod.TreeSelectProps[T]])(children: _*)
  }
  @JSImport("antd/lib/tree-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

