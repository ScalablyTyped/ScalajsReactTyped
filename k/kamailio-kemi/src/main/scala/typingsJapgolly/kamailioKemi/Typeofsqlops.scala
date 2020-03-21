package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsqlops extends js.Object {
  def sql_is_null(sres: String, i: Double, j: Double): Double
  def sql_num_columns(sres: String): Double
  def sql_num_rows(sres: String): Double
  def sql_query(scon: String, squery: String, sres: String): Double
  def sql_query_async(scon: String, squery: String): Double
  def sql_result_free(sres: String): Double
  def sql_xquery(scon: String, squery: String, xavp: String): Double
}

object Typeofsqlops {
  @scala.inline
  def apply(
    sql_is_null: (String, Double, Double) => CallbackTo[Double],
    sql_num_columns: String => CallbackTo[Double],
    sql_num_rows: String => CallbackTo[Double],
    sql_query: (String, String, String) => CallbackTo[Double],
    sql_query_async: (String, String) => CallbackTo[Double],
    sql_result_free: String => CallbackTo[Double],
    sql_xquery: (String, String, String) => CallbackTo[Double]
  ): Typeofsqlops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sql_is_null")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => sql_is_null(t0, t1, t2).runNow()))
    __obj.updateDynamic("sql_num_columns")(js.Any.fromFunction1((t0: java.lang.String) => sql_num_columns(t0).runNow()))
    __obj.updateDynamic("sql_num_rows")(js.Any.fromFunction1((t0: java.lang.String) => sql_num_rows(t0).runNow()))
    __obj.updateDynamic("sql_query")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => sql_query(t0, t1, t2).runNow()))
    __obj.updateDynamic("sql_query_async")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sql_query_async(t0, t1).runNow()))
    __obj.updateDynamic("sql_result_free")(js.Any.fromFunction1((t0: java.lang.String) => sql_result_free(t0).runNow()))
    __obj.updateDynamic("sql_xquery")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => sql_xquery(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeofsqlops]
  }
}

