package typingsJapgolly.cssSelect

import typingsJapgolly.cssSelect.libTypesMod.Adapter
import typingsJapgolly.cssSelect.libTypesMod.CompileToken
import typingsJapgolly.cssSelect.libTypesMod.CompiledQuery
import typingsJapgolly.cssSelect.libTypesMod.InternalOptions
import typingsJapgolly.cssWhat.libEsTypesMod.Selector
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPseudoSelectorsSubselectsMod {
  
  @JSImport("css-select/lib/pseudo-selectors/subselects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureIsTag[Node, ElementNode /* <: Node */](next: CompiledQuery[ElementNode], adapter: Adapter[Node, ElementNode]): CompiledQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureIsTag")(next.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[Node]]
  
  inline def getNextSiblings[Node, ElementNode /* <: Node */](elem: Node, adapter: Adapter[Node, ElementNode]): js.Array[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextSiblings")(elem.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementNode]]
  
  @JSImport("css-select/lib/pseudo-selectors/subselects", "subselects")
  @js.native
  val subselects: Record[String, Subselect] = js.native
  
  type Subselect = js.Function5[
    /* next */ CompiledQuery[Any], 
    /* subselect */ js.Array[js.Array[Selector]], 
    /* options */ InternalOptions[Any, Any], 
    /* context */ js.UndefOr[js.Array[Any]], 
    /* compileToken */ CompileToken[Any, Any], 
    CompiledQuery[Any]
  ]
}
