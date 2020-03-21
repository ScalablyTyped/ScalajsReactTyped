package typingsJapgolly.textEncoding.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.textEncoding.TextDecoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoding.TextDecoder")
@js.native
class TextDecoder ()
  extends typingsJapgolly.textEncoding.TextDecoder {
  def this(label: String) = this()
  def this(label: String, options: TextDecoderOptions) = this()
}

@JSGlobal("TextEncoding.TextDecoder")
@js.native
object TextDecoder
  extends Instantiable0[typingsJapgolly.textEncoding.TextDecoder]
     with Instantiable1[/* label */ String, typingsJapgolly.textEncoding.TextDecoder]
     with Instantiable2[
      /* label */ String, 
      /* options */ TextDecoderOptions, 
      typingsJapgolly.textEncoding.TextDecoder
    ] {
  var encoding: String = js.native
  def apply(): typingsJapgolly.textEncoding.TextDecoder = js.native
  def apply(label: String): typingsJapgolly.textEncoding.TextDecoder = js.native
  def apply(label: String, options: TextDecoderOptions): typingsJapgolly.textEncoding.TextDecoder = js.native
}

