package typingsJapgolly.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkType extends js.Object {
  var data: DataType
  var offset: Double
}

object ChunkType {
  @scala.inline
  def apply(data: DataType, offset: Double): ChunkType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChunkType]
  }
}

