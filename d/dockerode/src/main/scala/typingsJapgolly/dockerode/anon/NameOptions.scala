package typingsJapgolly.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameOptions extends StObject {
  
  var Name: js.UndefOr[String] = js.undefined
  
  var Options: js.UndefOr[StringDictionary[String]] = js.undefined
}
object NameOptions {
  
  inline def apply(): NameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameOptions]
  }
  
  extension [Self <: NameOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
  }
}
