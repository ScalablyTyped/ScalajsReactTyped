package typingsJapgolly.semanticUiDimmer

import typingsJapgolly.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.click
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'on'> */
trait PickImplon extends js.Object {
  var on: `false` | hover | click
}

object PickImplon {
  @scala.inline
  def apply(on: `false` | hover | click): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplon]
  }
}

