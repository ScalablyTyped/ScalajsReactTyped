package typingsJapgolly.coreJs.core

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("core.Set")
@js.native
class Set[T] ()
  extends typingsJapgolly.std.Set[T] {
  def this(values: js.Array[T]) = this()
}

@JSGlobal("core.Set")
@js.native
object Set extends TopLevel[SetConstructor]

