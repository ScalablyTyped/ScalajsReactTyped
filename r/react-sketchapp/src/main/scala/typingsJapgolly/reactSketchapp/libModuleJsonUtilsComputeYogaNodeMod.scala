package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.anon.Node
import typingsJapgolly.reactSketchapp.libModuleTypesMod.PlatformBridge
import typingsJapgolly.reactSketchapp.libModuleTypesMod.ViewStyle
import typingsJapgolly.reactSketchapp.libModuleUtilsContextMod.Context
import typingsJapgolly.reactTestRenderer.mod.ReactTestRendererNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleJsonUtilsComputeYogaNodeMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/computeYogaNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeYogaNode(bridge: PlatformBridge): js.Function2[/* node */ ReactTestRendererNode, /* context */ Context, Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeYogaNode")(bridge.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* node */ ReactTestRendererNode, /* context */ Context, Node]]
  
  inline def getStyles(node: ReactTestRendererNode): ViewStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(node.asInstanceOf[js.Any]).asInstanceOf[ViewStyle]
}
