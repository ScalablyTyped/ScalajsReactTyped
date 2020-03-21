package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hashJs {
  type HmacConstructor = js.Function3[
    /* hash */ typingsJapgolly.hashJs.BlockHash[js.Any], 
    /* key */ js.Any, 
    /* enc */ js.UndefOr[typingsJapgolly.hashJs.hashJsStrings.hex], 
    typingsJapgolly.hashJs.Hmac
  ]
  type Ripemd160Constructor = js.Function0[typingsJapgolly.hashJs.Ripemd160]
  type Sha1Constructor = js.Function0[typingsJapgolly.hashJs.Sha1]
  type Sha224Constructor = js.Function0[typingsJapgolly.hashJs.Sha224]
  type Sha256Constructor = js.Function0[typingsJapgolly.hashJs.Sha256]
  type Sha384Constructor = js.Function0[typingsJapgolly.hashJs.Sha384]
  type Sha512Constructor = js.Function0[typingsJapgolly.hashJs.Sha512]
}
