package typingsJapgolly.kahootJsUpdated.mod

import typingsJapgolly.kahootJsUpdated.anon.DefaultQuizData
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @todo Add better types.
  * This event doesn't seem to get fired any more so hard to tell exact types
  */
trait RecoveryData extends StObject {
  
  var data: DefaultQuizData & (Record[String, Any])
  
  var state: Double
}
object RecoveryData {
  
  inline def apply(data: DefaultQuizData & (Record[String, Any]), state: Double): RecoveryData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoveryData]
  }
  
  extension [Self <: RecoveryData](x: Self) {
    
    inline def setData(value: DefaultQuizData & (Record[String, Any])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
