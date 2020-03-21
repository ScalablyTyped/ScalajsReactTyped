package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.universal
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.desktop
*/
trait ApplicationType extends js.Object

object ApplicationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop: typingsJapgolly.microsoftGraph.microsoftGraphStrings.desktop = this.cast("desktop")
  @scala.inline
  def universal: typingsJapgolly.microsoftGraph.microsoftGraphStrings.universal = this.cast("universal")
}

