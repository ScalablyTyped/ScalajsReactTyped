package typingsJapgolly.gestalt.anon

import typingsJapgolly.gestalt.gestaltStrings.videoSlashm3u8
import typingsJapgolly.gestalt.gestaltStrings.videoSlashmp4
import typingsJapgolly.gestalt.gestaltStrings.videoSlashogg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Src extends StObject {
  
  var src: String
  
  var `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg
}
object Src {
  
  inline def apply(src: String, `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): Src = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  
  extension [Self <: Src](x: Self) {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setType(value: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
