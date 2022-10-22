package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapFormLayoutItem extends StObject {
  
  val formLayout: BootstrapFormLayout | Null
  
  def getCaption(): String
  
  def getItemByName(name: String): BootstrapFormLayoutItem | Null
  
  def getVisible(): Boolean
  
  /* protected */ val instance: Any
  
  val name: String
  
  val parent: BootstrapFormLayoutItem | Null
  
  def setCaption(caption: String): Unit
  
  def setVisible(value: Boolean): Unit
}
object BootstrapFormLayoutItem {
  
  inline def apply(
    getCaption: CallbackTo[String],
    getItemByName: String => BootstrapFormLayoutItem | Null,
    getVisible: CallbackTo[Boolean],
    instance: Any,
    name: String,
    setCaption: String => Callback,
    setVisible: Boolean => Callback
  ): BootstrapFormLayoutItem = {
    val __obj = js.Dynamic.literal(getCaption = getCaption.toJsFn, getItemByName = js.Any.fromFunction1(getItemByName), getVisible = getVisible.toJsFn, instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setCaption = js.Any.fromFunction1((t0: String) => setCaption(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), formLayout = null, parent = null)
    __obj.asInstanceOf[BootstrapFormLayoutItem]
  }
  
  extension [Self <: BootstrapFormLayoutItem](x: Self) {
    
    inline def setFormLayout(value: BootstrapFormLayout): Self = StObject.set(x, "formLayout", value.asInstanceOf[js.Any])
    
    inline def setFormLayoutNull: Self = StObject.set(x, "formLayout", null)
    
    inline def setGetCaption(value: CallbackTo[String]): Self = StObject.set(x, "getCaption", value.toJsFn)
    
    inline def setGetItemByName(value: String => BootstrapFormLayoutItem | Null): Self = StObject.set(x, "getItemByName", js.Any.fromFunction1(value))
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: BootstrapFormLayoutItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setSetCaption(value: String => Callback): Self = StObject.set(x, "setCaption", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
