package typingsJapgolly.metismenu

import typingsJapgolly.jquery.JQuery.Event
import typingsJapgolly.metismenu.metismenuStrings.dispose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def metisMenu(): JQuery = js.native
  def metisMenu(options: MetisMenuOptions): JQuery = js.native
  @JSName("metisMenu")
  def metisMenu_dispose(options: dispose): JQuery = js.native
  
  def on(events: MetisMenuEvents, handler: js.Function1[/* eventObject */ Event, Any]): JQuery = js.native
}
