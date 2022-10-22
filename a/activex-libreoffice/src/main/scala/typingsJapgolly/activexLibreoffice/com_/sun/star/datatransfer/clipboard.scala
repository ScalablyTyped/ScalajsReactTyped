package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboard {
  
  /**
    * A clipboard uses this object to notify its listeners of content changes.
    * @see com.sun.star.datatransfer.clipboard.XClipboardListener
    */
  trait ClipboardEvent
    extends StObject
       with EventObject {
    
    /** The current content of the clipboard. */
    var Contents: XTransferable
  }
  object ClipboardEvent {
    
    inline def apply(Contents: XTransferable, Source: XInterface): ClipboardEvent = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipboardEvent]
    }
    
    extension [Self <: ClipboardEvent](x: Self) {
      
      inline def setContents(value: XTransferable): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The clipboard manager is a one-instance service that holds a list of all known clipboard instances.
    * @see XClipboardManager
    */
  trait ClipboardManager
    extends StObject
       with XClipboardManager
       with XComponent
  object ClipboardManager {
    
    inline def apply(
      acquire: Callback,
      addClipboard: XClipboard => Callback,
      addEventListener: XEventListener => Callback,
      dispose: Callback,
      getClipboard: String => XClipboard,
      listClipboardNames: CallbackTo[SafeArray[String]],
      queryInterface: `type` => Any,
      release: Callback,
      removeClipboard: String => Callback,
      removeEventListener: XEventListener => Callback
    ): ClipboardManager = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addClipboard = js.Any.fromFunction1((t0: XClipboard) => addClipboard(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getClipboard = js.Any.fromFunction1(getClipboard), listClipboardNames = listClipboardNames.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeClipboard = js.Any.fromFunction1((t0: String) => removeClipboard(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
      __obj.asInstanceOf[ClipboardManager]
    }
  }
  
  /** A generic clipboard service is a simple container for transferable objects. */
  trait GenericClipboard
    extends StObject
       with XClipboardEx
       with XClipboardNotifier
       with XInitialization
       with XComponent
  object GenericClipboard {
    
    inline def apply(
      Contents: XTransferable,
      Name: String,
      RenderingCapabilities: Double,
      acquire: Callback,
      addClipboardListener: XClipboardListener => Callback,
      addEventListener: XEventListener => Callback,
      dispose: Callback,
      getContents: CallbackTo[XTransferable],
      getName: CallbackTo[String],
      getRenderingCapabilities: CallbackTo[Double],
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeClipboardListener: XClipboardListener => Callback,
      removeEventListener: XEventListener => Callback,
      setContents: (XTransferable, XClipboardOwner) => Callback
    ): GenericClipboard = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RenderingCapabilities = RenderingCapabilities.asInstanceOf[js.Any], acquire = acquire.toJsFn, addClipboardListener = js.Any.fromFunction1((t0: XClipboardListener) => addClipboardListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getContents = getContents.toJsFn, getName = getName.toJsFn, getRenderingCapabilities = getRenderingCapabilities.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeClipboardListener = js.Any.fromFunction1((t0: XClipboardListener) => removeClipboardListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setContents = js.Any.fromFunction2((t0: XTransferable, t1: XClipboardOwner) => (setContents(t0, t1)).runNow()))
      __obj.asInstanceOf[GenericClipboard]
    }
  }
  
  object RenderingCapabilities {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def Delayed: `1` = 1.asInstanceOf[`1`]
      
      inline def Persistant: `2` = 2.asInstanceOf[`2`]
    }
  }
  
  /** The system clipboard service builds a bridge to the OS specific clipboard interfaces. */
  type SystemClipboard = XSystemClipboard
  
  trait XClipboard
    extends StObject
       with XInterface {
    
    /**
      * To get the current content of the clipboard.
      * @returns The transferable object representing the current content of this clipboard.
      * @see com.sun.star.datatransfer.XTransferable
      */
    val Contents: XTransferable
    
    /**
      * To get the name of the clipboard instance.
      * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
      */
    val Name: String
    
    /**
      * To get the current content of the clipboard.
      * @returns The transferable object representing the current content of this clipboard.
      * @see com.sun.star.datatransfer.XTransferable
      */
    def getContents(): XTransferable
    
    /**
      * To get the name of the clipboard instance.
      * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
      */
    def getName(): String
    
    /**
      * Sets the current contents of the clipboard to the specified transferable object and registers the specified clipboard owner as the owner of the new
      * contents.
      * @param xTrans The transferable object to set as new content. If the given {@link com.sun.star.datatransfer.XTransferable} has no {@link com.sun.star.dat
      * @param xClipboardOwner The new owner of the clipboard. NULL is an acceptable value and means that the caller is not interested in lost ownership notific
      * @see com.sun.star.datatransfer.XTransferable
      * @see com.sun.star.datatransfer.clipboard.XClipboardOwner
      */
    def setContents(xTrans: XTransferable, xClipboardOwner: XClipboardOwner): Unit
  }
  object XClipboard {
    
    inline def apply(
      Contents: XTransferable,
      Name: String,
      acquire: Callback,
      getContents: CallbackTo[XTransferable],
      getName: CallbackTo[String],
      queryInterface: `type` => Any,
      release: Callback,
      setContents: (XTransferable, XClipboardOwner) => Callback
    ): XClipboard = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, getContents = getContents.toJsFn, getName = getName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setContents = js.Any.fromFunction2((t0: XTransferable, t1: XClipboardOwner) => (setContents(t0, t1)).runNow()))
      __obj.asInstanceOf[XClipboard]
    }
    
    extension [Self <: XClipboard](x: Self) {
      
      inline def setContents(value: XTransferable): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
      
      inline def setGetContents(value: CallbackTo[XTransferable]): Self = StObject.set(x, "getContents", value.toJsFn)
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setSetContents(value: (XTransferable, XClipboardOwner) => Callback): Self = StObject.set(x, "setContents", js.Any.fromFunction2((t0: XTransferable, t1: XClipboardOwner) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * The extended clipboard interface.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    */
  trait XClipboardEx
    extends StObject
       with XClipboard {
    
    /**
      * To determine the supported rendering capabilities of the clipboard instance.
      * @returns A set of flags describing the rendering capabilities of the clipboard instance.
      * @see RenderingCapabilities
      */
    val RenderingCapabilities: Double
    
    /**
      * To determine the supported rendering capabilities of the clipboard instance.
      * @returns A set of flags describing the rendering capabilities of the clipboard instance.
      * @see RenderingCapabilities
      */
    def getRenderingCapabilities(): Double
  }
  object XClipboardEx {
    
    inline def apply(
      Contents: XTransferable,
      Name: String,
      RenderingCapabilities: Double,
      acquire: Callback,
      getContents: CallbackTo[XTransferable],
      getName: CallbackTo[String],
      getRenderingCapabilities: CallbackTo[Double],
      queryInterface: `type` => Any,
      release: Callback,
      setContents: (XTransferable, XClipboardOwner) => Callback
    ): XClipboardEx = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RenderingCapabilities = RenderingCapabilities.asInstanceOf[js.Any], acquire = acquire.toJsFn, getContents = getContents.toJsFn, getName = getName.toJsFn, getRenderingCapabilities = getRenderingCapabilities.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setContents = js.Any.fromFunction2((t0: XTransferable, t1: XClipboardOwner) => (setContents(t0, t1)).runNow()))
      __obj.asInstanceOf[XClipboardEx]
    }
    
    extension [Self <: XClipboardEx](x: Self) {
      
      inline def setGetRenderingCapabilities(value: CallbackTo[Double]): Self = StObject.set(x, "getRenderingCapabilities", value.toJsFn)
      
      inline def setRenderingCapabilities(value: Double): Self = StObject.set(x, "RenderingCapabilities", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Should be implemented by a clipboard factory that simplifies the creation of multiple clipboard instances.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    */
  trait XClipboardFactory
    extends StObject
       with XInterface {
    
    /**
      * Creates a new named clipboard instance.
      * @param aName The name the clipboard should have.
      * @returns A newly created instance of a {@link GenericClipboard} implementation.
      * @throws com::sun::star::lang::IllegalArgumentException If an empty string is passed as clipboard name.
      */
    def createClipboard(aName: String): XClipboard
  }
  object XClipboardFactory {
    
    inline def apply(
      acquire: Callback,
      createClipboard: String => XClipboard,
      queryInterface: `type` => Any,
      release: Callback
    ): XClipboardFactory = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createClipboard = js.Any.fromFunction1(createClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XClipboardFactory]
    }
    
    extension [Self <: XClipboardFactory](x: Self) {
      
      inline def setCreateClipboard(value: String => XClipboard): Self = StObject.set(x, "createClipboard", js.Any.fromFunction1(value))
    }
  }
  
  /** Interface to be implemented to receive notifications on clipboard content changes. */
  trait XClipboardListener
    extends StObject
       with XEventListener {
    
    /**
      * The content of the clipboard has changed.
      * @param event The event object containing the new clipboard content.
      * @see com.sun.star.datatransfer.clipboard.ClipboardEvent
      */
    def changedContents(event: ClipboardEvent): Unit
  }
  object XClipboardListener {
    
    inline def apply(
      acquire: Callback,
      changedContents: ClipboardEvent => Callback,
      disposing: EventObject => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XClipboardListener = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, changedContents = js.Any.fromFunction1((t0: ClipboardEvent) => changedContents(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XClipboardListener]
    }
    
    extension [Self <: XClipboardListener](x: Self) {
      
      inline def setChangedContents(value: ClipboardEvent => Callback): Self = StObject.set(x, "changedContents", js.Any.fromFunction1((t0: ClipboardEvent) => value(t0).runNow()))
    }
  }
  
  /**
    * This interface is used to retrieve, add, or remove clipboard instances.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    */
  trait XClipboardManager
    extends StObject
       with XInterface {
    
    /**
      * Add a clipboard instance to the manager's list.
      * @param xClipboard The clipboard to add.
      * @throws com::sun::star::IllegalArgumentException if xClipboard is not a valid clipboard.
      * @throws com::sun::star::container::ElementExistsException if a clipboard with the name of xClipboard already exists.
      */
    def addClipboard(xClipboard: XClipboard): Unit
    
    /**
      * Get a clipboard instance by name.
      * @param aName The name of clipboard to return. To retrieve the default (system) clipboard, pass an empty string.
      * @returns The clipboard object with the specified name.
      * @throws com::sun::star::container::NoSuchElementException if no clipboard with the specified name exists.
      */
    def getClipboard(aName: String): XClipboard
    
    /**
      * Get a list of a managed clipboards.
      * @returns A sequence of the names of all available clipboards.
      */
    def listClipboardNames(): SafeArray[String]
    
    /**
      * Removes the clipboard with the specified name from the list.
      * @param aName The name of the clipboard to remove.
      */
    def removeClipboard(aName: String): Unit
  }
  object XClipboardManager {
    
    inline def apply(
      acquire: Callback,
      addClipboard: XClipboard => Callback,
      getClipboard: String => XClipboard,
      listClipboardNames: CallbackTo[SafeArray[String]],
      queryInterface: `type` => Any,
      release: Callback,
      removeClipboard: String => Callback
    ): XClipboardManager = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addClipboard = js.Any.fromFunction1((t0: XClipboard) => addClipboard(t0).runNow()), getClipboard = js.Any.fromFunction1(getClipboard), listClipboardNames = listClipboardNames.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeClipboard = js.Any.fromFunction1((t0: String) => removeClipboard(t0).runNow()))
      __obj.asInstanceOf[XClipboardManager]
    }
    
    extension [Self <: XClipboardManager](x: Self) {
      
      inline def setAddClipboard(value: XClipboard => Callback): Self = StObject.set(x, "addClipboard", js.Any.fromFunction1((t0: XClipboard) => value(t0).runNow()))
      
      inline def setGetClipboard(value: String => XClipboard): Self = StObject.set(x, "getClipboard", js.Any.fromFunction1(value))
      
      inline def setListClipboardNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "listClipboardNames", value.toJsFn)
      
      inline def setRemoveClipboard(value: String => Callback): Self = StObject.set(x, "removeClipboard", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait XClipboardNotifier
    extends StObject
       with XInterface {
    
    /**
      * Requests notifications on clipboard content changes.
      * @param listener The object receiving the notifications.
      */
    def addClipboardListener(listener: XClipboardListener): Unit
    
    /**
      * Removes listener from notification list.
      * @param listener The object to remove from notification list.
      */
    def removeClipboardListener(listener: XClipboardListener): Unit
  }
  object XClipboardNotifier {
    
    inline def apply(
      acquire: Callback,
      addClipboardListener: XClipboardListener => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeClipboardListener: XClipboardListener => Callback
    ): XClipboardNotifier = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addClipboardListener = js.Any.fromFunction1((t0: XClipboardListener) => addClipboardListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeClipboardListener = js.Any.fromFunction1((t0: XClipboardListener) => removeClipboardListener(t0).runNow()))
      __obj.asInstanceOf[XClipboardNotifier]
    }
    
    extension [Self <: XClipboardNotifier](x: Self) {
      
      inline def setAddClipboardListener(value: XClipboardListener => Callback): Self = StObject.set(x, "addClipboardListener", js.Any.fromFunction1((t0: XClipboardListener) => value(t0).runNow()))
      
      inline def setRemoveClipboardListener(value: XClipboardListener => Callback): Self = StObject.set(x, "removeClipboardListener", js.Any.fromFunction1((t0: XClipboardListener) => value(t0).runNow()))
    }
  }
  
  /**
    * The owner of a transferable object may pass this interface to the clipboard instance.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    */
  trait XClipboardOwner
    extends StObject
       with XInterface {
    
    /**
      * Notifies the transferable object source that it is no longer the owner of the clipboard.
      * @param xClipboard The clipboard for which the ownership was lost.
      * @param xTrans The transferable object that has been the contents of the clipboard.
      * @see com.sun.star.datatransfer.clipboard.XClipboard
      * @see com.sun.star.datatransfer.XTransferable
      */
    def lostOwnership(xClipboard: XClipboard, xTrans: XTransferable): Unit
  }
  object XClipboardOwner {
    
    inline def apply(
      acquire: Callback,
      lostOwnership: (XClipboard, XTransferable) => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XClipboardOwner = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, lostOwnership = js.Any.fromFunction2((t0: XClipboard, t1: XTransferable) => (lostOwnership(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XClipboardOwner]
    }
    
    extension [Self <: XClipboardOwner](x: Self) {
      
      inline def setLostOwnership(value: (XClipboard, XTransferable) => Callback): Self = StObject.set(x, "lostOwnership", js.Any.fromFunction2((t0: XClipboard, t1: XTransferable) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * An interface for flushable clipboards may optionally be implemented by a system clipboard service.
    * @see com.sun.star.datatransfer.clipboard.SystemClipboard
    */
  trait XFlushableClipboard
    extends StObject
       with XInterface {
    
    /** Renders the current content of the clipboard to the system so that it is available even if the source application no longer exist. */
    def flushClipboard(): Unit
  }
  object XFlushableClipboard {
    
    inline def apply(acquire: Callback, flushClipboard: Callback, queryInterface: `type` => Any, release: Callback): XFlushableClipboard = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, flushClipboard = flushClipboard.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XFlushableClipboard]
    }
    
    extension [Self <: XFlushableClipboard](x: Self) {
      
      inline def setFlushClipboard(value: Callback): Self = StObject.set(x, "flushClipboard", value.toJsFn)
    }
  }
  
  /**
    * Provides a unified interface for new-style service {@link SystemClipboard} .
    * @since LibreOffice 4.2
    */
  trait XSystemClipboard
    extends StObject
       with XClipboardEx
       with XClipboardNotifier
       with XFlushableClipboard
       with XComponent
  object XSystemClipboard {
    
    inline def apply(
      Contents: XTransferable,
      Name: String,
      RenderingCapabilities: Double,
      acquire: Callback,
      addClipboardListener: XClipboardListener => Callback,
      addEventListener: XEventListener => Callback,
      dispose: Callback,
      flushClipboard: Callback,
      getContents: CallbackTo[XTransferable],
      getName: CallbackTo[String],
      getRenderingCapabilities: CallbackTo[Double],
      queryInterface: `type` => Any,
      release: Callback,
      removeClipboardListener: XClipboardListener => Callback,
      removeEventListener: XEventListener => Callback,
      setContents: (XTransferable, XClipboardOwner) => Callback
    ): XSystemClipboard = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RenderingCapabilities = RenderingCapabilities.asInstanceOf[js.Any], acquire = acquire.toJsFn, addClipboardListener = js.Any.fromFunction1((t0: XClipboardListener) => addClipboardListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, flushClipboard = flushClipboard.toJsFn, getContents = getContents.toJsFn, getName = getName.toJsFn, getRenderingCapabilities = getRenderingCapabilities.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeClipboardListener = js.Any.fromFunction1((t0: XClipboardListener) => removeClipboardListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setContents = js.Any.fromFunction2((t0: XTransferable, t1: XClipboardOwner) => (setContents(t0, t1)).runNow()))
      __obj.asInstanceOf[XSystemClipboard]
    }
  }
}
