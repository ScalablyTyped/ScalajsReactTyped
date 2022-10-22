package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XEventBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloseListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloseable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common functionality for embedded objects. */
trait XEmbeddedObject
  extends StObject
     with XVisualObject
     with XClassifiedObject
     with XComponentSupplier
     with XStateChangeBroadcaster
     with XEventBroadcaster
     with XCloseable {
  
  /**
    * provides access to the internal link to the container client.
    * @returns a reference to related container client if any is set
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  var ClientSite: XEmbeddedClient
  
  /**
    * returns the current state of the object.
    * @returns the current state of the object
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  val CurrentState: Double
  
  /**
    * returns supported states for the object.
    * @returns the sequence of states the object can be set to
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, other possib
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  val ReachableStates: SafeArray[Double]
  
  /**
    * returns supported verbs for the object.
    * @returns the sequence of verbs the object supports
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, acceptable v
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    */
  val SupportedVerbs: SafeArray[VerbDescriptor]
  
  /**
    * changes the state of the object to the requested one.
    * @param nNewState specifies the new state, can take values from the constant set {@link com.sun.star.embed.EmbedStates}
    * @throws com::sun::star::embed::UnreachableStateException the specified state can not be reached
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def changeState(nNewState: Double): Unit
  
  /**
    * lets object perform an action referenced by nVerbID.
    * @param nVerbID specifies an action to perform, can take values from {@link EmbedVerbs}
    * @throws com::sun::star::lang::IllegalArgumentException the verb is not supported
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    * @throws com::sun::star::embed::UnreachableStateException the state, required by the verb, can not be reached
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def doVerb(nVerbID: Double): Unit
  
  /**
    * provides access to the internal link to the container client.
    * @returns a reference to related container client if any is set
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def getClientSite(): XEmbeddedClient
  
  /**
    * returns the current state of the object.
    * @returns the current state of the object
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  def getCurrentState(): Double
  
  /**
    * returns supported states for the object.
    * @returns the sequence of states the object can be set to
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, other possib
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  def getReachableStates(): SafeArray[Double]
  
  /**
    * retrieves the status of the object.
    * @param nAspect the aspect specifying the form of object representation
    * @returns the value specifying the status of the object for specified aspect can take values from {@link EmbedMisc} constant set
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def getStatus(nAspect: Double): Double
  
  /**
    * returns supported verbs for the object.
    * @returns the sequence of verbs the object supports
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, acceptable v
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    */
  def getSupportedVerbs(): SafeArray[VerbDescriptor]
  
  /**
    * sets a connection to the container's client.
    * @param xClient provides a reference to a client implementation
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def setClientSite(xClient: XEmbeddedClient): Unit
  
  /**
    * provides object with the name of container document.
    * @param sName name of the container document
    */
  def setContainerName(sName: String): Unit
  
  /**
    * specifies how often the object's representation should be updated.
    * @param nMode the new update mode, can take values from EmbeddedUpdateModes
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def setUpdateMode(nMode: Double): Unit
  
  /**
    * updates object's representations.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    * @throws com::sun::star::uno::Exception in case problems detected
    */
  def update(): Unit
}
object XEmbeddedObject {
  
