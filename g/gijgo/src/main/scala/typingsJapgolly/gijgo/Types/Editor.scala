package typingsJapgolly.gijgo.Types

import typingsJapgolly.gijgo.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor
  extends StObject
     with JQuery {
  
  def content(): String | Editor = js.native
  def content(html: String): String | Editor = js.native
  
  def destroy(): Unit = js.native
}
