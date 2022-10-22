package typingsJapgolly.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
@js.native
trait ExtJS
  extends StObject
     with Browser
     with IExtJSAjax
     with IExtJSComponent
     with IExtJSDataView
     with IExtJSElement
     with IExtJSFormField
     with IExtJSGrid
     with IExtJSObservable
     with IExtJSStore
     with IExtJSCore {
  
  def assertMaxNumberOfGlobalExtOverrides(maxNumber: Double, description: Any): Unit = js.native
  
  def assertNoGlobalExtOverrides(): Unit = js.native
  def assertNoGlobalExtOverrides(description: String): Unit = js.native
  
  def assertNoLayoutTriggered(fn: js.Function, scope: Any): Unit = js.native
  def assertNoLayoutTriggered(fn: js.Function, scope: Any, description: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def firesAtLeastNTimes(observable: Any, event: String, n: Double, desc: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def firesOnce(observable: Any, event: String, desc: String): Unit = js.native
  
  def getTotalLayoutCounter(): Double = js.native
  
  /* InferMemberOverrides */
  override def waitForEvent(observable: Any, event: String, callback: js.Function): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Any): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def wontFire(observable: Any, event: String, desc: String): Unit = js.native
}
