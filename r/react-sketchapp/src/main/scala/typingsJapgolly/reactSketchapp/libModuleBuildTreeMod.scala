package typingsJapgolly.reactSketchapp

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactSketchapp.libModuleTypesMod.PlatformBridge
import typingsJapgolly.reactSketchapp.libModuleTypesMod.TreeNode
import typingsJapgolly.reactSketchapp.libModuleUtilsContextMod.Context
import typingsJapgolly.reactTestRenderer.mod.ReactTestRendererNode
import typingsJapgolly.yogaLayout.mod.YogaNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleBuildTreeMod {
  
  @JSImport("react-sketchapp/lib/module/buildTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildTree(bridge: PlatformBridge): js.Function1[/* element */ Element, TreeNode[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildTree")(bridge.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* element */ Element, TreeNode[Any]]]
  
  inline def reactTreeToFlexTree(node: ReactTestRendererNode, yogaNode: YogaNode, context: Context): TreeNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("reactTreeToFlexTree")(node.asInstanceOf[js.Any], yogaNode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TreeNode[Any]]
}
