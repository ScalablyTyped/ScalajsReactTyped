package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLStyleMedia extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLStyleMedia_typekey")
  var MSHTMLDotHTMLStyleMedia_typekey: HTMLStyleMedia
  
  def matchMedium(mediaQuery: String): Boolean
  
  val `type`: String
}
object HTMLStyleMedia {
  
  inline def apply(MSHTMLDotHTMLStyleMedia_typekey: HTMLStyleMedia, matchMedium: String => Boolean, `type`: String): HTMLStyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("MSHTML.HTMLStyleMedia_typekey")(MSHTMLDotHTMLStyleMedia_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleMedia]
  }
  
  extension [Self <: HTMLStyleMedia](x: Self) {
    
    inline def setMSHTMLDotHTMLStyleMedia_typekey(value: HTMLStyleMedia): Self = StObject.set(x, "MSHTML.HTMLStyleMedia_typekey", value.asInstanceOf[js.Any])
    
    inline def setMatchMedium(value: String => Boolean): Self = StObject.set(x, "matchMedium", js.Any.fromFunction1(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
