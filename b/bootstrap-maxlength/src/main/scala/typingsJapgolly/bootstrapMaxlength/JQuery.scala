package typingsJapgolly.bootstrapMaxlength

import typingsJapgolly.bootstrapMaxlength.BootstrapMaxlength.Options
import typingsJapgolly.bootstrapMaxlength.bootstrapMaxlengthStrings.maxlengthDothidden
import typingsJapgolly.bootstrapMaxlength.bootstrapMaxlengthStrings.maxlengthDotreposition
import typingsJapgolly.bootstrapMaxlength.bootstrapMaxlengthStrings.maxlengthDotshown
import typingsJapgolly.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /** Apply the maxlength plugin on the selected elemens */
  def maxlength(): JQuery = js.native
  def maxlength(options: Options): JQuery = js.native
  
  @JSName("on")
  def on_maxlengthhidden(
    events: maxlengthDothidden,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_maxlengthshown(
    events: maxlengthDotshown,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition, extraParameters: js.Array[Any]): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition, extraParameters: js.Object): JQuery = js.native
}
