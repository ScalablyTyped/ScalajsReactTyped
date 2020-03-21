package typingsJapgolly.ebml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Decoder = typingsJapgolly.ebml.mod.Decoder_
  type Encoder = typingsJapgolly.ebml.mod.Encoder_
  type StateAndTagData = js.Tuple2[
    typingsJapgolly.ebml.ebmlStrings.tag | typingsJapgolly.ebml.ebmlStrings.start | typingsJapgolly.ebml.ebmlStrings.end, 
    typingsJapgolly.ebml.mod.Tag[js.Any] | typingsJapgolly.ebml.mod.TagMetadata
  ]
  type Tag[T /* <: typingsJapgolly.ebml.mod.TagType */] = typingsJapgolly.ebml.mod.Tag_[T]
}
