package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestFlexApiMod {
  
  @JSImport("twilio/lib/rest/FlexApi", JSImport.Namespace)
  @js.native
  open class ^ protected () extends FlexApi {
    /**
      * Initialize flex_api domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait FlexApi
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val channel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChannelListInstance */ Any = js.native
    
    val configuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigurationListInstance */ Any = js.native
    
    val flexFlow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlexFlowListInstance */ Any = js.native
    
    val interaction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InteractionListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestFlexApiV1Mod.^ = js.native
    
    val webChannel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebChannelListInstance */ Any = js.native
  }
}
