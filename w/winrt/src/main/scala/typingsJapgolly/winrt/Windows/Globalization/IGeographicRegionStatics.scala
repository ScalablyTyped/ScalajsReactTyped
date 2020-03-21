package typingsJapgolly.winrt.Windows.Globalization

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeographicRegionStatics extends js.Object {
  def isSupported(geographicRegionCode: String): Boolean
}

object IGeographicRegionStatics {
  @scala.inline
  def apply(isSupported: String => CallbackTo[Boolean]): IGeographicRegionStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSupported")(js.Any.fromFunction1((t0: java.lang.String) => isSupported(t0).runNow()))
    __obj.asInstanceOf[IGeographicRegionStatics]
  }
}

