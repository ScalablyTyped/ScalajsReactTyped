package typingsJapgolly.asynciterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTaskschedulerMod {
  
  @JSImport("asynciterator/dist/taskscheduler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTaskScheduler(): TaskScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaskScheduler")().asInstanceOf[TaskScheduler]
  
  type Task = js.Function0[Unit]
  
  type TaskScheduler = js.Function1[/* task */ Task, Unit]
}
