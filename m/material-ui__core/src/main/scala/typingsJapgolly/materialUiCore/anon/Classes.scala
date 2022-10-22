package typingsJapgolly.materialUiCore.anon

import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes[StylesOrClassKey /* <: String | (Styles[Any, Any, Any]) */] extends StObject {
  
  var classes: ClassNameMap[ClassKeyOfStyles[StylesOrClassKey]]
}
object Classes {
  
  inline def apply[StylesOrClassKey /* <: String | (Styles[Any, Any, Any]) */](classes: ClassNameMap[ClassKeyOfStyles[StylesOrClassKey]]): Classes[StylesOrClassKey] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[StylesOrClassKey]]
  }
  
  extension [Self <: Classes[?], StylesOrClassKey /* <: String | (Styles[Any, Any, Any]) */](x: Self & Classes[StylesOrClassKey]) {
    
    inline def setClasses(value: ClassNameMap[ClassKeyOfStyles[StylesOrClassKey]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
  }
}
