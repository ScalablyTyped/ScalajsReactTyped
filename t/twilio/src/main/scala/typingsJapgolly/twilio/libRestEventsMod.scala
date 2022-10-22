package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestEventsMod {
  
  @JSImport("twilio/lib/rest/Events", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Events {
    /**
      * Initialize events domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Events
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val eventTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTypeListInstance */ Any = js.native
    
    val schemas: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchemaListInstance */ Any = js.native
    
    val sinks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SinkListInstance */ Any = js.native
    
    val subscriptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscriptionListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestEventsV1Mod.^ = js.native
  }
}
