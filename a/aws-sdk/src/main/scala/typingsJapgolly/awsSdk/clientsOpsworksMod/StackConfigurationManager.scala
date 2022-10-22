package typingsJapgolly.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackConfigurationManager extends StObject {
  
  /**
    * The name. This parameter must be set to "Chef".
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows stacks. The default value for Linux stacks is 11.4.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object StackConfigurationManager {
  
  inline def apply(): StackConfigurationManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackConfigurationManager]
  }
  
  extension [Self <: StackConfigurationManager](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
