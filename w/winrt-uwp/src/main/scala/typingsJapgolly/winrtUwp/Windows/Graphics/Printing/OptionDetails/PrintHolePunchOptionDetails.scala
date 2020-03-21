package typingsJapgolly.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the list of punch hole options. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails")
@js.native
abstract class PrintHolePunchOptionDetails () extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets the list of items for the hole punch option. */
  var items: IVectorView[_] = js.native
  /** Gets the ID for the hole punch option. */
  var optionId: String = js.native
  /** Gets the option type for the hole punch option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the hole punch option. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the enumerated value of the hole punch option. */
  var value: js.Any = js.native
  /**
    * Sets the value for the hole punch option.
    * @param value Value for the hole punch option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
}

