package typingsJapgolly.ipldCar

import typingsJapgolly.ipldCar.typesLibCodingMod.BytesReader
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibDecoderMod {
  
  @JSImport("@ipld/car/types/lib/decoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncIterableReader(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): BytesReader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncIterableReader")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[BytesReader_]
  
  inline def bytesReader(bytes: js.typedarray.Uint8Array): BytesReader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesReader")(bytes.asInstanceOf[js.Any]).asInstanceOf[BytesReader_]
  
  inline def chunkReader(readChunk: js.Function0[js.Promise[js.typedarray.Uint8Array | Null]]): BytesReader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("chunkReader")(readChunk.asInstanceOf[js.Any]).asInstanceOf[BytesReader_]
  
  inline def createDecoder(reader: BytesReader_): CarDecoder = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoder")(reader.asInstanceOf[js.Any]).asInstanceOf[CarDecoder]
  
  inline def limitReader(reader: BytesReader_, byteLimit: Double): BytesReader_ = (^.asInstanceOf[js.Dynamic].applyDynamic("limitReader")(reader.asInstanceOf[js.Any], byteLimit.asInstanceOf[js.Any])).asInstanceOf[BytesReader_]
  
  inline def readBlockHead(reader: BytesReader_): js.Promise[BlockHeader] = ^.asInstanceOf[js.Dynamic].applyDynamic("readBlockHead")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockHeader]]
  
  inline def readHeader(reader: BytesReader_): js.Promise[CarHeader | CarV2Header] = ^.asInstanceOf[js.Dynamic].applyDynamic("readHeader")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CarHeader | CarV2Header]]
  inline def readHeader(reader: BytesReader_, strictVersion: Double): js.Promise[CarHeader | CarV2Header] = (^.asInstanceOf[js.Dynamic].applyDynamic("readHeader")(reader.asInstanceOf[js.Any], strictVersion.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CarHeader | CarV2Header]]
  
  type Block = typingsJapgolly.ipldCar.typesApiMod.Block
  
  type BlockHeader = typingsJapgolly.ipldCar.typesApiMod.BlockHeader
  
  type BlockIndex = typingsJapgolly.ipldCar.typesApiMod.BlockIndex
  
  type BytesReader_ = BytesReader
  
  type CarDecoder = typingsJapgolly.ipldCar.typesLibCodingMod.CarDecoder
  
  type CarHeader = typingsJapgolly.ipldCar.typesLibCodingMod.CarHeader
  
  type CarV2FixedHeader = typingsJapgolly.ipldCar.typesLibCodingMod.CarV2FixedHeader
  
  type CarV2Header = typingsJapgolly.ipldCar.typesLibCodingMod.CarV2Header
}
