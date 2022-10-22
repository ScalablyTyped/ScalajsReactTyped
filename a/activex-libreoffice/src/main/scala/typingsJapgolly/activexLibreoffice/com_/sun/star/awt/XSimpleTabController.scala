package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the basic operations for a tab controller, but does not require {@link XControl} as type of tabs. */
trait XSimpleTabController
  extends StObject
     with XInterface {
  
  /**
    * return the unique ID of the current active tab.
    * @returns [long] the ID of the active tab.
    */
  val ActiveTabID: Double
  
  /**
    * activate the specified tab.
    *
    * The new tab will be activated and all listener will get an event describing this. Of course there will be an event too, which notifies listener about
    * the deactivation of the last active tab.
    * @param ID the ID of the new active tab.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def activateTab(ID: Double): Unit
  
  /**
    * register listener for inserting/removing tabs and changing their properties.
    * @param Listener the listener to register.
    */
  def addTabListener(Listener: XTabListener): Unit
  
  /**
    * return the unique ID of the current active tab.
    * @returns [long] the ID of the active tab.
    */
  def getActiveTabID(): Double
  
  /**
    * retrieve the set of properties for the specified tab.
    * @param ID the ID of the tab.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def getTabProps(ID: Double): SafeArray[NamedValue]
  
  /**
    * create a new tab and return an unique ID, which can be used further to address this tab by using other methods of this interface.
    * @returns [long an unique ID for this new tab.
    */
  def insertTab(): Double
  
  /**
    * remove a tab with the given ID.
    * @param ID the ID of the tab, which should be removed.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def removeTab(ID: Double): Unit
  
  /**
    * unregister listener for inserting/removing tabs and changing their properties.
    * @param Listener the listener to unregister.
    */
  def removeTabListener(Listener: XTabListener): Unit
  
  /**
    * change some properties of the specified tab.
    * @param Properties Such properties can be: {{table here, see documentation}}
    * @param ID the ID of the tab, which should be changed.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def setTabProps(ID: Double, Properties: SeqEquiv[NamedValue]): Unit
}
object XSimpleTabController {
  
  inline def apply(
    ActiveTabID: Double,
    acquire: Callback,
    activateTab: Double => Callback,
    addTabListener: XTabListener => Callback,
    getActiveTabID: CallbackTo[Double],
    getTabProps: Double => SafeArray[NamedValue],
    insertTab: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    removeTab: Double => Callback,
    removeTabListener: XTabListener => Callback,
    setTabProps: (Double, SeqEquiv[NamedValue]) => Callback
  ): XSimpleTabController = {
    val __obj = js.Dynamic.literal(ActiveTabID = ActiveTabID.asInstanceOf[js.Any], acquire = acquire.toJsFn, activateTab = js.Any.fromFunction1((t0: Double) => activateTab(t0).runNow()), addTabListener = js.Any.fromFunction1((t0: XTabListener) => addTabListener(t0).runNow()), getActiveTabID = getActiveTabID.toJsFn, getTabProps = js.Any.fromFunction1(getTabProps), insertTab = insertTab.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTab = js.Any.fromFunction1((t0: Double) => removeTab(t0).runNow()), removeTabListener = js.Any.fromFunction1((t0: XTabListener) => removeTabListener(t0).runNow()), setTabProps = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[NamedValue]) => (setTabProps(t0, t1)).runNow()))
    __obj.asInstanceOf[XSimpleTabController]
  }
  
  extension [Self <: XSimpleTabController](x: Self) {
    
    inline def setActivateTab(value: Double => Callback): Self = StObject.set(x, "activateTab", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setActiveTabID(value: Double): Self = StObject.set(x, "ActiveTabID", value.asInstanceOf[js.Any])
    
    inline def setAddTabListener(value: XTabListener => Callback): Self = StObject.set(x, "addTabListener", js.Any.fromFunction1((t0: XTabListener) => value(t0).runNow()))
    
    inline def setGetActiveTabID(value: CallbackTo[Double]): Self = StObject.set(x, "getActiveTabID", value.toJsFn)
    
    inline def setGetTabProps(value: Double => SafeArray[NamedValue]): Self = StObject.set(x, "getTabProps", js.Any.fromFunction1(value))
    
    inline def setInsertTab(value: CallbackTo[Double]): Self = StObject.set(x, "insertTab", value.toJsFn)
    
    inline def setRemoveTab(value: Double => Callback): Self = StObject.set(x, "removeTab", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRemoveTabListener(value: XTabListener => Callback): Self = StObject.set(x, "removeTabListener", js.Any.fromFunction1((t0: XTabListener) => value(t0).runNow()))
    
    inline def setSetTabProps(value: (Double, SeqEquiv[NamedValue]) => Callback): Self = StObject.set(x, "setTabProps", js.Any.fromFunction2((t0: Double, t1: SeqEquiv[NamedValue]) => (value(t0, t1)).runNow()))
  }
}
