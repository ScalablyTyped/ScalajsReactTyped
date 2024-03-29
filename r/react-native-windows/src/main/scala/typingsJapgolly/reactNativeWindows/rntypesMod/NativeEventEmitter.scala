package typingsJapgolly.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstract base class for implementing event-emitting modules. This implements
  * a subset of the standard EventEmitter node module API.
  */
@js.native
trait NativeEventEmitter
  extends StObject
     with EventEmitter {
  
  def addListener(eventType: String, listener: js.Function1[/* event */ Any, Unit], context: js.Object): EmitterSubscription = js.native
}
