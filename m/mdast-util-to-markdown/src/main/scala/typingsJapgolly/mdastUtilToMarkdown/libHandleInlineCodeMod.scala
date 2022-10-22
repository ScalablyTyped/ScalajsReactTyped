package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdast.mod.InlineCode
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleInlineCodeMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/inline-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inlineCode(node: InlineCode_, _underscore: Null, context: Context): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineCode")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inlineCode(node: InlineCode_, _underscore: Unit, context: Context): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineCode")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inlineCode(node: InlineCode_, _underscore: Parent, context: Context): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineCode")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Handle = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handle
  
  type InlineCode_ = InlineCode
}
