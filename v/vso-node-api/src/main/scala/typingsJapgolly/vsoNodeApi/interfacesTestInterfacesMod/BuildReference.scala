package typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildReference extends StObject {
  
  var branchName: String
  
  var buildSystem: String
  
  var definitionId: Double
  
  var id: Double
  
  var number: String
  
  var repositoryId: String
  
  var uri: String
}
object BuildReference {
  
  inline def apply(
    branchName: String,
    buildSystem: String,
    definitionId: Double,
    id: Double,
    number: String,
    repositoryId: String,
    uri: String
  ): BuildReference = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], buildSystem = buildSystem.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildReference]
  }
  
  extension [Self <: BuildReference](x: Self) {
    
    inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBuildSystem(value: String): Self = StObject.set(x, "buildSystem", value.asInstanceOf[js.Any])
    
    inline def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
