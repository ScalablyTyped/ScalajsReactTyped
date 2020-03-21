package typingsJapgolly.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationFolders")
@js.native
class NavigationFolders protected () extends js.Object {
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.NavigationFolders_typekey")
  var OutlookDotNavigationFolders_typekey: NavigationFolders = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Folder: Folder): NavigationFolder = js.native
  def Item(Index: js.Any): NavigationFolder = js.native
  def Remove(RemovableFolder: NavigationFolder): Unit = js.native
}

