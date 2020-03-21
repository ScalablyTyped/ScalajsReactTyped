package typingsJapgolly.fastGlob

import typingsJapgolly.fastGlob.entriesMod.Entry
import typingsJapgolly.fastGlob.patternsMod.Pattern
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/adapters/fs-stream", JSImport.Namespace)
@js.native
object fsStreamMod extends js.Object {
  @js.native
  trait FileSystemStream
    extends typingsJapgolly.fastGlob.fsMod.default[ReadableStream] {
    /**
      * Return entry for the provided path.
      */
    def getEntry(filepath: String, pattern: Pattern): js.Promise[Entry | Null] = js.native
    /**
      * Return fs.Stats for the provided path.
      */
    def getStat(filepath: String): js.Promise[Stats] = js.native
  }
  
  @js.native
  class default () extends FileSystemStream
  
}

