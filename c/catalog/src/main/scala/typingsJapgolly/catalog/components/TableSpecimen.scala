package typingsJapgolly.catalog.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.catalog.catalogNumbers.`1`
import typingsJapgolly.catalog.catalogNumbers.`2`
import typingsJapgolly.catalog.catalogNumbers.`3`
import typingsJapgolly.catalog.catalogNumbers.`4`
import typingsJapgolly.catalog.catalogNumbers.`5`
import typingsJapgolly.catalog.catalogNumbers.`6`
import typingsJapgolly.catalog.mod.SpecimenProps
import typingsJapgolly.catalog.mod.TableSpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableSpecimen {
  def apply(
    rows: js.Array[StringDictionary[Node]],
    columns: js.Array[String] = null,
    rawBody: String = null,
    rawOptions: String = null,
    span: `1` | `2` | `3` | `4` | `5` | `6` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SpecimenProps with TableSpecimenProps, 
    typingsJapgolly.catalog.mod.TableSpecimen, 
    Unit, 
    SpecimenProps with TableSpecimenProps
  ] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
      if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.catalog.mod.SpecimenProps with typingsJapgolly.catalog.mod.TableSpecimenProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.catalog.mod.TableSpecimen](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.catalog.mod.SpecimenProps with typingsJapgolly.catalog.mod.TableSpecimenProps])(children: _*)
  }
  @JSImport("catalog", "TableSpecimen")
  @js.native
  object componentImport extends js.Object
  
}

