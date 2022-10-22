package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeData
import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeId
import typingsJapgolly.baseui.treeViewTypesMod.TreeViewOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TreeViewProps379846013 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def getId(value: /* node */ TreeNodeData[Any] => TreeNodeId): this.type = set("getId", js.Any.fromFunction1(value))
  
  inline def indentGuides(value: Boolean): this.type = set("indentGuides", value.asInstanceOf[js.Any])
  
  inline def onToggle(value: /* node */ TreeNodeData[Any] => Callback): this.type = set("onToggle", js.Any.fromFunction1((t0: /* node */ TreeNodeData[Any]) => value(t0).runNow()))
  
  inline def overrides(value: TreeViewOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  
  inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
  
  inline def singleExpanded(value: Boolean): this.type = set("singleExpanded", value.asInstanceOf[js.Any])
}
