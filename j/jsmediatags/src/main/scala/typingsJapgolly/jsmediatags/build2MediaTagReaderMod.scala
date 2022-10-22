package typingsJapgolly.jsmediatags

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsmediatags.typesMod.ByteRange
import typingsJapgolly.jsmediatags.typesMod.CallbackType
import typingsJapgolly.jsmediatags.typesMod.LoadCallbackType
import typingsJapgolly.jsmediatags.typesMod.TagType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2MediaTagReaderMod {
  
  @JSImport("jsmediatags/build2/MediaTagReader", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MediaTagReader {
    def this(mediaFileReader: typingsJapgolly.jsmediatags.build2MediaFileReaderMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/MediaTagReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadTagFormat")(tagIdentifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getTagIdentifierByteRange(): ByteRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagIdentifierByteRange")().asInstanceOf[ByteRange]
  }
  
  @js.native
  trait MediaTagReader extends StObject {
    
    def _expandShortcutTags(): js.Array[String] | Null = js.native
    def _expandShortcutTags(tagsWithShortcuts: js.Array[String]): js.Array[String] | Null = js.native
    
    def _loadData(
      mediaFileReader: typingsJapgolly.jsmediatags.build2MediaFileReaderMod.default,
      callbacks: LoadCallbackType
    ): Unit = js.native
    
    var _mediaFileReader: typingsJapgolly.jsmediatags.build2MediaFileReaderMod.default = js.native
    
    def _parseData(mediaFileReader: typingsJapgolly.jsmediatags.build2MediaFileReaderMod.default): TagType = js.native
    def _parseData(
      mediaFileReader: typingsJapgolly.jsmediatags.build2MediaFileReaderMod.default,
      tags: js.Array[String]
    ): TagType = js.native
    
    var _tags: js.UndefOr[js.Array[String]] = js.native
    
    def getShortcuts(): StringDictionary[String | js.Array[String]] = js.native
    
    def read(callbacks: CallbackType): Unit = js.native
    
    def setTagsToRead(tags: js.Array[String]): MediaTagReader = js.native
  }
}
