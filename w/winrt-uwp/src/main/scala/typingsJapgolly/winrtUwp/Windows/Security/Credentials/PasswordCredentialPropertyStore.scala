package typingsJapgolly.winrtUwp.Windows.Security.Credentials

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapChangedEventArgs
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IObservableMap
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.MapChangedEventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.mapchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the password credential property store. This class and its members are reserved for internal use and are not intended to be used in your code. */
@js.native
trait PasswordCredentialPropertyStore extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, Any]): Unit = js.native
  
  /** This method is reserved for internal use and is not intended to be used in your code. */
  def clear(): Unit = js.native
  
  /**
    * This method is reserved for internal use and is not intended to be used in your code.
    */
  def first(): Any = js.native
  
  /* unmapped return type */
  /**
    * This method is reserved for internal use and is not intended to be used in your code.
    */
  def getView(): Any = js.native
  
  /* unmapped return type */
  /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    */
  def hasKey(key: String): Any = js.native
  
  /* unmapped return type */
  /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    * @param value Reserved.
    */
  def insert(key: String, value: Any): Any = js.native
  
  /* unmapped return type */
  /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    */
  def lookup(key: String): Any = js.native
  
  /* unmapped return type */
  /** This method is reserved for internal use and is not intended to be used in your code. */
  def onmapchanged(ev: IMapChangedEventArgs[String] & (WinRTEvent[IObservableMap[String, Any]])): Unit = js.native
  /* unmapped return type */
  /** This method is reserved for internal use and is not intended to be used in your code. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[String, Any] = js.native
  
  /**
    * This method is reserved for internal use and is not intended to be used in your code.
    * @param key Reserved.
    */
  def remove(key: String): Unit = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, Any]): Unit = js.native
  
  /** This method is reserved for internal use and is not intended to be used in your code. */
  var size: Double = js.native
}
