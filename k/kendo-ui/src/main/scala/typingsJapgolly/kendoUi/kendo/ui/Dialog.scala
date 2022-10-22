package typingsJapgolly.kendoUi.kendo.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialog
  extends StObject
     with Widget {
  
  def center(): Dialog = js.native
  
  def close(): Dialog = js.native
  
  def content(): Dialog = js.native
  def content(content: String): Dialog = js.native
  def content(content: JQuery): Dialog = js.native
  @JSName("content")
  def content_String(): String = js.native
  
  def open(): Dialog = js.native
  
  def title(): Dialog = js.native
  def title(text: String): Dialog = js.native
  @JSName("title")
  def title_String(): String = js.native
  
  def toFront(): Dialog = js.native
  
  var wrapper: JQuery = js.native
}
