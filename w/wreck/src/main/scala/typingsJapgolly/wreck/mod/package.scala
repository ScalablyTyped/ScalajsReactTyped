package typingsJapgolly.wreck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RequestCallback = js.Function2[
    /* uri */ java.lang.String, 
    /* options */ typingsJapgolly.wreck.RequestOptionspayloadany, 
    scala.Unit
  ]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[typingsJapgolly.boom.mod.^[js.Any]], 
    /* details */ typingsJapgolly.wreck.AnonReq, 
    scala.Unit
  ]
}
