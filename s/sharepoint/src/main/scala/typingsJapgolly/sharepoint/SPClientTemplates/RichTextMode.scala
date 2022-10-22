package typingsJapgolly.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RichTextMode extends StObject
@JSGlobal("SPClientTemplates.RichTextMode")
@js.native
object RichTextMode extends StObject {
  
  @js.native
  sealed trait Compatible
    extends StObject
       with RichTextMode
  
  @js.native
  sealed trait FullHtml
    extends StObject
       with RichTextMode
  
  @js.native
  sealed trait HtmlAsXml
    extends StObject
       with RichTextMode
  
  @js.native
  sealed trait ThemeHtml
    extends StObject
       with RichTextMode
}
