package typingsJapgolly.mdastUtilMdx

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import typingsJapgolly.mdastUtilToMarkdown.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-mdx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxFromMarkdown(): js.Array[FromMarkdownExtension] = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxFromMarkdown")().asInstanceOf[js.Array[FromMarkdownExtension]]
  
  inline def mdxToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def mdxToMarkdown(options: typingsJapgolly.mdastUtilMdxJsx.libMod.ToMarkdownOptions): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type FromMarkdownExtension = Extension
  
  type MdxFlowExpression = typingsJapgolly.mdastUtilMdxExpression.mod.MdxFlowExpression
  
  type MdxJsxAttribute = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxAttribute
  
  type MdxJsxAttributeValueExpression = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxAttributeValueExpression
  
  type MdxJsxExpressionAttribute = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxExpressionAttribute
  
  type MdxJsxFlowElement = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxFlowElement
  
  type MdxJsxTextElement = typingsJapgolly.mdastUtilMdxJsx.mod.MdxJsxTextElement
  
  type MdxTextExpression = typingsJapgolly.mdastUtilMdxExpression.mod.MdxTextExpression
  
  type MdxjsEsm = typingsJapgolly.mdastUtilMdxjsEsm.mod.MdxjsEsm
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownOptions = typingsJapgolly.mdastUtilMdxJsx.mod.ToMarkdownOptions
}
