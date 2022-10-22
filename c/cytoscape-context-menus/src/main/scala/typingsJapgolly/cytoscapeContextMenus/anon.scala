package typingsJapgolly.cytoscapeContextMenus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CoreAsWell extends StObject {
    
    var coreAsWell: js.UndefOr[String] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
  }
  object CoreAsWell {
    
    inline def apply(): CoreAsWell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreAsWell]
    }
    
    extension [Self <: CoreAsWell](x: Self) {
      
      inline def setCoreAsWell(value: String): Self = StObject.set(x, "coreAsWell", value.asInstanceOf[js.Any])
      
      inline def setCoreAsWellUndefined: Self = StObject.set(x, "coreAsWell", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var src: String
    
    var width: Double
    
    var x: String
    
    var y: String
  }
  object Height {
    
    inline def apply(height: Double, src: String, width: Double, x: String, y: String): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Src extends StObject {
    
    var height: Double
    
    var src: String
    
    var width: Double
  }
  object Src {
    
    inline def apply(height: Double, src: String, width: Double): Src = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Src]
    }
    
    extension [Self <: Src](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
