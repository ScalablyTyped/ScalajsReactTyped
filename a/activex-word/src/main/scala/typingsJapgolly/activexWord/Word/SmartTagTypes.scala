package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagTypes extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): SmartTagType
  
  val Parent: Any
  
  def ReloadAll(): Unit
  
  /* private */ @JSName("Word.SmartTagTypes_typekey")
  var WordDotSmartTagTypes_typekey: SmartTagTypes
}
object SmartTagTypes {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => SmartTagType,
    Parent: Any,
    ReloadAll: Callback,
    WordDotSmartTagTypes_typekey: SmartTagTypes
  ): SmartTagTypes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadAll = ReloadAll.toJsFn)
    __obj.updateDynamic("Word.SmartTagTypes_typekey")(WordDotSmartTagTypes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagTypes]
  }
  
  extension [Self <: SmartTagTypes](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => SmartTagType): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReloadAll(value: Callback): Self = StObject.set(x, "ReloadAll", value.toJsFn)
    
    inline def setWordDotSmartTagTypes_typekey(value: SmartTagTypes): Self = StObject.set(x, "Word.SmartTagTypes_typekey", value.asInstanceOf[js.Any])
  }
}
