package typingsJapgolly.xadesjs.objectIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURI
  - typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURN
*/
trait IdentifierQualifier extends js.Object

object IdentifierQualifier {
  @scala.inline
  def OIDAsURI: typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURI = this.cast("OIDAsURI")
  @scala.inline
  def OIDAsURN: typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURN = this.cast("OIDAsURN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

