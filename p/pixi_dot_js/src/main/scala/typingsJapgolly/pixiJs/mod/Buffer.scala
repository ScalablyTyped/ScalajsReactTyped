package typingsJapgolly.pixiJs.mod

import typingsJapgolly.std.ArrayBufferView
import typingsJapgolly.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper for data so that it can be used and uploaded by WebGL
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Buffer")
@js.native
class Buffer protected ()
  extends typingsJapgolly.pixiJs.PIXI.Buffer {
  def this(data: scala.scalajs.js.typedarray.ArrayBuffer) = this()
  def this(data: scala.scalajs.js.typedarray.ArrayBufferView) = this()
  def this(data: SharedArrayBuffer) = this()
  def this(data: scala.scalajs.js.typedarray.ArrayBufferView, _static: Boolean) = this()
  def this(data: scala.scalajs.js.typedarray.ArrayBuffer, _static: Boolean) = this()
  def this(data: SharedArrayBuffer, _static: Boolean) = this()
  def this(data: scala.scalajs.js.typedarray.ArrayBufferView, _static: Boolean, index: Boolean) = this()
  def this(data: scala.scalajs.js.typedarray.ArrayBuffer, _static: Boolean, index: Boolean) = this()
  def this(data: SharedArrayBuffer, _static: Boolean, index: Boolean) = this()
}

/* static members */
@JSImport("pixi.js", "Buffer")
@js.native
object Buffer extends js.Object {
  def from(data: js.Array[Double]): typingsJapgolly.pixiJs.PIXI.Buffer = js.native
  /**
    * Helper function that creates a buffer based on an array or TypedArray
    *
    * @static
    * @param {ArrayBufferView | number[]} data the TypedArray that the buffer will store. If this is a regular Array it will be converted to a Float32Array.
    * @return {PIXI.Buffer} A new Buffer based on the data provided.
    */
  def from(data: ArrayBufferView): typingsJapgolly.pixiJs.PIXI.Buffer = js.native
}

