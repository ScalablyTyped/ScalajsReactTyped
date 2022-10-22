package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesFontAwesome extends StObject {
  
  def getIconList(): js.Array[String]
  
  def getIconUnicode(name: String): String
}
object NodesFontAwesome {
  
  inline def apply(getIconList: CallbackTo[js.Array[String]], getIconUnicode: String => String): NodesFontAwesome = {
    val __obj = js.Dynamic.literal(getIconList = getIconList.toJsFn, getIconUnicode = js.Any.fromFunction1(getIconUnicode))
    __obj.asInstanceOf[NodesFontAwesome]
  }
  
  extension [Self <: NodesFontAwesome](x: Self) {
    
    inline def setGetIconList(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getIconList", value.toJsFn)
    
    inline def setGetIconUnicode(value: String => String): Self = StObject.set(x, "getIconUnicode", js.Any.fromFunction1(value))
  }
}
