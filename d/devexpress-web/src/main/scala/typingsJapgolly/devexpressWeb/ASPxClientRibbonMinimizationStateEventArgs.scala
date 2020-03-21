package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.MinimizationStateChanged event.
  */
@JSGlobal("ASPxClientRibbonMinimizationStateEventArgs")
@js.native
class ASPxClientRibbonMinimizationStateEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRibbonMinimizationStateEventArgs class with the specified setting.
    * @param ribbonState The integer value indicating the new ribbon minimization state.
    */
  def this(ribbonState: Double) = this()
  /**
    * Returns the value indicating the new ribbon state.
    */
  var ribbonState: Double = js.native
}

