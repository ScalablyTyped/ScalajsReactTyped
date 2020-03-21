package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.FieldInstance
import typingsJapgolly.expressValidator.baseMod.Location
import typingsJapgolly.expressValidator.baseMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/select-fields", JSImport.Namespace)
@js.native
object selectFieldsMod extends js.Object {
  val selectFields: SelectFields_ = js.native
  type SelectFields_ = js.Function3[
    /* req */ Request, 
    /* fields */ js.Array[String], 
    /* locations */ js.Array[Location], 
    js.Array[FieldInstance]
  ]
}

