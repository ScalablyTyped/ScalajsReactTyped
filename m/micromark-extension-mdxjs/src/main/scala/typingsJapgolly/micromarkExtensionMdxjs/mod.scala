package typingsJapgolly.micromarkExtensionMdxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-mdxjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxjs(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxjs")().asInstanceOf[Extension]
  inline def mdxjs(options: typingsJapgolly.micromarkExtensionMdxExpression.devLibSyntaxMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxjs")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Extension = typingsJapgolly.micromarkUtilTypes.mod.Extension
  
  type Options = typingsJapgolly.micromarkExtensionMdxExpression.mod.Options
}
