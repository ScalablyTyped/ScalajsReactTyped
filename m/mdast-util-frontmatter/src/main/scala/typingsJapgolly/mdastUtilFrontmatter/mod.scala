package typingsJapgolly.mdastUtilFrontmatter

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import typingsJapgolly.mdastUtilFromMarkdown.mod.Handle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-frontmatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frontmatterFromMarkdown(): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterFromMarkdown")().asInstanceOf[FromMarkdownExtension]
  inline def frontmatterFromMarkdown(options: typingsJapgolly.micromarkExtensionFrontmatter.mattersMod.Options): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterFromMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[FromMarkdownExtension]
  
  inline def frontmatterToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def frontmatterToMarkdown(options: typingsJapgolly.micromarkExtensionFrontmatter.mattersMod.Options): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type Info = typingsJapgolly.micromarkExtensionFrontmatter.mattersMod.Info
  
  type Literal = typingsJapgolly.mdast.mod.Literal
  
  type Map = typingsJapgolly.mdastUtilToMarkdown.libUtilIndentLinesMod.Map
  
  type Matter = typingsJapgolly.micromarkExtensionFrontmatter.mattersMod.Matter
  
  type Options = typingsJapgolly.micromarkExtensionFrontmatter.mattersMod.Options
  
  type ToMarkdownExtension = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
  
  type ToMarkdownHandle = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handle
}
