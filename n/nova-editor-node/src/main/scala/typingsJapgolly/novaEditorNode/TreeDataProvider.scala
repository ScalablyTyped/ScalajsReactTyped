package typingsJapgolly.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/tree-data-provider/
@js.native
trait TreeDataProvider[E] extends StObject {
  
  def getChildren(): js.Array[E] | js.Promise[js.Array[E]] = js.native
  def getChildren(element: E): js.Array[E] | js.Promise[js.Array[E]] = js.native
  
  var getParent: js.UndefOr[js.Function1[/* element */ E, E | Null]] = js.native
  
  def getTreeItem(element: E): TreeItem = js.native
}
