package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.VertexBuffer
  * @classdesc A vertex buffer is the mechanism via which the application specifies vertex
  * data to the graphics hardware.
  * @description Creates a new vertex buffer object.
  * @param {pc.GraphicsDevice} graphicsDevice - The graphics device used to manage this vertex buffer.
  * @param {pc.VertexFormat} format - The vertex format of this vertex buffer.
  * @param {number} numVertices - The number of vertices that this vertex buffer will hold.
  * @param {number} [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param {ArrayBuffer} [initialData] - Initial data.
  */
@JSImport("playcanvas", "VertexBuffer")
@js.native
class VertexBuffer protected ()
  extends typingsJapgolly.playcanvas.pc.VertexBuffer {
  def this(
    graphicsDevice: typingsJapgolly.playcanvas.pc.GraphicsDevice,
    format: typingsJapgolly.playcanvas.pc.VertexFormat,
    numVertices: Double
  ) = this()
  def this(
    graphicsDevice: typingsJapgolly.playcanvas.pc.GraphicsDevice,
    format: typingsJapgolly.playcanvas.pc.VertexFormat,
    numVertices: Double,
    usage: Double
  ) = this()
  def this(
    graphicsDevice: typingsJapgolly.playcanvas.pc.GraphicsDevice,
    format: typingsJapgolly.playcanvas.pc.VertexFormat,
    numVertices: Double,
    usage: Double,
    initialData: scala.scalajs.js.typedarray.ArrayBuffer
  ) = this()
}

