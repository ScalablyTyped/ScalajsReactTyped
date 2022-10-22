package typingsJapgolly.jsmediatags

import typingsJapgolly.jsmediatags.typesMod.ByteRange
import typingsJapgolly.jsmediatags.typesMod.TagFrames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2Id3v2tagreaderMod {
  
  @JSImport("jsmediatags/build2/ID3v2TagReader", JSImport.Default)
  @js.native
  open class default () extends ID3v2TagReader
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/ID3v2TagReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadTagFormat")(tagIdentifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getTagIdentifierByteRange(): ByteRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagIdentifierByteRange")().asInstanceOf[ByteRange]
  }
  
  @js.native
  trait ID3v2TagReader
    extends typingsJapgolly.jsmediatags.build2MediaTagReaderMod.default {
    
    def _getFrameData(frames: TagFrames, ids: js.Array[String]): Any = js.native
  }
}
