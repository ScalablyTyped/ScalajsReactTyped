package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildRepair extends StObject {
  
  var build: typingsJapgolly.screeps.screepsInts.`2`
  
  var repair: typingsJapgolly.screeps.screepsInts.`2`
}
object BuildRepair {
  
  inline def apply(): BuildRepair = {
    val __obj = js.Dynamic.literal(build = 2, repair = 2)
    __obj.asInstanceOf[BuildRepair]
  }
  
  extension [Self <: BuildRepair](x: Self) {
    
    inline def setBuild(value: typingsJapgolly.screeps.screepsInts.`2`): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setRepair(value: typingsJapgolly.screeps.screepsInts.`2`): Self = StObject.set(x, "repair", value.asInstanceOf[js.Any])
  }
}
