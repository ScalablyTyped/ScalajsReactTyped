package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationNodeCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_asLastNode(): Boolean
  
  def get_isExternal(): Boolean
  
  def get_previousNode(): NavigationNode
  
  def get_title(): String
  
  def get_url(): String
  
  def set_asLastNode(value: Boolean): Unit
  
  def set_isExternal(value: Boolean): Unit
  
  def set_previousNode(value: NavigationNode): Unit
  
  def set_title(value: String): Unit
  
  def set_url(value: String): Unit
}
object NavigationNodeCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_asLastNode: CallbackTo[Boolean],
    get_isExternal: CallbackTo[Boolean],
    get_previousNode: CallbackTo[NavigationNode],
    get_title: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_url: CallbackTo[String],
    set_asLastNode: Boolean => Callback,
    set_isExternal: Boolean => Callback,
    set_previousNode: NavigationNode => Callback,
    set_title: String => Callback,
    set_url: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): NavigationNodeCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_asLastNode = get_asLastNode.toJsFn, get_isExternal = get_isExternal.toJsFn, get_previousNode = get_previousNode.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, get_url = get_url.toJsFn, set_asLastNode = js.Any.fromFunction1((t0: Boolean) => set_asLastNode(t0).runNow()), set_isExternal = js.Any.fromFunction1((t0: Boolean) => set_isExternal(t0).runNow()), set_previousNode = js.Any.fromFunction1((t0: NavigationNode) => set_previousNode(t0).runNow()), set_title = js.Any.fromFunction1((t0: String) => set_title(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[NavigationNodeCreationInformation]
  }
  
  extension [Self <: NavigationNodeCreationInformation](x: Self) {
    
    inline def setGet_asLastNode(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_asLastNode", value.toJsFn)
    
    inline def setGet_isExternal(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isExternal", value.toJsFn)
    
    inline def setGet_previousNode(value: CallbackTo[NavigationNode]): Self = StObject.set(x, "get_previousNode", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setSet_asLastNode(value: Boolean => Callback): Self = StObject.set(x, "set_asLastNode", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_isExternal(value: Boolean => Callback): Self = StObject.set(x, "set_isExternal", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_previousNode(value: NavigationNode => Callback): Self = StObject.set(x, "set_previousNode", js.Any.fromFunction1((t0: NavigationNode) => value(t0).runNow()))
    
    inline def setSet_title(value: String => Callback): Self = StObject.set(x, "set_title", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
