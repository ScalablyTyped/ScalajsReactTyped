package typingsJapgolly.extjs.global.Ext

import typingsJapgolly.extjs.Ext.IError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Error")
@js.native
open class Error ()
  extends StObject
     with typingsJapgolly.extjs.Ext.Error
/* static members */
object Error {
  
  @JSGlobal("Ext.Error")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Globally handle any Ext errors that may be raised optionally providing custom logic to handle different errors indiv
    * @param err Ext.Error The Ext.Error object being raised. It will contain any attributes that were originally raised with it, plus properties about the method and class from which the error originated (if raised from a class that uses the Ext 4 class system).
    */
  inline def handle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handle")().asInstanceOf[Unit]
  inline def handle(err: IError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handle")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Raise an error that can include additional data and supports automatic console logging if available
    * @param err String/Object The error message string, or an object containing the attribute "msg" that will be used as the error message. Any other data included in the object will also be logged to the browser console, if available.
    */
  inline def raise(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("raise")().asInstanceOf[Unit]
  inline def raise(err: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("raise")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
