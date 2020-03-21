package typingsJapgolly.gulpIf.mod

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.std.RegExp
import typingsJapgolly.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpIf extends js.Object {
  /** 
    * gulp-if will pipe data to stream whenever condition is truthy.
    * If condition is falsey and elseStream is passed, data will pipe to elseStream
    * After data is piped to stream or elseStream or neither, data is piped down-stream.
    * 
    * @param condition a function taking a vinyl file and returning a boolean
    * @param stream the stream to pipe to if condition is true
    * @param elseStream (optional) the stream to pipe to if condition is false 
    */
  def apply(condition: js.Function1[/* fs */ File, Boolean], stream: ReadWriteStream): ReadWriteStream = js.native
  def apply(
    condition: js.Function1[/* fs */ File, Boolean],
    stream: ReadWriteStream,
    elseStream: ReadWriteStream
  ): ReadWriteStream = js.native
  /** 
    * gulp-if will pipe data to stream whenever condition is truthy.
    * If condition is falsey and elseStream is passed, data will pipe to elseStream
    * After data is piped to stream or elseStream or neither, data is piped down-stream.
    * 
    * @param condition whether input should be piped to stream
    * @param stream the stream to pipe to if condition is true
    * @param elseStream (optional) the stream to pipe to if condition is false 
    */
  def apply(condition: Boolean, stream: ReadWriteStream): ReadWriteStream = js.native
  def apply(condition: Boolean, stream: ReadWriteStream, elseStream: ReadWriteStream): ReadWriteStream = js.native
  /** 
    * gulp-if will pipe data to stream whenever condition is truthy.
    * If condition is falsey and elseStream is passed, data will pipe to elseStream
    * After data is piped to stream or elseStream or neither, data is piped down-stream.
    * 
    * @param condition a Node Stat filter condition to be executed on the vinyl file's Stats object
    * @param stream the stream to pipe to if condition is true
    * @param elseStream (optional) the stream to pipe to if condition is false 
    */
  def apply(condition: StatFilterCondition, stream: ReadWriteStream): ReadWriteStream = js.native
  def apply(condition: StatFilterCondition, stream: ReadWriteStream, elseStream: ReadWriteStream): ReadWriteStream = js.native
  /** 
    * gulp-if will pipe data to stream whenever condition is truthy.
    * If condition is falsey and elseStream is passed, data will pipe to elseStream
    * After data is piped to stream or elseStream or neither, data is piped down-stream.
    * 
    * @param condition a RegularExpression that works on the file.path
    * @param stream the stream to pipe to if condition is true
    * @param elseStream (optional) the stream to pipe to if condition is false 
    */
  def apply(condition: RegExp, stream: ReadWriteStream): ReadWriteStream = js.native
  def apply(condition: RegExp, stream: ReadWriteStream, elseStream: ReadWriteStream): ReadWriteStream = js.native
}

