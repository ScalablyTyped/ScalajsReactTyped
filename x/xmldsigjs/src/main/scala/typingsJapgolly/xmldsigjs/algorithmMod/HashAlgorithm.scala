package typingsJapgolly.xmldsigjs.algorithmMod

import typingsJapgolly.std.BufferSource
import typingsJapgolly.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.xmldsigjs.algorithmMod.IAlgorithm because Already inherited
- typingsJapgolly.xmldsigjs.algorithmMod.IHashAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Digest, Digest, Digest */ @JSImport("xmldsigjs/build/types/algorithm", "HashAlgorithm")
@js.native
abstract class HashAlgorithm () extends XmlAlgorithm {
  def Digest(xml: String): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def Digest(xml: BufferSource): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def Digest(xml: Node): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
}

