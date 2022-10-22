package typingsJapgolly.wixStyleReact.anon

import typingsJapgolly.color.mod.ColorParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shown extends StObject {
  
  var color: typingsJapgolly.color.mod.Color[ColorParam]
  
  var shown: Boolean
}
object Shown {
  
  inline def apply(color: typingsJapgolly.color.mod.Color[ColorParam], shown: Boolean): Shown = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shown]
  }
  
  extension [Self <: Shown](x: Self) {
    
    inline def setColor(value: typingsJapgolly.color.mod.Color[ColorParam]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
  }
}
