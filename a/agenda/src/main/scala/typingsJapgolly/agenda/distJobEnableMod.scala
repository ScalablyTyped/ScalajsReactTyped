package typingsJapgolly.agenda

import typingsJapgolly.agenda.distJobMod.Job
import typingsJapgolly.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJobEnableMod {
  
  @JSImport("agenda/dist/job/enable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Job[JobAttributesData]]
}
