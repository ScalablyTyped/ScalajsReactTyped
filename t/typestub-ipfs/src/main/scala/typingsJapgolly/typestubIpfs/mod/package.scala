package typingsJapgolly.typestubIpfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Big = js.Any
  type CID = js.Any
  type Callback[T] = js.Function2[/* error */ js.Error, /* result */ js.UndefOr[T], scala.Unit]
  type DAGLink = js.Any
  type DAGLinkRef = typingsJapgolly.typestubIpfs.mod.DAGLink | js.Any
  type DAGNode = js.Any
  type FileContent = js.Object | org.scalajs.dom.raw.Blob | java.lang.String
  type KeyType = java.lang.String | typingsJapgolly.node.Buffer | typingsJapgolly.typestubIpfs.mod.CID | js.Any
  type Multihash = js.Any | java.lang.String
  type Obj = typingsJapgolly.std.BufferSource | js.Object
  type PeerId = js.Any
}
