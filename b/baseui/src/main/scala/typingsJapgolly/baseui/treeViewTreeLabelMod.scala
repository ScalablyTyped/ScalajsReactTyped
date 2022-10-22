package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.treeViewTypesMod.TreeLabelProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewTreeLabelMod extends Shortcut {
  
  @JSImport("baseui/tree-view/tree-label", JSImport.Default)
  @js.native
  val default: ComponentType[TreeLabelProps] = js.native
  
  type _To = ComponentType[TreeLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `treeViewTreeLabelMod.foo` */
  override def _to: ComponentType[TreeLabelProps] = default
}
