package typingsJapgolly.browserfs.distNodeBackendZipFSMod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "CentralDirectory")
@js.native
open class CentralDirectory protected () extends StObject {
  def this(zipData: Buffer, data: Buffer) = this()
  
  /* private */ var _filename: Any = js.native
  
  def compressedSize(): Double = js.native
  
  def compressionMethod(): CompressionMethod = js.native
  
  def crc32(): Double = js.native
  
  /* private */ var data: Any = js.native
  
  def diskNumberStart(): Double = js.native
  
  def externalAttributes(): Double = js.native
  
  def extraField(): Buffer = js.native
  
  def extraFieldLength(): Double = js.native
  
  def fileComment(): String = js.native
  
  def fileCommentLength(): Double = js.native
  
  def fileName(): String = js.native
  
  def fileNameLength(): Double = js.native
  
  def flag(): Double = js.native
  
  def getData(): Buffer = js.native
  
  def getFileData(): FileData = js.native
  
  def getRawData(): Buffer = js.native
  
  def getStats(): typingsJapgolly.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
  
  def headerRelativeOffset(): Double = js.native
  
  def internalAttributes(): Double = js.native
  
  def isDirectory(): Boolean = js.native
  
  def isEncrypted(): Boolean = js.native
  
  def isFile(): Boolean = js.native
  
  def lastModFileTime(): js.Date = js.native
  
  def produceFilename(): String = js.native
  
  def rawFileComment(): Buffer = js.native
  
  def rawFileName(): Buffer = js.native
  
  def rawLastModFileTime(): Double = js.native
  
  def totalSize(): Double = js.native
  
  def uncompressedSize(): Double = js.native
  
  def useUTF8(): Boolean = js.native
  
  def versionMadeBy(): Double = js.native
  
  def versionNeeded(): Double = js.native
  
  /* private */ var zipData: Any = js.native
}
