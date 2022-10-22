package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiCore.bottomNavigationActionBottomNavigationActionMod.BottomNavigationActionClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyDefaultComponent[P, D /* <: ElementType */] extends StObject {
  
  var classKey: BottomNavigationActionClassKey
  
  var defaultComponent: D
  
  var props: P & Icon
}
object ClassKeyDefaultComponent {
  
  inline def apply[P, D /* <: ElementType */](classKey: BottomNavigationActionClassKey, defaultComponent: D, props: P & Icon): ClassKeyDefaultComponent[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyDefaultComponent[P, D]]
  }
  
  extension [Self <: ClassKeyDefaultComponent[?, ?], P, D /* <: ElementType */](x: Self & (ClassKeyDefaultComponent[P, D])) {
    
    inline def setClassKey(value: BottomNavigationActionClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Icon): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
