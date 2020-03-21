package typingsJapgolly.ajv

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.ajv.mod.AjvErrors.MissingRefError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMissingRefError
  extends Instantiable2[/* baseId */ String, /* ref */ String, MissingRefError]
     with Instantiable3[/* baseId */ String, /* ref */ String, /* message */ String, MissingRefError] {
  def message(baseId: String, ref: String): String = js.native
}

