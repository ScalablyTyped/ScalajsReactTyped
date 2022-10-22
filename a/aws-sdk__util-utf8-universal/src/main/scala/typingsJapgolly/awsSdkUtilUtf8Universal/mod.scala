package typingsJapgolly.awsSdkUtilUtf8Universal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-utf8-universal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUtf8(input: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUtf8")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toUtf8(input: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
