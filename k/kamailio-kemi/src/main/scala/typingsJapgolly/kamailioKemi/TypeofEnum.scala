package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofEnum extends js.Object {
  def enum_i_query_suffix(vsuffix: String): Double
  def enum_pv_query(ve164: String): Double
  def enum_pv_query_suffix(ve164: String, vsuffix: String): Double
  def enum_pv_query_suffix_service(ve164: String, vsuffix: String, vservice: String): Double
  def enum_query(): Double
  def enum_query_suffix(vsuffix: String): Double
  def enum_query_suffix_service(vsuffix: String, vservice: String): Double
  def i_enum_query(): Double
  def i_enum_query_suffix_service(vsuffix: String, vservice: String): Double
  def is_from_user_enum(): Double
  def is_from_user_enum_suffix(vsuffix: String): Double
  def is_from_user_enum_suffix_service(vsuffix: String, vservice: String): Double
}

object TypeofEnum {
  @scala.inline
  def apply(
    enum_i_query_suffix: String => CallbackTo[Double],
    enum_pv_query: String => CallbackTo[Double],
    enum_pv_query_suffix: (String, String) => CallbackTo[Double],
    enum_pv_query_suffix_service: (String, String, String) => CallbackTo[Double],
    enum_query: CallbackTo[Double],
    enum_query_suffix: String => CallbackTo[Double],
    enum_query_suffix_service: (String, String) => CallbackTo[Double],
    i_enum_query: CallbackTo[Double],
    i_enum_query_suffix_service: (String, String) => CallbackTo[Double],
    is_from_user_enum: CallbackTo[Double],
    is_from_user_enum_suffix: String => CallbackTo[Double],
    is_from_user_enum_suffix_service: (String, String) => CallbackTo[Double]
  ): TypeofEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enum_i_query_suffix")(js.Any.fromFunction1((t0: java.lang.String) => enum_i_query_suffix(t0).runNow()))
    __obj.updateDynamic("enum_pv_query")(js.Any.fromFunction1((t0: java.lang.String) => enum_pv_query(t0).runNow()))
    __obj.updateDynamic("enum_pv_query_suffix")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => enum_pv_query_suffix(t0, t1).runNow()))
    __obj.updateDynamic("enum_pv_query_suffix_service")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => enum_pv_query_suffix_service(t0, t1, t2).runNow()))
    __obj.updateDynamic("enum_query")(enum_query.toJsFn)
    __obj.updateDynamic("enum_query_suffix")(js.Any.fromFunction1((t0: java.lang.String) => enum_query_suffix(t0).runNow()))
    __obj.updateDynamic("enum_query_suffix_service")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => enum_query_suffix_service(t0, t1).runNow()))
    __obj.updateDynamic("i_enum_query")(i_enum_query.toJsFn)
    __obj.updateDynamic("i_enum_query_suffix_service")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => i_enum_query_suffix_service(t0, t1).runNow()))
    __obj.updateDynamic("is_from_user_enum")(is_from_user_enum.toJsFn)
    __obj.updateDynamic("is_from_user_enum_suffix")(js.Any.fromFunction1((t0: java.lang.String) => is_from_user_enum_suffix(t0).runNow()))
    __obj.updateDynamic("is_from_user_enum_suffix_service")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => is_from_user_enum_suffix_service(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofEnum]
  }
}

