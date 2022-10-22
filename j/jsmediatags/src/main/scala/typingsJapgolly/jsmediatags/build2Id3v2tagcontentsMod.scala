package typingsJapgolly.jsmediatags

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsmediatags.anon.CRC
import typingsJapgolly.jsmediatags.typesMod.ByteArray
import typingsJapgolly.jsmediatags.typesMod.TagFrameFlags
import typingsJapgolly.jsmediatags.typesMod.TagHeaderFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2Id3v2tagcontentsMod {
  
  @JSImport("jsmediatags/build2/ID3v2TagContents", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ID3v2TagContents {
    def this(major: Double, revision: Double) = this()
  }
  
  @js.native
  trait ID3v2TagContents extends StObject {
    
    def _addData(offset: Double, data: ByteArray): Unit = js.native
    
    def _addExtendedHeaderData(tagKey: String, tagData: ByteArray): Unit = js.native
    
    var _contents: ByteArray = js.native
    
    var _extendedHeader: CRC = js.native
    
    var _frames: StringDictionary[js.Array[ByteArray]] = js.native
    
    def _getData(offset: Double, length: Double): ByteArray = js.native
    
    var _hasExtendedHeader: Boolean = js.native
    
    def _initExtendedHeader(): Unit = js.native
    
    var _major: Double = js.native
    
    var _nextFrameOffset: Double = js.native
    
    var _revision: Double = js.native
    
    def _setBitAtOffset(offset: Double, bit: Double): Unit = js.native
    
    def _setData(offset: Double, data: ByteArray): Unit = js.native
    
    var _size: Double = js.native
    
    def _updateFlags(flags: TagHeaderFlags): ID3v2TagContents = js.native
    def _updateFlags(flags: TagHeaderFlags, binaryFlags: Double): ID3v2TagContents = js.native
    
    def _updateSize(): Unit = js.native
    
    def addFrame(id: String, data: ByteArray): ID3v2TagContents = js.native
    def addFrame(id: String, data: ByteArray, flags: Unit, noFlagsDataLength: Double): ID3v2TagContents = js.native
    def addFrame(id: String, data: ByteArray, flags: TagFrameFlags): ID3v2TagContents = js.native
    def addFrame(id: String, data: ByteArray, flags: TagFrameFlags, noFlagsDataLength: Double): ID3v2TagContents = js.native
    
    def setCrc(crc: ByteArray): ID3v2TagContents = js.native
    
    def setFlags(flags: TagHeaderFlags): ID3v2TagContents = js.native
    
    def setTagIsUpdate(): ID3v2TagContents = js.native
    
    def setTagRestrictions(size: Double, textEncoding: Double, textSize: Double, imageEncoding: Double, imageSize: Double): ID3v2TagContents = js.native
    
    def toArray(): ByteArray = js.native
  }
}
