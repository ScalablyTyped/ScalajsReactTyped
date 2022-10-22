package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Quotationmark
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckQuoteMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-quote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkQuote(context: Context): Exclude[js.UndefOr[Quotationmark | (/* ' */ String)], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkQuote")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Quotationmark | (/* ' */ String)], Unit]]
  
  type Context = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
  
  type Options = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
}
