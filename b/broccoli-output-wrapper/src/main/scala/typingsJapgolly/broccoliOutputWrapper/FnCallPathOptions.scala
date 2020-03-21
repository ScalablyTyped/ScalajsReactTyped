package typingsJapgolly.broccoliOutputWrapper

import typingsJapgolly.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typingsJapgolly.node.Anon4
import typingsJapgolly.node.Anon5
import typingsJapgolly.node.AnonEncodingWithFileTypes
import typingsJapgolly.node.AnonWithFileTypes
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.fsMod.Dirent
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOptions extends js.Object {
  def apply(path: PathLike): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: Anon4): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: Anon5): js.Array[Dirent] = js.native
  def apply(path: PathLike, options: AnonEncodingWithFileTypes): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: AnonWithFileTypes): js.Array[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
}

