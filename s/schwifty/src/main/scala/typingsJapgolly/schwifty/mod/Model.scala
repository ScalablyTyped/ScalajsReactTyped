package typingsJapgolly.schwifty.mod

import typingsJapgolly.joi.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schwifty", "Model")
@js.native
class Model ()
  extends typingsJapgolly.objection.mod.Model {
  var joiSchema: Schema = js.native
}

/* static members */
@JSImport("schwifty", "Model")
@js.native
object Model extends js.Object {
  def getJoiSchema(): Schema = js.native
  def getJoiSchema(patch: Boolean): Schema = js.native
}

