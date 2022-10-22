package typingsJapgolly.mdastUtilGfmAutolinkLiteral

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import typingsJapgolly.mdastUtilFromMarkdown.mod.Handle
import typingsJapgolly.mdastUtilFromMarkdown.mod.Transform
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm-autolink-literal", "gfmAutolinkLiteralFromMarkdown")
  @js.native
  val gfmAutolinkLiteralFromMarkdown: FromMarkdownExtension = js.native
  
  @JSImport("mdast-util-gfm-autolink-literal", "gfmAutolinkLiteralToMarkdown")
  @js.native
  val gfmAutolinkLiteralToMarkdown: ToMarkdownExtension = js.native
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type FromMarkdownTransform = Transform
  
  type Link = typingsJapgolly.mdast.mod.Link
  
  type PhrasingContent = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_mdast-util-find-and-replace.PhrasingContent */ Any
  
  type RegExpMatchObject = typingsJapgolly.mdastUtilFindAndReplace.mod.RegExpMatchObject
  
  type ReplaceFunction = typingsJapgolly.mdastUtilFindAndReplace.mod.ReplaceFunction
  
  type ToMarkdownExtension = Options
}
