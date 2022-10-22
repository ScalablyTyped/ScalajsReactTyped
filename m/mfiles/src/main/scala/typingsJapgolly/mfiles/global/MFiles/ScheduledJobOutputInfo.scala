package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IScheduledJobOutputInfo
import typingsJapgolly.mfiles.MFiles.MFScheduledJobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ScheduledJobOutputInfo")
@js.native
open class ScheduledJobOutputInfo ()
  extends StObject
     with IScheduledJobOutputInfo {
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var JobType: MFScheduledJobType = js.native
  
  /* CompleteClass */
  var Message: String = js.native
}
