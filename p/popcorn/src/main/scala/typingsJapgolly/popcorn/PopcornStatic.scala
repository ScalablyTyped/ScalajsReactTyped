package typingsJapgolly.popcorn

import typingsJapgolly.popcorn.anon.Call
import typingsJapgolly.popcorn.anon.ToSeconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopcornStatic extends StObject {
  
  def apply(callback: js.Function): PopcornImpl = js.native
  def apply(selector: String): PopcornImpl = js.native
  def apply(selector: String, options: Any): PopcornImpl = js.native
  
  def destroy(insntace: PopcornImpl): Any = js.native
  
  def extend(target: String, source: Any, rest: Any*): Any = js.native
  
  def forEach(`object`: Any, callback: js.Function): Any = js.native
  def forEach(`object`: Any, callback: js.Function, context: Any): Any = js.native
  
  def getJSONP(url: String, successCallback: js.Function): Any = js.native
  
  def getScript(url: String, successCallback: js.Function): Any = js.native
  
  def guid(prefix: String): Any = js.native
  
  var locale: PopcornLocale = js.native
  
  def parser(parserName: Any, fn: Any, data: Any): Any = js.native
  
  def plugin(pluginName: String, info: PopcornPlugin): Any = js.native
  def plugin(pluginName: String, info: PopcornPlugin, manifest: Any): Any = js.native
  @JSName("plugin")
  var plugin_Original: Call = js.native
  
  var util: ToSeconds = js.native
}
