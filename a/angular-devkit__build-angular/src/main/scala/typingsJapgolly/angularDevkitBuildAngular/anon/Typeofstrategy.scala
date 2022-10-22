package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitCore.srcExperimentalJobsStrategyMod.strategy.JobStrategy
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstrategy extends StObject {
  
  /**
    * Creates a JobStrategy that will reuse a running job if the argument matches.
    * @param replayMessages Replay ALL messages if a job is reused, otherwise just hook up where it
    * is.
    */
  def memoize[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobStrategy[A, I, O] = js.native
  def memoize[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](replayMessages: Boolean): JobStrategy[A, I, O] = js.native
  
  /**
    * Creates a JobStrategy that will always reuse a running job, and restart it if the job ended.
    * @param replayMessages Replay ALL messages if a job is reused, otherwise just hook up where it
    * is.
    */
  def reuse[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobStrategy[A, I, O] = js.native
  def reuse[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](replayMessages: Boolean): JobStrategy[A, I, O] = js.native
  
  /**
    * Creates a JobStrategy that serializes every call. This strategy can be mixed between jobs.
    */
  def serialize[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobStrategy[A, I, O] = js.native
}
