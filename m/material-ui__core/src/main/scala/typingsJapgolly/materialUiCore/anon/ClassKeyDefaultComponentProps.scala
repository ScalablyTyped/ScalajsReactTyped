package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiCore.buttonButtonMod.ButtonClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyDefaultComponentProps[P, D /* <: ElementType */] extends StObject {
  
  var classKey: ButtonClassKey
  
  var defaultComponent: D
  
  var props: P & DisableElevation
}
object ClassKeyDefaultComponentProps {
  
  inline def apply[P, D /* <: ElementType */](classKey: ButtonClassKey, defaultComponent: D, props: P & DisableElevation): ClassKeyDefaultComponentProps[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyDefaultComponentProps[P, D]]
  }
  
  extension [Self <: ClassKeyDefaultComponentProps[?, ?], P, D /* <: ElementType */](x: Self & (ClassKeyDefaultComponentProps[P, D])) {
    
    inline def setClassKey(value: ButtonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & DisableElevation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
