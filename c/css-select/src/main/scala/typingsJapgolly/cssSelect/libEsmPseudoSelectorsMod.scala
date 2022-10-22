package typingsJapgolly.cssSelect

import typingsJapgolly.cssSelect.libEsmPseudoSelectorsFiltersMod.Filter
import typingsJapgolly.cssSelect.libEsmPseudoSelectorsPseudosMod.Pseudo
import typingsJapgolly.cssSelect.libEsmTypesMod.CompileToken
import typingsJapgolly.cssSelect.libEsmTypesMod.CompiledQuery
import typingsJapgolly.cssSelect.libEsmTypesMod.InternalOptions
import typingsJapgolly.cssWhat.libEsTypesMod.PseudoSelector
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPseudoSelectorsMod {
  
  @JSImport("css-select/lib/esm/pseudo-selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("css-select/lib/esm/pseudo-selectors", "aliases")
  @js.native
  val aliases: Record[String, String] = js.native
  
  inline def compilePseudoSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: PseudoSelector,
    options: InternalOptions[Node, ElementNode],
    context: js.Array[Node],
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compilePseudoSelector")(next.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], compileToken.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  inline def compilePseudoSelector[Node, ElementNode /* <: Node */](
    next: CompiledQuery[ElementNode],
    selector: PseudoSelector,
    options: InternalOptions[Node, ElementNode],
    context: Unit,
    compileToken: CompileToken[Node, ElementNode]
  ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compilePseudoSelector")(next.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], compileToken.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
  
  @JSImport("css-select/lib/esm/pseudo-selectors", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  @JSImport("css-select/lib/esm/pseudo-selectors", "pseudos")
  @js.native
  val pseudos: Record[String, Pseudo] = js.native
}
