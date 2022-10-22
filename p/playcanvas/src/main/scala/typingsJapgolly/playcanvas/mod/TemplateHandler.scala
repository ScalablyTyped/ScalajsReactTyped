package typingsJapgolly.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "TemplateHandler")
@js.native
open class TemplateHandler protected () extends StObject {
  def this(app: Any) = this()
  
  var _app: Any = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any): Template = js.native
}
