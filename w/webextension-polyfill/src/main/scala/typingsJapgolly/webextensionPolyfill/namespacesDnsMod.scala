package typingsJapgolly.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesDnsMod {
  
  object Dns {
    
    /**
      * An object encapsulating a DNS Record.
      */
    trait DNSRecord extends StObject {
      
      var addresses: js.Array[String]
      
      /**
        * The canonical hostname for this record.  this value is empty if the record was not fetched with the 'canonical_name'
        * flag.
        * Optional.
        */
      var canonicalName: js.UndefOr[String] = js.undefined
      
      /**
        * Record retreived with TRR.
        */
      var isTRR: String
    }
    object DNSRecord {
      
      inline def apply(addresses: js.Array[String], isTRR: String): DNSRecord = {
        val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], isTRR = isTRR.asInstanceOf[js.Any])
        __obj.asInstanceOf[DNSRecord]
      }
      
      extension [Self <: DNSRecord](x: Self) {
        
        inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
        
        inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
        
        inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
        
        inline def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
        
        inline def setIsTRR(value: String): Self = StObject.set(x, "isTRR", value.asInstanceOf[js.Any])
      }
    }
    
    type ResolveFlags = js.Array[ResolveFlagsItemEnum]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.allow_name_collisions
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.bypass_cache
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.canonical_name
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disable_ipv4
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disable_ipv6
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disable_trr
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.offline
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.priority_low
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.priority_medium
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.speculate
    */
    trait ResolveFlagsItemEnum extends StObject
    object ResolveFlagsItemEnum {
      
      inline def allow_name_collisions: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.allow_name_collisions = "allow_name_collisions".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.allow_name_collisions]
      
      inline def bypass_cache: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.bypass_cache = "bypass_cache".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.bypass_cache]
      
      inline def canonical_name: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.canonical_name = "canonical_name".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.canonical_name]
      
      inline def disable_ipv4: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disable_ipv4 = "disable_ipv4".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disable_ipv4]
      
      inline def disable_ipv6: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disable_ipv6 = "disable_ipv6".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disable_ipv6]
      
      inline def disable_trr: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disable_trr = "disable_trr".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disable_trr]
      
      inline def offline: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.offline = "offline".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.offline]
      
      inline def priority_low: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.priority_low = "priority_low".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.priority_low]
      
      inline def priority_medium: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.priority_medium = "priority_medium".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.priority_medium]
      
      inline def speculate: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.speculate = "speculate".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.speculate]
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Resolves a hostname to a DNS record.
        *
        * @param hostname
        * @param flags Optional.
        */
      def resolve(hostname: String): js.Promise[DNSRecord] = js.native
      def resolve(hostname: String, flags: ResolveFlags): js.Promise[DNSRecord] = js.native
    }
  }
}
