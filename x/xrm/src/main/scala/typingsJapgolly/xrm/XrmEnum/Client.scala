package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.UnifiedServiceDesk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Client Types for {@link ClientContext.getClient clientContext.getClient()}.
  * @see {@link Xrm.Client}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.Web
  - typingsJapgolly.xrm.xrmStrings.Outlook
  - typingsJapgolly.xrm.xrmStrings.Mobile
  - typingsJapgolly.xrm.xrmStrings.UnifiedServiceDesk
*/
trait Client extends js.Object

object Client {
  @scala.inline
  def Mobile: typingsJapgolly.xrm.xrmStrings.Mobile = this.cast("Mobile")
  @scala.inline
  def Outlook: typingsJapgolly.xrm.xrmStrings.Outlook = this.cast("Outlook")
  @scala.inline
  def USD: UnifiedServiceDesk = this.cast("UnifiedServiceDesk")
  @scala.inline
  def UnifiedServiceDesk: typingsJapgolly.xrm.xrmStrings.UnifiedServiceDesk = this.cast("UnifiedServiceDesk")
  @scala.inline
  def Web: typingsJapgolly.xrm.xrmStrings.Web = this.cast("Web")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

