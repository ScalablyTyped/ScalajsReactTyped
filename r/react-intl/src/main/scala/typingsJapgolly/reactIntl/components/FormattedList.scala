package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactIntl.IntlListFormatOptionsvalu
import typingsJapgolly.reactIntl.reactIntlStrings.`best fit`
import typingsJapgolly.reactIntl.reactIntlStrings.conjunction
import typingsJapgolly.reactIntl.reactIntlStrings.disjunction
import typingsJapgolly.reactIntl.reactIntlStrings.long
import typingsJapgolly.reactIntl.reactIntlStrings.lookup
import typingsJapgolly.reactIntl.reactIntlStrings.narrow
import typingsJapgolly.reactIntl.reactIntlStrings.short
import typingsJapgolly.reactIntl.reactIntlStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedList {
  def apply(
    value: js.Array[Node],
    localeMatcher: (`best fit`) | lookup = null,
    style: long | short | narrow = null,
    `type`: conjunction | disjunction | unit = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IntlListFormatOptionsvalu, 
    MountedWithRawType[
      IntlListFormatOptionsvalu, 
      js.Object, 
      RawMounted[IntlListFormatOptionsvalu, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactIntl.IntlListFormatOptionsvalu, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactIntl.IntlListFormatOptionsvalu])(children: _*)
  }
  @JSImport("react-intl", "FormattedList")
  @js.native
  object componentImport extends js.Object
  
}

