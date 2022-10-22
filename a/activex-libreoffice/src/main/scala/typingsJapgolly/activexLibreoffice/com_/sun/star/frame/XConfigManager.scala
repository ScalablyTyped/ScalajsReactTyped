package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XConfigManager
  extends StObject
     with XInterface {
  
  /**
    * add a listener to notify changes on well known variables inside the real implementation
    *
    * Listener can update its text values by calling {@link XConfigManager.substituteVariables()} again. If **KeyName** specifies a group of keys, the
    * listener gets one notify for each subkey.
    * @deprecated Deprecated
    * @param KeyName specifies variable about listener will be informed on changes
    * @param Listener listener which will be informed
    * @see XConfigManager.removePropertyChangeListener()
    */
  def addPropertyChangeListener(KeyName: String, Listener: XPropertyChangeListener): Unit
  
  /**
    * was designed for additional functionality for interface {@link com.sun.star.registry.XSimpleRegistry} and make no sense without that
    * @deprecated Deprecated
    */
  def flush(): Unit
  
  /**
    * remove a registered listener
    * @deprecated Deprecated
    * @param KeyName specifies variable on which listener was registered
    * @param Listener listener which will be deregistered
    * @see XConfigManager.addPropertyChangeListener()
    */
  def removePropertyChangeListener(KeyName: String, Listener: XPropertyChangeListener): Unit
  
  /**
    * substitute variables (place holder) inside given parameter **Text**
    *
    * The value of **Text** is NOT changed.
    * @param Text original value including variables
    * @returns changed copy of **Text** without any variables
    */
  def substituteVariables(Text: String): String
}
object XConfigManager {
  
  inline def apply(
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    flush: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    substituteVariables: String => String
  ): XConfigManager = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), flush = flush.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), substituteVariables = js.Any.fromFunction1(substituteVariables))
    __obj.asInstanceOf[XConfigManager]
  }
  
  extension [Self <: XConfigManager](x: Self) {
    
    inline def setAddPropertyChangeListener(value: (String, XPropertyChangeListener) => Callback): Self = StObject.set(x, "addPropertyChangeListener", js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (value(t0, t1)).runNow()))
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setRemovePropertyChangeListener(value: (String, XPropertyChangeListener) => Callback): Self = StObject.set(x, "removePropertyChangeListener", js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (value(t0, t1)).runNow()))
    
    inline def setSubstituteVariables(value: String => String): Self = StObject.set(x, "substituteVariables", js.Any.fromFunction1(value))
  }
}
