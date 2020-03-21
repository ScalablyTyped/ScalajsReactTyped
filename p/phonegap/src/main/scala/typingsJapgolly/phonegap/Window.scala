package typingsJapgolly.phonegap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var requestFileSystem: js.Any
  def openDatabase(
    database_name: String,
    database_version: String,
    database_displayname: String,
    database_size: Double
  ): Database
}

object Window {
  @scala.inline
  def apply(openDatabase: (String, String, String, Double) => CallbackTo[Database], requestFileSystem: js.Any): Window = {
    val __obj = js.Dynamic.literal(requestFileSystem = requestFileSystem.asInstanceOf[js.Any])
    __obj.updateDynamic("openDatabase")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: scala.Double) => openDatabase(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Window]
  }
}

