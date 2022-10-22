package typingsJapgolly.hammerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HammerManager extends StObject {
  
  def add(recogniser: js.Array[Recognizer]): HammerManager = js.native
  def add(recogniser: Recognizer): HammerManager = js.native
  @JSName("add")
  def add_Recognizer(recogniser: js.Array[Recognizer]): Recognizer = js.native
  @JSName("add")
  def add_Recognizer(recogniser: Recognizer): Recognizer = js.native
  
  def destroy(): Unit = js.native
  
  def emit(event: String, data: Any): Unit = js.native
  
  def get(recogniser: String): Recognizer = js.native
  def get(recogniser: Recognizer): Recognizer = js.native
  
  def off(events: String): Unit = js.native
  def off(events: String, handler: HammerListener): Unit = js.native
  
  def on(events: String, handler: HammerListener): Unit = js.native
  
  def recognize(inputData: Any): Unit = js.native
  
  def remove(recogniser: String): HammerManager = js.native
  def remove(recogniser: Recognizer): HammerManager = js.native
  
  def set(options: HammerOptions): HammerManager = js.native
  
  def stop(force: Boolean): Unit = js.native
}
