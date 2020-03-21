package typingsJapgolly.jestSourceMap

import typingsJapgolly.callsites.mod.CallSite
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/source-map", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getCallsite(level: Double): CallSite = js.native
  def getCallsite(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
}

