package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.mixed
import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.one
import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.tab
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckListItemIndentMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-list-item-indent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkListItemIndent(context: Context): Exclude[js.UndefOr[tab | one | mixed], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkListItemIndent")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[tab | one | mixed], Unit]]
  
  type Context = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
  
  type Options = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
}
