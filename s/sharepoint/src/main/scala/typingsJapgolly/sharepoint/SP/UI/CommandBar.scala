package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.HtmlBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandBar extends StObject {
  
  def addCommand(action: Command): Unit
  
  def attachEvents(): Unit
  
  def findCommandByName(name: String): Command
  
  def get_commands(): js.Array[Command]
  
  def get_dropDownThreshold(): Double
  
  def get_elementID(): String
  
  def get_overrideClass(): String
  
  def insertCommand(action: Command, position: Double): Unit
  
  def render(builder: HtmlBuilder): Unit
  
  def set_dropDownThreshold(value: Double): Double
  
  def set_overrideClass(value: String): String
}
object CommandBar {
  
  inline def apply(
    addCommand: Command => Callback,
    attachEvents: Callback,
    findCommandByName: String => Command,
    get_commands: CallbackTo[js.Array[Command]],
    get_dropDownThreshold: CallbackTo[Double],
    get_elementID: CallbackTo[String],
    get_overrideClass: CallbackTo[String],
    insertCommand: (Command, Double) => Callback,
    render: HtmlBuilder => Callback,
    set_dropDownThreshold: Double => Double,
    set_overrideClass: String => String
  ): CommandBar = {
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1((t0: Command) => addCommand(t0).runNow()), attachEvents = attachEvents.toJsFn, findCommandByName = js.Any.fromFunction1(findCommandByName), get_commands = get_commands.toJsFn, get_dropDownThreshold = get_dropDownThreshold.toJsFn, get_elementID = get_elementID.toJsFn, get_overrideClass = get_overrideClass.toJsFn, insertCommand = js.Any.fromFunction2((t0: Command, t1: Double) => (insertCommand(t0, t1)).runNow()), render = js.Any.fromFunction1((t0: HtmlBuilder) => render(t0).runNow()), set_dropDownThreshold = js.Any.fromFunction1(set_dropDownThreshold), set_overrideClass = js.Any.fromFunction1(set_overrideClass))
    __obj.asInstanceOf[CommandBar]
  }
  
  extension [Self <: CommandBar](x: Self) {
    
    inline def setAddCommand(value: Command => Callback): Self = StObject.set(x, "addCommand", js.Any.fromFunction1((t0: Command) => value(t0).runNow()))
    
    inline def setAttachEvents(value: Callback): Self = StObject.set(x, "attachEvents", value.toJsFn)
    
    inline def setFindCommandByName(value: String => Command): Self = StObject.set(x, "findCommandByName", js.Any.fromFunction1(value))
    
    inline def setGet_commands(value: CallbackTo[js.Array[Command]]): Self = StObject.set(x, "get_commands", value.toJsFn)
    
    inline def setGet_dropDownThreshold(value: CallbackTo[Double]): Self = StObject.set(x, "get_dropDownThreshold", value.toJsFn)
    
    inline def setGet_elementID(value: CallbackTo[String]): Self = StObject.set(x, "get_elementID", value.toJsFn)
    
    inline def setGet_overrideClass(value: CallbackTo[String]): Self = StObject.set(x, "get_overrideClass", value.toJsFn)
    
    inline def setInsertCommand(value: (Command, Double) => Callback): Self = StObject.set(x, "insertCommand", js.Any.fromFunction2((t0: Command, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRender(value: HtmlBuilder => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: HtmlBuilder) => value(t0).runNow()))
    
    inline def setSet_dropDownThreshold(value: Double => Double): Self = StObject.set(x, "set_dropDownThreshold", js.Any.fromFunction1(value))
    
    inline def setSet_overrideClass(value: String => String): Self = StObject.set(x, "set_overrideClass", js.Any.fromFunction1(value))
  }
}
