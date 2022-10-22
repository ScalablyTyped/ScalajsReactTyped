package typingsJapgolly.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  /* private */ @JSName("VBIDE.Application_typekey")
  var VBIDEDotApplication_typekey: Application
  
  val Version: String
}
object Application {
  
  inline def apply(VBIDEDotApplication_typekey: Application, Version: String): Application = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.Application_typekey")(VBIDEDotApplication_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  
  extension [Self <: Application](x: Self) {
    
    inline def setVBIDEDotApplication_typekey(value: Application): Self = StObject.set(x, "VBIDE.Application_typekey", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
