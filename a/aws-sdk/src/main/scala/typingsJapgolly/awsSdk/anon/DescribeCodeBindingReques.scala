package typingsJapgolly.awsSdk.anon

import typingsJapgolly.awsSdk.clientsSchemasMod.string
import typingsJapgolly.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/schemas.DescribeCodeBindingRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeCodeBindingReques extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The language of the code binding.
    */
  var Language: string
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
  
  /**
    * The name of the schema.
    */
  var SchemaName: string
  
  /**
    * Specifying this limits the results to only this schema version.
    */
  var SchemaVersion: js.UndefOr[string] = js.undefined
}
object DescribeCodeBindingReques {
  
  inline def apply(Language: string, RegistryName: string, SchemaName: string): DescribeCodeBindingReques = {
    val __obj = js.Dynamic.literal(Language = Language.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeBindingReques]
  }
  
  extension [Self <: DescribeCodeBindingReques](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setLanguage(value: string): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
  }
}
