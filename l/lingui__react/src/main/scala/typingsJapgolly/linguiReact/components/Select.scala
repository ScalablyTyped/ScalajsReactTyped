package typingsJapgolly.linguiReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linguiReact.selectMod.SelectPropsWithoutI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select {
  def apply(
    value: String,
    StringDictionary: /* exact */ StringDictionary[Node] = null,
    className: String = null,
    id: String = null,
    other: VdomNode = null,
    render: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SelectPropsWithoutI18n, 
    typingsJapgolly.linguiReact.mod.Select, 
    Unit, 
    SelectPropsWithoutI18n
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.rawNode.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.linguiReact.selectMod.SelectPropsWithoutI18n, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.linguiReact.mod.Select](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.linguiReact.selectMod.SelectPropsWithoutI18n])(children: _*)
  }
  @JSImport("@lingui/react", "Select")
  @js.native
  object componentImport extends js.Object
  
}

