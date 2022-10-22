package typingsJapgolly.atlaskitTree

import typingsJapgolly.atlaskitTree.anon.DraggedItemId
import typingsJapgolly.atlaskitTree.anon.IsDragEnabled
import typingsJapgolly.atlaskitTree.distTypesComponentsTreeTreeTypesMod.Props
import typingsJapgolly.atlaskitTree.distTypesComponentsTreeTreeTypesMod.State
import typingsJapgolly.atlaskitTree.distTypesTypesMod.ItemId
import typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTreeMod {
  
  @JSImport("@atlaskit/tree/dist/types/components/Tree", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.atlaskitTree.distTypesComponentsTreeTreeMod.default
  /* static members */
  object default {
    
    @JSImport("@atlaskit/tree/dist/types/components/Tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def closeParentIfNeeded(tree: TreeData): TreeData = ^.asInstanceOf[js.Dynamic].applyDynamic("closeParentIfNeeded")(tree.asInstanceOf[js.Any]).asInstanceOf[TreeData]
    inline def closeParentIfNeeded(tree: TreeData, draggedItemId: ItemId): TreeData = (^.asInstanceOf[js.Dynamic].applyDynamic("closeParentIfNeeded")(tree.asInstanceOf[js.Any], draggedItemId.asInstanceOf[js.Any])).asInstanceOf[TreeData]
    
    @JSImport("@atlaskit/tree/dist/types/components/Tree", "default.defaultProps")
    @js.native
    def defaultProps: IsDragEnabled = js.native
    inline def defaultProps_=(x: IsDragEnabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: Props, state: State): DraggedItemId = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DraggedItemId]
  }
}
