package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiCore.cardActionAreaCardActionAreaMod.CardActionAreaClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyCardActionAreaClassKey[P, D /* <: ElementType */] extends StObject {
  
  var classKey: CardActionAreaClassKey
  
  var defaultComponent: D
  
  var props: P & FocusVisibleClassName
}
object ClassKeyCardActionAreaClassKey {
  
  inline def apply[P, D /* <: ElementType */](classKey: CardActionAreaClassKey, defaultComponent: D, props: P & FocusVisibleClassName): ClassKeyCardActionAreaClassKey[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyCardActionAreaClassKey[P, D]]
  }
  
  extension [Self <: ClassKeyCardActionAreaClassKey[?, ?], P, D /* <: ElementType */](x: Self & (ClassKeyCardActionAreaClassKey[P, D])) {
    
    inline def setClassKey(value: CardActionAreaClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & FocusVisibleClassName): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
