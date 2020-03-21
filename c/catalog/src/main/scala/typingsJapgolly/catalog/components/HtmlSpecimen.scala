package typingsJapgolly.catalog.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.catalog.catalogNumbers.`1`
import typingsJapgolly.catalog.catalogNumbers.`2`
import typingsJapgolly.catalog.catalogNumbers.`3`
import typingsJapgolly.catalog.catalogNumbers.`4`
import typingsJapgolly.catalog.catalogNumbers.`5`
import typingsJapgolly.catalog.catalogNumbers.`6`
import typingsJapgolly.catalog.mod.HtmlSpecimenProps
import typingsJapgolly.catalog.mod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HtmlSpecimen {
  def apply(
    dark: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    light: js.UndefOr[Boolean] = js.undefined,
    noSource: js.UndefOr[Boolean] = js.undefined,
    plain: js.UndefOr[Boolean] = js.undefined,
    rawBody: String = null,
    rawOptions: String = null,
    responsive: Boolean | String | js.Array[String] = null,
    showSource: js.UndefOr[Boolean] = js.undefined,
    span: `1` | `2` | `3` | `4` | `5` | `6` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: String
  ): UnmountedWithRoot[
    SpecimenProps with HtmlSpecimenProps, 
    typingsJapgolly.catalog.mod.HtmlSpecimen, 
    Unit, 
    SpecimenProps with HtmlSpecimenProps
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (!js.isUndefined(noSource)) __obj.updateDynamic("noSource")(noSource.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(showSource)) __obj.updateDynamic("showSource")(showSource.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.catalog.mod.SpecimenProps with typingsJapgolly.catalog.mod.HtmlSpecimenProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.catalog.mod.HtmlSpecimen](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.catalog.mod.SpecimenProps with typingsJapgolly.catalog.mod.HtmlSpecimenProps])
  }
  @JSImport("catalog", "HtmlSpecimen")
  @js.native
  object componentImport extends js.Object
  
}

