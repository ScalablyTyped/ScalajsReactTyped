package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Graveaccent
import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Tilde
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckFenceMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-fence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkFence(context: Context): Exclude[js.UndefOr[Tilde | Graveaccent], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFence")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Tilde | Graveaccent], Unit]]
  
  type Context = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
  
  type Options = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
}
