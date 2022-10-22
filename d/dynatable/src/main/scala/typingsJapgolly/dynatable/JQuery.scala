package typingsJapgolly.dynatable

import typingsJapgolly.dynatable.JQueryDynatable.Dynatable
import typingsJapgolly.dynatable.JQueryDynatable.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Initialize Dynatable plugin
    *
    * @param options An optional object that allow you to change the default configuration options
    */
  /**
    * @constructor
    */
  def dynatable(): JQuery
  def dynatable(options: Options): JQuery
  /**
    * @constructor
    */
  @JSName("dynatable")
  var dynatable_Original: Dynatable
}
object JQuery {
  
  inline def apply(dynatable: Dynatable): JQuery = {
    val __obj = js.Dynamic.literal(dynatable = dynatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setDynatable(value: Dynatable): Self = StObject.set(x, "dynatable", value.asInstanceOf[js.Any])
  }
}
