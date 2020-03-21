package typingsJapgolly.pgCopyStreams

import typingsJapgolly.node.AnonEnd
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.pg.mod.Connection
import typingsJapgolly.pg.mod.Submittable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-copy-streams", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CopyStreamQuery ()
    extends Transform
       with Submittable {
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
  }
  
  @js.native
  class CopyToStreamQuery ()
    extends Transform
       with Submittable {
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
  }
  
  def from(txt: String): CopyStreamQuery = js.native
  def from(txt: String, options: TransformOptions): CopyStreamQuery = js.native
  def to(txt: String): CopyToStreamQuery = js.native
  def to(txt: String, options: TransformOptions): CopyToStreamQuery = js.native
}

