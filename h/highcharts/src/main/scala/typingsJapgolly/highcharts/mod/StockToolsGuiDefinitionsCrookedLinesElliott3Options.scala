package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsCrookedLinesElliott3Options extends js.Object {
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}

object StockToolsGuiDefinitionsCrookedLinesElliott3Options {
  @scala.inline
  def apply(symbol: String = null): StockToolsGuiDefinitionsCrookedLinesElliott3Options = {
    val __obj = js.Dynamic.literal()
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiDefinitionsCrookedLinesElliott3Options]
  }
}

