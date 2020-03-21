package typingsJapgolly.rdfTransformTripleToQuad.mod

import typingsJapgolly.node.AnonEnd
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.QuadGraph
import typingsJapgolly.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-transform-triple-to-quad", JSImport.Namespace)
@js.native
class ^[Q /* <: BaseQuad */] ()
  extends Transform
     with Stream[Q] {
  def this(graph: QuadGraph) = this()
  def this(graph: QuadGraph, options: TripleToQuadTransformOptions) = this()
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
  /* InferMemberOverrides */
  override def read(): (String | Buffer) with Q = js.native
}

