package typingsJapgolly.reactDashNative.reactDashNativeMod

import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecursiveArray[T] extends Array[T | RecursiveArray[T]]

