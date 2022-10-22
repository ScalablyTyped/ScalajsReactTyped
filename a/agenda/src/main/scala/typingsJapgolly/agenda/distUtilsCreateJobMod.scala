package typingsJapgolly.agenda

import typingsJapgolly.agenda.distAgendaMod.Agenda
import typingsJapgolly.agenda.distJobMod.Job
import typingsJapgolly.agenda.distJobMod.JobAttributes
import typingsJapgolly.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCreateJobMod {
  
  @JSImport("agenda/dist/utils/create-job", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createJob(agenda: Agenda, jobData: JobAttributes[JobAttributesData]): Job[JobAttributesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJob")(agenda.asInstanceOf[js.Any], jobData.asInstanceOf[js.Any])).asInstanceOf[Job[JobAttributesData]]
}
