package typingsJapgolly.saml20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ParseCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* profile */ typingsJapgolly.saml20.mod.Profile, 
    /* version */ java.lang.String, 
    scala.Unit
  ]
}
