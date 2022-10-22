package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdast.mod.Code
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Parent
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.SafeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleCodeMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def code(node: Code_, _underscore: Null, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def code(node: Code_, _underscore: Unit, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def code(node: Code_, _underscore: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Code_ = Code
  
  type Exit = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Exit
  
  type Handle = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handle
  
  type Map = typingsJapgolly.mdastUtilToMarkdown.libUtilIndentLinesMod.Map
}
