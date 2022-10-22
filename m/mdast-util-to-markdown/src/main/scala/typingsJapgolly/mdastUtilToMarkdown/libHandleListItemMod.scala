package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdast.mod.ListItem
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Parent
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.SafeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleListItemMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/list-item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listItem(node: ListItem_, parent: Null, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def listItem(node: ListItem_, parent: Unit, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def listItem(node: ListItem_, parent: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Handle = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handle
  
  type List = typingsJapgolly.mdast.mod.List
  
  type ListItem_ = ListItem
  
  type Map = typingsJapgolly.mdastUtilToMarkdown.libUtilIndentLinesMod.Map
  
  type Options = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
}
