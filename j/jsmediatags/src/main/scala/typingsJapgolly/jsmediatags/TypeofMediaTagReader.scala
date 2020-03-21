package typingsJapgolly.jsmediatags

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.jsmediatags.mediaFileReaderMod.default
import typingsJapgolly.jsmediatags.typesMod.ByteRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMediaTagReader
  extends Instantiable1[
      /* mediaFileReader */ default, 
      typingsJapgolly.jsmediatags.mediaTagReaderMod.default
    ] {
  def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
  def getTagIdentifierByteRange(): ByteRange = js.native
}

