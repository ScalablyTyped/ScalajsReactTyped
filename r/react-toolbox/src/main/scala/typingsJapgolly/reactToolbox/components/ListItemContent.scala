package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToolbox.listListItemContentMod.ListItemContentProps
import typingsJapgolly.reactToolbox.listListItemContentMod.ListItemContentTheme
import typingsJapgolly.reactToolbox.reactToolboxStrings.auto
import typingsJapgolly.reactToolbox.reactToolboxStrings.large
import typingsJapgolly.reactToolbox.reactToolboxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemContent {
  def apply(
    caption: VdomNode = null,
    legend: String = null,
    theme: ListItemContentTheme = null,
    `type`: auto | normal | large = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ListItemContentProps, 
    typingsJapgolly.reactToolbox.libListMod.ListItemContent, 
    Unit, 
    ListItemContentProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (caption != null) __obj.updateDynamic("caption")(caption.rawNode.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToolbox.listListItemContentMod.ListItemContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToolbox.libListMod.ListItemContent](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToolbox.listListItemContentMod.ListItemContentProps])(children: _*)
  }
  @JSImport("react-toolbox/lib/list", "ListItemContent")
  @js.native
  object componentImport extends js.Object
  
}

