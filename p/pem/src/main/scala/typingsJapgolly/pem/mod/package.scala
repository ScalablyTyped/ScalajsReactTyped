package typingsJapgolly.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* error */ js.Any, /* result */ T, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pem.pemStrings.md5
    - typingsJapgolly.pem.pemStrings.sha1
    - typingsJapgolly.pem.pemStrings.sha256
    - java.lang.String
  */
  type HashFunction = typingsJapgolly.pem.mod._HashFunction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pem.pemStrings.aes128
    - typingsJapgolly.pem.pemStrings.aes192
    - typingsJapgolly.pem.pemStrings.aes256
    - typingsJapgolly.pem.pemStrings.camellia128
    - typingsJapgolly.pem.pemStrings.camellia192
    - typingsJapgolly.pem.pemStrings.camellia256
    - typingsJapgolly.pem.pemStrings.des
    - typingsJapgolly.pem.pemStrings.des3
    - typingsJapgolly.pem.pemStrings.idea
    - java.lang.String
  */
  type PrivateKeyCipher = typingsJapgolly.pem.mod._PrivateKeyCipher | java.lang.String
}
