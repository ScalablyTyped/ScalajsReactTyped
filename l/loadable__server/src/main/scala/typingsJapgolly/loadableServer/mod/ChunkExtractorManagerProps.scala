package typingsJapgolly.loadableServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkExtractorManagerProps extends js.Object {
  var extractor: ChunkExtractor
}

object ChunkExtractorManagerProps {
  @scala.inline
  def apply(extractor: ChunkExtractor): ChunkExtractorManagerProps = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChunkExtractorManagerProps]
  }
}

