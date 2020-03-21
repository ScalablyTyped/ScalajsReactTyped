package typingsJapgolly.mendixmodelsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transportationMod {
  type IResponseCallback[T] = js.Function2[
    /* data */ T, 
    /* response */ typingsJapgolly.mendixmodelsdk.transportationMod.IResponse, 
    scala.Unit
  ]
}
