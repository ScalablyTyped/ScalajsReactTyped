package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings._underscore
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckStrongMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-strong", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkStrong(context: Context): Exclude[js.UndefOr[Asterisk | _underscore], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkStrong")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Asterisk | _underscore], Unit]]
  
  type Context = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
  
  type Options = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
}
