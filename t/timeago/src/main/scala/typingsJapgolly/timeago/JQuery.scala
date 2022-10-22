package typingsJapgolly.timeago

import typingsJapgolly.timeago.timeagoStrings.dispose
import typingsJapgolly.timeago.timeagoStrings.init
import typingsJapgolly.timeago.timeagoStrings.update
import typingsJapgolly.timeago.timeagoStrings.updateFromDOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def timeago(): this.type = js.native
  def timeago(action: init | updateFromDOM | dispose): this.type = js.native
  @JSName("timeago")
  def timeago_update(action: update, timestamp: String): this.type = js.native
  @JSName("timeago")
  def timeago_update(action: update, timestamp: js.Date): this.type = js.native
}
