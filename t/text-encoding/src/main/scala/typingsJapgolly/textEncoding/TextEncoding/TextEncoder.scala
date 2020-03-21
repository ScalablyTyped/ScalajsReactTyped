package typingsJapgolly.textEncoding.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoding.TextEncoder")
@js.native
class TextEncoder ()
  extends typingsJapgolly.textEncoding.TextEncoder {
  def this(utfLabel: String) = this()
  def this(utfLabel: String, options: TextEncoderOptions) = this()
}

@JSGlobal("TextEncoding.TextEncoder")
@js.native
object TextEncoder
  extends Instantiable0[typingsJapgolly.textEncoding.TextEncoder]
     with Instantiable1[/* utfLabel */ String, typingsJapgolly.textEncoding.TextEncoder]
     with Instantiable2[
      /* utfLabel */ String, 
      /* options */ TextEncoderOptions, 
      typingsJapgolly.textEncoding.TextEncoder
    ] {
  var encoding: String = js.native
  def apply(): typingsJapgolly.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String): typingsJapgolly.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String, options: TextEncoderOptions): typingsJapgolly.textEncoding.TextEncoder = js.native
}

