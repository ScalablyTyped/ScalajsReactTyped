package typingsJapgolly.ionicCore.interfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteEntry extends js.Object {
  var id: String
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var path: js.Array[String]
}

object RouteEntry {
  @scala.inline
  def apply(id: String, path: js.Array[String], params: StringDictionary[js.Any] = null): RouteEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteEntry]
  }
}

