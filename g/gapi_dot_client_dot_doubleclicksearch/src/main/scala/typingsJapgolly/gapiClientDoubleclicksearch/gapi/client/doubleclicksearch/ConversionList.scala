package typingsJapgolly.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionList extends js.Object {
  /** The conversions being requested. */
  var conversion: js.UndefOr[js.Array[Conversion]] = js.undefined
  /** Identifies this as a ConversionList resource. Value: the fixed string doubleclicksearch#conversionList. */
  var kind: js.UndefOr[String] = js.undefined
}

object ConversionList {
  @scala.inline
  def apply(conversion: js.Array[Conversion] = null, kind: String = null): ConversionList = {
    val __obj = js.Dynamic.literal()
    if (conversion != null) __obj.updateDynamic("conversion")(conversion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionList]
  }
}

