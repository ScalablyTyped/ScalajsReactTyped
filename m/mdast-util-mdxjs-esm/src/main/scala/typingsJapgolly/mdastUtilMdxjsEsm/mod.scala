package typingsJapgolly.mdastUtilMdxjsEsm

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import typingsJapgolly.mdastUtilFromMarkdown.mod.Handle
import typingsJapgolly.mdastUtilToMarkdown.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-mdxjs-esm", "mdxjsEsmFromMarkdown")
  @js.native
  val mdxjsEsmFromMarkdown: FromMarkdownExtension = js.native
  
  @JSImport("mdast-util-mdxjs-esm", "mdxjsEsmToMarkdown")
  @js.native
  val mdxjsEsmToMarkdown: ToMarkdownExtension = js.native
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type MDXJSEsm_ = MdxjsEsm
  
  type MdxjsEsm = typingsJapgolly.mdastUtilMdxjsEsm.complexTypesMod.MdxjsEsm
  
  type Program = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Program */ Any
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownHandle = typingsJapgolly.mdastUtilToMarkdown.mod.Handle
}
