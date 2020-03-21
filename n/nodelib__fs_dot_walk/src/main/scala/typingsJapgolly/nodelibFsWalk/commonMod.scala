package typingsJapgolly.nodelibFsWalk

import typingsJapgolly.nodelibFsWalk.settingsMod.FilterFunction
import typingsJapgolly.nodelibFsWalk.settingsMod.default
import typingsJapgolly.nodelibFsWalk.typesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/readers/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  def isAppliedFilter[T](filter: Null, value: T): Boolean = js.native
  def isAppliedFilter[T](filter: FilterFunction[T], value: T): Boolean = js.native
  def isFatalError(settings: default, error: Errno): Boolean = js.native
  def joinPathSegments(a: String, b: String, separator: String): String = js.native
  def replacePathSegmentSeparator(filepath: String, separator: String): String = js.native
}

