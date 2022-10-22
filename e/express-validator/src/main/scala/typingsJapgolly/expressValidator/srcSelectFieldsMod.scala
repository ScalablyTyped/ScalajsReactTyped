package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.srcBaseMod.FieldInstance
import typingsJapgolly.expressValidator.srcBaseMod.Location
import typingsJapgolly.expressValidator.srcBaseMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSelectFieldsMod {
  
  @JSImport("express-validator/src/select-fields", "selectFields")
  @js.native
  val selectFields: SelectFields_ = js.native
  
  type SelectFields_ = js.Function3[
    /* req */ Request, 
    /* fields */ js.Array[String], 
    /* locations */ js.Array[Location], 
    js.Array[FieldInstance]
  ]
}
