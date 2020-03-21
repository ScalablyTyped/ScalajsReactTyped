package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Chart object, which can be converted to a static image. For charts embedded in spreadsheets,
  * see EmbeddedChart.
  */
trait Chart extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getOptions(): ChartOptions
}

object Chart {
  @scala.inline
  def apply(getAs: String => CallbackTo[Blob], getBlob: CallbackTo[Blob], getOptions: CallbackTo[ChartOptions]): Chart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(js.Any.fromFunction1((t0: java.lang.String) => getAs(t0).runNow()))
    __obj.updateDynamic("getBlob")(getBlob.toJsFn)
    __obj.updateDynamic("getOptions")(getOptions.toJsFn)
    __obj.asInstanceOf[Chart]
  }
}

