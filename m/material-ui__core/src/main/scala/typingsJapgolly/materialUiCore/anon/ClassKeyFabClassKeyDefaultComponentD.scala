package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiCore.fabFabMod.FabClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyFabClassKeyDefaultComponentD[P, D /* <: ElementType */] extends StObject {
  
  var classKey: FabClassKey
  
  var defaultComponent: D
  
  var props: P & DisableRipple
}
object ClassKeyFabClassKeyDefaultComponentD {
  
  inline def apply[P, D /* <: ElementType */](classKey: FabClassKey, defaultComponent: D, props: P & DisableRipple): ClassKeyFabClassKeyDefaultComponentD[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyFabClassKeyDefaultComponentD[P, D]]
  }
  
  extension [Self <: ClassKeyFabClassKeyDefaultComponentD[?, ?], P, D /* <: ElementType */](x: Self & (ClassKeyFabClassKeyDefaultComponentD[P, D])) {
    
    inline def setClassKey(value: FabClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & DisableRipple): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
