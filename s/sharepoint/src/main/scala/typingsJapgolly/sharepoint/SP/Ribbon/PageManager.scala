package typingsJapgolly.sharepoint.SP.Ribbon

import typingsJapgolly.sharepoint.CUI.Component
import typingsJapgolly.sharepoint.CUI.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Ribbon.PageManager")
@js.native
class PageManager ()
  extends typingsJapgolly.sharepoint.CUI.Page.PageManager {
  def addPageComponent(component: Component): Unit = js.native
  def get_ribbon(): typingsJapgolly.sharepoint.SP.Ribbon.Ribbon = js.native
  def isRootCommandEnabled(commandId: String, root: Root): Boolean = js.native
  def onRootRefreshed(root: Root): Unit = js.native
  def removePageComponent(component: Component): Unit = js.native
}

/* static members */
@JSGlobal("SP.Ribbon.PageManager")
@js.native
object PageManager extends js.Object {
  def get_instance(): PageManager = js.native
}

