package typingsJapgolly.remarkMdx

import typingsJapgolly.mdastUtilMdx.mod.FromMarkdownExtension
import typingsJapgolly.mdastUtilMdx.mod.ToMarkdownExtension
import typingsJapgolly.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remark-mdx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root])]
  inline def default(options: Unit): Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root])]
  inline def default(options: Options): Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root])]
  
  @js.native
  trait DoNotTouchAsThisImportItIncludesMdxInTree extends StObject {
    
    def mdxFromMarkdown(): js.Array[FromMarkdownExtension] = js.native
    
    def mdxToMarkdown(): ToMarkdownExtension = js.native
    def mdxToMarkdown(options: typingsJapgolly.mdastUtilMdxJsx.libMod.ToMarkdownOptions): ToMarkdownExtension = js.native
  }
  
  type MicromarkOptions = typingsJapgolly.micromarkExtensionMdxjs.mod.Options
  
  trait Options
    extends StObject
       with typingsJapgolly.micromarkExtensionMdxExpression.devLibSyntaxMod.Options
       with typingsJapgolly.mdastUtilMdxJsx.libMod.ToMarkdownOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  type Root = typingsJapgolly.mdast.mod.Root
  
  type ToMarkdownOptions = typingsJapgolly.mdastUtilMdx.mod.ToMarkdownOptions
}
