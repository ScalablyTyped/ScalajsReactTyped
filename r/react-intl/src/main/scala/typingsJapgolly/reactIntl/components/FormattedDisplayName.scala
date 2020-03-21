package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactIntl.DisplayNamesOptionsvalues
import typingsJapgolly.reactIntl.reactIntlStrings.`best fit`
import typingsJapgolly.reactIntl.reactIntlStrings.code
import typingsJapgolly.reactIntl.reactIntlStrings.currency
import typingsJapgolly.reactIntl.reactIntlStrings.language
import typingsJapgolly.reactIntl.reactIntlStrings.long
import typingsJapgolly.reactIntl.reactIntlStrings.lookup
import typingsJapgolly.reactIntl.reactIntlStrings.narrow
import typingsJapgolly.reactIntl.reactIntlStrings.none
import typingsJapgolly.reactIntl.reactIntlStrings.region
import typingsJapgolly.reactIntl.reactIntlStrings.script
import typingsJapgolly.reactIntl.reactIntlStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedDisplayName {
  def apply(
    value: String | Double | js.Object,
    fallback: code | none = null,
    localeMatcher: lookup | (`best fit`) = null,
    style: narrow | short | long = null,
    `type`: language | region | script | currency = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    DisplayNamesOptionsvalues, 
    MountedWithRawType[
      DisplayNamesOptionsvalues, 
      js.Object, 
      RawMounted[DisplayNamesOptionsvalues, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactIntl.DisplayNamesOptionsvalues, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactIntl.DisplayNamesOptionsvalues])(children: _*)
  }
  @JSImport("react-intl", "FormattedDisplayName")
  @js.native
  object componentImport extends js.Object
  
}

