package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.DocumentFragment
import typingsJapgolly.ckeditorCkeditor5Engine.srcDataprocessorHtmlwriterMod.HtmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDataprocessorBasichtmlwriterMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/dataprocessor/basichtmlwriter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BasicHtmlWriter {
    
    /* CompleteClass */
    override def getHtml(fragment: DocumentFragment): String = js.native
  }
  
  trait BasicHtmlWriter
    extends StObject
       with HtmlWriter
  object BasicHtmlWriter {
    
    inline def apply(getHtml: DocumentFragment => String): BasicHtmlWriter = {
      val __obj = js.Dynamic.literal(getHtml = js.Any.fromFunction1(getHtml))
      __obj.asInstanceOf[BasicHtmlWriter]
    }
  }
}
