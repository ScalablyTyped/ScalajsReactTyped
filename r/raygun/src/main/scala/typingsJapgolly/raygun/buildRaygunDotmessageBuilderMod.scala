package typingsJapgolly.raygun

import typingsJapgolly.raygun.buildTypesMod.CustomData
import typingsJapgolly.raygun.buildTypesMod.Message
import typingsJapgolly.raygun.buildTypesMod.MessageBuilderOptions
import typingsJapgolly.raygun.buildTypesMod.MessageBuilding
import typingsJapgolly.raygun.buildTypesMod.RawUserData
import typingsJapgolly.raygun.buildTypesMod.RequestParams
import typingsJapgolly.raygun.buildTypesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRaygunDotmessageBuilderMod {
  
  @JSImport("raygun/build/raygun.messageBuilder", "RaygunMessageBuilder")
  @js.native
  open class RaygunMessageBuilder () extends StObject {
    def this(options: MessageBuilderOptions) = this()
    
    var _filters: js.Array[String] = js.native
    
    def build(): Message = js.native
    
    /* private */ var extractUserProperties: Any = js.native
    
    var message: MessageBuilding = js.native
    
    var options: MessageBuilderOptions = js.native
    
    def setEnvironmentDetails(): this.type = js.native
    
    def setErrorDetails(error: Any): this.type = js.native
    
    def setMachineName(): this.type = js.native
    def setMachineName(machineName: String): this.type = js.native
    
    def setRequestDetails(): this.type = js.native
    def setRequestDetails(request: RequestParams): this.type = js.native
    
    def setTags(tags: js.Array[Tag]): this.type = js.native
    
    def setUser(user: js.Function0[UserMessageData]): this.type = js.native
    def setUser(user: UserMessageData): this.type = js.native
    
    def setUserCustomData(): this.type = js.native
    def setUserCustomData(customData: CustomData): this.type = js.native
    
    def setVersion(version: String): this.type = js.native
  }
  
  type UserMessageData = js.UndefOr[RawUserData | String]
}
