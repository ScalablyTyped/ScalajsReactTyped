package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.TagProps
import typingsJapgolly.reactElemental.mod.TagSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tag {
  def apply(
    text: String,
    backgroundColor: String = null,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    outlineColor: String = null,
    size: TagSize = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[TagProps, MountedWithRawType[TagProps, js.Object, RawMounted[TagProps, js.Object]]] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactElemental.mod.TagProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactElemental.mod.TagProps])(children: _*)
  }
  @JSImport("react-elemental", "Tag")
  @js.native
  object componentImport extends js.Object
  
}

