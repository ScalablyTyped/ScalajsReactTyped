package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMediaMod {
  
  @JSImport("twilio/lib/rest/Media", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Media {
    /**
      * Initialize media domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Media
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val mediaProcessor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MediaProcessorListInstance */ Any = js.native
    
    val mediaRecording: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MediaRecordingListInstance */ Any = js.native
    
    val playerStreamer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlayerStreamerListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestMediaV1Mod.^ = js.native
  }
}
