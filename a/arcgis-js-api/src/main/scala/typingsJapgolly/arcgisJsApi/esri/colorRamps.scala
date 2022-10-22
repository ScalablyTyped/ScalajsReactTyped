package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module provides convenience methods for querying color ramps (arrays of colors) used in the smart mapping [color symbology](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html) module.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html)
  */
trait colorRamps extends StObject {
  
  /**
    * Returns all color ramps available in smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#all)
    */
  def all(): js.Array[colorRampsColorRamp]
  
  /**
    * Returns the color ramp available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html) matching the given name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#byName)
    */
  def byName(name: String): colorRampsColorRamp
  
  /**
    * Returns the color ramps available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html) matching the given tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#byTag)
    */
  def byTag(params: colorRampsByTagParams): js.Array[colorRampsColorRamp]
  
  /**
    * Returns the names of all color ramps available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#names)
    */
  def names(): js.Array[String]
}
object colorRamps {
  
  inline def apply(
    all: CallbackTo[js.Array[colorRampsColorRamp]],
    byName: String => colorRampsColorRamp,
    byTag: colorRampsByTagParams => js.Array[colorRampsColorRamp],
    names: CallbackTo[js.Array[String]]
  ): colorRamps = {
    val __obj = js.Dynamic.literal(all = all.toJsFn, byName = js.Any.fromFunction1(byName), byTag = js.Any.fromFunction1(byTag), names = names.toJsFn)
    __obj.asInstanceOf[colorRamps]
  }
  
  extension [Self <: colorRamps](x: Self) {
    
    inline def setAll(value: CallbackTo[js.Array[colorRampsColorRamp]]): Self = StObject.set(x, "all", value.toJsFn)
    
    inline def setByName(value: String => colorRampsColorRamp): Self = StObject.set(x, "byName", js.Any.fromFunction1(value))
    
    inline def setByTag(value: colorRampsByTagParams => js.Array[colorRampsColorRamp]): Self = StObject.set(x, "byTag", js.Any.fromFunction1(value))
    
    inline def setNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "names", value.toJsFn)
  }
}
