package typingsJapgolly.webgme.anon

import typingsJapgolly.webgme.GmeCommon.DefIntegerObject
import typingsJapgolly.webgme.GmeCommon.DefStringObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  var level: DefIntegerObject
  
  var name: DefStringObject
}
object Level {
  
  inline def apply(level: DefIntegerObject, name: DefStringObject): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  extension [Self <: Level](x: Self) {
    
    inline def setLevel(value: DefIntegerObject): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setName(value: DefStringObject): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
