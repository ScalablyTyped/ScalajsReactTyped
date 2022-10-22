package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import typingsJapgolly.maximMazurokGapiClientSheets.anon.Fields
import typingsJapgolly.maximMazurokGapiClientSheets.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsResource extends StObject {
  
  /** Copies a single sheet from a spreadsheet to another spreadsheet. Returns the properties of the newly created sheet. */
  def copyTo(request: Fields): typingsJapgolly.gapiClient.gapi.client.Request[SheetProperties] = js.native
  def copyTo(request: Key, body: CopySheetToAnotherSpreadsheetRequest): typingsJapgolly.gapiClient.gapi.client.Request[SheetProperties] = js.native
}
