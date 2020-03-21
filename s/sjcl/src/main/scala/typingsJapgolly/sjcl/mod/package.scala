package typingsJapgolly.sjcl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // ________________________________________________________________________
  type BitArray_ = js.Array[scala.Double]
  type SjclConvenienceDecryptor = js.Function4[
    /* password */ typingsJapgolly.sjcl.mod.SjclElGamalSecretKey | typingsJapgolly.sjcl.mod.BitArray_ | java.lang.String, 
    /* ciphertext */ typingsJapgolly.sjcl.mod.SjclCipherEncrypted | java.lang.String, 
    /* params */ js.UndefOr[typingsJapgolly.sjcl.mod.SjclCipherDecryptParams], 
    /* rp */ js.UndefOr[typingsJapgolly.sjcl.mod.SjclCipherDecrypted], 
    java.lang.String
  ]
  type SjclConvenienceEncryptor = js.Function4[
    /* password */ typingsJapgolly.sjcl.mod.SjclElGamalPublicKey | typingsJapgolly.sjcl.mod.BitArray_ | java.lang.String, 
    /* plaintext */ java.lang.String, 
    /* params */ js.UndefOr[typingsJapgolly.sjcl.mod.SjclCipherEncryptParams], 
    /* rp */ js.UndefOr[typingsJapgolly.sjcl.mod.SjclCipherEncrypted], 
    typingsJapgolly.sjcl.mod.SjclCipherEncrypted
  ]
  type SjclKeysGenerator[P /* <: typingsJapgolly.sjcl.mod.SjclECCPublicKey */, S /* <: typingsJapgolly.sjcl.mod.SjclECCSecretKey */] = js.Function3[
    /* curve */ typingsJapgolly.sjcl.mod.SjclEllipticalCurve | scala.Double, 
    /* paranoia */ scala.Double, 
    /* sec */ js.UndefOr[typingsJapgolly.sjcl.mod.BigNumber], 
    typingsJapgolly.sjcl.mod.SjclKeyPair[P, S]
  ]
}
