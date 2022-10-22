package typingsJapgolly.ink

import typingsJapgolly.ink.inkStrings.`truncate-end`
import typingsJapgolly.ink.inkStrings.`truncate-middle`
import typingsJapgolly.ink.inkStrings.`truncate-start`
import typingsJapgolly.ink.inkStrings.end
import typingsJapgolly.ink.inkStrings.middle
import typingsJapgolly.ink.inkStrings.truncate
import typingsJapgolly.ink.inkStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildWrapTextMod {
  
  @JSImport("ink/build/wrap-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String, maxWidth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(
    text: String,
    maxWidth: Double,
    wrapType: wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], wrapType.asInstanceOf[js.Any])).asInstanceOf[String]
}
