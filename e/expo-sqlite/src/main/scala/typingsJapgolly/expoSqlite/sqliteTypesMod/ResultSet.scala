package typingsJapgolly.expoSqlite.sqliteTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSet extends js.Object {
  var insertId: js.UndefOr[Double] = js.undefined
  var rows: js.Array[StringDictionary[_]]
  var rowsAffected: Double
}

object ResultSet {
  @scala.inline
  def apply(rows: js.Array[StringDictionary[_]], rowsAffected: Double, insertId: Int | Double = null): ResultSet = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
}

