package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteSheet
  extends StObject
     with Base {
  
  def addIcon(iconName: String, x: Double, y: Double): Unit
  
  def getIconCSS(iconName: String): String
  
  def getIconPosition(iconName: String): X
  
  var icons: StringDictionary[js.Array[Double]]
  
  var imageUrl: String
  
  var name: String
  
  def removeIcon(iconName: String): Unit
  
  var size: String
}
object SpriteSheet {
  
  inline def apply(
    addIcon: (String, Double, Double) => Callback,
    destroy: Callback,
    getIconCSS: String => String,
    getIconPosition: String => X,
    icons: StringDictionary[js.Array[Double]],
    imageUrl: String,
    name: String,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback,
    removeIcon: String => Callback,
    size: String
  ): SpriteSheet = {
    val __obj = js.Dynamic.literal(addIcon = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (addIcon(t0, t1, t2)).runNow()), destroy = destroy.toJsFn, getIconCSS = js.Any.fromFunction1(getIconCSS), getIconPosition = js.Any.fromFunction1(getIconPosition), icons = icons.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()), removeIcon = js.Any.fromFunction1((t0: String) => removeIcon(t0).runNow()), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheet]
  }
  
  extension [Self <: SpriteSheet](x: Self) {
    
    inline def setAddIcon(value: (String, Double, Double) => Callback): Self = StObject.set(x, "addIcon", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetIconCSS(value: String => String): Self = StObject.set(x, "getIconCSS", js.Any.fromFunction1(value))
    
    inline def setGetIconPosition(value: String => X): Self = StObject.set(x, "getIconPosition", js.Any.fromFunction1(value))
    
    inline def setIcons(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemoveIcon(value: String => Callback): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
