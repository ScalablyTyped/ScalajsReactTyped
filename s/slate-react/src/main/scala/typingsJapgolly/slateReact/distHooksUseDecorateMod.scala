package typingsJapgolly.slateReact

import typingsJapgolly.react.mod.Context
import typingsJapgolly.slate.distInterfacesNodeMod.Node
import typingsJapgolly.slate.distInterfacesNodeMod.NodeEntry
import typingsJapgolly.slate.distInterfacesRangeMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDecorateMod {
  
  @JSImport("slate-react/dist/hooks/use-decorate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/hooks/use-decorate", "DecorateContext")
  @js.native
  val DecorateContext: Context[js.Function1[/* entry */ NodeEntry[Node], js.Array[Range]]] = js.native
  
  inline def useDecorate(): js.Function1[/* entry */ NodeEntry[Node], js.Array[Range]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDecorate")().asInstanceOf[js.Function1[/* entry */ NodeEntry[Node], js.Array[Range]]]
}
