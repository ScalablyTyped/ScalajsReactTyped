package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindow extends StObject {
  
  def Close(): Unit
  
  val Events: IWindowEvents
  
  def Focus(): Unit
  
  val Handle: Double
  
  var Height: Double
  
  val IsFocused: Boolean
  
  var Maximizable: Boolean
  
  def Maximize(): Unit
  
  var Minimizable: Boolean
  
  def Minimize(): Unit
  
  var Resizable: Boolean
  
  def Restore(): Unit
  
  def SetDefaultSize(defaultWidth: Double, defaultHeight: Double, resizeToDefault: Boolean): Unit
  
  var Title: String
  
  var Width: Double
}
object IWindow {
  
  inline def apply(
    Close: Callback,
    Events: IWindowEvents,
    Focus: Callback,
    Handle: Double,
    Height: Double,
    IsFocused: Boolean,
    Maximizable: Boolean,
    Maximize: Callback,
    Minimizable: Boolean,
    Minimize: Callback,
    Resizable: Boolean,
    Restore: Callback,
    SetDefaultSize: (Double, Double, Boolean) => Callback,
    Title: String,
    Width: Double
  ): IWindow = {
    val __obj = js.Dynamic.literal(Close = Close.toJsFn, Events = Events.asInstanceOf[js.Any], Focus = Focus.toJsFn, Handle = Handle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFocused = IsFocused.asInstanceOf[js.Any], Maximizable = Maximizable.asInstanceOf[js.Any], Maximize = Maximize.toJsFn, Minimizable = Minimizable.asInstanceOf[js.Any], Minimize = Minimize.toJsFn, Resizable = Resizable.asInstanceOf[js.Any], Restore = Restore.toJsFn, SetDefaultSize = js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (SetDefaultSize(t0, t1, t2)).runNow()), Title = Title.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindow]
  }
  
  extension [Self <: IWindow](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "Close", value.toJsFn)
    
    inline def setEvents(value: IWindowEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "Focus", value.toJsFn)
    
    inline def setHandle(value: Double): Self = StObject.set(x, "Handle", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "IsFocused", value.asInstanceOf[js.Any])
    
    inline def setMaximizable(value: Boolean): Self = StObject.set(x, "Maximizable", value.asInstanceOf[js.Any])
    
    inline def setMaximize(value: Callback): Self = StObject.set(x, "Maximize", value.toJsFn)
    
    inline def setMinimizable(value: Boolean): Self = StObject.set(x, "Minimizable", value.asInstanceOf[js.Any])
    
    inline def setMinimize(value: Callback): Self = StObject.set(x, "Minimize", value.toJsFn)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "Resizable", value.asInstanceOf[js.Any])
    
    inline def setRestore(value: Callback): Self = StObject.set(x, "Restore", value.toJsFn)
    
    inline def setSetDefaultSize(value: (Double, Double, Boolean) => Callback): Self = StObject.set(x, "SetDefaultSize", js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
