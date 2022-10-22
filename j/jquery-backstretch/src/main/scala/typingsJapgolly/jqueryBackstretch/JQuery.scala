package typingsJapgolly.jqueryBackstretch

import typingsJapgolly.jqueryBackstretch.JQueryBackStretch.BackStretch
import typingsJapgolly.jqueryBackstretch.JQueryBackStretch.BackStretchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def backstretch(images: js.Array[String]): BackStretch = js.native
  def backstretch(images: js.Array[String], config: BackStretchOptions): BackStretch = js.native
  def backstretch(method: String): JQuery = js.native
}
