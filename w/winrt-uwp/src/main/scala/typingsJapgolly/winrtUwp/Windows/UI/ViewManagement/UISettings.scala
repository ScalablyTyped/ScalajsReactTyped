package typingsJapgolly.winrtUwp.Windows.UI.ViewManagement

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.Size
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.UI.Color
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.colorvalueschanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.textscalefactorchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a set of common app user interface settings and operations. */
@js.native
trait UISettings extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorvalueschanged(`type`: colorvalueschanged, listener: TypedEventHandler[UISettings, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textscalefactorchanged(`type`: textscalefactorchanged, listener: TypedEventHandler[UISettings, Any]): Unit = js.native
  
  /** Gets whether animations are enabled for the user interface. */
  var animationsEnabled: Boolean = js.native
  
  /** Gets the blink rate of a new caret created by the app view. */
  var caretBlinkRate: Double = js.native
  
  /** Gets whether the caret can be used for browse operations. */
  var caretBrowsingEnabled: Boolean = js.native
  
  /** Gets the width of a new caret created by the app view. */
  var caretWidth: Double = js.native
  
  /** Gets the size of a new cursor created by the app view. */
  var cursorSize: Size = js.native
  
  /** Gets the maximum allowed time between clicks in a double-click operation. */
  var doubleClickTime: Double = js.native
  
  /**
    * Returns the color value of the specified color type.
    * @param desiredColor An enumeration value that specifies the type of color to get a value for.
    * @return The color value of the specified color type.
    */
  def getColorValue(desiredColor: UIColorType): Color = js.native
  
  /** Gets the directional preference of the user interface created by the app view. */
  var handPreference: HandPreference = js.native
  
  /** Gets the length of time a message is displayed for the app view. */
  var messageDuration: Double = js.native
  
  /** Gets the amount of time the mouse pointer can rest in a hover rectangle before a hover event is raised. */
  var mouseHoverTime: Double = js.native
  
  /** Occurs when color values have changed. */
  def oncolorvalueschanged(ev: Any & WinRTEvent[UISettings]): Unit = js.native
  /** Occurs when color values have changed. */
  @JSName("oncolorvalueschanged")
  var oncolorvalueschanged_Original: TypedEventHandler[UISettings, Any] = js.native
  
  /** Occurs when the system text size setting is changed. */
  def ontextscalefactorchanged(ev: Any & WinRTEvent[UISettings]): Unit = js.native
  /** Occurs when the system text size setting is changed. */
  @JSName("ontextscalefactorchanged")
  var ontextscalefactorchanged_Original: TypedEventHandler[UISettings, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_colorvalueschanged(`type`: colorvalueschanged, listener: TypedEventHandler[UISettings, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_textscalefactorchanged(`type`: textscalefactorchanged, listener: TypedEventHandler[UISettings, Any]): Unit = js.native
  
  /** Gets the size of a scroll bar arrow for windows associated with the app view. */
  var scrollBarArrowSize: Size = js.native
  
  /** Gets the size of a scroll bar for windows associated with the app view. */
  var scrollBarSize: Size = js.native
  
  /** Gets the size of a thumb box for windows associated with the app view. */
  var scrollBarThumbBoxSize: Size = js.native
  
  /** Gets the value of the system text size setting. */
  var textScaleFactor: Double = js.native
  
  /**
    * Gets the color used for a specific user interface element type, such as a button face or window text.
    * @param desiredElement The type of element for which the color will be obtained.
    * @return The color of the element type, expressed as a 32-bit color value.
    */
  def uiElementColor(desiredElement: UIElementType): Color = js.native
}
