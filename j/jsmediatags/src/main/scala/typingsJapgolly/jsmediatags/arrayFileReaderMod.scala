package typingsJapgolly.jsmediatags

import typingsJapgolly.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/ArrayFileReader", JSImport.Namespace)
@js.native
object arrayFileReaderMod extends js.Object {
  @js.native
  trait ArrayFileReader
    extends typingsJapgolly.jsmediatags.mediaFileReaderMod.default {
    var _array: ByteArray = js.native
  }
  
  @js.native
  class default protected () extends ArrayFileReader {
    def this(array: ByteArray) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def canReadFile(file: js.Any): Boolean = js.native
  }
  
}

