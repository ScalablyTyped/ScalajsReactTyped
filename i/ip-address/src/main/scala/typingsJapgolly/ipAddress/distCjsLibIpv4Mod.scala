package typingsJapgolly.ipAddress

import typingsJapgolly.ipAddress.distCjsLibCommonMod.ReverseFormOptions
import typingsJapgolly.ipAddress.distCjsLibIpv6Mod.Address6
import typingsJapgolly.jsbn.mod.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsLibIpv4Mod {
  
  @JSImport("ip-address/dist/cjs/lib/ipv4", "Address4")
  @js.native
  open class Address4 protected () extends StObject {
    def this(address: String) = this()
    
    /**
      * Helper function getting end address.
      * @memberof Address4
      * @instance
      * @returns {BigInteger}
      */
    def _endAddress(): BigInteger = js.native
    
    /**
      * Helper function getting start address.
      * @memberof Address4
      * @instance
      * @returns {BigInteger}
      */
    def _startAddress(): BigInteger = js.native
    
    var address: String = js.native
    
    var addressMinusSuffix: js.UndefOr[String] = js.native
    
    /**
      * Returns the address as a BigInteger
      * @memberof Address4
      * @instance
      * @returns {BigInteger}
      */
    def bigInteger(): BigInteger = js.native
    
    /**
      * Returns a zero-padded base-2 string representation of the address
      * @memberof Address4
      * @instance
      * @returns {string}
      */
    def binaryZeroPad(): String = js.native
    
    /**
      * Returns the correct form of an address
      * @memberof Address4
      * @instance
      * @returns {String}
      */
    def correctForm(): String = js.native
    
    /**
      * The last address in the range given by this address' subnet
      * Often referred to as the Broadcast
      * @memberof Address4
      * @instance
      * @returns {Address4}
      */
    def endAddress(): Address4 = js.native
    
    /**
      * The last host address in the range given by this address's subnet ie
      * the last address prior to the Broadcast Address
      * @memberof Address4
      * @instance
      * @returns {Address4}
      */
    def endAddressExclusive(): Address4 = js.native
    
    /**
      * Returns the bits in the given range as a base-2 string
      * @memberof Address4
      * @instance
      * @returns {string}
      */
    def getBitsBase2(start: Double, end: Double): String = js.native
    
    /**
      * Groups an IPv4 address for inclusion at the end of an IPv6 address
      * @returns {String}
      */
    def groupForV6(): String = js.native
    
    var groups: Double = js.native
    
    /**
      * Returns true if the address is correct, false otherwise
      * @memberof Address4
      * @instance
      * @returns {Boolean}
      */
    def isCorrect(): Boolean = js.native
    
    /**
      * Returns true if the given address is in the subnet of the current address
      * @memberof Address4
      * @instance
      * @returns {boolean}
      */
    def isInSubnet(address: this.type): Boolean = js.native
    def isInSubnet(address: Address6): Boolean = js.native
    /**
      * Returns true if the given address is in the subnet of the current address
      * @memberof Address4
      * @instance
      * @returns {boolean}
      */
    @JSName("isInSubnet")
    var isInSubnet_Original: js.ThisFunction1[/* this */ this.type | Address6, /* address */ this.type | Address6, Boolean] = js.native
    
    /**
      * Returns true if the given address is a multicast address
      * @memberof Address4
      * @instance
      * @returns {boolean}
      */
    def isMulticast(): Boolean = js.native
    
    /**
      * Returns the first n bits of the address, defaulting to the
      * subnet mask
      * @memberof Address4
      * @instance
      * @returns {String}
      */
    def mask(): String = js.native
    def mask(mask: Double): String = js.native
    
    def parse(address: String): js.Array[String] = js.native
    
    var parsedAddress: js.Array[String] = js.native
    
    var parsedSubnet: String = js.native
    
    /**
      * Return the reversed ip6.arpa form of the address
      * @memberof Address4
      * @param {Object} options
      * @param {boolean} options.omitSuffix - omit the "in-addr.arpa" suffix
      * @instance
      * @returns {String}
      */
    def reverseForm(): String = js.native
    def reverseForm(options: ReverseFormOptions): String = js.native
    
    /**
      * The first address in the range given by this address' subnet.
      * Often referred to as the Network Address.
      * @memberof Address4
      * @instance
      * @returns {Address4}
      */
    def startAddress(): Address4 = js.native
    
    /**
      * The first host address in the range given by this address's subnet ie
      * the first address after the Network Address
      * @memberof Address4
      * @instance
      * @returns {Address4}
      */
    def startAddressExclusive(): Address4 = js.native
    
    var subnet: String = js.native
    
    var subnetMask: Double = js.native
    
    /**
      * Converts an IPv4 address object to an array of bytes
      * @memberof Address4
      * @instance
      * @returns {Array}
      */
    def toArray(): js.Array[Double] = js.native
    
    /**
      * Converts an IPv4 address object to an IPv6 address group
      * @memberof Address4
      * @instance
      * @returns {String}
      */
    def toGroup6(): String = js.native
    
    /**
      * Converts an IPv4 address object to a hex string
      * @memberof Address4
      * @instance
      * @returns {String}
      */
    def toHex(): String = js.native
    
    var v4: Boolean = js.native
  }
  /* static members */
  object Address4 {
    
    @JSImport("ip-address/dist/cjs/lib/ipv4", "Address4")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return an address from in-addr.arpa form
      * @memberof Address4
      * @static
      * @param {string} arpaFormAddress - an 'in-addr.arpa' form ipv4 address
      * @returns {Adress4}
      * @example
      * var address = Address4.fromArpa(42.2.0.192.in-addr.arpa.)
      * address.correctForm(); // '192.0.2.42'
      */
    inline def fromArpa(arpaFormAddress: String): Address4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArpa")(arpaFormAddress.asInstanceOf[js.Any]).asInstanceOf[Address4]
    
    /**
      * Converts a BigInteger to a v4 address object
      * @memberof Address4
      * @static
      * @param {BigInteger} bigInteger - a BigInteger to convert
      * @returns {Address4}
      */
    inline def fromBigInteger(bigInteger: BigInteger): Address4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInteger")(bigInteger.asInstanceOf[js.Any]).asInstanceOf[Address4]
    
    /**
      * Converts a hex string to an IPv4 address object
      * @memberof Address4
      * @static
      * @param {string} hex - a hex string to convert
      * @returns {Address4}
      */
    inline def fromHex(hex: String): Address4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[Address4]
    
    /**
      * Converts an integer into a IPv4 address object
      * @memberof Address4
      * @static
      * @param {integer} integer - a number to convert
      * @returns {Address4}
      */
    inline def fromInteger(integer: Double): Address4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInteger")(integer.asInstanceOf[js.Any]).asInstanceOf[Address4]
    
    inline def isValid(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
