package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated */
trait StyleMedia extends StObject {
  
  /* standard dom */
  def matchMedium(mediaquery: java.lang.String): scala.Boolean
  
  /* standard dom */
  var `type`: java.lang.String
}
object StyleMedia {
  
  inline def apply(matchMedium: java.lang.String => scala.Boolean, `type`: java.lang.String): StyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleMedia]
  }
  
  extension [Self <: StyleMedia](x: Self) {
    
    inline def setMatchMedium(value: java.lang.String => scala.Boolean): Self = StObject.set(x, "matchMedium", js.Any.fromFunction1(value))
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
