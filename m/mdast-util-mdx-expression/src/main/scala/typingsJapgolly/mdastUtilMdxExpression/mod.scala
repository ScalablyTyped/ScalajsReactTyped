package typingsJapgolly.mdastUtilMdxExpression

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import typingsJapgolly.mdastUtilFromMarkdown.mod.Handle
import typingsJapgolly.mdastUtilToMarkdown.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-mdx-expression", "mdxExpressionFromMarkdown")
  @js.native
  val mdxExpressionFromMarkdown: FromMarkdownExtension = js.native
  
  @JSImport("mdast-util-mdx-expression", "mdxExpressionToMarkdown")
  @js.native
  val mdxExpressionToMarkdown: ToMarkdownExtension = js.native
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type MDXFlowExpression_ = MdxFlowExpression
  
  type MDXTextExpression_ = MdxTextExpression
  
  type MdxFlowExpression = typingsJapgolly.mdastUtilMdxExpression.complexTypesMod.MdxFlowExpression
  
  type MdxTextExpression = typingsJapgolly.mdastUtilMdxExpression.complexTypesMod.MdxTextExpression
  
  type Program = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Program */ Any
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownHandle = typingsJapgolly.mdastUtilToMarkdown.mod.Handle
}
