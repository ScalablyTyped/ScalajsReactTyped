package typingsJapgolly.micromarkExtensionMdxJsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsxFlowMod {
  
  @JSImport("micromark-extension-mdx-jsx/lib/jsx-flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsxFlow(): Construct = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxFlow")().asInstanceOf[Construct]
  inline def jsxFlow(acorn: Unit, acornOptions: Unit, addResult: Boolean): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxFlow")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxFlow(acorn: Unit, acornOptions: AcornOptions): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxFlow")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxFlow(acorn: Unit, acornOptions: AcornOptions, addResult: Boolean): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxFlow")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxFlow(acorn: Acorn): Construct = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxFlow")(acorn.asInstanceOf[js.Any]).asInstanceOf[Construct]
  inline def jsxFlow(acorn: Acorn, acornOptions: Unit, addResult: Boolean): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxFlow")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxFlow(acorn: Acorn, acornOptions: AcornOptions): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxFlow")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxFlow(acorn: Acorn, acornOptions: AcornOptions, addResult: Boolean): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxFlow")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any])).asInstanceOf[Construct]
  
  type Acorn = typingsJapgolly.micromarkFactoryMdxExpression.mod.Acorn
  
  type AcornOptions = typingsJapgolly.micromarkFactoryMdxExpression.mod.AcornOptions
  
  type Construct = typingsJapgolly.micromarkUtilTypes.mod.Construct
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
  
  type Tokenizer = typingsJapgolly.micromarkUtilTypes.mod.Tokenizer
}
