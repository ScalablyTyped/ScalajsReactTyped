package typingsJapgolly.gulpWatch.mod

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWatchStream
  extends ReadableStream
     with WritableStream {
  def add(path: String): ReadWriteStream = js.native
  def add(path: js.Array[String]): ReadWriteStream = js.native
  def close(): ReadWriteStream = js.native
  def unwatch(path: String): ReadWriteStream = js.native
  def unwatch(path: js.Array[String]): ReadWriteStream = js.native
}

