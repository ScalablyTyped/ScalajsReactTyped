package typingsJapgolly.agenda

import typingsJapgolly.agenda.distAgendaMod.Agenda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaDefaultLockLimitMod {
  
  @JSImport("agenda/dist/agenda/default-lock-limit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultLockLimit(times: Double): Agenda = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLockLimit")(times.asInstanceOf[js.Any]).asInstanceOf[Agenda]
}
