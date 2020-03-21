package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToolbox.listListItemActionMod.ListItemActionTheme
import typingsJapgolly.reactToolbox.listListItemActionsMod.ListItemActionsProps
import typingsJapgolly.reactToolbox.listListItemActionsMod.ListItemActionsTheme
import typingsJapgolly.reactToolbox.reactToolboxStrings.left
import typingsJapgolly.reactToolbox.reactToolboxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemActions {
  def apply(
    theme: ListItemActionsTheme with ListItemActionTheme = null,
    `type`: left | right = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ListItemActionsProps, 
    typingsJapgolly.reactToolbox.libListMod.ListItemActions, 
    Unit, 
    ListItemActionsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToolbox.listListItemActionsMod.ListItemActionsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToolbox.libListMod.ListItemActions](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToolbox.listListItemActionsMod.ListItemActionsProps])(children: _*)
  }
  @JSImport("react-toolbox/lib/list", "ListItemActions")
  @js.native
  object componentImport extends js.Object
  
}

