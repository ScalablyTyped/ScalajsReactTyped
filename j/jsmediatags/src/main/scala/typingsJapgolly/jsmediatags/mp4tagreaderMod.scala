package typingsJapgolly.jsmediatags

import typingsJapgolly.jsmediatags.typesMod.ByteRange
import typingsJapgolly.jsmediatags.typesMod.LoadCallbackType
import typingsJapgolly.jsmediatags.typesMod.TagFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/MP4TagReader", JSImport.Namespace)
@js.native
object mp4tagreaderMod extends js.Object {
  @js.native
  trait MP4TagReader
    extends typingsJapgolly.jsmediatags.mediaTagReaderMod.default {
    def _canReadAtom(atomName: String): Boolean = js.native
    def _isContainerAtom(atomName: String): Boolean = js.native
    def _loadAtom(
      mediaFileReader: typingsJapgolly.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      parentAtomFullName: String,
      callbacks: LoadCallbackType
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsJapgolly.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsJapgolly.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String]
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsJapgolly.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String],
      parentAtomFullName: String
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsJapgolly.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String],
      parentAtomFullName: String,
      indent: String
    ): Unit = js.native
    def _readMetadataAtom(data: typingsJapgolly.jsmediatags.mediaFileReaderMod.default, offset: Double): TagFrame = js.native
  }
  
  @js.native
  class default () extends MP4TagReader
  
  /* static members */
  @js.native
  object default extends js.Object {
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
  
}

