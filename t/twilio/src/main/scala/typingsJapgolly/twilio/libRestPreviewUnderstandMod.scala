package typingsJapgolly.twilio

import typingsJapgolly.twilio.libRestPreviewUnderstandAssistantMod.AssistantContext
import typingsJapgolly.twilio.libRestPreviewUnderstandAssistantMod.AssistantListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandMod {
  
  @JSImport("twilio/lib/rest/preview/Understand", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Understand {
    /**
      * Initialize the Understand version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typingsJapgolly.twilio.libRestPreviewMod.^) = this()
  }
  
  @js.native
  trait Understand
    extends typingsJapgolly.twilio.libBaseVersionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def assistants(sid: String): AssistantContext = js.native
    @JSName("assistants")
    val assistants_Original: AssistantListInstance = js.native
  }
}
