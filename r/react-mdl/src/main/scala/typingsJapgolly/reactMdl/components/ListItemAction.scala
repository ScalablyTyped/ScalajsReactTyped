package typingsJapgolly.reactMdl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactMdl.mod.ListItemActionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemAction {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    info: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ListItemActionProps, 
    typingsJapgolly.reactMdl.mod.ListItemAction, 
    Unit, 
    ListItemActionProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMdl.mod.ListItemActionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMdl.mod.ListItemAction](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMdl.mod.ListItemActionProps])(children: _*)
  }
  @JSImport("react-mdl", "ListItemAction")
  @js.native
  object componentImport extends js.Object
  
}

