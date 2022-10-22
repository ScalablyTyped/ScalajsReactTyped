package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyDefOrObjectType extends StObject {
  
  def Clone(): IPropertyDefOrObjectType
  
  def GetAsExpression(): IExpression
  
  var ID: Double
  
  var PropertyDef: Boolean
}
object IPropertyDefOrObjectType {
  
  inline def apply(
    Clone: CallbackTo[IPropertyDefOrObjectType],
    GetAsExpression: CallbackTo[IExpression],
    ID: Double,
    PropertyDef: Boolean
  ): IPropertyDefOrObjectType = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, GetAsExpression = GetAsExpression.toJsFn, ID = ID.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDefOrObjectType]
  }
  
  extension [Self <: IPropertyDefOrObjectType](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyDefOrObjectType]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setGetAsExpression(value: CallbackTo[IExpression]): Self = StObject.set(x, "GetAsExpression", value.toJsFn)
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setPropertyDef(value: Boolean): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
  }
}
