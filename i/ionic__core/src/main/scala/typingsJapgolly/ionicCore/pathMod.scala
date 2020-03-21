package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.interfaceMod.RouteEntry
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.std.History_
import typingsJapgolly.std.Location_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  def chainToPath(chain: js.Array[RouteEntry]): js.Array[String] | Null = js.native
  def generatePath(segments: js.Array[String]): String = js.native
  def parsePath(): js.Array[String] = js.native
  def parsePath(path: String): js.Array[String] = js.native
  def readPath(loc: Location_, root: String, useHash: Boolean): js.Array[String] | Null = js.native
  def removePrefix(prefix: js.Array[String], path: js.Array[String]): js.Array[String] | Null = js.native
  def writePath(
    history: History_,
    root: String,
    useHash: Boolean,
    path: js.Array[String],
    direction: RouterDirection,
    state: Double
  ): Unit = js.native
}

