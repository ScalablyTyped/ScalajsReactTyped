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
import typingsJapgolly.catalog.mod.AudioSpecimenProps
import typingsJapgolly.catalog.mod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AudioSpecimen {
  def apply(
    src: String,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    rawBody: String = null,
    rawOptions: String = null,
    span: `1` | `2` | `3` | `4` | `5` | `6` = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SpecimenProps with AudioSpecimenProps, 
    typingsJapgolly.catalog.mod.AudioSpecimen, 
    Unit, 
    SpecimenProps with AudioSpecimenProps
  ] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.catalog.mod.SpecimenProps with typingsJapgolly.catalog.mod.AudioSpecimenProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.catalog.mod.AudioSpecimen](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.catalog.mod.SpecimenProps with typingsJapgolly.catalog.mod.AudioSpecimenProps])(children: _*)
  }
  @JSImport("catalog", "AudioSpecimen")
  @js.native
  object componentImport extends js.Object
  
}

