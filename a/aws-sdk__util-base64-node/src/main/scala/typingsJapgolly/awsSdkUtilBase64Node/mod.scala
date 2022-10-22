package typingsJapgolly.awsSdkUtilBase64Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-base64-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBase64(input: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toBase64(input: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
