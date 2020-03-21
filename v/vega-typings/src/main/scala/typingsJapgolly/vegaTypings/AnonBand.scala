package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.encodeMod.Field
import typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBand
  extends ScaledValueRef[js.Any] {
  var band: Boolean | Double
  var scale: Field
}

object AnonBand {
  @scala.inline
  def apply(band: Boolean | Double, scale: Field): AnonBand = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBand]
  }
}

