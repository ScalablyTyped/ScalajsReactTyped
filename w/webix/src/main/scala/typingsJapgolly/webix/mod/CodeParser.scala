package typingsJapgolly.webix.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeParser extends StObject {
  
  def collapseNames(obj: Any): StringDictionary[Any]
  
  def expandNames(obj: StringDictionary[Any]): Any
}
object CodeParser {
  
  @JSImport("webix", "CodeParser")
  @js.native
  val ^ : CodeParser = js.native
  
  extension [Self <: CodeParser](x: Self) {
    
    inline def setCollapseNames(value: Any => StringDictionary[Any]): Self = StObject.set(x, "collapseNames", js.Any.fromFunction1(value))
    
    inline def setExpandNames(value: StringDictionary[Any] => Any): Self = StObject.set(x, "expandNames", js.Any.fromFunction1(value))
  }
}
