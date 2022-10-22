package typingsJapgolly.vueCompilerSsr

import typingsJapgolly.vueCompilerCore.mod.CodegenResult
import typingsJapgolly.vueCompilerCore.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/compiler-ssr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(template: String): CodegenResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[CodegenResult]
  inline def compile(template: String, options: CompilerOptions): CodegenResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodegenResult]
}
