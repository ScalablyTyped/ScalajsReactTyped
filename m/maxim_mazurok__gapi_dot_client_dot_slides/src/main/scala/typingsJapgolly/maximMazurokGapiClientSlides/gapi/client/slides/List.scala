package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List extends StObject {
  
  /** The ID of the list. */
  var listId: js.UndefOr[String] = js.undefined
  
  /**
    * A map of nesting levels to the properties of bullets at the associated level. A list has at most nine levels of nesting, so the possible values for the keys of this map are 0
    * through 8, inclusive.
    */
  var nestingLevel: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.slides.gapi.client.slides.NestingLevel} */ js.Any
  ] = js.undefined
}
object List {
  
  inline def apply(): typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides.List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides.List]
  }
  
  extension [Self <: typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides.List](x: Self) {
    
    inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    inline def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    inline def setNestingLevel(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.slides.gapi.client.slides.NestingLevel} */ js.Any
    ): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    inline def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
  }
}
