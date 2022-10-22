package typingsJapgolly.atlaskitTree

import typingsJapgolly.atlaskitTree.anon.DestinationPosition
import typingsJapgolly.atlaskitTree.distTypesComponentsTreeTreeTypesMod.DragState
import typingsJapgolly.atlaskitTree.distTypesTypesMod.FlattenedTree
import typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTreeTreeUtilsMod {
  
  @JSImport("@atlaskit/tree/dist/types/components/Tree/Tree-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateFinalDropPositions(tree: TreeData, flattenedTree: FlattenedTree, dragState: DragState): DestinationPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateFinalDropPositions")(tree.asInstanceOf[js.Any], flattenedTree.asInstanceOf[js.Any], dragState.asInstanceOf[js.Any])).asInstanceOf[DestinationPosition]
}
