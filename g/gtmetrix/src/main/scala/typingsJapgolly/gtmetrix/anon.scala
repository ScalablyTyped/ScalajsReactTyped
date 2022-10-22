package typingsJapgolly.gtmetrix

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gtmetrix.gtmetrixInts.`-1`
import typingsJapgolly.gtmetrix.gtmetrixInts.`0`
import typingsJapgolly.gtmetrix.gtmetrixInts.`1`
import typingsJapgolly.node.anon.Data
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.ArrayBufferLike
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<gtmetrix.gtmetrix.AccountStatus> */
  trait ReadonlyAccountStatus extends StObject {
    
    val api_credits: Double
    
    val api_refill: Double
  }
  object ReadonlyAccountStatus {
    
    inline def apply(api_credits: Double, api_refill: Double): ReadonlyAccountStatus = {
      val __obj = js.Dynamic.literal(api_credits = api_credits.asInstanceOf[js.Any], api_refill = api_refill.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyAccountStatus]
    }
    
    extension [Self <: ReadonlyAccountStatus](x: Self) {
      
      inline def setApi_credits(value: Double): Self = StObject.set(x, "api_credits", value.asInstanceOf[js.Any])
      
      inline def setApi_refill(value: Double): Self = StObject.set(x, "api_refill", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<gtmetrix.gtmetrix.BrowserFeatures> */
  trait ReadonlyBrowserFeatures extends StObject {
    
    val browser: String
    
    val device: js.UndefOr[String] = js.undefined
    
    val features: StringDictionary[Boolean]
    
    val id: Double
    
    val name: String
    
    val platform: String
  }
  object ReadonlyBrowserFeatures {
    
    inline def apply(browser: String, features: StringDictionary[Boolean], id: Double, name: String, platform: String): ReadonlyBrowserFeatures = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyBrowserFeatures]
    }
    
    extension [Self <: ReadonlyBrowserFeatures](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setFeatures(value: StringDictionary[Boolean]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<node.buffer.<global>.Buffer> */
  trait ReadonlyBuffer extends StObject {
    
    val BYTES_PER_ELEMENT: Double
    
    def at(index: Double): js.UndefOr[Double]
    
    val buffer: ArrayBufferLike
    
    val byteLength: Double
    
    val byteOffset: Double
    
    def compare(target: js.typedarray.Uint8Array): `-1` | `0` | `1`
    
    def copy(target: js.typedarray.Uint8Array): Double
    
    def copyWithin(target: Double, start: Double): this.type
    
    def entries(): IterableIterator[js.Tuple2[Double, Double]]
    
    def equals(otherBuffer: js.typedarray.Uint8Array): Boolean
    
    def every(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Boolean
    
    def fill(value: String): this.type
    
    def filter(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): js.typedarray.Uint8Array
    
    def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): js.UndefOr[Double]
    
    def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): Double
    
    def forEach(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit]): Unit
    
    def includes(value: String): Boolean
    
    def indexOf(value: String): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(value: String): Double
    
    val length: Double
    
    def map(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double]): js.typedarray.Uint8Array
    
    def readBigInt64BE(): js.BigInt
    
    def readBigInt64LE(): js.BigInt
    
    def readBigUInt64BE(): js.BigInt
    
    def readBigUInt64LE(): js.BigInt
    
    def readBigUint64BE(): js.BigInt
    
    def readBigUint64LE(): js.BigInt
    
    def readDoubleBE(): Double
    
    def readDoubleLE(): Double
    
    def readFloatBE(): Double
    
    def readFloatLE(): Double
    
    def readInt16BE(): Double
    
    def readInt16LE(): Double
    
    def readInt32BE(): Double
    
    def readInt32LE(): Double
    
    def readInt8(): Double
    
    def readIntBE(offset: Double, byteLength: Double): Double
    
    def readIntLE(offset: Double, byteLength: Double): Double
    
    def readUInt16BE(): Double
    
    def readUInt16LE(): Double
    
    def readUInt32BE(): Double
    
    def readUInt32LE(): Double
    
    def readUInt8(): Double
    
    def readUIntBE(offset: Double, byteLength: Double): Double
    
    def readUIntLE(offset: Double, byteLength: Double): Double
    
    def readUint16BE(): Double
    
    def readUint16LE(): Double
    
    def readUint32BE(): Double
    
    def readUint32LE(): Double
    
    def readUint8(): Double
    
    def readUintBE(offset: Double, byteLength: Double): Double
    
    def readUintLE(offset: Double, byteLength: Double): Double
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ this.type, 
          Double
        ]
    ): Double
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ this.type, 
          Double
        ]
    ): Double
    
    def reverse(): this.type
    
    def set(array: ArrayLike[Double]): Unit
    
    def slice(): Buffer
    
    def some(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Boolean
    
    def sort(): this.type
    
    def subarray(): Buffer
    
    def swap16(): Buffer
    
    def swap32(): Buffer
    
    def swap64(): Buffer
    
    def toJSON(): Data
    
    def values(): IterableIterator[Double]
    
    def write(string: String): Double
    
    def writeBigInt64BE(value: js.BigInt): Double
    
    def writeBigInt64LE(value: js.BigInt): Double
    
    def writeBigUInt64BE(value: js.BigInt): Double
    
    def writeBigUInt64LE(value: js.BigInt): Double
    
    def writeBigUint64BE(value: js.BigInt): Double
    
    def writeBigUint64LE(value: js.BigInt): Double
    
    def writeDoubleBE(value: Double): Double
    
    def writeDoubleLE(value: Double): Double
    
    def writeFloatBE(value: Double): Double
    
    def writeFloatLE(value: Double): Double
    
    def writeInt16BE(value: Double): Double
    
    def writeInt16LE(value: Double): Double
    
    def writeInt32BE(value: Double): Double
    
    def writeInt32LE(value: Double): Double
    
    def writeInt8(value: Double): Double
    
    def writeIntBE(value: Double, offset: Double, byteLength: Double): Double
    
    def writeIntLE(value: Double, offset: Double, byteLength: Double): Double
    
    def writeUInt16BE(value: Double): Double
    
    def writeUInt16LE(value: Double): Double
    
    def writeUInt32BE(value: Double): Double
    
    def writeUInt32LE(value: Double): Double
    
    def writeUInt8(value: Double): Double
    
    def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double
    
    def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double
    
    def writeUint16BE(value: Double): Double
    
    def writeUint16LE(value: Double): Double
    
    def writeUint32BE(value: Double): Double
    
    def writeUint32LE(value: Double): Double
    
    def writeUint8(value: Double): Double
    
    def writeUintBE(value: Double, offset: Double, byteLength: Double): Double
    
    def writeUintLE(value: Double, offset: Double, byteLength: Double): Double
  }
  object ReadonlyBuffer {
    
    inline def apply(
      BYTES_PER_ELEMENT: Double,
      at: Double => js.UndefOr[Double],
      buffer: ArrayBufferLike,
      byteLength: Double,
      byteOffset: Double,
      compare: js.typedarray.Uint8Array => `-1` | `0` | `1`,
      copy: js.typedarray.Uint8Array => Double,
      copyWithin: (Double, Double) => ReadonlyBuffer,
      entries: CallbackTo[IterableIterator[js.Tuple2[Double, Double]]],
      equals_ : js.typedarray.Uint8Array => Boolean,
      every: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Any] => Boolean,
      fill: String => ReadonlyBuffer,
      filter: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Any] => js.typedarray.Uint8Array,
      find: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => js.UndefOr[Double],
      findIndex: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => Double,
      forEach: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Unit] => Callback,
      includes: String => Boolean,
      indexOf: String => Double,
      join: CallbackTo[String],
      keys: CallbackTo[IterableIterator[Double]],
      lastIndexOf: String => Double,
      length: Double,
      map: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Double] => js.typedarray.Uint8Array,
      readBigInt64BE: CallbackTo[js.BigInt],
      readBigInt64LE: CallbackTo[js.BigInt],
      readBigUInt64BE: CallbackTo[js.BigInt],
      readBigUInt64LE: CallbackTo[js.BigInt],
      readBigUint64BE: CallbackTo[js.BigInt],
      readBigUint64LE: CallbackTo[js.BigInt],
      readDoubleBE: CallbackTo[Double],
      readDoubleLE: CallbackTo[Double],
      readFloatBE: CallbackTo[Double],
      readFloatLE: CallbackTo[Double],
      readInt16BE: CallbackTo[Double],
      readInt16LE: CallbackTo[Double],
      readInt32BE: CallbackTo[Double],
      readInt32LE: CallbackTo[Double],
      readInt8: CallbackTo[Double],
      readIntBE: (Double, Double) => Double,
      readIntLE: (Double, Double) => Double,
      readUInt16BE: CallbackTo[Double],
      readUInt16LE: CallbackTo[Double],
      readUInt32BE: CallbackTo[Double],
      readUInt32LE: CallbackTo[Double],
      readUInt8: CallbackTo[Double],
      readUIntBE: (Double, Double) => Double,
      readUIntLE: (Double, Double) => Double,
      readUint16BE: CallbackTo[Double],
      readUint16LE: CallbackTo[Double],
      readUint32BE: CallbackTo[Double],
      readUint32LE: CallbackTo[Double],
      readUint8: CallbackTo[Double],
      readUintBE: (Double, Double) => Double,
      readUintLE: (Double, Double) => Double,
      reduce: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyBuffer, 
          Double
        ] => Double,
      reduceRight: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyBuffer, 
          Double
        ] => Double,
      reverse: CallbackTo[ReadonlyBuffer],
      set: ArrayLike[Double] => Callback,
      slice: CallbackTo[Buffer],
      some: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Any] => Boolean,
      sort: CallbackTo[ReadonlyBuffer],
      subarray: CallbackTo[Buffer],
      swap16: CallbackTo[Buffer],
      swap32: CallbackTo[Buffer],
      swap64: CallbackTo[Buffer],
      toJSON: CallbackTo[Data],
      values: CallbackTo[IterableIterator[Double]],
      write: String => Double,
      writeBigInt64BE: js.BigInt => Double,
      writeBigInt64LE: js.BigInt => Double,
      writeBigUInt64BE: js.BigInt => Double,
      writeBigUInt64LE: js.BigInt => Double,
      writeBigUint64BE: js.BigInt => Double,
      writeBigUint64LE: js.BigInt => Double,
      writeDoubleBE: Double => Double,
      writeDoubleLE: Double => Double,
      writeFloatBE: Double => Double,
      writeFloatLE: Double => Double,
      writeInt16BE: Double => Double,
      writeInt16LE: Double => Double,
      writeInt32BE: Double => Double,
      writeInt32LE: Double => Double,
      writeInt8: Double => Double,
      writeIntBE: (Double, Double, Double) => Double,
      writeIntLE: (Double, Double, Double) => Double,
      writeUInt16BE: Double => Double,
      writeUInt16LE: Double => Double,
      writeUInt32BE: Double => Double,
      writeUInt32LE: Double => Double,
      writeUInt8: Double => Double,
      writeUIntBE: (Double, Double, Double) => Double,
      writeUIntLE: (Double, Double, Double) => Double,
      writeUint16BE: Double => Double,
      writeUint16LE: Double => Double,
      writeUint32BE: Double => Double,
      writeUint32LE: Double => Double,
      writeUint8: Double => Double,
      writeUintBE: (Double, Double, Double) => Double,
      writeUintLE: (Double, Double, Double) => Double
    ): ReadonlyBuffer = {
      val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], at = js.Any.fromFunction1(at), buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction1(copy), copyWithin = js.Any.fromFunction2(copyWithin), entries = entries.toJsFn, every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), forEach = js.Any.fromFunction1((t0: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Unit]) => forEach(t0).runNow()), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = join.toJsFn, keys = keys.toJsFn, lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), readBigInt64BE = readBigInt64BE.toJsFn, readBigInt64LE = readBigInt64LE.toJsFn, readBigUInt64BE = readBigUInt64BE.toJsFn, readBigUInt64LE = readBigUInt64LE.toJsFn, readBigUint64BE = readBigUint64BE.toJsFn, readBigUint64LE = readBigUint64LE.toJsFn, readDoubleBE = readDoubleBE.toJsFn, readDoubleLE = readDoubleLE.toJsFn, readFloatBE = readFloatBE.toJsFn, readFloatLE = readFloatLE.toJsFn, readInt16BE = readInt16BE.toJsFn, readInt16LE = readInt16LE.toJsFn, readInt32BE = readInt32BE.toJsFn, readInt32LE = readInt32LE.toJsFn, readInt8 = readInt8.toJsFn, readIntBE = js.Any.fromFunction2(readIntBE), readIntLE = js.Any.fromFunction2(readIntLE), readUInt16BE = readUInt16BE.toJsFn, readUInt16LE = readUInt16LE.toJsFn, readUInt32BE = readUInt32BE.toJsFn, readUInt32LE = readUInt32LE.toJsFn, readUInt8 = readUInt8.toJsFn, readUIntBE = js.Any.fromFunction2(readUIntBE), readUIntLE = js.Any.fromFunction2(readUIntLE), readUint16BE = readUint16BE.toJsFn, readUint16LE = readUint16LE.toJsFn, readUint32BE = readUint32BE.toJsFn, readUint32LE = readUint32LE.toJsFn, readUint8 = readUint8.toJsFn, readUintBE = js.Any.fromFunction2(readUintBE), readUintLE = js.Any.fromFunction2(readUintLE), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = reverse.toJsFn, set = js.Any.fromFunction1((t0: ArrayLike[Double]) => set(t0).runNow()), slice = slice.toJsFn, some = js.Any.fromFunction1(some), sort = sort.toJsFn, subarray = subarray.toJsFn, swap16 = swap16.toJsFn, swap32 = swap32.toJsFn, swap64 = swap64.toJsFn, toJSON = toJSON.toJsFn, values = values.toJsFn, write = js.Any.fromFunction1(write), writeBigInt64BE = js.Any.fromFunction1(writeBigInt64BE), writeBigInt64LE = js.Any.fromFunction1(writeBigInt64LE), writeBigUInt64BE = js.Any.fromFunction1(writeBigUInt64BE), writeBigUInt64LE = js.Any.fromFunction1(writeBigUInt64LE), writeBigUint64BE = js.Any.fromFunction1(writeBigUint64BE), writeBigUint64LE = js.Any.fromFunction1(writeBigUint64LE), writeDoubleBE = js.Any.fromFunction1(writeDoubleBE), writeDoubleLE = js.Any.fromFunction1(writeDoubleLE), writeFloatBE = js.Any.fromFunction1(writeFloatBE), writeFloatLE = js.Any.fromFunction1(writeFloatLE), writeInt16BE = js.Any.fromFunction1(writeInt16BE), writeInt16LE = js.Any.fromFunction1(writeInt16LE), writeInt32BE = js.Any.fromFunction1(writeInt32BE), writeInt32LE = js.Any.fromFunction1(writeInt32LE), writeInt8 = js.Any.fromFunction1(writeInt8), writeIntBE = js.Any.fromFunction3(writeIntBE), writeIntLE = js.Any.fromFunction3(writeIntLE), writeUInt16BE = js.Any.fromFunction1(writeUInt16BE), writeUInt16LE = js.Any.fromFunction1(writeUInt16LE), writeUInt32BE = js.Any.fromFunction1(writeUInt32BE), writeUInt32LE = js.Any.fromFunction1(writeUInt32LE), writeUInt8 = js.Any.fromFunction1(writeUInt8), writeUIntBE = js.Any.fromFunction3(writeUIntBE), writeUIntLE = js.Any.fromFunction3(writeUIntLE), writeUint16BE = js.Any.fromFunction1(writeUint16BE), writeUint16LE = js.Any.fromFunction1(writeUint16LE), writeUint32BE = js.Any.fromFunction1(writeUint32BE), writeUint32LE = js.Any.fromFunction1(writeUint32LE), writeUint8 = js.Any.fromFunction1(writeUint8), writeUintBE = js.Any.fromFunction3(writeUintBE), writeUintLE = js.Any.fromFunction3(writeUintLE))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[ReadonlyBuffer]
    }
    
    extension [Self <: ReadonlyBuffer](x: Self) {
      
      inline def setAt(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setBYTES_PER_ELEMENT(value: Double): Self = StObject.set(x, "BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: ArrayBufferLike): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
      
      inline def setCompare(value: js.typedarray.Uint8Array => `-1` | `0` | `1`): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setCopy(value: js.typedarray.Uint8Array => Double): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setCopyWithin(value: (Double, Double) => ReadonlyBuffer): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setEquals_(value: js.typedarray.Uint8Array => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setEvery(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Any] => Boolean): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFill(value: String => ReadonlyBuffer): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Any] => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => js.UndefOr[Double]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => Double): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Unit]) => value(t0).runNow()))
      
      inline def setIncludes(value: String => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: String => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: CallbackTo[String]): Self = StObject.set(x, "join", value.toJsFn)
      
      inline def setKeys(value: CallbackTo[IterableIterator[Double]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setLastIndexOf(value: String => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Double] => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setReadBigInt64BE(value: CallbackTo[js.BigInt]): Self = StObject.set(x, "readBigInt64BE", value.toJsFn)
      
      inline def setReadBigInt64LE(value: CallbackTo[js.BigInt]): Self = StObject.set(x, "readBigInt64LE", value.toJsFn)
      
      inline def setReadBigUInt64BE(value: CallbackTo[js.BigInt]): Self = StObject.set(x, "readBigUInt64BE", value.toJsFn)
      
      inline def setReadBigUInt64LE(value: CallbackTo[js.BigInt]): Self = StObject.set(x, "readBigUInt64LE", value.toJsFn)
      
      inline def setReadDoubleBE(value: CallbackTo[Double]): Self = StObject.set(x, "readDoubleBE", value.toJsFn)
      
      inline def setReadDoubleLE(value: CallbackTo[Double]): Self = StObject.set(x, "readDoubleLE", value.toJsFn)
      
      inline def setReadFloatBE(value: CallbackTo[Double]): Self = StObject.set(x, "readFloatBE", value.toJsFn)
      
      inline def setReadFloatLE(value: CallbackTo[Double]): Self = StObject.set(x, "readFloatLE", value.toJsFn)
      
      inline def setReadInt16BE(value: CallbackTo[Double]): Self = StObject.set(x, "readInt16BE", value.toJsFn)
      
      inline def setReadInt16LE(value: CallbackTo[Double]): Self = StObject.set(x, "readInt16LE", value.toJsFn)
      
      inline def setReadInt32BE(value: CallbackTo[Double]): Self = StObject.set(x, "readInt32BE", value.toJsFn)
      
      inline def setReadInt32LE(value: CallbackTo[Double]): Self = StObject.set(x, "readInt32LE", value.toJsFn)
      
      inline def setReadInt8(value: CallbackTo[Double]): Self = StObject.set(x, "readInt8", value.toJsFn)
      
      inline def setReadIntBE(value: (Double, Double) => Double): Self = StObject.set(x, "readIntBE", js.Any.fromFunction2(value))
      
      inline def setReadIntLE(value: (Double, Double) => Double): Self = StObject.set(x, "readIntLE", js.Any.fromFunction2(value))
      
      inline def setReadUInt16BE(value: CallbackTo[Double]): Self = StObject.set(x, "readUInt16BE", value.toJsFn)
      
      inline def setReadUInt16LE(value: CallbackTo[Double]): Self = StObject.set(x, "readUInt16LE", value.toJsFn)
      
      inline def setReadUInt32BE(value: CallbackTo[Double]): Self = StObject.set(x, "readUInt32BE", value.toJsFn)
      
      inline def setReadUInt32LE(value: CallbackTo[Double]): Self = StObject.set(x, "readUInt32LE", value.toJsFn)
      
      inline def setReadUInt8(value: CallbackTo[Double]): Self = StObject.set(x, "readUInt8", value.toJsFn)
      
      inline def setReadUIntBE(value: (Double, Double) => Double): Self = StObject.set(x, "readUIntBE", js.Any.fromFunction2(value))
      
      inline def setReadUIntLE(value: (Double, Double) => Double): Self = StObject.set(x, "readUIntLE", js.Any.fromFunction2(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              ReadonlyBuffer, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              ReadonlyBuffer, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReverse(value: CallbackTo[ReadonlyBuffer]): Self = StObject.set(x, "reverse", value.toJsFn)
      
      inline def setSet(value: ArrayLike[Double] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: ArrayLike[Double]) => value(t0).runNow()))
      
      inline def setSlice(value: CallbackTo[Buffer]): Self = StObject.set(x, "slice", value.toJsFn)
      
      inline def setSome(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Any] => Boolean): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSort(value: CallbackTo[ReadonlyBuffer]): Self = StObject.set(x, "sort", value.toJsFn)
      
      inline def setSubarray(value: CallbackTo[Buffer]): Self = StObject.set(x, "subarray", value.toJsFn)
      
      inline def setSwap16(value: CallbackTo[Buffer]): Self = StObject.set(x, "swap16", value.toJsFn)
      
      inline def setSwap32(value: CallbackTo[Buffer]): Self = StObject.set(x, "swap32", value.toJsFn)
      
      inline def setSwap64(value: CallbackTo[Buffer]): Self = StObject.set(x, "swap64", value.toJsFn)
      
      inline def setToJSON(value: CallbackTo[Data]): Self = StObject.set(x, "toJSON", value.toJsFn)
      
      inline def setValues(value: CallbackTo[IterableIterator[Double]]): Self = StObject.set(x, "values", value.toJsFn)
      
      inline def setWrite(value: String => Double): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setWriteBigInt64BE(value: js.BigInt => Double): Self = StObject.set(x, "writeBigInt64BE", js.Any.fromFunction1(value))
      
      inline def setWriteBigInt64LE(value: js.BigInt => Double): Self = StObject.set(x, "writeBigInt64LE", js.Any.fromFunction1(value))
      
      inline def setWriteBigUInt64BE(value: js.BigInt => Double): Self = StObject.set(x, "writeBigUInt64BE", js.Any.fromFunction1(value))
      
      inline def setWriteBigUInt64LE(value: js.BigInt => Double): Self = StObject.set(x, "writeBigUInt64LE", js.Any.fromFunction1(value))
      
      inline def setWriteDoubleBE(value: Double => Double): Self = StObject.set(x, "writeDoubleBE", js.Any.fromFunction1(value))
      
      inline def setWriteDoubleLE(value: Double => Double): Self = StObject.set(x, "writeDoubleLE", js.Any.fromFunction1(value))
      
      inline def setWriteFloatBE(value: Double => Double): Self = StObject.set(x, "writeFloatBE", js.Any.fromFunction1(value))
      
      inline def setWriteFloatLE(value: Double => Double): Self = StObject.set(x, "writeFloatLE", js.Any.fromFunction1(value))
      
      inline def setWriteInt16BE(value: Double => Double): Self = StObject.set(x, "writeInt16BE", js.Any.fromFunction1(value))
      
      inline def setWriteInt16LE(value: Double => Double): Self = StObject.set(x, "writeInt16LE", js.Any.fromFunction1(value))
      
      inline def setWriteInt32BE(value: Double => Double): Self = StObject.set(x, "writeInt32BE", js.Any.fromFunction1(value))
      
      inline def setWriteInt32LE(value: Double => Double): Self = StObject.set(x, "writeInt32LE", js.Any.fromFunction1(value))
      
      inline def setWriteInt8(value: Double => Double): Self = StObject.set(x, "writeInt8", js.Any.fromFunction1(value))
      
      inline def setWriteIntBE(value: (Double, Double, Double) => Double): Self = StObject.set(x, "writeIntBE", js.Any.fromFunction3(value))
      
      inline def setWriteIntLE(value: (Double, Double, Double) => Double): Self = StObject.set(x, "writeIntLE", js.Any.fromFunction3(value))
      
      inline def setWriteUInt16BE(value: Double => Double): Self = StObject.set(x, "writeUInt16BE", js.Any.fromFunction1(value))
      
      inline def setWriteUInt16LE(value: Double => Double): Self = StObject.set(x, "writeUInt16LE", js.Any.fromFunction1(value))
      
      inline def setWriteUInt32BE(value: Double => Double): Self = StObject.set(x, "writeUInt32BE", js.Any.fromFunction1(value))
      
      inline def setWriteUInt32LE(value: Double => Double): Self = StObject.set(x, "writeUInt32LE", js.Any.fromFunction1(value))
      
      inline def setWriteUInt8(value: Double => Double): Self = StObject.set(x, "writeUInt8", js.Any.fromFunction1(value))
      
      inline def setWriteUIntBE(value: (Double, Double, Double) => Double): Self = StObject.set(x, "writeUIntBE", js.Any.fromFunction3(value))
      
      inline def setWriteUIntLE(value: (Double, Double, Double) => Double): Self = StObject.set(x, "writeUIntLE", js.Any.fromFunction3(value))
    }
  }
  
  /* Inlined std.Readonly<gtmetrix.gtmetrix.TestBasicInfo> */
  trait ReadonlyTestBasicInfo extends StObject {
    
    val credits_left: Double
    
    val poll_state_url: String
    
    val test_id: String
  }
  object ReadonlyTestBasicInfo {
    
    inline def apply(credits_left: Double, poll_state_url: String, test_id: String): ReadonlyTestBasicInfo = {
      val __obj = js.Dynamic.literal(credits_left = credits_left.asInstanceOf[js.Any], poll_state_url = poll_state_url.asInstanceOf[js.Any], test_id = test_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyTestBasicInfo]
    }
    
    extension [Self <: ReadonlyTestBasicInfo](x: Self) {
      
      inline def setCredits_left(value: Double): Self = StObject.set(x, "credits_left", value.asInstanceOf[js.Any])
      
      inline def setPoll_state_url(value: String): Self = StObject.set(x, "poll_state_url", value.asInstanceOf[js.Any])
      
      inline def setTest_id(value: String): Self = StObject.set(x, "test_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<gtmetrix.gtmetrix.TestDetails> */
  trait ReadonlyTestDetails extends StObject {
    
    val error: js.UndefOr[String] = js.undefined
    
    val resources: StringDictionary[String]
    
    val results: StringDictionary[Any]
    
    val state: String
  }
  object ReadonlyTestDetails {
    
    inline def apply(resources: StringDictionary[String], results: StringDictionary[Any], state: String): ReadonlyTestDetails = {
      val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyTestDetails]
    }
    
    extension [Self <: ReadonlyTestDetails](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResources(value: StringDictionary[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResults(value: StringDictionary[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
