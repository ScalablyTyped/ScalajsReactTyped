package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientBooks.anon.CategoryId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnboardingResource extends StObject {
  
  /** List categories for onboarding experience. */
  def listCategories(): Request[Category] = js.native
  def listCategories(request: CallbackFields): Request[Category] = js.native
  
  /** List available volumes under categories for onboarding experience. */
  def listCategoryVolumes(): Request[Volume2] = js.native
  def listCategoryVolumes(request: CategoryId): Request[Volume2] = js.native
}
