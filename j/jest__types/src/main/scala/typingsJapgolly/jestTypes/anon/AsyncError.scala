package typingsJapgolly.jestTypes.anon

import typingsJapgolly.jestTypes.jestTypesStrings.start_describe_definition
import typingsJapgolly.jestTypes.mod.BlockMode
import typingsJapgolly.jestTypes.mod.BlockName2
import typingsJapgolly.jestTypes.mod.SyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncError
  extends StObject
     with SyncEvent {
  
  var asyncError: js.Error
  
  var blockName: BlockName2
  
  var mode: BlockMode
  
  var name: start_describe_definition
}
object AsyncError {
  
  inline def apply(asyncError: js.Error, blockName: BlockName2, mode: BlockMode): AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "start_describe_definition")
    __obj.asInstanceOf[AsyncError]
  }
  
  extension [Self <: AsyncError](x: Self) {
    
    inline def setAsyncError(value: js.Error): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    inline def setBlockName(value: BlockName2): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setMode(value: BlockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: start_describe_definition): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
