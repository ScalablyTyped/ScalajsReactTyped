package typingsJapgolly.cannon.global.CANNON

import typingsJapgolly.cannon.CANNON.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.World")
@js.native
open class World ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.World {
  
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function): typingsJapgolly.cannon.CANNON.EventTarget = js.native
  
  /* CompleteClass */
  override def dispatchEvent(event: IEvent): IEvent = js.native
  
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function): typingsJapgolly.cannon.CANNON.EventTarget = js.native
}
