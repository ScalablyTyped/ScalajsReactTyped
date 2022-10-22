package typingsJapgolly.protonsRuntime

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.protonsRuntime.distSrcCodecMod.Codec
import typingsJapgolly.protonsRuntime.distSrcCodecMod.EncodeOptions
import typingsJapgolly.protonsRuntime.mod.Reader
import typingsJapgolly.protonsRuntime.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCodecsMessageMod {
  
  @JSImport("protons-runtime/dist/src/codecs/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def message[T](
    encode: js.Function3[/* obj */ T, /* writer */ Writer, /* opts */ js.UndefOr[EncodeOptions], Unit],
    decode: js.Function2[/* reader */ Reader, /* length */ js.UndefOr[Double], T]
  ): Codec[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(encode.asInstanceOf[js.Any], decode.asInstanceOf[js.Any])).asInstanceOf[Codec[T]]
  
  @js.native
  trait Factory[A, T]
    extends StObject
       with Instantiable1[/* obj */ A, T]
}
