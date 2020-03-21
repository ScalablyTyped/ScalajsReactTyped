package typingsJapgolly.tableau.tableau

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Error Classes
@JSGlobal("tableau.TableauException")
@js.native
class TableauException () extends Error {
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var tableauSoftwareErrorCode: ErrorCode = js.native
}