  inline def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    ClientSite: XEmbeddedClient,
    Component: XCloseable,
    CurrentState: Double,
    ReachableStates: SafeArray[Double],
    SupportedVerbs: SafeArray[VerbDescriptor],
    acquire: Callback,
    addCloseListener: XCloseListener => Callback,
    addEventListener: XEventListener => Callback,
    addStateChangeListener: XStateChangeListener => Callback,
    changeState: Double => Callback,
    close: Boolean => Callback,
    doVerb: Double => Callback,
    getClassID: CallbackTo[SafeArray[Double]],
    getClassName: CallbackTo[String],
    getClientSite: CallbackTo[XEmbeddedClient],
    getComponent: CallbackTo[XCloseable],
    getCurrentState: CallbackTo[Double],
    getMapUnit: Double => Double,
    getPreferredVisualRepresentation: Double => VisualRepresentation,
    getReachableStates: CallbackTo[SafeArray[Double]],
    getStatus: Double => Double,
    getSupportedVerbs: CallbackTo[SafeArray[VerbDescriptor]],
    getVisualAreaSize: Double => Size,
    queryInterface: `type` => Any,
    release: Callback,
    removeCloseListener: XCloseListener => Callback,
    removeEventListener: XEventListener => Callback,
    removeStateChangeListener: XStateChangeListener => Callback,
    setClassInfo: (SeqEquiv[Double], String) => Callback,
    setClientSite: XEmbeddedClient => Callback,
    setContainerName: String => Callback,
    setUpdateMode: Double => Callback,
    setVisualAreaSize: (Double, Size) => Callback,
    update: Callback
  ): XEmbeddedObject = {
    val __obj = js.Dynamic.literal(ClassID = ClassID.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], ClientSite = ClientSite.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], CurrentState = CurrentState.asInstanceOf[js.Any], ReachableStates = ReachableStates.asInstanceOf[js.Any], SupportedVerbs = SupportedVerbs.asInstanceOf[js.Any], acquire = acquire.toJsFn, addCloseListener = js.Any.fromFunction1((t0: XCloseListener) => addCloseListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addStateChangeListener = js.Any.fromFunction1((t0: XStateChangeListener) => addStateChangeListener(t0).runNow()), changeState = js.Any.fromFunction1((t0: Double) => changeState(t0).runNow()), close = js.Any.fromFunction1((t0: Boolean) => close(t0).runNow()), doVerb = js.Any.fromFunction1((t0: Double) => doVerb(t0).runNow()), getClassID = getClassID.toJsFn, getClassName = getClassName.toJsFn, getClientSite = getClientSite.toJsFn, getComponent = getComponent.toJsFn, getCurrentState = getCurrentState.toJsFn, getMapUnit = js.Any.fromFunction1(getMapUnit), getPreferredVisualRepresentation = js.Any.fromFunction1(getPreferredVisualRepresentation), getReachableStates = getReachableStates.toJsFn, getStatus = js.Any.fromFunction1(getStatus), getSupportedVerbs = getSupportedVerbs.toJsFn, getVisualAreaSize = js.Any.fromFunction1(getVisualAreaSize), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeCloseListener = js.Any.fromFunction1((t0: XCloseListener) => removeCloseListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeStateChangeListener = js.Any.fromFunction1((t0: XStateChangeListener) => removeStateChangeListener(t0).runNow()), setClassInfo = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: String) => (setClassInfo(t0, t1)).runNow()), setClientSite = js.Any.fromFunction1((t0: XEmbeddedClient) => setClientSite(t0).runNow()), setContainerName = js.Any.fromFunction1((t0: String) => setContainerName(t0).runNow()), setUpdateMode = js.Any.fromFunction1((t0: Double) => setUpdateMode(t0).runNow()), setVisualAreaSize = js.Any.fromFunction2((t0: Double, t1: Size) => (setVisualAreaSize(t0, t1)).runNow()), update = update.toJsFn)
    __obj.asInstanceOf[XEmbeddedObject]
  }
  
  extension [Self <: XEmbeddedObject](x: Self) {
    
    inline def setChangeState(value: Double => Callback): Self = StObject.set(x, "changeState", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setClientSite(value: XEmbeddedClient): Self = StObject.set(x, "ClientSite", value.asInstanceOf[js.Any])
    
    inline def setCurrentState(value: Double): Self = StObject.set(x, "CurrentState", value.asInstanceOf[js.Any])
    
    inline def setDoVerb(value: Double => Callback): Self = StObject.set(x, "doVerb", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setGetClientSite(value: CallbackTo[XEmbeddedClient]): Self = StObject.set(x, "getClientSite", value.toJsFn)
    
    inline def setGetCurrentState(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentState", value.toJsFn)
    
    inline def setGetReachableStates(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getReachableStates", value.toJsFn)
    
    inline def setGetStatus(value: Double => Double): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
    
    inline def setGetSupportedVerbs(value: CallbackTo[SafeArray[VerbDescriptor]]): Self = StObject.set(x, "getSupportedVerbs", value.toJsFn)
    
    inline def setReachableStates(value: SafeArray[Double]): Self = StObject.set(x, "ReachableStates", value.asInstanceOf[js.Any])
    
    inline def setSetClientSite(value: XEmbeddedClient => Callback): Self = StObject.set(x, "setClientSite", js.Any.fromFunction1((t0: XEmbeddedClient) => value(t0).runNow()))
    
    inline def setSetContainerName(value: String => Callback): Self = StObject.set(x, "setContainerName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetUpdateMode(value: Double => Callback): Self = StObject.set(x, "setUpdateMode", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSupportedVerbs(value: SafeArray[VerbDescriptor]): Self = StObject.set(x, "SupportedVerbs", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
