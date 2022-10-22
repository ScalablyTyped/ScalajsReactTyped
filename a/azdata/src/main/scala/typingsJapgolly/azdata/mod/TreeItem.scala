package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.TreeItemCollapsibleState
import typingsJapgolly.vscode.mod.TreeItemLabel
import typingsJapgolly.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "TreeItem")
@js.native
open class TreeItem protected ()
  extends typingsJapgolly.vscode.mod.TreeItem {
  /**
    * @param label A human-readable string describing this item
    * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
    */
  def this(label: String) = this()
  def this(label: TreeItemLabel) = this()
  /**
    * @param resourceUri The {@link Uri} of the resource representing this item.
    * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
    */
  def this(resourceUri: Uri) = this()
  def this(label: String, collapsibleState: TreeItemCollapsibleState) = this()
  def this(label: TreeItemLabel, collapsibleState: TreeItemCollapsibleState) = this()
  def this(resourceUri: Uri, collapsibleState: TreeItemCollapsibleState) = this()
  
  var childProvider: js.UndefOr[String] = js.native
  
  var payload: js.UndefOr[IConnectionProfile] = js.native
  
  var `type`: js.UndefOr[ExtensionNodeType] = js.native
}
