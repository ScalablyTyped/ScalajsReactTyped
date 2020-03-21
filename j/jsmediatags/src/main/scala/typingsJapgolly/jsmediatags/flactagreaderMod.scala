package typingsJapgolly.jsmediatags

import typingsJapgolly.jsmediatags.typesMod.ByteRange
import typingsJapgolly.jsmediatags.typesMod.LoadCallbackType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/FLACTagReader", JSImport.Namespace)
@js.native
object flactagreaderMod extends js.Object {
  @js.native
  trait FLACTagReader
    extends typingsJapgolly.jsmediatags.mediaTagReaderMod.default {
    var _commentOffset: Double = js.native
    var _pictureOffset: Double = js.native
    def _loadBlock(
      mediaFileReader: typingsJapgolly.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      callbacks: LoadCallbackType
    ): Unit = js.native
    def _nextBlock(
      mediaFileReader: typingsJapgolly.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      blockHeader: Double,
      blockSize: Double,
      callbacks: LoadCallbackType
    ): Unit = js.native
  }
  
  @js.native
  class default () extends FLACTagReader
  
  /* static members */
  @js.native
  object default extends js.Object {
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
  
}

