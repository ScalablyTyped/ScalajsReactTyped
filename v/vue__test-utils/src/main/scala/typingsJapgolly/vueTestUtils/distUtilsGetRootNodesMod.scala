package typingsJapgolly.vueTestUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Node
import typingsJapgolly.vueRuntimeCore.mod.RendererElement
import typingsJapgolly.vueRuntimeCore.mod.RendererNode
import typingsJapgolly.vueRuntimeCore.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsGetRootNodesMod {
  
  @JSImport("@vue/test-utils/dist/utils/getRootNodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRootNodes(vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]]): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootNodes")(vnode.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
}
