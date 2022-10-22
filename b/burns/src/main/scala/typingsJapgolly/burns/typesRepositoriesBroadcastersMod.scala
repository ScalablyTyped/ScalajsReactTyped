package typingsJapgolly.burns

import typingsJapgolly.burns.anon.Broadcast
import typingsJapgolly.burns.anon.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoriesBroadcastersMod {
  
  @JSImport("burns/types/repositories/broadcasters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBroadcaster(driver: String, config: Any): Broadcast = (^.asInstanceOf[js.Dynamic].applyDynamic("createBroadcaster")(driver.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Broadcast]
  
  @js.native
  trait Broadcaster extends StObject {
    
    def broadcast(channels: String, eventName: String, eventData: Any, options: Exclude): Any = js.native
    def broadcast(channels: js.Array[String], eventName: String, eventData: Any, options: Exclude): Any = js.native
  }
}
