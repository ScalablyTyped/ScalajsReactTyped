package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLBRElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.Node
import org.scalajs.dom.Text
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewFillerMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/filler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BR_FILLER(domDocument: Document): HTMLBRElement = ^.asInstanceOf[js.Dynamic].applyDynamic("BR_FILLER")(domDocument.asInstanceOf[js.Any]).asInstanceOf[HTMLBRElement]
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/filler", "INLINE_FILLER")
  @js.native
  val INLINE_FILLER: /* "\\u2060\\u2060\\u2060\\u2060\\u2060\\u2060\\u2060" */ String = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/filler", "INLINE_FILLER_LENGTH")
  @js.native
  val INLINE_FILLER_LENGTH: /* 7 */ Double = js.native
  
  inline def MARKED_NBSP_FILLER(domDocument: Document): HTMLSpanElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MARKED_NBSP_FILLER")(domDocument.asInstanceOf[js.Any]).asInstanceOf[HTMLSpanElement]
  
  inline def NBSP_FILLER(domDocument: Document): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("NBSP_FILLER")(domDocument.asInstanceOf[js.Any]).asInstanceOf[Text]
  
  inline def getDataWithoutFiller(domText: Text): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataWithoutFiller")(domText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def injectQuirksHandling(view: View): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectQuirksHandling")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isInlineFiller(domText: Text): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInlineFiller")(domText.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def startsWithFiller(domNode: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWithFiller")(domNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
