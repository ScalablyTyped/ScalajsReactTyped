package typingsJapgolly.pdfkit

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMixinsTextMod extends Shortcut {
  
  @JSImport("pdfkit/js/mixins/text", JSImport.Namespace)
  @js.native
  val ^ : PDFText = js.native
  
  type _To = PDFText
  
  /* This means you don't have to write `^`, but can instead just say `jsMixinsTextMod.foo` */
  override def _to: PDFText = ^
}
