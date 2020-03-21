package typingsJapgolly.reactMdl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactMdl.mod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    threeLine: js.UndefOr[Boolean] = js.undefined,
    twoLine: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ListItemProps, typingsJapgolly.reactMdl.mod.ListItem, Unit, ListItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(threeLine)) __obj.updateDynamic("threeLine")(threeLine.asInstanceOf[js.Any])
    if (!js.isUndefined(twoLine)) __obj.updateDynamic("twoLine")(twoLine.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMdl.mod.ListItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMdl.mod.ListItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMdl.mod.ListItemProps])(children: _*)
  }
  @JSImport("react-mdl", "ListItem")
  @js.native
  object componentImport extends js.Object
  
}

