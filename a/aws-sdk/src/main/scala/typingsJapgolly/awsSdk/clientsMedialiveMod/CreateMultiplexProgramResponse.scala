package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultiplexProgramResponse extends StObject {
  
  /**
    * The newly created multiplex program.
    */
  var MultiplexProgram: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.MultiplexProgram] = js.undefined
}
object CreateMultiplexProgramResponse {
  
  inline def apply(): CreateMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMultiplexProgramResponse]
  }
  
  extension [Self <: CreateMultiplexProgramResponse](x: Self) {
    
    inline def setMultiplexProgram(value: MultiplexProgram): Self = StObject.set(x, "MultiplexProgram", value.asInstanceOf[js.Any])
    
    inline def setMultiplexProgramUndefined: Self = StObject.set(x, "MultiplexProgram", js.undefined)
  }
}
