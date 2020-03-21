package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToolbox.listListItemActionMod.ListItemActionProps
import typingsJapgolly.reactToolbox.listListItemActionMod.ListItemActionTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemAction {
  def apply(
    action: VdomNode = null,
    theme: ListItemActionTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ListItemActionProps, 
    typingsJapgolly.reactToolbox.libListMod.ListItemAction, 
    Unit, 
    ListItemActionProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (action != null) __obj.updateDynamic("action")(action.rawNode.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToolbox.listListItemActionMod.ListItemActionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToolbox.libListMod.ListItemAction](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToolbox.listListItemActionMod.ListItemActionProps])(children: _*)
  }
  @JSImport("react-toolbox/lib/list", "ListItemAction")
  @js.native
  object componentImport extends js.Object
  
}

