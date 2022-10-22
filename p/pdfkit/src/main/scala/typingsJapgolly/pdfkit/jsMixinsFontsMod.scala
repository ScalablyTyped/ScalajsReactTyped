package typingsJapgolly.pdfkit

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.pdfkit.PDFKit.Mixins.PDFFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMixinsFontsMod extends Shortcut {
  
  @JSImport("pdfkit/js/mixins/fonts", JSImport.Namespace)
  @js.native
  val ^ : PDFFont = js.native
  
  type _To = PDFFont
  
  /* This means you don't have to write `^`, but can instead just say `jsMixinsFontsMod.foo` */
  override def _to: PDFFont = ^
}
