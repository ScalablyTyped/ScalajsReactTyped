package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typingsJapgolly.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typingsJapgolly.mangopay2NodejsSdk.typingsBaseMod.base.NoArgMethodOverload
import typingsJapgolly.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsEventMod.event.EventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesEventsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Events", "Events")
  @js.native
  open class Events () extends StObject {
    
    /**
      * Get events
      * @param options
      */
    def getAll(): js.Promise[js.Array[EventData]] = js.native
    /**
      * Get events
      * @param options
      */
    def getAll(
      callback: js.Function1[
          (/* data */ js.Array[EventData]) | (/* data */ WithResponse[js.Array[EventData]]), 
          Unit
        ]
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ WithResponse[js.Array[EventData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getAll(callback: js.Function1[/* data */ js.Array[EventData], Unit], options: MethodOptionWithoutResponse): Unit = js.native
    /**
      * Get events
      * @param options
      */
    def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[EventData]]] = js.native
    def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[EventData]] = js.native
    /**
      * Get events
      * @param options
      */
    @JSName("getAll")
    var getAll_Original: NoArgMethodOverload[js.Array[EventData]] = js.native
  }
}
