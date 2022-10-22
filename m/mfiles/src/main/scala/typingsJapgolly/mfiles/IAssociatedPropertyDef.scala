package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAssociatedPropertyDef extends StObject {
  
  def Clone(): IAssociatedPropertyDef
  
  var PropertyDef: MFBuiltInPropertyDef | Double
  
  var Required: Boolean
}
object IAssociatedPropertyDef {
  
  inline def apply(
    Clone: CallbackTo[IAssociatedPropertyDef],
    PropertyDef: MFBuiltInPropertyDef | Double,
    Required: Boolean
  ): IAssociatedPropertyDef = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, PropertyDef = PropertyDef.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssociatedPropertyDef]
  }
  
  extension [Self <: IAssociatedPropertyDef](x: Self) {
    
    inline def setClone(value: CallbackTo[IAssociatedPropertyDef]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
  }
}
