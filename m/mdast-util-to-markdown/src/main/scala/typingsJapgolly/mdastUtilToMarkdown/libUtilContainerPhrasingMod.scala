package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilContainerPhrasingMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/container-phrasing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def containerPhrasing(parent: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("containerPhrasing")(parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Context = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
  
  type Node = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Node
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type SafeOptions = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.SafeOptions
}
