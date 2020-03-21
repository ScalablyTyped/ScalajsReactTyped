package typingsJapgolly.vexdb.settingsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.vexdb.AnonPollTime
import typingsJapgolly.vexdb.AnonTtl
import typingsJapgolly.vexdb.requestObjectsMod.RequestObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait settings extends js.Object {
  var baseURL: String
  var cache: AnonTtl
  var headers: StringDictionary[String]
  var live: AnonPollTime
  var params: RequestObject
}

@JSImport("vexdb/out/constants/settings", "settings")
@js.native
object settings extends TopLevel[settings]

