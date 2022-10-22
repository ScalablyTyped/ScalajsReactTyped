package typingsJapgolly.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBodyRenderOptions extends StObject {
  
  /**
    * A hex color value that defines the fill color to use when rendering the body.
    *
    * @property fillColor
    * @type number
    */
  var fillColor: js.UndefOr[Double] = js.undefined
  
  /**
    * A value that defines the fill opacity to use when rendering the body.
    *
    * @property fillOpacity
    * @type number
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * A hex color value that defines the line color to use when rendering the body.
    *
    * @property lineColor
    * @type number
    */
  var lineColor: js.UndefOr[Double] = js.undefined
  
  /**
    * A value that defines the line opacity to use when rendering the body.
    *
    * @property lineOpacity
    * @type number
    */
  var lineOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that defines the line width to use when rendering the body outline.
    *
    * @property lineThickness
    * @type number
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the opacity. 1.0 is fully opaque. 0.0 is fully translucent.
    *
    * @property opacity
    * @type number
    * @default 1
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * An `Object` that defines the sprite properties to use when rendering, if any.
    *
    * @property sprite
    * @type object
    */
  var sprite: js.UndefOr[IBodyRenderOptionsSprite] = js.undefined
  
  /**
    * A flag that indicates if the body should be rendered.
    *
    * @property visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IBodyRenderOptions {
  
  inline def apply(): IBodyRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyRenderOptions]
  }
  
  extension [Self <: IBodyRenderOptions](x: Self) {
    
    inline def setFillColor(value: Double): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setLineColor(value: Double): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineOpacity(value: Double): Self = StObject.set(x, "lineOpacity", value.asInstanceOf[js.Any])
    
    inline def setLineOpacityUndefined: Self = StObject.set(x, "lineOpacity", js.undefined)
    
    inline def setLineThickness(value: Double): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    inline def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSprite(value: IBodyRenderOptionsSprite): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    inline def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
