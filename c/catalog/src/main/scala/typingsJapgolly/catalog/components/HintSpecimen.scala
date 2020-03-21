package typingsJapgolly.catalog.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.catalog.catalogNumbers.`1`
import typingsJapgolly.catalog.catalogNumbers.`2`
import typingsJapgolly.catalog.catalogNumbers.`3`
import typingsJapgolly.catalog.catalogNumbers.`4`
import typingsJapgolly.catalog.catalogNumbers.`5`
import typingsJapgolly.catalog.catalogNumbers.`6`
import typingsJapgolly.catalog.mod.HintSpecimenProps
import typingsJapgolly.catalog.mod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HintSpecimen {
  def apply(
    directive: js.UndefOr[Boolean] = js.undefined,
    important: js.UndefOr[Boolean] = js.undefined,
    neutral: js.UndefOr[Boolean] = js.undefined,
    rawBody: String = null,
    rawOptions: String = null,
    span: `1` | `2` | `3` | `4` | `5` | `6` = null,
    warning: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SpecimenProps with HintSpecimenProps, 
    typingsJapgolly.catalog.mod.HintSpecimen, 
    Unit, 
    SpecimenProps with HintSpecimenProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(directive)) __obj.updateDynamic("directive")(directive.asInstanceOf[js.Any])
    if (!js.isUndefined(important)) __obj.updateDynamic("important")(important.asInstanceOf[js.Any])
    if (!js.isUndefined(neutral)) __obj.updateDynamic("neutral")(neutral.asInstanceOf[js.Any])
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.catalog.mod.SpecimenProps with typingsJapgolly.catalog.mod.HintSpecimenProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.catalog.mod.HintSpecimen](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.catalog.mod.SpecimenProps with typingsJapgolly.catalog.mod.HintSpecimenProps])(children: _*)
  }
  @JSImport("catalog", "HintSpecimen")
  @js.native
  object componentImport extends js.Object
  
}

