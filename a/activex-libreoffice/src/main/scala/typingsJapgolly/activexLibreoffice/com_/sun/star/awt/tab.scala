package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tab {
  
  /**
    * An event used by a {@link XTabPageContainer} to notify changes in tab page activation.
    * @since OOo 3.4
    */
  trait TabPageActivatedEvent
    extends StObject
       with EventObject {
    
    /** Contains the ID of the tab page */
    var TabPageID: Double
  }
  object TabPageActivatedEvent {
    
    inline def apply(Source: XInterface, TabPageID: Double): TabPageActivatedEvent = {
      val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], TabPageID = TabPageID.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPageActivatedEvent]
    }
    
    extension [Self <: TabPageActivatedEvent](x: Self) {
      
      inline def setTabPageID(value: Double): Self = StObject.set(x, "TabPageID", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies a TabPage control.
    * @since OOo 3.4
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait UnoControlTabPage
    extends StObject
       with UnoControlContainer
  object UnoControlTabPage {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Controls: SafeArray[XControl],
      Graphics: XGraphics,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      Size: Size,
      TabControllers: SafeArray[XTabController],
      View: XView,
      acquire: Callback,
      addContainerListener: XContainerListener => Callback,
      addControl: (String, XControl) => Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addTabController: XTabController => Callback,
      addWindowListener: XWindowListener => Callback,
      createPeer: (XToolkit, XWindowPeer) => Callback,
      dispose: Callback,
      draw: (Double, Double) => Callback,
      getAccessibleContext: CallbackTo[XAccessibleContext],
      getContext: CallbackTo[XInterface],
      getControl: String => XControl,
      getControls: CallbackTo[SafeArray[XControl]],
      getGraphics: CallbackTo[XGraphics],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getPosSize: CallbackTo[Rectangle],
      getSize: CallbackTo[Size],
      getTabControllers: CallbackTo[SafeArray[XTabController]],
      getView: CallbackTo[XView],
      isDesignMode: CallbackTo[Boolean],
      isTransparent: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeContainerListener: XContainerListener => Callback,
      removeControl: XControl => Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeTabController: XTabController => Callback,
      removeWindowListener: XWindowListener => Callback,
      setContext: XInterface => Callback,
      setDesignMode: Boolean => Callback,
      setEnable: Boolean => Callback,
      setFocus: Callback,
      setGraphics: XGraphics => Boolean,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Callback,
      setStatusText: String => Callback,
      setTabControllers: SeqEquiv[XTabController] => Callback,
      setVisible: Boolean => Callback,
      setZoom: (Double, Double) => Callback
    ): UnoControlTabPage = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabControllers = TabControllers.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), addControl = js.Any.fromFunction2((t0: String, t1: XControl) => (addControl(t0, t1)).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addTabController = js.Any.fromFunction1((t0: XTabController) => addTabController(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getContext = getContext.toJsFn, getControl = js.Any.fromFunction1(getControl), getControls = getControls.toJsFn, getGraphics = getGraphics.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getSize = getSize.toJsFn, getTabControllers = getTabControllers.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeControl = js.Any.fromFunction1((t0: XControl) => removeControl(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeTabController = js.Any.fromFunction1((t0: XTabController) => removeTabController(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setStatusText = js.Any.fromFunction1((t0: String) => setStatusText(t0).runNow()), setTabControllers = js.Any.fromFunction1((t0: SeqEquiv[XTabController]) => setTabControllers(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
      __obj.asInstanceOf[UnoControlTabPage]
    }
  }
  
  /**
    * specifies a TabPageContainer control.
    * @since OOo 3.4
    */
  trait UnoControlTabPageContainer
    extends StObject
       with UnoControl
       with XTabPageContainer
  object UnoControlTabPageContainer {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      ActiveTabPageID: Double,
      Context: XInterface,
      Graphics: XGraphics,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      Size: Size,
      TabPageCount: Double,
      View: XView,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addFocusListener: XFocusListener => Callback,
      addKeyListener: XKeyListener => Callback,
      addMouseListener: XMouseListener => Callback,
      addMouseMotionListener: XMouseMotionListener => Callback,
      addPaintListener: XPaintListener => Callback,
      addTabPageContainerListener: XTabPageContainerListener => Callback,
      addWindowListener: XWindowListener => Callback,
      createPeer: (XToolkit, XWindowPeer) => Callback,
      dispose: Callback,
      draw: (Double, Double) => Callback,
      getAccessibleContext: CallbackTo[XAccessibleContext],
      getContext: CallbackTo[XInterface],
      getGraphics: CallbackTo[XGraphics],
      getModel: CallbackTo[XControlModel],
      getPeer: CallbackTo[XWindowPeer],
      getPosSize: CallbackTo[Rectangle],
      getSize: CallbackTo[Size],
      getTabPage: Double => XTabPage,
      getTabPageByID: Double => XTabPage,
      getTabPageCount: CallbackTo[Double],
      getView: CallbackTo[XView],
      isDesignMode: CallbackTo[Boolean],
      isTabPageActive: Double => Boolean,
      isTransparent: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      removeFocusListener: XFocusListener => Callback,
      removeKeyListener: XKeyListener => Callback,
      removeMouseListener: XMouseListener => Callback,
      removeMouseMotionListener: XMouseMotionListener => Callback,
      removePaintListener: XPaintListener => Callback,
      removeTabPageContainerListener: XTabPageContainerListener => Callback,
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
    ): UnoControlTabPageContainer = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], ActiveTabPageID = ActiveTabPageID.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabPageCount = TabPageCount.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addTabPageContainerListener = js.Any.fromFunction1((t0: XTabPageContainerListener) => addTabPageContainerListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getContext = getContext.toJsFn, getGraphics = getGraphics.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getSize = getSize.toJsFn, getTabPage = js.Any.fromFunction1(getTabPage), getTabPageByID = js.Any.fromFunction1(getTabPageByID), getTabPageCount = getTabPageCount.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTabPageActive = js.Any.fromFunction1(isTabPageActive), isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeTabPageContainerListener = js.Any.fromFunction1((t0: XTabPageContainerListener) => removeTabPageContainerListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
      __obj.asInstanceOf[UnoControlTabPageContainer]
    }
  }
  
  /**
    * specifies a model for a {@link UnoControlTabPageContainer} control.
    * @since OOo 3.4
    */
  trait UnoControlTabPageContainerModel
    extends StObject
       with UnoControlModel
       with XTabPageContainerModel {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo
  }
  object UnoControlTabPageContainerModel {
    
    inline def apply(
      Count: Double,
      DefaultControl: String,
      ElementType: `type`,
      Height: Double,
      Name: String,
      PositionX: String,
      PositionY: String,
      PropertySetInfo: XPropertySetInfo,
      ServiceName: String,
      Step: Double,
      TabIndex: Double,
      Tag: String,
      Width: Double,
      acquire: Callback,
      addContainerListener: XContainerListener => Callback,
      addEventListener: XEventListener => Callback,
      addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      createClone: CallbackTo[XCloneable],
      createTabPage: Double => XTabPageModel,
      dispose: Callback,
      firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
      getByIndex: Double => Any,
      getCount: CallbackTo[Double],
      getElementType: CallbackTo[`type`],
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      getPropertyValues: SeqEquiv[String] => SafeArray[Any],
      getServiceName: CallbackTo[String],
      hasElements: CallbackTo[Boolean],
      insertByIndex: (Double, Any) => Callback,
      loadTabPage: (Double, String) => XTabPageModel,
      queryInterface: `type` => Any,
      read: XObjectInputStream => Callback,
      release: Callback,
      removeByIndex: Double => Callback,
      removeContainerListener: XContainerListener => Callback,
      removeEventListener: XEventListener => Callback,
      removePropertiesChangeListener: XPropertiesChangeListener => Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      replaceByIndex: (Double, Any) => Callback,
      setPropertyValue: (String, Any) => Callback,
      setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Callback,
      write: XObjectOutputStream => Callback
    ): UnoControlTabPageContainerModel = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createClone = createClone.toJsFn, createTabPage = js.Any.fromFunction1(createTabPage), dispose = dispose.toJsFn, firePropertiesChangeEvent = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (firePropertiesChangeEvent(t0, t1)).runNow()), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = getServiceName.toJsFn, hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (insertByIndex(t0, t1)).runNow()), loadTabPage = js.Any.fromFunction2(loadTabPage), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1((t0: XObjectInputStream) => read(t0).runNow()), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()), removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertiesChangeListener = js.Any.fromFunction1((t0: XPropertiesChangeListener) => removePropertiesChangeListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setPropertyValues(t0, t1)).runNow()), write = js.Any.fromFunction1((t0: XObjectOutputStream) => write(t0).runNow()))
      __obj.asInstanceOf[UnoControlTabPageContainerModel]
    }
    
    extension [Self <: UnoControlTabPageContainerModel](x: Self) {
      
      inline def setGetPropertySetInfo(value: CallbackTo[XPropertySetInfo]): Self = StObject.set(x, "getPropertySetInfo", value.toJsFn)
    }
  }
  
  /**
    * specifies the standard model of a {@link XTabPageModel} .
    * @since OOo 3.4
    */
  type UnoControlTabPageModel = XTabPageModel
  
  /**
    * An interface to a control that displays a tab page.
    * @see UnoControlTabPage
    * @since OOo 3.4
    */
  type XTabPage = Any
  
  /**
    * An interface to a control that displays tab pages.
    * @see UnoControlTabPageContainer
    * @since OOo 3.4
    */
  trait XTabPageContainer extends StObject {
    
    /** Specifies the ID of the current active tab page. */
    var ActiveTabPageID: Double
    
    /**
      * Returns the number of tab pages.
      * @returns the number of tab pages.
      */
    val TabPageCount: Double
    
    /**
      * Adds a listener for the TabPageActivedEvent posted after the tab page was activated.
      * @param listener the listener to add.
      */
    def addTabPageContainerListener(listener: XTabPageContainerListener): Unit
    
    /**
      * Returns tab page for the given index.
      * @param tabPageIndex - index of the tab page in the IndexContainer.
      * @returns tab page which has tabPageIndex.
      */
    def getTabPage(tabPageIndex: Double): XTabPage
    
    /**
      * Returns tab page for the given ID.
      * @param tabPageID - ID of the tab page.
      * @returns tab page which has tabPageID.
      */
    def getTabPageByID(tabPageID: Double): XTabPage
    
    /**
      * Returns the number of tab pages.
      * @returns the number of tab pages.
      */
    def getTabPageCount(): Double
    
    /**
      * Checks whether a tab page is activated.
      * @param tabPageIndex the tab page to be checked.
      * @returns `TRUE` if tab page is activated, else `FALSE` .
      */
    def isTabPageActive(tabPageIndex: Double): Boolean
    
    /**
      * Removes a listener previously added with addTabPageListener().
      * @param listener the listener to remove.
      */
    def removeTabPageContainerListener(listener: XTabPageContainerListener): Unit
  }
  object XTabPageContainer {
    
    inline def apply(
      ActiveTabPageID: Double,
      TabPageCount: Double,
      addTabPageContainerListener: XTabPageContainerListener => Callback,
      getTabPage: Double => XTabPage,
      getTabPageByID: Double => XTabPage,
      getTabPageCount: CallbackTo[Double],
      isTabPageActive: Double => Boolean,
      removeTabPageContainerListener: XTabPageContainerListener => Callback
    ): XTabPageContainer = {
      val __obj = js.Dynamic.literal(ActiveTabPageID = ActiveTabPageID.asInstanceOf[js.Any], TabPageCount = TabPageCount.asInstanceOf[js.Any], addTabPageContainerListener = js.Any.fromFunction1((t0: XTabPageContainerListener) => addTabPageContainerListener(t0).runNow()), getTabPage = js.Any.fromFunction1(getTabPage), getTabPageByID = js.Any.fromFunction1(getTabPageByID), getTabPageCount = getTabPageCount.toJsFn, isTabPageActive = js.Any.fromFunction1(isTabPageActive), removeTabPageContainerListener = js.Any.fromFunction1((t0: XTabPageContainerListener) => removeTabPageContainerListener(t0).runNow()))
      __obj.asInstanceOf[XTabPageContainer]
    }
    
    extension [Self <: XTabPageContainer](x: Self) {
      
      inline def setActiveTabPageID(value: Double): Self = StObject.set(x, "ActiveTabPageID", value.asInstanceOf[js.Any])
      
      inline def setAddTabPageContainerListener(value: XTabPageContainerListener => Callback): Self = StObject.set(x, "addTabPageContainerListener", js.Any.fromFunction1((t0: XTabPageContainerListener) => value(t0).runNow()))
      
      inline def setGetTabPage(value: Double => XTabPage): Self = StObject.set(x, "getTabPage", js.Any.fromFunction1(value))
      
      inline def setGetTabPageByID(value: Double => XTabPage): Self = StObject.set(x, "getTabPageByID", js.Any.fromFunction1(value))
      
      inline def setGetTabPageCount(value: CallbackTo[Double]): Self = StObject.set(x, "getTabPageCount", value.toJsFn)
      
      inline def setIsTabPageActive(value: Double => Boolean): Self = StObject.set(x, "isTabPageActive", js.Any.fromFunction1(value))
      
      inline def setRemoveTabPageContainerListener(value: XTabPageContainerListener => Callback): Self = StObject.set(x, "removeTabPageContainerListener", js.Any.fromFunction1((t0: XTabPageContainerListener) => value(t0).runNow()))
      
      inline def setTabPageCount(value: Double): Self = StObject.set(x, "TabPageCount", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An instance of this interface is used by the {@link XTabPageContainer} to get notifications about changes in activation of tab pages.
    * @since OOo 3.4
    */
  trait XTabPageContainerListener
    extends StObject
       with XEventListener {
    
    /** Invoked after a tab page was activated. */
    def tabPageActivated(tabPageActivatedEvent: TabPageActivatedEvent): Unit
  }
  object XTabPageContainerListener {
    
    inline def apply(
      acquire: Callback,
      disposing: EventObject => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      tabPageActivated: TabPageActivatedEvent => Callback
    ): XTabPageContainerListener = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, tabPageActivated = js.Any.fromFunction1((t0: TabPageActivatedEvent) => tabPageActivated(t0).runNow()))
      __obj.asInstanceOf[XTabPageContainerListener]
    }
    
    extension [Self <: XTabPageContainerListener](x: Self) {
      
      inline def setTabPageActivated(value: TabPageActivatedEvent => Callback): Self = StObject.set(x, "tabPageActivated", js.Any.fromFunction1((t0: TabPageActivatedEvent) => value(t0).runNow()))
    }
  }
  
  /**
    * specifies an interface for a {@link UnoControlTabPageContainerModel} .
    * @since OOo 3.4
    */
  trait XTabPageContainerModel
    extends StObject
       with XIndexContainer
       with XContainer {
    
    /**
      * creates a TabPageModel which can be inserted into the container.
      * @param TabPageID the id of the tab page
      */
    def createTabPage(TabPageID: Double): XTabPageModel
    
    /**
      * creates a TabPageModel which can be inserted into the container, by loading it from a user interface resource file.
      * @param TabPageID the id of the tab page
      * @param ResourceURL the URL of the user interface resource to load
      */
    def loadTabPage(TabPageID: Double, ResourceURL: String): XTabPageModel
  }
  object XTabPageContainerModel {
    
    inline def apply(
      Count: Double,
      ElementType: `type`,
      acquire: Callback,
      addContainerListener: XContainerListener => Callback,
      createTabPage: Double => XTabPageModel,
      getByIndex: Double => Any,
      getCount: CallbackTo[Double],
      getElementType: CallbackTo[`type`],
      hasElements: CallbackTo[Boolean],
      insertByIndex: (Double, Any) => Callback,
      loadTabPage: (Double, String) => XTabPageModel,
      queryInterface: `type` => Any,
      release: Callback,
      removeByIndex: Double => Callback,
      removeContainerListener: XContainerListener => Callback,
      replaceByIndex: (Double, Any) => Callback
    ): XTabPageContainerModel = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), createTabPage = js.Any.fromFunction1(createTabPage), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (insertByIndex(t0, t1)).runNow()), loadTabPage = js.Any.fromFunction2(loadTabPage), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()), removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()))
      __obj.asInstanceOf[XTabPageContainerModel]
    }
    
    extension [Self <: XTabPageContainerModel](x: Self) {
      
      inline def setCreateTabPage(value: Double => XTabPageModel): Self = StObject.set(x, "createTabPage", js.Any.fromFunction1(value))
      
      inline def setLoadTabPage(value: (Double, String) => XTabPageModel): Self = StObject.set(x, "loadTabPage", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * specifies an {@link XTabPageModel} interface.
    * @since OOo 3.4
    */
  trait XTabPageModel extends StObject {
    
    /** determines whether a tab page is enabled or disabled. */
    var Enabled: Boolean
    
    /** specifies a URL that references a graphic that should be displayed in the tab bar. */
    var ImageURL: String
    
    /** ID for tab page. */
    var TabPageID: Double
    
    /** specifies the text that is displayed in the tab bar of the tab page. */
    var Title: String
    
    /** specifies a tooltip text that should be displayed in the tab bar. */
    var ToolTip: String
  }
  object XTabPageModel {
    
    inline def apply(Enabled: Boolean, ImageURL: String, TabPageID: Double, Title: String, ToolTip: String): XTabPageModel = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ImageURL = ImageURL.asInstanceOf[js.Any], TabPageID = TabPageID.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ToolTip = ToolTip.asInstanceOf[js.Any])
      __obj.asInstanceOf[XTabPageModel]
    }
    
    extension [Self <: XTabPageModel](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setImageURL(value: String): Self = StObject.set(x, "ImageURL", value.asInstanceOf[js.Any])
      
      inline def setTabPageID(value: Double): Self = StObject.set(x, "TabPageID", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setToolTip(value: String): Self = StObject.set(x, "ToolTip", value.asInstanceOf[js.Any])
    }
  }
}
