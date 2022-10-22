package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AltExperimentId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.ExperimentId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.KeyMaxresults
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.ProfileId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExperimentsResource extends StObject {
  
  /** Delete an experiment. */
  def delete(): Request[Unit] = js.native
  def delete(request: ExperimentId): Request[Unit] = js.native
  
  /** Returns an experiment to which the user has access. */
  def get(): Request[Experiment] = js.native
  def get(request: ExperimentId): Request[Experiment] = js.native
  
  def insert(request: FieldsKey, body: Experiment): Request[Experiment] = js.native
  /** Create a new experiment. */
  def insert(request: ProfileId): Request[Experiment] = js.native
  
  /** Lists experiments to which the user has access. */
  def list(): Request[Experiments] = js.native
  def list(request: KeyMaxresults): Request[Experiments] = js.native
  
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: AltExperimentId): Request[Experiment] = js.native
  def patch(request: ExperimentId, body: Experiment): Request[Experiment] = js.native
  
  /** Update an existing experiment. */
  def update(request: AltExperimentId): Request[Experiment] = js.native
  def update(request: ExperimentId, body: Experiment): Request[Experiment] = js.native
}
