package typingsJapgolly.browserfs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.bufferMod.SlowBuffer
import typingsJapgolly.node.bufferMod.TranscodeEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbuffer extends js.Object {
  var Buffer: (Instantiable1[/* str */ String, typingsJapgolly.node.bufferMod.Buffer]) with TypeofBuffer_
  val INSPECT_MAX_BYTES: Double
  var SlowBuffer: (Instantiable1[/* size */ Double, typingsJapgolly.node.bufferMod.SlowBuffer]) with AnonInstantiable
  val constants: AnonMAXLENGTH
  val kMaxLength: Double
  val kStringMaxLength: Double
  def transcode(
    source: scala.scalajs.js.typedarray.Uint8Array,
    fromEnc: TranscodeEncoding,
    toEnc: TranscodeEncoding
  ): Buffer
}

object Typeofbuffer {
  @scala.inline
  def apply(
    Buffer: (Instantiable1[/* str */ String, typingsJapgolly.node.bufferMod.Buffer]) with TypeofBuffer_,
    INSPECT_MAX_BYTES: Double,
    SlowBuffer: (Instantiable1[/* size */ Double, SlowBuffer]) with AnonInstantiable,
    constants: AnonMAXLENGTH,
    kMaxLength: Double,
    kStringMaxLength: Double,
    transcode: (scala.scalajs.js.typedarray.Uint8Array, TranscodeEncoding, TranscodeEncoding) => CallbackTo[Buffer]
  ): Typeofbuffer = {
    val __obj = js.Dynamic.literal(Buffer = Buffer.asInstanceOf[js.Any], INSPECT_MAX_BYTES = INSPECT_MAX_BYTES.asInstanceOf[js.Any], SlowBuffer = SlowBuffer.asInstanceOf[js.Any], constants = constants.asInstanceOf[js.Any], kMaxLength = kMaxLength.asInstanceOf[js.Any], kStringMaxLength = kStringMaxLength.asInstanceOf[js.Any])
    __obj.updateDynamic("transcode")(js.Any.fromFunction3((t0: scala.scalajs.js.typedarray.Uint8Array, t1: typingsJapgolly.node.bufferMod.TranscodeEncoding, t2: typingsJapgolly.node.bufferMod.TranscodeEncoding) => transcode(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeofbuffer]
  }
}

