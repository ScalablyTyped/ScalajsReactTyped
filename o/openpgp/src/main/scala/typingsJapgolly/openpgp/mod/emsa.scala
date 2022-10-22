package typingsJapgolly.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emsa {
  
  @JSImport("openpgp", "emsa")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a EMSA-PKCS1-v1_5 padded message
    * @see
    * @param algo Hash algorithm type used
    * @param hashed message to be encoded
    * @param emLen intended length in octets of the encoded message
    * @returns encoded message
    */
  inline def encode(algo: Integer, hashed: js.typedarray.Uint8Array, emLen: Integer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(algo.asInstanceOf[js.Any], hashed.asInstanceOf[js.Any], emLen.asInstanceOf[js.Any])).asInstanceOf[String]
}
