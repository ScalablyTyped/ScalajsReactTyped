package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Plussign
import typingsJapgolly.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.`-_`
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCheckBulletMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-bullet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkBullet(context: Context): Exclude[js.UndefOr[`-_` | Asterisk | Plussign], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkBullet")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[`-_` | Asterisk | Plussign], Unit]]
  
  type Context = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
  
  type Options = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
}
