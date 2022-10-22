package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlEntryKeys extends StObject {
  
  def Clone(): IAccessControlEntryKeys
  
  val Count: Double
  
  def Item(Index: Double): IAccessControlEntryKey
}
object IAccessControlEntryKeys {
  
  inline def apply(Clone: CallbackTo[IAccessControlEntryKeys], Count: Double, Item: Double => IAccessControlEntryKey): IAccessControlEntryKeys = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IAccessControlEntryKeys]
  }
  
  extension [Self <: IAccessControlEntryKeys](x: Self) {
    
    inline def setClone(value: CallbackTo[IAccessControlEntryKeys]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IAccessControlEntryKey): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
