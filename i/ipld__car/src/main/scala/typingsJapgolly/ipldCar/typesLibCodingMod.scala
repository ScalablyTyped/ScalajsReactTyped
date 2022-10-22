package typingsJapgolly.ipldCar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ipldCar.ipldCarInts.`1`
import typingsJapgolly.ipldCar.ipldCarInts.`2`
import typingsJapgolly.ipldCar.typesApiMod.Block
import typingsJapgolly.ipldCar.typesApiMod.BlockIndex
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCodingMod {
  
  trait BytesReader extends StObject {
    
    def exactly(length: Double): js.Promise[js.typedarray.Uint8Array]
    
    var pos: Double
    
    def seek(length: Double): Unit
    
    def upTo(length: Double): js.Promise[js.typedarray.Uint8Array]
  }
  object BytesReader {
    
    inline def apply(
      exactly: Double => js.Promise[js.typedarray.Uint8Array],
      pos: Double,
      seek: Double => Callback,
      upTo: Double => js.Promise[js.typedarray.Uint8Array]
    ): BytesReader = {
      val __obj = js.Dynamic.literal(exactly = js.Any.fromFunction1(exactly), pos = pos.asInstanceOf[js.Any], seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), upTo = js.Any.fromFunction1(upTo))
      __obj.asInstanceOf[BytesReader]
    }
    
    extension [Self <: BytesReader](x: Self) {
      
      inline def setExactly(value: Double => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "exactly", js.Any.fromFunction1(value))
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setUpTo(value: Double => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "upTo", js.Any.fromFunction1(value))
    }
  }
  
  trait CarDecoder extends StObject {
    
    def blocks(): AsyncGenerator[Block, Any, Any]
    
    def blocksIndex(): AsyncGenerator[BlockIndex, Any, Any]
    
    def header(): js.Promise[CarHeader | CarV2Header]
  }
  object CarDecoder {
    
    inline def apply(
      blocks: CallbackTo[AsyncGenerator[Block, Any, Any]],
      blocksIndex: CallbackTo[AsyncGenerator[BlockIndex, Any, Any]],
      header: CallbackTo[js.Promise[CarHeader | CarV2Header]]
    ): CarDecoder = {
      val __obj = js.Dynamic.literal(blocks = blocks.toJsFn, blocksIndex = blocksIndex.toJsFn, header = header.toJsFn)
      __obj.asInstanceOf[CarDecoder]
    }
    
    extension [Self <: CarDecoder](x: Self) {
      
      inline def setBlocks(value: CallbackTo[AsyncGenerator[Block, Any, Any]]): Self = StObject.set(x, "blocks", value.toJsFn)
      
      inline def setBlocksIndex(value: CallbackTo[AsyncGenerator[BlockIndex, Any, Any]]): Self = StObject.set(x, "blocksIndex", value.toJsFn)
      
      inline def setHeader(value: CallbackTo[js.Promise[CarHeader | CarV2Header]]): Self = StObject.set(x, "header", value.toJsFn)
    }
  }
  
  trait CarEncoder extends StObject {
    
    def close(): js.Promise[Unit]
    
    def setRoots(roots: js.Array[CID[Any, Double, Double, Version]]): js.Promise[Unit]
    
    def writeBlock(block: Block): js.Promise[Unit]
  }
  object CarEncoder {
    
    inline def apply(
      close: CallbackTo[js.Promise[Unit]],
      setRoots: js.Array[CID[Any, Double, Double, Version]] => js.Promise[Unit],
      writeBlock: Block => js.Promise[Unit]
    ): CarEncoder = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, setRoots = js.Any.fromFunction1(setRoots), writeBlock = js.Any.fromFunction1(writeBlock))
      __obj.asInstanceOf[CarEncoder]
    }
    
    extension [Self <: CarEncoder](x: Self) {
      
      inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setSetRoots(value: js.Array[CID[Any, Double, Double, Version]] => js.Promise[Unit]): Self = StObject.set(x, "setRoots", js.Any.fromFunction1(value))
      
      inline def setWriteBlock(value: Block => js.Promise[Unit]): Self = StObject.set(x, "writeBlock", js.Any.fromFunction1(value))
    }
  }
  
  trait CarHeader extends StObject {
    
    var roots: js.Array[CID[Any, Double, Double, Version]]
    
    var version: `1`
  }
  object CarHeader {
    
    inline def apply(roots: js.Array[CID[Any, Double, Double, Version]]): CarHeader = {
      val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any], version = 1)
      __obj.asInstanceOf[CarHeader]
    }
    
    extension [Self <: CarHeader](x: Self) {
      
      inline def setRoots(value: js.Array[CID[Any, Double, Double, Version]]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: (CID[Any, Double, Double, Version])*): Self = StObject.set(x, "roots", js.Array(value*))
      
      inline def setVersion(value: `1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait CarV2FixedHeader extends StObject {
    
    var characteristics: js.Tuple2[js.BigInt, js.BigInt]
    
    var dataOffset: Double
    
    var dataSize: Double
    
    var indexOffset: Double
  }
  object CarV2FixedHeader {
    
    inline def apply(
      characteristics: js.Tuple2[js.BigInt, js.BigInt],
      dataOffset: Double,
      dataSize: Double,
      indexOffset: Double
    ): CarV2FixedHeader = {
      val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], indexOffset = indexOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarV2FixedHeader]
    }
    
    extension [Self <: CarV2FixedHeader](x: Self) {
      
      inline def setCharacteristics(value: js.Tuple2[js.BigInt, js.BigInt]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      inline def setDataOffset(value: Double): Self = StObject.set(x, "dataOffset", value.asInstanceOf[js.Any])
      
      inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
      
      inline def setIndexOffset(value: Double): Self = StObject.set(x, "indexOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait CarV2Header
    extends StObject
       with CarV2FixedHeader {
    
    var roots: js.Array[CID[Any, Double, Double, Version]]
    
    var version: `2`
  }
  object CarV2Header {
    
    inline def apply(
      characteristics: js.Tuple2[js.BigInt, js.BigInt],
      dataOffset: Double,
      dataSize: Double,
      indexOffset: Double,
      roots: js.Array[CID[Any, Double, Double, Version]]
    ): CarV2Header = {
      val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], indexOffset = indexOffset.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], version = 2)
      __obj.asInstanceOf[CarV2Header]
    }
    
    extension [Self <: CarV2Header](x: Self) {
      
      inline def setRoots(value: js.Array[CID[Any, Double, Double, Version]]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: (CID[Any, Double, Double, Version])*): Self = StObject.set(x, "roots", js.Array(value*))
      
      inline def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait IteratorChannel[T] extends StObject {
    
    var iterator: AsyncIterator[T, Any, Unit]
    
    var writer: IteratorChannelWriter[T]
  }
  object IteratorChannel {
    
    inline def apply[T](iterator: AsyncIterator[T, Any, Unit], writer: IteratorChannelWriter[T]): IteratorChannel[T] = {
      val __obj = js.Dynamic.literal(iterator = iterator.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
      __obj.asInstanceOf[IteratorChannel[T]]
    }
    
    extension [Self <: IteratorChannel[?], T](x: Self & IteratorChannel[T]) {
      
      inline def setIterator(value: AsyncIterator[T, Any, Unit]): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
      
      inline def setWriter(value: IteratorChannelWriter[T]): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    }
  }
  
  trait IteratorChannelWriter[T] extends StObject {
    
    def end(): js.Promise[Unit]
    
    def write(chunk: T): js.Promise[Unit]
  }
  object IteratorChannelWriter {
    
    inline def apply[T](end: CallbackTo[js.Promise[Unit]], write: T => js.Promise[Unit]): IteratorChannelWriter[T] = {
      val __obj = js.Dynamic.literal(end = end.toJsFn, write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[IteratorChannelWriter[T]]
    }
    
    extension [Self <: IteratorChannelWriter[?], T](x: Self & IteratorChannelWriter[T]) {
      
      inline def setEnd(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setWrite(value: T => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
