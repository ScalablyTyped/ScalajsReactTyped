package typingsJapgolly.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptorSkewedInfo extends js.Object {
  /**
    * A list of names of columns that contain skewed values.
    */
  var skewedColumnNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var skewedColumnValueLocationMaps: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A mapping of skewed values to the columns that contain them.
    */
  var skewedColumnValues: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object CatalogTableStorageDescriptorSkewedInfo {
  @scala.inline
  def apply(
    skewedColumnNames: Input[js.Array[Input[String]]] = null,
    skewedColumnValueLocationMaps: Input[StringDictionary[Input[String]]] = null,
    skewedColumnValues: Input[js.Array[Input[String]]] = null
  ): CatalogTableStorageDescriptorSkewedInfo = {
    val __obj = js.Dynamic.literal()
    if (skewedColumnNames != null) __obj.updateDynamic("skewedColumnNames")(skewedColumnNames.asInstanceOf[js.Any])
    if (skewedColumnValueLocationMaps != null) __obj.updateDynamic("skewedColumnValueLocationMaps")(skewedColumnValueLocationMaps.asInstanceOf[js.Any])
    if (skewedColumnValues != null) __obj.updateDynamic("skewedColumnValues")(skewedColumnValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptorSkewedInfo]
  }
}

