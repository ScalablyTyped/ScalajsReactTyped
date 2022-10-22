package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceSource extends StObject {
  
  /* standard dom */
  val fonts: FontFaceSet
}
object FontFaceSource {
  
  inline def apply(fonts: FontFaceSet): FontFaceSource = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceSource]
  }
  
  extension [Self <: FontFaceSource](x: Self) {
    
    inline def setFonts(value: FontFaceSet): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
  }
}
