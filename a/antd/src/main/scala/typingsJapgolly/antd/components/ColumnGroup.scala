package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libTableColumnGroupMod.ColumnGroupProps
import typingsJapgolly.antd.libTableColumnGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnGroup {
  def apply(
    className: String = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ColumnGroupProps, default, Unit, ColumnGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libTableColumnGroupMod.ColumnGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libTableColumnGroupMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTableColumnGroupMod.ColumnGroupProps])(children: _*)
  }
  @JSImport("antd/lib/table/ColumnGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

