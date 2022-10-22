package typingsJapgolly.agenda

import typingsJapgolly.agenda.anon.InsertOnly
import typingsJapgolly.agenda.distJobMod.Job
import typingsJapgolly.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJobUniqueMod {
  
  @JSImport("agenda/dist/job/unique", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unique(unique: Any): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(unique.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
  inline def unique(unique: Any, options: InsertOnly): Job[JobAttributesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(unique.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Job[JobAttributesData]]
}
