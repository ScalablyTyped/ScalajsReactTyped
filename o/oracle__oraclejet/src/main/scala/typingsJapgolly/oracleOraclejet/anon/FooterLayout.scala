package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings._empty
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.image
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.now
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterLayout extends StObject {
  
  var footerLayout: _empty | now
  
  var showOn: focus | image
  
  var timeIncrement: String
}
object FooterLayout {
  
  inline def apply(footerLayout: _empty | now, showOn: focus | image, timeIncrement: String): FooterLayout = {
    val __obj = js.Dynamic.literal(footerLayout = footerLayout.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], timeIncrement = timeIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterLayout]
  }
  
  extension [Self <: FooterLayout](x: Self) {
    
    inline def setFooterLayout(value: _empty | now): Self = StObject.set(x, "footerLayout", value.asInstanceOf[js.Any])
    
    inline def setShowOn(value: focus | image): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    inline def setTimeIncrement(value: String): Self = StObject.set(x, "timeIncrement", value.asInstanceOf[js.Any])
  }
}
