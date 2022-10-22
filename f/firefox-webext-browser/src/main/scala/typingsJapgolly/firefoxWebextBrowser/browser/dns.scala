package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Asynchronous DNS API
  *
  * Permissions: `dns`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object dns {
  
  /* dns types */
  /** An object encapsulating a DNS Record. */
  trait DNSRecord extends StObject {
    
    var addresses: js.Array[String]
    
    /**
      * The canonical hostname for this record. this value is empty if the record was not fetched with the 'canonical_name' flag.
      */
    var canonicalName: js.UndefOr[String] = js.undefined
    
    /** Record retreived with TRR. */
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
  
  type ResolveFlags = js.Array[_ResolveFlags]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_name_collisions
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bypass_cache
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.canonical_name
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv4
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv6
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_trr
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.offline
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_low
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_medium
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.speculate
  */
  trait _ResolveFlags extends StObject
  object _ResolveFlags {
    
    inline def allow_name_collisions: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_name_collisions = "allow_name_collisions".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_name_collisions]
    
    inline def bypass_cache: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bypass_cache = "bypass_cache".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bypass_cache]
    
    inline def canonical_name: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.canonical_name = "canonical_name".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.canonical_name]
    
    inline def disable_ipv4: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv4 = "disable_ipv4".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv4]
    
    inline def disable_ipv6: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv6 = "disable_ipv6".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv6]
    
    inline def disable_trr: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_trr = "disable_trr".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_trr]
    
    inline def offline: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.offline = "offline".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.offline]
    
    inline def priority_low: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_low = "priority_low".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_low]
    
    inline def priority_medium: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_medium = "priority_medium".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_medium]
    
    inline def speculate: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.speculate = "speculate".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.speculate]
  }
}
