package typingsJapgolly.cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Copied from https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/node/events.d.ts
// to avoid type conflict.
@js.native
trait NodeEventEmitter extends StObject {
  
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  
  def eventNames(): js.Array[String | js.Symbol] = js.native
  
  def getMaxListeners(): Double = js.native
  
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  
  def listeners(event: String): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  def off(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  // Added in Node 6...
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  def rawListeners(event: String): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  
  def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  def setMaxListeners(n: Double): this.type = js.native
}
