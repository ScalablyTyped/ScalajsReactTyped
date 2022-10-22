package typingsJapgolly.stylelint.anon

import typingsJapgolly.postcss.libResultMod.Message
import typingsJapgolly.stylelint.mod.PostcssResult
import typingsJapgolly.stylelint.mod.StylelintPostcssResult
import typingsJapgolly.stylelint.mod.WarningOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stylelint.stylelint.EmptyResult & {  stylelint :stylelint.stylelint.StylelintPostcssResult, warn (message : string, options : stylelint.stylelint.WarningOptions | undefined): void} */
@js.native
trait EmptyResultstylelintStyle
  extends StObject
     with PostcssResult {
  
  var messages: js.Array[Message] = js.native
  
  var opts: Unit = js.native
  
  var root: Nodes = js.native
  
  var stylelint: StylelintPostcssResult = js.native
  
  def warn(message: String): Unit = js.native
  def warn(message: String, options: WarningOptions): Unit = js.native
}
