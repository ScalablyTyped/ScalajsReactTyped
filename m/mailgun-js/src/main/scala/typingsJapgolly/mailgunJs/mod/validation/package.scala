package typingsJapgolly.mailgunJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validation {
  type ValidationCallback = js.Function2[
    /* error */ typingsJapgolly.mailgunJs.mod.Error, 
    /* body */ typingsJapgolly.mailgunJs.mod.validation.ValidateResponse, 
    scala.Unit
  ]
}
