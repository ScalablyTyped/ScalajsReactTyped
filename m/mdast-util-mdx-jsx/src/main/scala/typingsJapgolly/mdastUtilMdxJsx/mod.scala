package typingsJapgolly.mdastUtilMdxJsx

import typingsJapgolly.mdastUtilMdxJsx.libMod.FromMarkdownExtension
import typingsJapgolly.mdastUtilMdxJsx.libMod.ToMarkdownExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-mdx-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxJsxFromMarkdown(): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsxFromMarkdown")().asInstanceOf[FromMarkdownExtension]
  
  inline def mdxJsxToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsxToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def mdxJsxToMarkdown(options: typingsJapgolly.mdastUtilMdxJsx.libMod.ToMarkdownOptions): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsxToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type MdxJsxAttribute = typingsJapgolly.mdastUtilMdxJsx.libMod.MdxJsxAttribute
  
  type MdxJsxAttributeValueExpression = typingsJapgolly.mdastUtilMdxJsx.libMod.MdxJsxAttributeValueExpression
  
  type MdxJsxExpressionAttribute = typingsJapgolly.mdastUtilMdxJsx.libMod.MdxJsxExpressionAttribute
  
  type MdxJsxFlowElement = typingsJapgolly.mdastUtilMdxJsx.libMod.MdxJsxFlowElement
  
  type MdxJsxTextElement = typingsJapgolly.mdastUtilMdxJsx.libMod.MdxJsxTextElement
  
  type ToMarkdownOptions = typingsJapgolly.mdastUtilMdxJsx.libMod.ToMarkdownOptions
}
