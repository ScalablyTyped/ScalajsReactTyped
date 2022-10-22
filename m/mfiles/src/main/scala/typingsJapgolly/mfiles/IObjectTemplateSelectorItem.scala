package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTemplateSelectorItem extends StObject {
  
  def GetClassID(): Double
  
  def GetClassName(): String
  
  def GetGroupID(): Double
  
  def GetGroupName(): String
  
  def GetID(): String
  
  def GetIconURL(): String
  
  def GetName(): String
  
  def GetTemplateID(): Double
  
  def IsBlankItem(): Boolean
  
  def IsDefaultTemplateForClass(): Boolean
}
object IObjectTemplateSelectorItem {
  
  inline def apply(
    GetClassID: CallbackTo[Double],
    GetClassName: CallbackTo[String],
    GetGroupID: CallbackTo[Double],
    GetGroupName: CallbackTo[String],
    GetID: CallbackTo[String],
    GetIconURL: CallbackTo[String],
    GetName: CallbackTo[String],
    GetTemplateID: CallbackTo[Double],
    IsBlankItem: CallbackTo[Boolean],
    IsDefaultTemplateForClass: CallbackTo[Boolean]
  ): IObjectTemplateSelectorItem = {
    val __obj = js.Dynamic.literal(GetClassID = GetClassID.toJsFn, GetClassName = GetClassName.toJsFn, GetGroupID = GetGroupID.toJsFn, GetGroupName = GetGroupName.toJsFn, GetID = GetID.toJsFn, GetIconURL = GetIconURL.toJsFn, GetName = GetName.toJsFn, GetTemplateID = GetTemplateID.toJsFn, IsBlankItem = IsBlankItem.toJsFn, IsDefaultTemplateForClass = IsDefaultTemplateForClass.toJsFn)
    __obj.asInstanceOf[IObjectTemplateSelectorItem]
  }
  
  extension [Self <: IObjectTemplateSelectorItem](x: Self) {
    
    inline def setGetClassID(value: CallbackTo[Double]): Self = StObject.set(x, "GetClassID", value.toJsFn)
    
    inline def setGetClassName(value: CallbackTo[String]): Self = StObject.set(x, "GetClassName", value.toJsFn)
    
    inline def setGetGroupID(value: CallbackTo[Double]): Self = StObject.set(x, "GetGroupID", value.toJsFn)
    
    inline def setGetGroupName(value: CallbackTo[String]): Self = StObject.set(x, "GetGroupName", value.toJsFn)
    
    inline def setGetID(value: CallbackTo[String]): Self = StObject.set(x, "GetID", value.toJsFn)
    
    inline def setGetIconURL(value: CallbackTo[String]): Self = StObject.set(x, "GetIconURL", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "GetName", value.toJsFn)
    
    inline def setGetTemplateID(value: CallbackTo[Double]): Self = StObject.set(x, "GetTemplateID", value.toJsFn)
    
    inline def setIsBlankItem(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsBlankItem", value.toJsFn)
    
    inline def setIsDefaultTemplateForClass(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsDefaultTemplateForClass", value.toJsFn)
  }
}
