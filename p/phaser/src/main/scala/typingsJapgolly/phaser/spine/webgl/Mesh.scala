package typingsJapgolly.phaser.spine.webgl

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.phaser.spine.Disposable
import typingsJapgolly.phaser.spine.Restorable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Mesh")
@js.native
class Mesh protected ()
  extends Disposable
     with Restorable {
  def this(
    context: ManagedWebGLRenderingContext,
    attributes: js.Array[VertexAttribute],
    maxVertices: Double,
    maxIndices: Double
  ) = this()
  def this(
    context: WebGLRenderingContext,
    attributes: js.Array[VertexAttribute],
    maxVertices: Double,
    maxIndices: Double
  ) = this()
  var attributes: js.Any = js.native
  var context: js.Any = js.native
  var dirtyIndices: js.Any = js.native
  var dirtyVertices: js.Any = js.native
  var elementsPerVertex: js.Any = js.native
  var indices: js.Any = js.native
  var indicesBuffer: js.Any = js.native
  var indicesLength: js.Any = js.native
  var update: js.Any = js.native
  var vertices: js.Any = js.native
  var verticesBuffer: js.Any = js.native
  var verticesLength: js.Any = js.native
  def bind(shader: Shader): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def draw(shader: Shader, primitiveType: Double): Unit = js.native
  def drawWithOffset(shader: Shader, primitiveType: Double, offset: Double, count: Double): Unit = js.native
  def getAttributes(): js.Array[VertexAttribute] = js.native
  def getIndices(): scala.scalajs.js.typedarray.Uint16Array = js.native
  def getVertexSizeInFloats(): Double = js.native
  def getVertices(): scala.scalajs.js.typedarray.Float32Array = js.native
  def maxIndices(): Double = js.native
  def maxVertices(): Double = js.native
  def numIndices(): Double = js.native
  def numVertices(): Double = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  def setIndices(indices: js.Array[Double]): Unit = js.native
  def setIndicesLength(length: Double): Unit = js.native
  def setVertices(vertices: js.Array[Double]): Unit = js.native
  def setVerticesLength(length: Double): Unit = js.native
  def unbind(shader: Shader): Unit = js.native
}

