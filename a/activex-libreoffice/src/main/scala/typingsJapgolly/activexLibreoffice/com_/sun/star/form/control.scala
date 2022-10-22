package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlButton
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlCheckBox
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlComboBox
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlCurrencyField
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlDateField
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlEdit
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlFormattedField
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlGroupBox
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlImageControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlListBox
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlNumericField
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlPatternField
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlRadioButton
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlTimeField
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XActionListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XGraphics
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XItemListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XToolkit
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XView
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.submission.XSubmission
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatch
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatchProviderInterception
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatchProviderInterceptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XStatusListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModeSelector
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XNumberFormatter
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  /**
    * describes a check box control which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.CheckBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait CheckBox
    extends StObject
       with UnoControlCheckBox
       with XBoundControl
  object CheckBox {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      Lock: Boolean,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      State: Double,
      View: XView,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addItemListener: XItemListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addWindowListener: XWindowListener => Callback,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Callback,
      dispose: Callback,
      draw: (Double, Double) => Callback,
      enableTriState: Boolean => Callback,
      getAccessibleContext: CallbackTo[XAccessibleContext],
      getContext: CallbackTo[XInterface],
      getGraphics: CallbackTo[XGraphics],
      getLock: CallbackTo[Boolean],
      getMinimumSize: CallbackTo[Size],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getPosSize: CallbackTo[Rectangle],
      getPreferredSize: CallbackTo[Size],
      getSize: CallbackTo[Size],
      getState: CallbackTo[Double],
      getView: CallbackTo[XView],
      isDesignMode: CallbackTo[Boolean],
      isTransparent: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeItemListener: XItemListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeWindowListener: XWindowListener => Callback,
      setContext: XInterface => Callback,
      setDesignMode: Boolean => Callback,
      setEnable: Boolean => Callback,
      setFocus: Callback,
      setGraphics: XGraphics => Boolean,
      setLabel: String => Callback,
      setLock: Boolean => Callback,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Callback,
      setState: Double => Callback,
      setVisible: Boolean => Callback,
      setZoom: (Double, Double) => Callback
    ): CheckBox = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Lock = Lock.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addItemListener = js.Any.fromFunction1((t0: XItemListener) => addItemListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), enableTriState = js.Any.fromFunction1((t0: Boolean) => enableTriState(t0).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getContext = getContext.toJsFn, getGraphics = getGraphics.toJsFn, getLock = getLock.toJsFn, getMinimumSize = getMinimumSize.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getPreferredSize = getPreferredSize.toJsFn, getSize = getSize.toJsFn, getState = getState.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeItemListener = js.Any.fromFunction1((t0: XItemListener) => removeItemListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setLock = js.Any.fromFunction1((t0: Boolean) => setLock(t0).runNow()), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setState = js.Any.fromFunction1((t0: Double) => setState(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
      __obj.asInstanceOf[CheckBox]
    }
  }
  
  /**
    * describes a combo box control.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.ComboBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait ComboBox
    extends StObject
       with UnoControlComboBox
       with XBoundControl
  
  /**
    * describes a button control.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.CommandButton} service.
    *
    * The control is clickable, the action taken upon clicking depends on the settings of the model the control belongs to.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    * @see com.sun.star.form.component.CommandButton.ButtonType
    */
  trait CommandButton
    extends StObject
       with UnoControlButton
       with XApproveActionBroadcaster
  object CommandButton {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      View: XView,
      acquire: Callback,
      addActionListener: XActionListener => Callback,
      addApproveActionListener: XApproveActionListener => Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addWindowListener: XWindowListener => Callback,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Callback,
      dispose: Callback,
      draw: (Double, Double) => Callback,
      getAccessibleContext: CallbackTo[XAccessibleContext],
      getContext: CallbackTo[XInterface],
      getGraphics: CallbackTo[XGraphics],
      getMinimumSize: CallbackTo[Size],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getPosSize: CallbackTo[Rectangle],
      getPreferredSize: CallbackTo[Size],
      getSize: CallbackTo[Size],
      getView: CallbackTo[XView],
      isDesignMode: CallbackTo[Boolean],
      isTransparent: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeActionListener: XActionListener => Callback,
      removeApproveActionListener: XApproveActionListener => Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeWindowListener: XWindowListener => Callback,
      setActionCommand: String => Callback,
      setContext: XInterface => Callback,
      setDesignMode: Boolean => Callback,
      setEnable: Boolean => Callback,
      setFocus: Callback,
      setGraphics: XGraphics => Boolean,
      setLabel: String => Callback,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Callback,
      setVisible: Boolean => Callback,
      setZoom: (Double, Double) => Callback
    ): CommandButton = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addActionListener = js.Any.fromFunction1((t0: XActionListener) => addActionListener(t0).runNow()), addApproveActionListener = js.Any.fromFunction1((t0: XApproveActionListener) => addApproveActionListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getContext = getContext.toJsFn, getGraphics = getGraphics.toJsFn, getMinimumSize = getMinimumSize.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getPreferredSize = getPreferredSize.toJsFn, getSize = getSize.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActionListener = js.Any.fromFunction1((t0: XActionListener) => removeActionListener(t0).runNow()), removeApproveActionListener = js.Any.fromFunction1((t0: XApproveActionListener) => removeApproveActionListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setActionCommand = js.Any.fromFunction1((t0: String) => setActionCommand(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
      __obj.asInstanceOf[CommandButton]
    }
  }
  
  /**
    * describes a control which can be used for inputting currency values, and which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.CurrencyField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait CurrencyField
    extends StObject
       with UnoControlCurrencyField
       with XBoundControl
  
  /**
    * describes a control which can be used for inputting date values, and which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.DateField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait DateField
    extends StObject
       with UnoControlDateField
       with XBoundControl
  
  /**
    * describes a check box control which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.CheckBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait FilterControl
    extends StObject
       with XControl {
    
    def createWithFormat(MessageParent: XWindow, NumberFormatter: XNumberFormatter, ControlModel: XPropertySet): Unit
  }
  object FilterControl {
    
    inline def apply(
      Context: XInterface,
      Model: XControlModel,
      Peer: XWindowPeer,
      View: XView,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      createPeer: (XToolkit, XWindowPeer) => Callback,
      createWithFormat: (XWindow, XNumberFormatter, XPropertySet) => Callback,
      dispose: Callback,
      getContext: CallbackTo[XInterface],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getView: CallbackTo[XView],
      isDesignMode: CallbackTo[Boolean],
      isTransparent: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      setContext: XInterface => Callback,
      setDesignMode: Boolean => Callback,
      setModel: XControlModel => Boolean
    ): FilterControl = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), createWithFormat = js.Any.fromFunction3((t0: XWindow, t1: XNumberFormatter, t2: XPropertySet) => (createWithFormat(t0, t1, t2)).runNow()), dispose = dispose.toJsFn, getContext = getContext.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setModel = js.Any.fromFunction1(setModel))
      __obj.asInstanceOf[FilterControl]
    }
    
    extension [Self <: FilterControl](x: Self) {
      
      inline def setCreateWithFormat(value: (XWindow, XNumberFormatter, XPropertySet) => Callback): Self = StObject.set(x, "createWithFormat", js.Any.fromFunction3((t0: XWindow, t1: XNumberFormatter, t2: XPropertySet) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  /**
    * describes a control which can be used for inputting values with a arbitrary formatting, and can (but not necessarily has to) be bound to a database
    * field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.FormattedField} service.
    *
    * In addition, this control can be used in HTML forms. It triggers the {@link com.sun.star.form.XSubmit.submit()} method of the form it belongs to if
    * the **enter** key is pressed while it has the focus.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    * @see com.sun.star.util.XNumberFormatsSupplier
    */
  @js.native
  trait FormattedField
    extends StObject
       with UnoControlFormattedField
       with XBoundControl
  
  /**
    * describes a table-like control for displaying data.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.GridControl} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait GridControl
    extends StObject
       with UnoControl
       with XBoundComponent
       with XGridControl
       with XModifyBroadcaster
       with XIndexAccess
       with XEnumerationAccess
       with XModeSelector
       with XSelectionSupplier
       with XDispatchProviderInterception
  object GridControl {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Count: Double,
      CurrentColumnPosition: Double,
      ElementType: `type`,
      Graphics: XGraphics,
      Mode: String,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      Selection: Any,
      Size: Size,
      SupportedModes: SafeArray[String],
      View: XView,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addGridControlListener: XGridControlListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addModifyListener: XModifyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addSelectionChangeListener: XSelectionChangeListener => Callback,
      addUpdateListener: XUpdateListener => Callback,
      addWindowListener: XWindowListener => Callback,
      commit: CallbackTo[Boolean],
      createEnumeration: CallbackTo[XEnumeration],
      createPeer: (XToolkit, XWindowPeer) => Callback,
      dispose: Callback,
      draw: (Double, Double) => Callback,
      getAccessibleContext: CallbackTo[XAccessibleContext],
      getByIndex: Double => Any,
      getContext: CallbackTo[XInterface],
      getCount: CallbackTo[Double],
      getCurrentColumnPosition: CallbackTo[Double],
      getElementType: CallbackTo[`type`],
      getGraphics: CallbackTo[XGraphics],
      getMode: CallbackTo[String],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getPosSize: CallbackTo[Rectangle],
      getSelection: CallbackTo[Any],
      getSize: CallbackTo[Size],
      getSupportedModes: CallbackTo[SafeArray[String]],
      getView: CallbackTo[XView],
      hasElements: CallbackTo[Boolean],
      isDesignMode: CallbackTo[Boolean],
      isTransparent: CallbackTo[Boolean],
      queryFieldData: (Double, `type`) => SafeArray[Any],
      queryFieldDataType: `type` => SafeArray[Boolean],
      queryInterface: `type` => Any,
      registerDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback,
      release: Callback,
      releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeGridControlListener: XGridControlListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeModifyListener: XModifyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeSelectionChangeListener: XSelectionChangeListener => Callback,
      removeUpdateListener: XUpdateListener => Callback,
      removeWindowListener: XWindowListener => Callback,
      select: Any => Boolean,
      setContext: XInterface => Callback,
      setCurrentColumnPosition: Double => Callback,
      setDesignMode: Boolean => Callback,
      setEnable: Boolean => Callback,
      setFocus: Callback,
      setGraphics: XGraphics => Boolean,
      setMode: String => Callback,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Callback,
      setVisible: Boolean => Callback,
      setZoom: (Double, Double) => Callback,
      supportsMode: String => Boolean
    ): GridControl = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], CurrentColumnPosition = CurrentColumnPosition.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addGridControlListener = js.Any.fromFunction1((t0: XGridControlListener) => addGridControlListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), addUpdateListener = js.Any.fromFunction1((t0: XUpdateListener) => addUpdateListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), commit = commit.toJsFn, createEnumeration = createEnumeration.toJsFn, createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getContext = getContext.toJsFn, getCount = getCount.toJsFn, getCurrentColumnPosition = getCurrentColumnPosition.toJsFn, getElementType = getElementType.toJsFn, getGraphics = getGraphics.toJsFn, getMode = getMode.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getSelection = getSelection.toJsFn, getSize = getSize.toJsFn, getSupportedModes = getSupportedModes.toJsFn, getView = getView.toJsFn, hasElements = hasElements.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryFieldData = js.Any.fromFunction2(queryFieldData), queryFieldDataType = js.Any.fromFunction1(queryFieldDataType), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => registerDispatchProviderInterceptor(t0).runNow()), release = release.toJsFn, releaseDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => releaseDispatchProviderInterceptor(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeGridControlListener = js.Any.fromFunction1((t0: XGridControlListener) => removeGridControlListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()), removeUpdateListener = js.Any.fromFunction1((t0: XUpdateListener) => removeUpdateListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), select = js.Any.fromFunction1(select), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setCurrentColumnPosition = js.Any.fromFunction1((t0: Double) => setCurrentColumnPosition(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setMode = js.Any.fromFunction1((t0: String) => setMode(t0).runNow()), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()), supportsMode = js.Any.fromFunction1(supportsMode))
      __obj.asInstanceOf[GridControl]
    }
  }
  
  /**
    * describes a control which can be used for visually grouping controls
    *
    * The model of the control has to support the {@link com.sun.star.form.component.GroupBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  type GroupBox = UnoControlGroupBox
  
  /**
    * describes a control which can be used for displaying images on a control acting like a button.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.ImageButton} service.
    *
    * The control is clickable, the action taken upon clicking depends on the settings of the model the control belongs to.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    * @see com.sun.star.form.component.ImageButton.ButtonType
    */
  trait ImageButton
    extends StObject
       with UnoControlImageControl
       with XApproveActionBroadcaster
  object ImageButton {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      View: XView,
      acquire: Callback,
      addApproveActionListener: XApproveActionListener => Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addWindowListener: XWindowListener => Callback,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Callback,
      dispose: Callback,
      draw: (Double, Double) => Callback,
      getAccessibleContext: CallbackTo[XAccessibleContext],
      getContext: CallbackTo[XInterface],
      getGraphics: CallbackTo[XGraphics],
      getMinimumSize: CallbackTo[Size],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getPosSize: CallbackTo[Rectangle],
      getPreferredSize: CallbackTo[Size],
      getSize: CallbackTo[Size],
      getView: CallbackTo[XView],
      isDesignMode: CallbackTo[Boolean],
      isTransparent: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeApproveActionListener: XApproveActionListener => Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeWindowListener: XWindowListener => Callback,
      setContext: XInterface => Callback,
      setDesignMode: Boolean => Callback,
      setEnable: Boolean => Callback,
      setFocus: Callback,
      setGraphics: XGraphics => Boolean,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Callback,
      setVisible: Boolean => Callback,
      setZoom: (Double, Double) => Callback
    ): ImageButton = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addApproveActionListener = js.Any.fromFunction1((t0: XApproveActionListener) => addApproveActionListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getContext = getContext.toJsFn, getGraphics = getGraphics.toJsFn, getMinimumSize = getMinimumSize.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getPreferredSize = getPreferredSize.toJsFn, getSize = getSize.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeApproveActionListener = js.Any.fromFunction1((t0: XApproveActionListener) => removeApproveActionListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
      __obj.asInstanceOf[ImageButton]
    }
  }
  
  /**
    * describes a control used for displaying images stored in a database.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.DatabaseImageControl} service.
    *
    * If the model of the control is valid bound to a database field, the control allows to select an image (browsing the file system) upon double clicking
    * into it, and forwards the URL of the chosen image to the ImageURL property of its model.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait ImageControl
    extends StObject
       with UnoControlImageControl
       with XBoundControl
  object ImageControl {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      Lock: Boolean,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      View: XView,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addWindowListener: XWindowListener => Callback,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Callback,
      dispose: Callback,
      draw: (Double, Double) => Callback,
      getAccessibleContext: CallbackTo[XAccessibleContext],
      getContext: CallbackTo[XInterface],
      getGraphics: CallbackTo[XGraphics],
      getLock: CallbackTo[Boolean],
      getMinimumSize: CallbackTo[Size],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getPosSize: CallbackTo[Rectangle],
      getPreferredSize: CallbackTo[Size],
      getSize: CallbackTo[Size],
      getView: CallbackTo[XView],
      isDesignMode: CallbackTo[Boolean],
      isTransparent: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeWindowListener: XWindowListener => Callback,
      setContext: XInterface => Callback,
      setDesignMode: Boolean => Callback,
      setEnable: Boolean => Callback,
      setFocus: Callback,
      setGraphics: XGraphics => Boolean,
      setLock: Boolean => Callback,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Callback,
      setVisible: Boolean => Callback,
      setZoom: (Double, Double) => Callback
    ): ImageControl = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Lock = Lock.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getContext = getContext.toJsFn, getGraphics = getGraphics.toJsFn, getLock = getLock.toJsFn, getMinimumSize = getMinimumSize.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getPreferredSize = getPreferredSize.toJsFn, getSize = getSize.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setLock = js.Any.fromFunction1((t0: Boolean) => setLock(t0).runNow()), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
      __obj.asInstanceOf[ImageControl]
    }
  }
  
  /** is an extended grid control, which allows the user to customize some of its user interface's aspects. */
  trait InteractionGridControl
    extends StObject
       with GridControl
       with XDispatch
  object InteractionGridControl {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Count: Double,
      CurrentColumnPosition: Double,
      ElementType: `type`,
      Graphics: XGraphics,
      Mode: String,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      Selection: Any,
      Size: Size,
      SupportedModes: SafeArray[String],
      View: XView,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addGridControlListener: XGridControlListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addModifyListener: XModifyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addSelectionChangeListener: XSelectionChangeListener => Callback,
      addStatusListener: (XStatusListener, URL) => Callback,
      addUpdateListener: XUpdateListener => Callback,
      addWindowListener: XWindowListener => Callback,
      commit: CallbackTo[Boolean],
      createEnumeration: CallbackTo[XEnumeration],
      createPeer: (XToolkit, XWindowPeer) => Callback,
      dispatch: (URL, SeqEquiv[PropertyValue]) => Callback,
      dispose: Callback,
      draw: (Double, Double) => Callback,
      getAccessibleContext: CallbackTo[XAccessibleContext],
      getByIndex: Double => Any,
      getContext: CallbackTo[XInterface],
      getCount: CallbackTo[Double],
      getCurrentColumnPosition: CallbackTo[Double],
      getElementType: CallbackTo[`type`],
      getGraphics: CallbackTo[XGraphics],
      getMode: CallbackTo[String],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getPosSize: CallbackTo[Rectangle],
      getSelection: CallbackTo[Any],
      getSize: CallbackTo[Size],
      getSupportedModes: CallbackTo[SafeArray[String]],
      getView: CallbackTo[XView],
      hasElements: CallbackTo[Boolean],
      isDesignMode: CallbackTo[Boolean],
      isTransparent: CallbackTo[Boolean],
      queryFieldData: (Double, `type`) => SafeArray[Any],
      queryFieldDataType: `type` => SafeArray[Boolean],
      queryInterface: `type` => Any,
      registerDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback,
      release: Callback,
      releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeGridControlListener: XGridControlListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeModifyListener: XModifyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeSelectionChangeListener: XSelectionChangeListener => Callback,
      removeStatusListener: (XStatusListener, URL) => Callback,
      removeUpdateListener: XUpdateListener => Callback,
      removeWindowListener: XWindowListener => Callback,
      select: Any => Boolean,
      setContext: XInterface => Callback,
      setCurrentColumnPosition: Double => Callback,
      setDesignMode: Boolean => Callback,
      setEnable: Boolean => Callback,
      setFocus: Callback,
      setGraphics: XGraphics => Boolean,
      setMode: String => Callback,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Callback,
      setVisible: Boolean => Callback,
      setZoom: (Double, Double) => Callback,
      supportsMode: String => Boolean
    ): InteractionGridControl = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], CurrentColumnPosition = CurrentColumnPosition.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addGridControlListener = js.Any.fromFunction1((t0: XGridControlListener) => addGridControlListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), addStatusListener = js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (addStatusListener(t0, t1)).runNow()), addUpdateListener = js.Any.fromFunction1((t0: XUpdateListener) => addUpdateListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), commit = commit.toJsFn, createEnumeration = createEnumeration.toJsFn, createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispatch = js.Any.fromFunction2((t0: URL, t1: SeqEquiv[PropertyValue]) => (dispatch(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getContext = getContext.toJsFn, getCount = getCount.toJsFn, getCurrentColumnPosition = getCurrentColumnPosition.toJsFn, getElementType = getElementType.toJsFn, getGraphics = getGraphics.toJsFn, getMode = getMode.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getSelection = getSelection.toJsFn, getSize = getSize.toJsFn, getSupportedModes = getSupportedModes.toJsFn, getView = getView.toJsFn, hasElements = hasElements.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryFieldData = js.Any.fromFunction2(queryFieldData), queryFieldDataType = js.Any.fromFunction1(queryFieldDataType), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => registerDispatchProviderInterceptor(t0).runNow()), release = release.toJsFn, releaseDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => releaseDispatchProviderInterceptor(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeGridControlListener = js.Any.fromFunction1((t0: XGridControlListener) => removeGridControlListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()), removeStatusListener = js.Any.fromFunction2((t0: XStatusListener, t1: URL) => (removeStatusListener(t0, t1)).runNow()), removeUpdateListener = js.Any.fromFunction1((t0: XUpdateListener) => removeUpdateListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), select = js.Any.fromFunction1(select), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setCurrentColumnPosition = js.Any.fromFunction1((t0: Double) => setCurrentColumnPosition(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setMode = js.Any.fromFunction1((t0: String) => setMode(t0).runNow()), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()), supportsMode = js.Any.fromFunction1(supportsMode))
      __obj.asInstanceOf[InteractionGridControl]
    }
  }
  
  /**
    * describes a list box control which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.ListBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait ListBox
    extends StObject
       with UnoControlListBox
       with XBoundControl
       with XChangeBroadcaster
  
  /**
    * This service specifies the model for control which provides controller functionality for a {@link com.sun.star.form.component.DataForm} , such as
    * navigating or filtering the form.
    * @see com.sun.star.form.component.NavigationToolBar
    */
  type NavigationToolBar = UnoControl
  
  /**
    * describes a control for inputting numeric values and which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.NumericField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait NumericField
    extends StObject
       with UnoControlNumericField
       with XBoundControl
  
  /**
    * describes a control for inputting text complying to a given pattern, and which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.PatternField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait PatternField
    extends StObject
       with UnoControlPatternField
       with XBoundControl
  
  /**
    * describes a radio button control which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.RadioButton} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait RadioButton
    extends StObject
       with UnoControlRadioButton
       with XBoundControl
  object RadioButton {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      Lock: Boolean,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      State: Boolean,
      View: XView,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addItemListener: XItemListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addWindowListener: XWindowListener => Callback,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Callback,
      dispose: Callback,
      draw: (Double, Double) => Callback,
      getAccessibleContext: CallbackTo[XAccessibleContext],
      getContext: CallbackTo[XInterface],
      getGraphics: CallbackTo[XGraphics],
      getLock: CallbackTo[Boolean],
      getMinimumSize: CallbackTo[Size],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getPosSize: CallbackTo[Rectangle],
      getPreferredSize: CallbackTo[Size],
      getSize: CallbackTo[Size],
      getState: CallbackTo[Boolean],
      getView: CallbackTo[XView],
      isDesignMode: CallbackTo[Boolean],
      isTransparent: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeItemListener: XItemListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeWindowListener: XWindowListener => Callback,
      setContext: XInterface => Callback,
      setDesignMode: Boolean => Callback,
      setEnable: Boolean => Callback,
      setFocus: Callback,
      setGraphics: XGraphics => Boolean,
      setLabel: String => Callback,
      setLock: Boolean => Callback,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Callback,
      setState: Boolean => Callback,
      setVisible: Boolean => Callback,
      setZoom: (Double, Double) => Callback
    ): RadioButton = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Lock = Lock.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addItemListener = js.Any.fromFunction1((t0: XItemListener) => addItemListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getContext = getContext.toJsFn, getGraphics = getGraphics.toJsFn, getLock = getLock.toJsFn, getMinimumSize = getMinimumSize.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getPreferredSize = getPreferredSize.toJsFn, getSize = getSize.toJsFn, getState = getState.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeItemListener = js.Any.fromFunction1((t0: XItemListener) => removeItemListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setLock = js.Any.fromFunction1((t0: Boolean) => setLock(t0).runNow()), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setState = js.Any.fromFunction1((t0: Boolean) => setState(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
      __obj.asInstanceOf[RadioButton]
    }
  }
  
  /**
    * specifies a button control which can execute external submissions
    *
    * The model of the control has to support the {@link com.sun.star.form.component.SubmitButton} service.
    *
    * The control is clickable. When clicked (by mouse or keyboard, or programmatically), the following happens:  1. Any
    * com::sun::star::form::submission::XSubmissionVetoListeners registered at the component are given the chance to veto the submission. 2. The model of
    * the control is examined for an external submission object. That is, com::sun::star::form::submission::XSubmissionSupplier::getSubmission() is called
    * at the model. ;  If there is such a submission object, its {@link com.sun.star.form.submission.XSubmission.submit()} method is invoked. 3. If there is
    * no external submission, the parent object of the model is examined for the presence of the {@link com.sun.star.form.XSubmit} interface. If it is
    * present, it's {@link com.sun.star.form.XSubmit.submit()} method is invoked. ;  Since the parent object of a submit button can only be a {@link
    * com.sun.star.form.component.Form} , this means that SubmitButtons are also able to submit com::sun::star::form::component::HTMLForms.
    */
  type SubmitButton = XSubmission
  
  /**
    * describes a control for entering arbitrary text which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.TextField} service.
    *
    * In addition, this control can be used in HTML forms. It triggers the {@link com.sun.star.form.XSubmit.submit()} method of the form it belongs to if
    * the **enter** is pressed while it has the focus.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait TextField
    extends StObject
       with UnoControlEdit
       with XBoundControl
       with XChangeBroadcaster
  
  /**
    * describes a control for inputting time values which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.TimeField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait TimeField
    extends StObject
       with UnoControlTimeField
       with XBoundControl
}
