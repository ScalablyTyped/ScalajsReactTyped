package typingsJapgolly.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStandardKernel extends StObject {
  
  val connectionProviderIds: js.Array[String]
  
  val displayName: String
  
  val name: String
}
object IStandardKernel {
  
  inline def apply(connectionProviderIds: js.Array[String], displayName: String, name: String): IStandardKernel = {
    val __obj = js.Dynamic.literal(connectionProviderIds = connectionProviderIds.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandardKernel]
  }
  
  extension [Self <: IStandardKernel](x: Self) {
    
    inline def setConnectionProviderIds(value: js.Array[String]): Self = StObject.set(x, "connectionProviderIds", value.asInstanceOf[js.Any])
    
    inline def setConnectionProviderIdsVarargs(value: String*): Self = StObject.set(x, "connectionProviderIds", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
