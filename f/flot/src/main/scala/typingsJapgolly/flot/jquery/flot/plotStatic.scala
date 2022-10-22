package typingsJapgolly.flot.jquery.flot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait plotStatic extends StObject {
  
  def apply(placeholder: JQuery[HTMLElement], data: js.Array[Any | dataSeries]): plot = js.native
  def apply(placeholder: JQuery[HTMLElement], data: js.Array[Any | dataSeries], options: plotOptions): plot = js.native
  
  var plugins: js.Array[plugin] = js.native
}
