package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.screepsStrings.KO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Z extends StObject {
  
  var H: typingsJapgolly.screeps.screepsStrings.KH
  
  var O: KO
  
  var Z: typingsJapgolly.screeps.screepsStrings.ZK
}
object Z {
  
  inline def apply(): Z = {
    val __obj = js.Dynamic.literal(H = "KH", O = "KO", Z = "ZK")
    __obj.asInstanceOf[Z]
  }
  
  extension [Self <: Z](x: Self) {
    
    inline def setH(value: typingsJapgolly.screeps.screepsStrings.KH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    inline def setO(value: KO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
    
    inline def setZ(value: typingsJapgolly.screeps.screepsStrings.ZK): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
  }
}
