package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the TripleExponentialMovingAverageTrix class.
  */
@JSGlobal("ASPxClientTripleExponentialMovingAverageTrix")
@js.native
class ASPxClientTripleExponentialMovingAverageTrix () extends ASPxSeparatePaneIndicator {
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  var pointsCount: Double = js.native
  /**
    * Gets a value, indicating whose series point values are used to calculate the indicator's values.
    */
  var valueLevel: String = js.native
}

