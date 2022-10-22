package typingsJapgolly.reactMosaicComponent

import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicBranch
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicDirection
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicNode
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMosaicUtilitiesMod {
  
  @JSImport("react-mosaic-component/lib/util/mosaicUtilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Corner extends StObject
  @JSImport("react-mosaic-component/lib/util/mosaicUtilities", "Corner")
  @js.native
  object Corner extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Corner & Double] = js.native
    
    @js.native
    sealed trait BOTTOM_LEFT
      extends StObject
         with Corner
    /* 3 */ val BOTTOM_LEFT: typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_LEFT & Double = js.native
    
    @js.native
    sealed trait BOTTOM_RIGHT
      extends StObject
         with Corner
    /* 4 */ val BOTTOM_RIGHT: typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_RIGHT & Double = js.native
    
    @js.native
    sealed trait TOP_LEFT
      extends StObject
         with Corner
    /* 1 */ val TOP_LEFT: typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner.TOP_LEFT & Double = js.native
    
    @js.native
    sealed trait TOP_RIGHT
      extends StObject
         with Corner
    /* 2 */ val TOP_RIGHT: typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner.TOP_RIGHT & Double = js.native
  }
  
  inline def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]]): MosaicNode[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createBalancedTreeFromLeaves")(leaves.asInstanceOf[js.Any]).asInstanceOf[MosaicNode[T] | Null]
  inline def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]], startDirection: MosaicDirection): MosaicNode[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createBalancedTreeFromLeaves")(leaves.asInstanceOf[js.Any], startDirection.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T] | Null]
  
  inline def getAndAssertNodeAtPathExists[T /* <: MosaicKey */](tree: Null, path: MosaicPath): MosaicNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAndAssertNodeAtPathExists")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T]]
  inline def getAndAssertNodeAtPathExists[T /* <: MosaicKey */](tree: MosaicNode[T], path: MosaicPath): MosaicNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAndAssertNodeAtPathExists")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T]]
  
  inline def getLeaves[T /* <: MosaicKey */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeaves")().asInstanceOf[js.Array[T]]
  inline def getLeaves[T /* <: MosaicKey */](tree: MosaicNode[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeaves")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def getNodeAtPath[T /* <: MosaicKey */](tree: Null, path: MosaicPath): MosaicNode[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPath")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T] | Null]
  inline def getNodeAtPath[T /* <: MosaicKey */](tree: MosaicNode[T], path: MosaicPath): MosaicNode[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPath")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T] | Null]
  
  inline def getOtherBranch(branch: MosaicBranch): MosaicBranch = ^.asInstanceOf[js.Dynamic].applyDynamic("getOtherBranch")(branch.asInstanceOf[js.Any]).asInstanceOf[MosaicBranch]
  
  inline def getOtherDirection(direction: MosaicDirection): MosaicDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("getOtherDirection")(direction.asInstanceOf[js.Any]).asInstanceOf[MosaicDirection]
  
  inline def getPathToCorner(tree: MosaicNode[Any], corner: Corner): MosaicPath = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathToCorner")(tree.asInstanceOf[js.Any], corner.asInstanceOf[js.Any])).asInstanceOf[MosaicPath]
  
  inline def isParent[T /* <: MosaicKey */](node: MosaicNode[T]): /* is react-mosaic-component.react-mosaic-component/lib/types.MosaicParent<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParent")(node.asInstanceOf[js.Any]).asInstanceOf[/* is react-mosaic-component.react-mosaic-component/lib/types.MosaicParent<T> */ Boolean]
}
