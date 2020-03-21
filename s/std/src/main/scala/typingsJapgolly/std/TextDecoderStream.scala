package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderStream
  extends GenericTransformStream
     with TextDecoderCommon {
  @JSName("readable")
  val readable_TextDecoderStream: org.scalajs.dom.experimental.ReadableStream[java.lang.String]
  @JSName("writable")
  val writable_TextDecoderStream: WritableStream[BufferSource]
}

@JSGlobal("TextDecoderStream")
@js.native
object TextDecoderStream
  extends Instantiable0[TextDecoderStream]
     with Instantiable1[/* label */ java.lang.String, TextDecoderStream]
     with Instantiable2[/* label */ java.lang.String, /* options */ TextDecoderOptions, TextDecoderStream]

