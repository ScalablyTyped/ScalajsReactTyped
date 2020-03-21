package typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionDetails extends js.Object {
  var onbeginvalidation: js.Any
  var onoptionchanged: js.Any
  var options: IMapView[String, IPrintOptionDetails]
  def createItemListOption(optionId: String, displayName: String): PrintCustomItemListOptionDetails
  def createTextOption(optionId: String, displayName: String): PrintCustomTextOptionDetails
}

object IPrintTaskOptionDetails {
  @scala.inline
  def apply(
    createItemListOption: (String, String) => CallbackTo[PrintCustomItemListOptionDetails],
    createTextOption: (String, String) => CallbackTo[PrintCustomTextOptionDetails],
    onbeginvalidation: js.Any,
    onoptionchanged: js.Any,
    options: IMapView[String, IPrintOptionDetails]
  ): IPrintTaskOptionDetails = {
    val __obj = js.Dynamic.literal(onbeginvalidation = onbeginvalidation.asInstanceOf[js.Any], onoptionchanged = onoptionchanged.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("createItemListOption")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createItemListOption(t0, t1).runNow()))
    __obj.updateDynamic("createTextOption")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createTextOption(t0, t1).runNow()))
    __obj.asInstanceOf[IPrintTaskOptionDetails]
  }
}

