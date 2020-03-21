package typingsJapgolly.bser

import typingsJapgolly.bser.bserBooleans.`false`
import typingsJapgolly.bser.bserBooleans.`true`
import typingsJapgolly.bser.bserNumbers.`0`
import typingsJapgolly.bser.bserNumbers.`1`
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.TypedArray
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodeInt64.mod.^
import typingsJapgolly.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Accumulator () extends js.Object {
    def this(initsize: Double) = this()
    var buf: Buffer = js.native
    var readOffset: Double = js.native
    var writeOffset: Double = js.native
    def append(buf: InputWrapper): Unit = js.native
    def assertReadableSize(size: Double): Unit = js.native
    def peekDouble(): Double = js.native
    def peekInt(size: Double): IntWrapper = js.native
    def peekString(size: Double): String = js.native
    def readAdvance(size: Double): Unit = js.native
    def readAvail(): Double = js.native
    def readDouble(): Double = js.native
    // replace "IntWrapper" with "number"?
    def readInt(bytes: Double): IntWrapper = js.native
    def readString(size: Double): String = js.native
    def reserve(size: Double): Unit = js.native
    def writeAvail(): Double = js.native
    def writeByte(value: Double): Unit = js.native
    def writeDouble(value: Double): Unit = js.native
    def writeInt(value: Double, size: Double): Unit = js.native
  }
  
  @js.native
  class BunserBuf () extends EventEmitter {
    var buf: Accumulator = js.native
    // replace "IntWrapper" with "number"?
    var pduLen: js.UndefOr[`false` | IntWrapper] = js.native
    var state: `0` | `1` = js.native
    def append(buf: InputWrapper): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
    @JSName("append")
    def append_false(buf: InputWrapper, synchronous: `false`): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
    @JSName("append")
    def append_true(buf: InputWrapper, synchronous: `true`): Unit = js.native
    def decodeAny(): AnyWrapper | js.Array[AnyWrapper] = js.native
    def decodeArray(): js.Array[AnyWrapper] = js.native
    // replace "IntWrapper" with "number"?
    def decodeInt(): `false` | IntWrapper = js.native
    def decodeInt(relaxSizeAsserts: Boolean): `false` | IntWrapper = js.native
    def decodeObject(): js.Object = js.native
    def decodeString(): String = js.native
    def decodeTemplate(): js.Array[AnyWrapper] = js.native
    def expectCode(expected: Double): Unit = js.native
    def process(): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
    def processLater(): Unit = js.native
    @JSName("process")
    def process_false(synchronous: `false`): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
    @JSName("process")
    def process_true(synchronous: `true`): Unit = js.native
    def raise(reason: String): Unit = js.native
  }
  
  def dumpToBuffer(`val`: js.Any): Buffer = js.native
  def loadFromBuffer(input: InputWrapper): AnyWrapper | js.Array[AnyWrapper] = js.native
  type AnyWrapper = Boolean | IntWrapper | Null | String | js.Object
  type InputWrapper = Buffer | String | TypedArray | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer
  type IntWrapper = Double | ^ 
}

