package typingsJapgolly.cborg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibJsonEncodeMod {
  
  @JSImport("cborg/types/lib/json/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encode(data: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encode(data: Any, options: typingsJapgolly.cborg.typesInterfaceMod.EncodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  type Bl = typingsJapgolly.cborg.typesLibBlMod.Bl
  
  type EncodeOptions = typingsJapgolly.cborg.typesInterfaceMod.EncodeOptions
  
  type Token = typingsJapgolly.cborg.typesLibTokenMod.Token
}
