package typingsJapgolly.langmap

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("langmap", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LanguageMappingList = js.native
  
  trait Language extends StObject {
    
    var englishName: String
    
    var nativeName: String
  }
  object Language {
    
    inline def apply(englishName: String, nativeName: String): Language = {
      val __obj = js.Dynamic.literal(englishName = englishName.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    extension [Self <: Language](x: Self) {
      
      inline def setEnglishName(value: String): Self = StObject.set(x, "englishName", value.asInstanceOf[js.Any])
      
      inline def setNativeName(value: String): Self = StObject.set(x, "nativeName", value.asInstanceOf[js.Any])
    }
  }
  
  type LanguageMappingList = StringDictionary[Language]
  
  type _To = js.Object & LanguageMappingList
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & LanguageMappingList = ^
}
