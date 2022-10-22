package typingsJapgolly.grommet.es6UtilsMod

import typingsJapgolly.grommet.grommetStrings.`no-repeat`
import typingsJapgolly.grommet.grommetStrings.contain
import typingsJapgolly.grommet.grommetStrings.cover
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.repeat
import typingsJapgolly.grommet.grommetStrings.strong
import typingsJapgolly.grommet.grommetStrings.text
import typingsJapgolly.grommet.grommetStrings.weak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundObject extends StObject {
  
  var clip: js.UndefOr[text | String] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var dark: js.UndefOr[Boolean | String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var light: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[weak | medium | strong | Double | Boolean] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var repeat: js.UndefOr[`no-repeat` | typingsJapgolly.grommet.grommetStrings.repeat | String] = js.undefined
  
  var rotate: js.UndefOr[Double | String] = js.undefined
  
  var size: js.UndefOr[cover | contain | String] = js.undefined
}
object BackgroundObject {
  
  inline def apply(): BackgroundObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundObject]
  }
  
  extension [Self <: BackgroundObject](x: Self) {
    
    inline def setClip(value: text | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDark(value: Boolean | String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setOpacity(value: weak | medium | strong | Double | Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRepeat(value: `no-repeat` | repeat | String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setSize(value: cover | contain | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
