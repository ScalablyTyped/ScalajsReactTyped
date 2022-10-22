package typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod

import typingsJapgolly.angularDevkitCore.anon.PartialJobDescription
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobHandler[ArgT /* <: JsonValue */, InputT /* <: JsonValue */, OutputT /* <: JsonValue */] extends StObject {
  
  def apply(argument: ArgT, context: JobHandlerContext[ArgT, InputT, OutputT]): Observable_[JobOutboundMessage[OutputT]] = js.native
  
  var jobDescription: PartialJobDescription = js.native
}
