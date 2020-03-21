package typingsJapgolly.textEncoding.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoderStatic
  extends Instantiable0[typingsJapgolly.textEncoding.TextEncoder]
     with Instantiable1[/* utfLabel */ String, typingsJapgolly.textEncoding.TextEncoder]
     with Instantiable2[
      /* utfLabel */ String, 
      /* options */ TextEncoderOptions, 
      typingsJapgolly.textEncoding.TextEncoder
    ] {
  def apply(): typingsJapgolly.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String): typingsJapgolly.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String, options: TextEncoderOptions): typingsJapgolly.textEncoding.TextEncoder = js.native
}

