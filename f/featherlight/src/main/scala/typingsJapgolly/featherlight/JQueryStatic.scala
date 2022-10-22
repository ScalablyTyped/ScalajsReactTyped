package typingsJapgolly.featherlight

import typingsJapgolly.featherlight.Featherlight.Config
import typingsJapgolly.featherlight.Featherlight.FeatherlightStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def featherlight(): typingsJapgolly.featherlight.Featherlight.Featherlight
  def featherlight($content: String): typingsJapgolly.featherlight.Featherlight.Featherlight
  def featherlight($content: String, config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight
  def featherlight($content: JQuery): typingsJapgolly.featherlight.Featherlight.Featherlight
  def featherlight($content: JQuery, config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight
  def featherlight(config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight
  @JSName("featherlight")
  var featherlight_Original: FeatherlightStatic
}
object JQueryStatic {
  
  inline def apply(featherlight: FeatherlightStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(featherlight = featherlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setFeatherlight(value: FeatherlightStatic): Self = StObject.set(x, "featherlight", value.asInstanceOf[js.Any])
  }
}
