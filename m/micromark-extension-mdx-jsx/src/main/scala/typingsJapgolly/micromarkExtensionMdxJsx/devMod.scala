package typingsJapgolly.micromarkExtensionMdxJsx

import typingsJapgolly.micromarkExtensionMdxJsx.devLibSyntaxMod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devMod {
  
  @JSImport("micromark-extension-mdx-jsx/dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxJsx(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsx")().asInstanceOf[Extension]
  inline def mdxJsx(options: typingsJapgolly.micromarkExtensionMdxJsx.devLibSyntaxMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsx")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Options = typingsJapgolly.micromarkExtensionMdxJsx.devLibSyntaxMod.Options
}
