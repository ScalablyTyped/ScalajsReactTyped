package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distCommonMod.ProtoAny
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2ExpectedIntent
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod.InputValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod.Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperHelperMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/helper", "Helper")
  @js.native
  open class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends StObject
       with GoogleActionsV2ExpectedIntent {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
    
    @JSName("inputValueData")
    var inputValueData_Helper: ProtoAny[InputValueSpec, TValueSpec] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/helper", "SoloHelper")
  @js.native
  open class SoloHelper[TIntent /* <: Intent */, TValueSpec] protected () extends Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  trait HelperOptions[TIntent /* <: Intent */, TValueSpec] extends StObject {
    
    var data: js.UndefOr[TValueSpec] = js.undefined
    
    var intent: TIntent
    
    var `type`: InputValueSpec
  }
  object HelperOptions {
    
    inline def apply[TIntent /* <: Intent */, TValueSpec](intent: TIntent, `type`: InputValueSpec): HelperOptions[TIntent, TValueSpec] = {
      val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelperOptions[TIntent, TValueSpec]]
    }
    
    extension [Self <: HelperOptions[?, ?], TIntent /* <: Intent */, TValueSpec](x: Self & (HelperOptions[TIntent, TValueSpec])) {
      
      inline def setData(value: TValueSpec): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIntent(value: TIntent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setType(value: InputValueSpec): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
