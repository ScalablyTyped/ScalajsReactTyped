package typingsJapgolly.sidewayAddress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIpMod {
  
  @JSImport("@sideway/address/dist/ip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ipRegex(): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("ipRegex")().asInstanceOf[Expression]
  inline def ipRegex(options: Options): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("ipRegex")(options.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sidewayAddress.sidewayAddressStrings.optional
    - typingsJapgolly.sidewayAddress.sidewayAddressStrings.required
    - typingsJapgolly.sidewayAddress.sidewayAddressStrings.forbidden
  */
  trait Cidr extends StObject
  object Cidr {
    
    inline def forbidden: typingsJapgolly.sidewayAddress.sidewayAddressStrings.forbidden = "forbidden".asInstanceOf[typingsJapgolly.sidewayAddress.sidewayAddressStrings.forbidden]
    
    inline def optional: typingsJapgolly.sidewayAddress.sidewayAddressStrings.optional = "optional".asInstanceOf[typingsJapgolly.sidewayAddress.sidewayAddressStrings.optional]
    
    inline def required: typingsJapgolly.sidewayAddress.sidewayAddressStrings.required = "required".asInstanceOf[typingsJapgolly.sidewayAddress.sidewayAddressStrings.required]
  }
  
  trait Expression extends StObject {
    
    /** The CIDR mode. */
    var cidr: Cidr
    
    /** The raw regular expression string. */
    var raw: String
    
    /** The regular expression. */
    var regex: js.RegExp
    
    /** The array of versions allowed. */
    var versions: js.Array[Version]
  }
  object Expression {
    
    inline def apply(cidr: Cidr, raw: String, regex: js.RegExp, versions: js.Array[Version]): Expression = {
      val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    extension [Self <: Expression](x: Self) {
      
      inline def setCidr(value: Cidr): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: js.Array[Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: Version*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The required CIDR mode.
      *
      * @default 'optional'
      */
    val cidr: js.UndefOr[Cidr] = js.undefined
    
    /**
      * The allowed versions.
      *
      * @default ['ipv4', 'ipv6', 'ipvfuture']
      */
    val version: js.UndefOr[Version | js.Array[Version]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCidr(value: Cidr): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      inline def setVersion(value: Version | js.Array[Version]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVersionVarargs(value: Version*): Self = StObject.set(x, "version", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sidewayAddress.sidewayAddressStrings.ipv4
    - typingsJapgolly.sidewayAddress.sidewayAddressStrings.ipv6
    - typingsJapgolly.sidewayAddress.sidewayAddressStrings.ipvfuture
  */
  trait Version extends StObject
  object Version {
    
    inline def ipv4: typingsJapgolly.sidewayAddress.sidewayAddressStrings.ipv4 = "ipv4".asInstanceOf[typingsJapgolly.sidewayAddress.sidewayAddressStrings.ipv4]
    
    inline def ipv6: typingsJapgolly.sidewayAddress.sidewayAddressStrings.ipv6 = "ipv6".asInstanceOf[typingsJapgolly.sidewayAddress.sidewayAddressStrings.ipv6]
    
    inline def ipvfuture: typingsJapgolly.sidewayAddress.sidewayAddressStrings.ipvfuture = "ipvfuture".asInstanceOf[typingsJapgolly.sidewayAddress.sidewayAddressStrings.ipvfuture]
  }
}
