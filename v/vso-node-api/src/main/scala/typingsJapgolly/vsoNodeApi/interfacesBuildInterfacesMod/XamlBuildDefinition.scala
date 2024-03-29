package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XamlBuildDefinition
  extends StObject
     with DefinitionReference {
  
  var _links: Any
  
  /**
    * Batch size of the definition
    */
  var batchSize: Double
  
  var buildArgs: String
  
  /**
    * The continuous integration quiet period
    */
  var continuousIntegrationQuietPeriod: Double
  
  /**
    * The build controller
    */
  var controller: BuildController
  
  /**
    * The date this definition was created
    */
  var createdOn: js.Date
  
  /**
    * Default drop location for builds from this definition
    */
  var defaultDropLocation: String
  
  /**
    * Description of the definition
    */
  var description: String
  
  /**
    * The last build on this definition
    */
  var lastBuild: XamlBuildReference
  
  /**
    * The repository
    */
  var repository: BuildRepository
  
  /**
    * The reasons supported by the template
    */
  var supportedReasons: BuildReason
  
  /**
    * How builds are triggered from this definition
    */
  var triggerType: DefinitionTriggerType
}
object XamlBuildDefinition {
  
  inline def apply(
    _links: Any,
    batchSize: Double,
    buildArgs: String,
    continuousIntegrationQuietPeriod: Double,
    controller: BuildController,
    createdDate: js.Date,
    createdOn: js.Date,
    defaultDropLocation: String,
    description: String,
    id: Double,
    lastBuild: XamlBuildReference,
    name: String,
    path: String,
    project: TeamProjectReference,
    queueStatus: DefinitionQueueStatus,
    repository: BuildRepository,
    revision: Double,
    supportedReasons: BuildReason,
    triggerType: DefinitionTriggerType,
    `type`: DefinitionType,
    uri: String,
    url: String
  ): XamlBuildDefinition = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], batchSize = batchSize.asInstanceOf[js.Any], buildArgs = buildArgs.asInstanceOf[js.Any], continuousIntegrationQuietPeriod = continuousIntegrationQuietPeriod.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], defaultDropLocation = defaultDropLocation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastBuild = lastBuild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], queueStatus = queueStatus.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], supportedReasons = supportedReasons.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XamlBuildDefinition]
  }
  
  extension [Self <: XamlBuildDefinition](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBuildArgs(value: String): Self = StObject.set(x, "buildArgs", value.asInstanceOf[js.Any])
    
    inline def setContinuousIntegrationQuietPeriod(value: Double): Self = StObject.set(x, "continuousIntegrationQuietPeriod", value.asInstanceOf[js.Any])
    
    inline def setController(value: BuildController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setDefaultDropLocation(value: String): Self = StObject.set(x, "defaultDropLocation", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLastBuild(value: XamlBuildReference): Self = StObject.set(x, "lastBuild", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: BuildRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSupportedReasons(value: BuildReason): Self = StObject.set(x, "supportedReasons", value.asInstanceOf[js.Any])
    
    inline def setTriggerType(value: DefinitionTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
