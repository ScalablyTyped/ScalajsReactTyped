package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestBulkexportsMod {
  
  @JSImport("twilio/lib/rest/Bulkexports", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Bulkexports {
    /**
      * Initialize bulkexports domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Bulkexports
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val exportConfiguration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExportConfigurationListInstance */ Any = js.native
    
    val exports: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExportListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestBulkexportsV1Mod.^ = js.native
  }
}
