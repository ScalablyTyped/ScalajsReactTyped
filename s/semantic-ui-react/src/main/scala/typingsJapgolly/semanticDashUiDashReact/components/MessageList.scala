package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageListMod.MessageListProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MessageList {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    items: SemanticShorthandCollection[MessageItemProps] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MessageListProps, 
    MountedWithRawType[MessageListProps, js.Object, RawMounted[MessageListProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageListMod.MessageListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageListMod.MessageListProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/MessageList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

