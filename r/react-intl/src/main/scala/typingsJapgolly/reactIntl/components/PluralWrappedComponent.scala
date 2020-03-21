package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactIntl.pluralMod.Props
import typingsJapgolly.reactIntl.typesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PluralWrappedComponent {
  def apply(
    intl: IntlShape,
    value: Double,
    few: VdomNode = null,
    format: String = null,
    many: VdomNode = null,
    one: VdomNode = null,
    other: VdomNode = null,
    two: VdomNode = null,
    zero: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* value */ Node => CallbackTo[Element | Null] = null
  ): UnmountedSimple[Props, MountedWithRawType[Props, js.Object, RawMounted[Props, js.Object]]] = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* value */ japgolly.scalajs.react.raw.React.Node) => children(t0).runNow()))
    if (few != null) __obj.updateDynamic("few")(few.rawNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.rawNode.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.rawNode.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.rawNode.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.rawNode.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactIntl.pluralMod.Props, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactIntl.pluralMod.Props])
  }
  @JSImport("react-intl/lib/components/plural", "default.WrappedComponent")
  @js.native
  object componentImport extends js.Object
  
}

