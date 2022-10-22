package typingsJapgolly.reactSortableTree.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactSortableTree.anon.AddAsFirstChild
import typingsJapgolly.reactSortableTree.anon.Children
import typingsJapgolly.reactSortableTree.anon.Depth
import typingsJapgolly.reactSortableTree.anon.ExpandAllMatchPaths
import typingsJapgolly.reactSortableTree.anon.Expanded
import typingsJapgolly.reactSortableTree.anon.FlatData
import typingsJapgolly.reactSortableTree.anon.GetNodeKey
import typingsJapgolly.reactSortableTree.anon.GetNodeKeyIgnoreCollapsed
import typingsJapgolly.reactSortableTree.anon.IgnoreCollapsed
import typingsJapgolly.reactSortableTree.anon.Index
import typingsJapgolly.reactSortableTree.anon.LowerSiblingsCounts
import typingsJapgolly.reactSortableTree.anon.Matches
import typingsJapgolly.reactSortableTree.anon.ParentNode
import typingsJapgolly.reactSortableTree.mod.^
import typingsJapgolly.reactSortableTree.utilsTreeDataUtilsMod.WalkAndMapFunctionParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// tslint:disable-next-line:no-unnecessary-generics
inline def default[T](props: PropsWithChildren[ReactSortableTreeProps[T]]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

// tslint:disable-next-line:no-unnecessary-generics
inline def SortableTree[T](props: PropsWithChildren[ReactSortableTreeProps[T]]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableTree")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

// tslint:disable-next-line:no-unnecessary-generics
inline def SortableTreeWithoutDndContext[T](props: PropsWithChildren[ReactSortableTreeProps[T]]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableTreeWithoutDndContext")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def addNodeUnderParent[T](data: FullTree[T] & AddAsFirstChild[T]): FullTree[T] & TreeIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("addNodeUnderParent")(data.asInstanceOf[js.Any]).asInstanceOf[FullTree[T] & TreeIndex]

inline def changeNodeAtPath[T](data: FullTree[T] & TreePath & GetNodeKey[T]): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("changeNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]

inline def defaultGetNodeKey(data: TreeIndex): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetNodeKey")(data.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def defaultSearchMethod[T](data: SearchData[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSearchMethod")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def find[T](data: FullTree[T] & ExpandAllMatchPaths[T]): Matches[T] & FullTree[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(data.asInstanceOf[js.Any]).asInstanceOf[Matches[T] & FullTree[T]]

inline def getDepth[T](node: TreeItem[T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDepth")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def getDepth[T](node: TreeItem[T], depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDepth")(node.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getDescendantCount[T](data: TreeNode[T] & IgnoreCollapsed): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescendantCount")(data.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getFlatDataFromTree[T](data: FullTree[T] & GetNodeKeyIgnoreCollapsed[T]): js.Array[FlatDataItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlatDataFromTree")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatDataItem[T]]]

inline def getNodeAtPath[T](data: FullTree[T] & TreePath & GetNodeKeyIgnoreCollapsed[T]): (TreeNode[T] & TreeIndex) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[(TreeNode[T] & TreeIndex) | Null]

inline def getTreeFromFlatData[T](data: FlatData[T]): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeFromFlatData")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]

inline def getVisibleNodeCount[T](data: FullTree[T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleNodeCount")(data.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getVisibleNodeInfoAtIndex[T](data: FullTree[T] & Index[T]): (TreeNode[T] & TreePath & LowerSiblingsCounts) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleNodeInfoAtIndex")(data.asInstanceOf[js.Any]).asInstanceOf[(TreeNode[T] & TreePath & LowerSiblingsCounts) | Null]

inline def insertNode[T](data: FullTree[T] & Depth[T]): FullTree[T] & TreeIndex & TreePath & ParentNode[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(data.asInstanceOf[js.Any]).asInstanceOf[FullTree[T] & TreeIndex & TreePath & ParentNode[T]]

inline def isDescendant[T](older: TreeItem[T], younger: TreeItem[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDescendant")(older.asInstanceOf[js.Any], younger.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def map[T](data: WalkAndMapFunctionParameters[T]): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]

inline def removeNode[T](data: FullTree[T] & TreePath & GetNodeKeyIgnoreCollapsed[T]): (FullTree[T] & TreeNode[T] & TreeIndex) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(data.asInstanceOf[js.Any]).asInstanceOf[(FullTree[T] & TreeNode[T] & TreeIndex) | Null]

inline def removeNodeAtPath[T](data: FullTree[T] & TreePath & GetNodeKeyIgnoreCollapsed[T]): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]

inline def toggleExpandedForAll[T](data: FullTree[T] & Expanded): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleExpandedForAll")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]

inline def walk[T](data: WalkAndMapFunctionParameters[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]

type GetTreeItemChildrenFn[T] = js.Function1[/* data */ GetTreeItemChildren[T], Unit]

type NodeRenderer[T] = ComponentType[NodeRendererProps[T]]

type NumberOrStringArray = js.Array[String | Double]

type PlaceholderRenderer[T] = ComponentType[PlaceholderRendererProps[T]]

type TreeItem[T] = T & Children[T]

type TreeRenderer[T] = ComponentType[TreeRendererProps[T]]
