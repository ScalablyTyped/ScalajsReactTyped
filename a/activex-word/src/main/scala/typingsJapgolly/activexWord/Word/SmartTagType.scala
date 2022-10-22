package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagType extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  val FriendlyName: String
  
  val Name: String
  
  val Parent: Any
  
  val SmartTagActions: typingsJapgolly.activexWord.Word.SmartTagActions
  
  val SmartTagRecognizers: typingsJapgolly.activexWord.Word.SmartTagRecognizers
  
  /* private */ @JSName("Word.SmartTagType_typekey")
  var WordDotSmartTagType_typekey: SmartTagType
}
object SmartTagType {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    FriendlyName: String,
    Name: String,
    Parent: Any,
    SmartTagActions: SmartTagActions,
    SmartTagRecognizers: SmartTagRecognizers,
    WordDotSmartTagType_typekey: SmartTagType
  ): SmartTagType = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FriendlyName = FriendlyName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SmartTagActions = SmartTagActions.asInstanceOf[js.Any], SmartTagRecognizers = SmartTagRecognizers.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagType_typekey")(WordDotSmartTagType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagType]
  }
  
  extension [Self <: SmartTagType](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "FriendlyName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSmartTagActions(value: SmartTagActions): Self = StObject.set(x, "SmartTagActions", value.asInstanceOf[js.Any])
    
    inline def setSmartTagRecognizers(value: SmartTagRecognizers): Self = StObject.set(x, "SmartTagRecognizers", value.asInstanceOf[js.Any])
    
    inline def setWordDotSmartTagType_typekey(value: SmartTagType): Self = StObject.set(x, "Word.SmartTagType_typekey", value.asInstanceOf[js.Any])
  }
}
