package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.breeze.breeze.core.EnumSymbol
import typingsJapgolly.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityStateSymbol
  extends StObject
     with EnumSymbol {
  
  def isAdded(): Boolean
  
  def isAddedModifiedOrDeleted(): Boolean
  
  def isDeleted(): Boolean
  
  def isDetached(): Boolean
  
  def isModified(): Boolean
  
  def isUnchanged(): Boolean
  
  def isUnchangedOrModified(): Boolean
}
object EntityStateSymbol {
  
  inline def apply(
    getName: CallbackTo[String],
    isAdded: CallbackTo[Boolean],
    isAddedModifiedOrDeleted: CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean],
    isDetached: CallbackTo[Boolean],
    isModified: CallbackTo[Boolean],
    isUnchanged: CallbackTo[Boolean],
    isUnchangedOrModified: CallbackTo[Boolean],
    parentEnum: IEnum
  ): EntityStateSymbol = {
    val __obj = js.Dynamic.literal(getName = getName.toJsFn, isAdded = isAdded.toJsFn, isAddedModifiedOrDeleted = isAddedModifiedOrDeleted.toJsFn, isDeleted = isDeleted.toJsFn, isDetached = isDetached.toJsFn, isModified = isModified.toJsFn, isUnchanged = isUnchanged.toJsFn, isUnchangedOrModified = isUnchangedOrModified.toJsFn, parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityStateSymbol]
  }
  
  extension [Self <: EntityStateSymbol](x: Self) {
    
    inline def setIsAdded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAdded", value.toJsFn)
    
    inline def setIsAddedModifiedOrDeleted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAddedModifiedOrDeleted", value.toJsFn)
    
    inline def setIsDeleted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDeleted", value.toJsFn)
    
    inline def setIsDetached(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDetached", value.toJsFn)
    
    inline def setIsModified(value: CallbackTo[Boolean]): Self = StObject.set(x, "isModified", value.toJsFn)
    
    inline def setIsUnchanged(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUnchanged", value.toJsFn)
    
    inline def setIsUnchangedOrModified(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUnchangedOrModified", value.toJsFn)
  }
}
