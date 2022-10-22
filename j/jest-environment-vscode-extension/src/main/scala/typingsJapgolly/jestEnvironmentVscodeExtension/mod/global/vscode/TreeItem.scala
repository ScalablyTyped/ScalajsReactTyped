package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.mod.TreeItemLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.TreeItem")
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
  def this(resourceUri: typingsJapgolly.vscode.mod.Uri) = this()
  def this(label: String, collapsibleState: typingsJapgolly.vscode.mod.TreeItemCollapsibleState) = this()
  def this(label: TreeItemLabel, collapsibleState: typingsJapgolly.vscode.mod.TreeItemCollapsibleState) = this()
  def this(
    resourceUri: typingsJapgolly.vscode.mod.Uri,
    collapsibleState: typingsJapgolly.vscode.mod.TreeItemCollapsibleState
  ) = this()
}
