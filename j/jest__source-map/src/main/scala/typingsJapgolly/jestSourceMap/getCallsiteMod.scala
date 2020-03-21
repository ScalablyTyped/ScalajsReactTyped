package typingsJapgolly.jestSourceMap

import typingsJapgolly.callsites.mod.CallSite
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/source-map/build/getCallsite", JSImport.Namespace)
@js.native
object getCallsiteMod extends js.Object {
  def default(level: Double): CallSite = js.native
  def default(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
}

