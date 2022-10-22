package typingsJapgolly.activexVbide.VBIDE

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  val Caption: String
  
  def Close(): Unit
  
  def Collection(index: Any): Window
  @JSName("Collection")
  val Collection_Original: Windows
  
  val HWnd: Double
  
  var Height: Double
  
  var Left: Double
  
  val LinkedWindowFrame: Window
  
  def LinkedWindows(index: Any): Window
  @JSName("LinkedWindows")
  val LinkedWindows_Original: LinkedWindows
  
  def SetFocus(): Unit
  
  var Top: Double
  
  val Type: vbextWindowType
  
  val VBE: typingsJapgolly.activexVbide.VBIDE.VBE
  
  /* private */ @JSName("VBIDE.Window_typekey")
  var VBIDEDotWindow_typekey: Window
  
  var Visible: Boolean
  
  var Width: Double
  
  var WindowState: vbextWindowState
}
object Window {
  
  inline def apply(
    Caption: String,
    Close: Callback,
    Collection: Windows,
    HWnd: Double,
    Height: Double,
    Left: Double,
    LinkedWindowFrame: Window,
    LinkedWindows: LinkedWindows,
    SetFocus: Callback,
    Top: Double,
    Type: vbextWindowType,
    VBE: VBE,
    VBIDEDotWindow_typekey: Window,
    Visible: Boolean,
    Width: Double,
    WindowState: vbextWindowState
  ): Window = {
    val __obj = js.Dynamic.literal(Caption = Caption.asInstanceOf[js.Any], Close = Close.toJsFn, Collection = Collection.asInstanceOf[js.Any], HWnd = HWnd.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], LinkedWindowFrame = LinkedWindowFrame.asInstanceOf[js.Any], LinkedWindows = LinkedWindows.asInstanceOf[js.Any], SetFocus = SetFocus.toJsFn, Top = Top.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], VBE = VBE.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WindowState = WindowState.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.Window_typekey")(VBIDEDotWindow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "Close", value.toJsFn)
    
    inline def setCollection(value: Windows): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    
    inline def setHWnd(value: Double): Self = StObject.set(x, "HWnd", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setLinkedWindowFrame(value: Window): Self = StObject.set(x, "LinkedWindowFrame", value.asInstanceOf[js.Any])
    
    inline def setLinkedWindows(value: LinkedWindows): Self = StObject.set(x, "LinkedWindows", value.asInstanceOf[js.Any])
    
    inline def setSetFocus(value: Callback): Self = StObject.set(x, "SetFocus", value.toJsFn)
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setType(value: vbextWindowType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVBE(value: VBE): Self = StObject.set(x, "VBE", value.asInstanceOf[js.Any])
    
    inline def setVBIDEDotWindow_typekey(value: Window): Self = StObject.set(x, "VBIDE.Window_typekey", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWindowState(value: vbextWindowState): Self = StObject.set(x, "WindowState", value.asInstanceOf[js.Any])
  }
}
