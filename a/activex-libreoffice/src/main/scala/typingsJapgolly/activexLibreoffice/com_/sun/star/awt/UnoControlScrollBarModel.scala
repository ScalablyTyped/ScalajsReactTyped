package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the standard model of an {@link UnoControlScrollBar} . */
trait UnoControlScrollBarModel
  extends StObject
     with UnoControlModel {
  
  /**
    * specifies the RGB color to be used for the control.
    * @since OOo 2.0
    */
  var BackgroundColor: Color
  
  /** specifies the increment for a block move. */
  var BlockIncrement: Double
  
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double
  
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double
  
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean
  
  /** specifies the help text of the control. */
  var HelpText: String
  
  /** specifies the help URL of the control. */
  var HelpURL: String
  
  /** specifies the increment for a single line move. */
  var LineIncrement: Double
  
  /**
    * specifies the scrolling behavior of the control.
    *
    * `TRUE` means, that when the user moves the slider in the scroll bar, the content of the window is updated immediately. `FALSE` means, that the window
    * is only updated after the user has released the mouse button.
    * @since OOo 2.0
    */
  var LiveScroll: Boolean
  
  /** specifies the {@link ScrollBarOrientation} of the control. */
  var Orientation: Double
  
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean
  
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as scrolling the scrollbar), then usual control implementations
    * allow to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: Double
  
  /** specifies the scroll value of the control. */
  var ScrollValue: Double
  
  /** specifies the maximum scroll value of the control. */
  var ScrollValueMax: Double
  
  /**
    * specifies the minimum scroll value of the control.
    *
    * If this optional property is not present, clients of the component should assume a minimal scroll value of 0.
    */
  var ScrollValueMin: Double
  
  /**
    * specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons.
    * @since OOo 2.0
    */
  var SymbolColor: Color
  
  /**
    * specifies that the control can be reached with the TAB key.
    * @since OOo 2.0
    */
  var Tabstop: Boolean
  
  /** specifies the visible size of the scroll bar. */
  var VisibleSize: Double
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object UnoControlScrollBarModel {
  
  inline def apply(
    BackgroundColor: Color,
    BlockIncrement: Double,
    Border: Double,
    BorderColor: Double,
    DefaultControl: String,
    Enabled: Boolean,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    LineIncrement: Double,
    LiveScroll: Boolean,
    Name: String,
    Orientation: Double,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RepeatDelay: Double,
    ScrollValue: Double,
    ScrollValueMax: Double,
    ScrollValueMin: Double,
    ServiceName: String,
    Step: Double,
    SymbolColor: Color,
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
    VisibleSize: Double,
    Width: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createClone: CallbackTo[XCloneable],
    dispose: Callback,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    getServiceName: CallbackTo[String],
    queryInterface: `type` => Any,
    read: XObjectInputStream => Callback,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertiesChangeListener: XPropertiesChangeListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Callback,
    write: XObjectOutputStream => Callback
  ): UnoControlScrollBarModel = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any], BlockIncrement = BlockIncrement.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], LineIncrement = LineIncrement.asInstanceOf[js.Any], LiveScroll = LiveScroll.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RepeatDelay = RepeatDelay.asInstanceOf[js.Any], ScrollValue = ScrollValue.asInstanceOf[js.Any], ScrollValueMax = ScrollValueMax.asInstanceOf[js.Any], ScrollValueMin = ScrollValueMin.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], SymbolColor = SymbolColor.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tabstop = Tabstop.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], VisibleSize = VisibleSize.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createClone = createClone.toJsFn, dispose = dispose.toJsFn, firePropertiesChangeEvent = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (firePropertiesChangeEvent(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = getServiceName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1((t0: XObjectInputStream) => read(t0).runNow()), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertiesChangeListener = js.Any.fromFunction1((t0: XPropertiesChangeListener) => removePropertiesChangeListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setPropertyValues(t0, t1)).runNow()), write = js.Any.fromFunction1((t0: XObjectOutputStream) => write(t0).runNow()))
    __obj.asInstanceOf[UnoControlScrollBarModel]
  }
  
  extension [Self <: UnoControlScrollBarModel](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBlockIncrement(value: Double): Self = StObject.set(x, "BlockIncrement", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Double): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: CallbackTo[XPropertySetInfo]): Self = StObject.set(x, "getPropertySetInfo", value.toJsFn)
    
    inline def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    inline def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    inline def setLineIncrement(value: Double): Self = StObject.set(x, "LineIncrement", value.asInstanceOf[js.Any])
    
    inline def setLiveScroll(value: Boolean): Self = StObject.set(x, "LiveScroll", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setPrintable(value: Boolean): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "RepeatDelay", value.asInstanceOf[js.Any])
    
    inline def setScrollValue(value: Double): Self = StObject.set(x, "ScrollValue", value.asInstanceOf[js.Any])
    
    inline def setScrollValueMax(value: Double): Self = StObject.set(x, "ScrollValueMax", value.asInstanceOf[js.Any])
    
    inline def setScrollValueMin(value: Double): Self = StObject.set(x, "ScrollValueMin", value.asInstanceOf[js.Any])
    
    inline def setSymbolColor(value: Color): Self = StObject.set(x, "SymbolColor", value.asInstanceOf[js.Any])
    
    inline def setTabstop(value: Boolean): Self = StObject.set(x, "Tabstop", value.asInstanceOf[js.Any])
    
    inline def setVisibleSize(value: Double): Self = StObject.set(x, "VisibleSize", value.asInstanceOf[js.Any])
  }
}
