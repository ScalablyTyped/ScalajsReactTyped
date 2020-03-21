package typingsJapgolly.history

import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationDescriptorObject
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.history.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/PathUtils", JSImport.Namespace)
@js.native
object pathUtilsMod extends js.Object {
  def addLeadingSlash(path: Path): Path = js.native
  def createPath[S](location: LocationDescriptorObject[S]): Path = js.native
  def hasBasename(path: Path): Boolean = js.native
  def parsePath(path: Path): Location[LocationState] = js.native
  def stripBasename(path: Path, prefix: String): Path = js.native
  def stripLeadingSlash(path: Path): Path = js.native
  def stripTrailingSlash(path: Path): Path = js.native
}

