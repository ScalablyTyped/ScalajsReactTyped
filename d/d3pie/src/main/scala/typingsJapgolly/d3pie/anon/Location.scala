package typingsJapgolly.d3pie.anon

import typingsJapgolly.d3pie.d3pie.ID3PieTextOptions
import typingsJapgolly.d3pie.d3pieStrings.`pie-center`
import typingsJapgolly.d3pie.d3pieStrings.`top-center`
import typingsJapgolly.d3pie.d3pieStrings.`top-left`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var location: js.UndefOr[`top-center` | `top-left` | `pie-center`] = js.undefined
  
  var subtitle: js.UndefOr[ID3PieTextOptions] = js.undefined
  
  var title: js.UndefOr[ID3PieTextOptions] = js.undefined
  
  var titleSubtitlePadding: js.UndefOr[Double] = js.undefined
}
object Location {
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setLocation(value: `top-center` | `top-left` | `pie-center`): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSubtitle(value: ID3PieTextOptions): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: ID3PieTextOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleSubtitlePadding(value: Double): Self = StObject.set(x, "titleSubtitlePadding", value.asInstanceOf[js.Any])
    
    inline def setTitleSubtitlePaddingUndefined: Self = StObject.set(x, "titleSubtitlePadding", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
