package typingsJapgolly.oracleOraclejet.ojdataproviderMod

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.iteration
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.randomAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByOffsetCapability[D] extends js.Object {
  var implementation: iteration | randomAccess
}

object FetchByOffsetCapability {
  @scala.inline
  def apply[D](implementation: iteration | randomAccess): FetchByOffsetCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchByOffsetCapability[D]]
  }
}

