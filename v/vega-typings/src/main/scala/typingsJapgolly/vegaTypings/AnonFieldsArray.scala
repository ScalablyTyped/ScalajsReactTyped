package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.scaleMod.DataRef
import typingsJapgolly.vegaTypings.scaleMod.MultiDataRef
import typingsJapgolly.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldsArray extends MultiDataRef {
  var fields: js.Array[(js.Array[String | Double | Boolean]) | DataRef | SignalRef]
}

object AnonFieldsArray {
  @scala.inline
  def apply(fields: js.Array[(js.Array[String | Double | Boolean]) | DataRef | SignalRef]): AnonFieldsArray = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFieldsArray]
  }
}

