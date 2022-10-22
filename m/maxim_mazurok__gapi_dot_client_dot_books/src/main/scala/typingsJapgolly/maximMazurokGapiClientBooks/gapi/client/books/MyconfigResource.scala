package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Country
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Features
import typingsJapgolly.maximMazurokGapiClientBooks.anon.LicenseTypes
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Locale
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MyconfigResource extends StObject {
  
  /** Gets the current settings for the user. */
  def getUserSettings(): Request[Usersettings] = js.native
  def getUserSettings(request: Country): Request[Usersettings] = js.native
  
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(): Request[DownloadAccesses] = js.native
  def releaseDownloadAccess(request: Locale): Request[DownloadAccesses] = js.native
  
  /** Request concurrent and download access restrictions. */
  def requestAccess(): Request[RequestAccessData] = js.native
  def requestAccess(request: LicenseTypes): Request[RequestAccessData] = js.native
  
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(): Request[Volumes] = js.native
  def syncVolumeLicenses(request: Features): Request[Volumes] = js.native
  
  def updateUserSettings(request: Uploadprotocol, body: Usersettings): Request[Usersettings] = js.native
  /** Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects will retain the existing value. */
  def updateUserSettings(request: Xgafv): Request[Usersettings] = js.native
}
