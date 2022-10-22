package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPathToItemsCollection extends StObject {
  
  var items: StringDictionary[js.Array[GitItem]]
}
object GitPathToItemsCollection {
  
  inline def apply(items: StringDictionary[js.Array[GitItem]]): GitPathToItemsCollection = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPathToItemsCollection]
  }
  
  extension [Self <: GitPathToItemsCollection](x: Self) {
    
    inline def setItems(value: StringDictionary[js.Array[GitItem]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
