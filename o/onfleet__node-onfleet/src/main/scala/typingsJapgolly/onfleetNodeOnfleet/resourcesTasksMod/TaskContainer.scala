package typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod.WorkerTaskContainer
  - typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod.OrganizationTaskContainer
  - typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod.TeamTaskContainer
*/
trait TaskContainer extends StObject
object TaskContainer {
  
  inline def OrganizationTaskContainer(organization: String): typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod.OrganizationTaskContainer = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ORGANIZATION")
    __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod.OrganizationTaskContainer]
  }
  
  inline def TeamTaskContainer(team: String): typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod.TeamTaskContainer = {
    val __obj = js.Dynamic.literal(team = team.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TEAM")
    __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod.TeamTaskContainer]
  }
  
  inline def WorkerTaskContainer(worker: String): typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod.WorkerTaskContainer = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WORKER")
    __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.resourcesTasksMod.WorkerTaskContainer]
  }
}
