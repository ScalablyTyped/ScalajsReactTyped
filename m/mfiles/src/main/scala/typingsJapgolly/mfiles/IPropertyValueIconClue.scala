package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValueIconClue extends StObject {
  
  def Clone(): IPropertyValueIconClue
  
  val PropertyDef: MFBuiltInPropertyDef | Double
  
  val ValueListItem: Double
}
object IPropertyValueIconClue {
  
  inline def apply(
    Clone: CallbackTo[IPropertyValueIconClue],
    PropertyDef: MFBuiltInPropertyDef | Double,
    ValueListItem: Double
  ): IPropertyValueIconClue = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, PropertyDef = PropertyDef.asInstanceOf[js.Any], ValueListItem = ValueListItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueIconClue]
  }
  
  extension [Self <: IPropertyValueIconClue](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyValueIconClue]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setValueListItem(value: Double): Self = StObject.set(x, "ValueListItem", value.asInstanceOf[js.Any])
  }
}
