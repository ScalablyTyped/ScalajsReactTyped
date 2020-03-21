package typingsJapgolly.elliptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BNInput = java.lang.String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Double | typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | js.Array[scala.Double]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.elliptic.mod.ec.Signature
    - typingsJapgolly.elliptic.mod.ec.SignatureOptions
    - typingsJapgolly.std.Uint8Array
    - js.Array[scala.Double]
    - java.lang.String
  */
  type SignatureInput = typingsJapgolly.elliptic.mod._SignatureInput | js.Array[scala.Double] | scala.scalajs.js.typedarray.Uint8Array | java.lang.String
  type ec = typingsJapgolly.elliptic.mod.ec_
  type eddsa = typingsJapgolly.elliptic.mod.eddsa_
}
