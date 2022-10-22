package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.sectionResource
  * @description Loads in data for section
  **/
trait ISectionResource extends StObject {
  
  /** Loads in the data to display the section list */
  def getSections(): Unit
}
object ISectionResource {
  
  inline def apply(getSections: Callback): ISectionResource = {
    val __obj = js.Dynamic.literal(getSections = getSections.toJsFn)
    __obj.asInstanceOf[ISectionResource]
  }
  
  extension [Self <: ISectionResource](x: Self) {
    
    inline def setGetSections(value: Callback): Self = StObject.set(x, "getSections", value.toJsFn)
  }
}
