package typingsJapgolly.jqueryDrawer

import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.close
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.destroy
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.drawerDotclosed
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.drawerDotopened
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.open
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def drawer(): JQuery = js.native
  def drawer(method: open | close | toggle | destroy): JQuery = js.native
  def drawer(options: JQueryDrawerOptions): JQuery = js.native
  
  def on(event: drawerDotopened | drawerDotclosed, handler: js.Function0[Unit]): JQuery = js.native
}
