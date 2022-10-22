package typingsJapgolly.ethersprojectBase64

import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(textData: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(textData.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
