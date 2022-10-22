package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcTreeSelect.anon.Children
import typingsJapgolly.rcTreeSelect.anon.SHOWALL
import typingsJapgolly.rcTreeSelect.esTreeNodeMod.TreeNodeProps
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.TreeSelectProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-tree-select", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children & (TreeSelectProps[Any, DefaultOptionType]), Element]) & SHOWALL = js.native
  
  @JSImport("rc-tree-select", "SHOW_ALL")
  @js.native
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  
  @JSImport("rc-tree-select", "SHOW_CHILD")
  @js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  @JSImport("rc-tree-select", "SHOW_PARENT")
  @js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-tree-select", "TreeNode")
  @js.native
  val TreeNode: FC[TreeNodeProps] = js.native
  
  type _To = (js.Function1[/* props */ Children & (TreeSelectProps[Any, DefaultOptionType]), Element]) & SHOWALL
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* props */ Children & (TreeSelectProps[Any, DefaultOptionType]), Element]) & SHOWALL = default
}
