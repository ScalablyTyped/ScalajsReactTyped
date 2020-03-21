package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpresenceXml extends js.Object {
  def pres_check_activities(pres_uri: String, activity: String): Double
  def pres_check_basic(pres_uri: String, status: String): Double
}

object TypeofpresenceXml {
  @scala.inline
  def apply(
    pres_check_activities: (String, String) => CallbackTo[Double],
    pres_check_basic: (String, String) => CallbackTo[Double]
  ): TypeofpresenceXml = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pres_check_activities")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => pres_check_activities(t0, t1).runNow()))
    __obj.updateDynamic("pres_check_basic")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => pres_check_basic(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofpresenceXml]
  }
}

