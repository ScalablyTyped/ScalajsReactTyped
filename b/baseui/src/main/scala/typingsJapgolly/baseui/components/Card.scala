package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonThumbnail
import typingsJapgolly.baseui.cardMod.CardOverrides
import typingsJapgolly.baseui.cardMod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  def apply(
    action: VdomNode = null,
    hasThumbnail: /* props */ AnonThumbnail => CallbackTo[Boolean] = null,
    headerImage: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImagePropsT */ js.Any) = null,
    overrides: CardOverrides = null,
    thumbnail: String = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    CardProps, 
    MountedWithRawType[CardProps, js.Object, RawMounted[CardProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (action != null) __obj.updateDynamic("action")(action.rawNode.asInstanceOf[js.Any])
    if (hasThumbnail != null) __obj.updateDynamic("hasThumbnail")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.baseui.AnonThumbnail) => hasThumbnail(t0).runNow()))
    if (headerImage != null) __obj.updateDynamic("headerImage")(headerImage.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.cardMod.CardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.cardMod.CardProps])(children: _*)
  }
  @JSImport("baseui/card", "Card")
  @js.native
  object componentImport extends js.Object
  
}

