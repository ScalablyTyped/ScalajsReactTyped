package typingsJapgolly.ipaddrJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ipaddrJs.ipaddrJsStrings.ipv4
import typingsJapgolly.ipaddrJs.ipaddrJsStrings.ipv6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipaddr.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipaddr.js", "IPv4")
  @js.native
  open class IPv4 protected ()
    extends StObject
       with IP {
    def this(octets: js.Array[Double]) = this()
    
    def kind(): ipv4 = js.native
    
    def `match`(what: js.Tuple2[IPv4 | IPv6, Double]): Boolean = js.native
    def `match`(what: js.Tuple2[IPv4 | IPv6, Double], bits: Double): Boolean = js.native
    def `match`(what: IPv4): Boolean = js.native
    def `match`(what: IPv4, bits: Double): Boolean = js.native
    def `match`(what: IPv6): Boolean = js.native
    def `match`(what: IPv6, bits: Double): Boolean = js.native
    
    var octets: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def prefixLengthFromSubnetMask(): Double | Null = js.native
    
    def range(): IPv4Range = js.native
    
    def subnetMatch(rangeList: RangeList[IPv4]): String = js.native
    def subnetMatch(rangeList: RangeList[IPv4], defaultName: String): String = js.native
    
    /* CompleteClass */
    override def toByteArray(): js.Array[Double] = js.native
    
    def toIPv4MappedAddress(): IPv6 = js.native
    
    /* CompleteClass */
    override def toNormalizedString(): String = js.native
  }
  /* static members */
  object IPv4 {
    
    @JSImport("ipaddr.js", "IPv4")
    @js.native
    val ^ : js.Any = js.native
    
    inline def broadcastAddressFromCIDR(addr: String): IPv4 = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastAddressFromCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4]
    
    inline def isIPv4(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValid(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidFourPartDecimal(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFourPartDecimal")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def networkAddressFromCIDR(addr: String): IPv4 = ^.asInstanceOf[js.Dynamic].applyDynamic("networkAddressFromCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4]
    
    inline def parse(addr: String): IPv4 = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4]
    
    inline def parseCIDR(addr: String): js.Tuple2[IPv4, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[IPv4, Double]]
    
    inline def subnetMaskFromPrefixLength(prefix: Double): IPv4 = ^.asInstanceOf[js.Dynamic].applyDynamic("subnetMaskFromPrefixLength")(prefix.asInstanceOf[js.Any]).asInstanceOf[IPv4]
  }
  
  @JSImport("ipaddr.js", "IPv6")
  @js.native
  open class IPv6 protected ()
    extends StObject
       with IP {
    def this(parts: js.Array[Double]) = this()
    
    def isIPv4MappedAddress(): Boolean = js.native
    
    def kind(): ipv6 = js.native
    
    def `match`(what: js.Tuple2[IPv4 | IPv6, Double]): Boolean = js.native
    def `match`(what: js.Tuple2[IPv4 | IPv6, Double], bits: Double): Boolean = js.native
    def `match`(what: IPv4): Boolean = js.native
    def `match`(what: IPv4, bits: Double): Boolean = js.native
    def `match`(what: IPv6): Boolean = js.native
    def `match`(what: IPv6, bits: Double): Boolean = js.native
    
    var parts: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def prefixLengthFromSubnetMask(): Double | Null = js.native
    
    def range(): IPv6Range = js.native
    
    def subnetMatch(rangeList: RangeList[IPv6]): String = js.native
    def subnetMatch(rangeList: RangeList[IPv6], defaultName: String): String = js.native
    
    /* CompleteClass */
    override def toByteArray(): js.Array[Double] = js.native
    
    def toIPv4Address(): IPv4 = js.native
    
    /* CompleteClass */
    override def toNormalizedString(): String = js.native
    
    def toRFC5952String(): String = js.native
    
    var zoneId: js.UndefOr[String] = js.native
  }
  /* static members */
  object IPv6 {
    
    @JSImport("ipaddr.js", "IPv6")
    @js.native
    val ^ : js.Any = js.native
    
    inline def broadcastAddressFromCIDR(addr: String): IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastAddressFromCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv6]
    
    inline def isIPv6(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValid(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def networkAddressFromCIDR(addr: String): IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("networkAddressFromCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv6]
    
    inline def parse(addr: String): IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv6]
    
    inline def parseCIDR(addr: String): js.Tuple2[IPv6, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCIDR")(addr.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[IPv6, Double]]
    
    inline def subnetMaskFromPrefixLength(prefix: Double): IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("subnetMaskFromPrefixLength")(prefix.asInstanceOf[js.Any]).asInstanceOf[IPv6]
  }
  
  inline def fromByteArray(bytes: js.Array[Double]): IPv4 | IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromByteArray")(bytes.asInstanceOf[js.Any]).asInstanceOf[IPv4 | IPv6]
  
  inline def isValid(addr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse(addr: String): IPv4 | IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4 | IPv6]
  
  inline def parseCIDR(mask: String): js.Tuple2[IPv4 | IPv6, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCIDR")(mask.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[IPv4 | IPv6, Double]]
  
  inline def process(addr: String): IPv4 | IPv6 = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(addr.asInstanceOf[js.Any]).asInstanceOf[IPv4 | IPv6]
  
  inline def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4 | IPv6]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subnetMatch")(addr.asInstanceOf[js.Any], rangeList.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4 | IPv6], defaultName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subnetMatch")(addr.asInstanceOf[js.Any], rangeList.asInstanceOf[js.Any], defaultName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def subnetMatch(addr: IPv6, rangeList: RangeList[IPv4 | IPv6]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subnetMatch")(addr.asInstanceOf[js.Any], rangeList.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def subnetMatch(addr: IPv6, rangeList: RangeList[IPv4 | IPv6], defaultName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subnetMatch")(addr.asInstanceOf[js.Any], rangeList.asInstanceOf[js.Any], defaultName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  // Common methods/properties for IPv4 and IPv6 classes.
  trait IP extends StObject {
    
    def prefixLengthFromSubnetMask(): Double | Null
    
    def toByteArray(): js.Array[Double]
    
    def toNormalizedString(): String
  }
  object IP {
    
    inline def apply(
      prefixLengthFromSubnetMask: CallbackTo[Double | Null],
      toByteArray: CallbackTo[js.Array[Double]],
      toNormalizedString: CallbackTo[String]
    ): IP = {
      val __obj = js.Dynamic.literal(prefixLengthFromSubnetMask = prefixLengthFromSubnetMask.toJsFn, toByteArray = toByteArray.toJsFn, toNormalizedString = toNormalizedString.toJsFn)
      __obj.asInstanceOf[IP]
    }
    
    extension [Self <: IP](x: Self) {
      
      inline def setPrefixLengthFromSubnetMask(value: CallbackTo[Double | Null]): Self = StObject.set(x, "prefixLengthFromSubnetMask", value.toJsFn)
      
      inline def setToByteArray(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "toByteArray", value.toJsFn)
      
      inline def setToNormalizedString(value: CallbackTo[String]): Self = StObject.set(x, "toNormalizedString", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.broadcast
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.carrierGradeNat
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.`private`
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved
  */
  trait IPv4Range extends StObject
  object IPv4Range {
    
    inline def broadcast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.broadcast = "broadcast".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.broadcast]
    
    inline def carrierGradeNat: typingsJapgolly.ipaddrJs.ipaddrJsStrings.carrierGradeNat = "carrierGradeNat".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.carrierGradeNat]
    
    inline def linkLocal: typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal = "linkLocal".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal]
    
    inline def loopback: typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback = "loopback".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback]
    
    inline def multicast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast = "multicast".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast]
    
    inline def `private`: typingsJapgolly.ipaddrJs.ipaddrJsStrings.`private` = "private".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.`private`]
    
    inline def reserved: typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved = "reserved".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved]
    
    inline def unicast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast = "unicast".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast]
    
    inline def unspecified: typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified = "unspecified".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.uniqueLocal
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.ipv4Mapped
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.rfc6145
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.rfc6052
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.`6to4`
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.teredo
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved
  */
  trait IPv6Range extends StObject
  object IPv6Range {
    
    inline def `6to4`: typingsJapgolly.ipaddrJs.ipaddrJsStrings.`6to4` = "6to4".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.`6to4`]
    
    inline def ipv4Mapped: typingsJapgolly.ipaddrJs.ipaddrJsStrings.ipv4Mapped = "ipv4Mapped".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.ipv4Mapped]
    
    inline def linkLocal: typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal = "linkLocal".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal]
    
    inline def loopback: typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback = "loopback".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback]
    
    inline def multicast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast = "multicast".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast]
    
    inline def reserved: typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved = "reserved".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved]
    
    inline def rfc6052: typingsJapgolly.ipaddrJs.ipaddrJsStrings.rfc6052 = "rfc6052".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.rfc6052]
    
    inline def rfc6145: typingsJapgolly.ipaddrJs.ipaddrJsStrings.rfc6145 = "rfc6145".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.rfc6145]
    
    inline def teredo: typingsJapgolly.ipaddrJs.ipaddrJsStrings.teredo = "teredo".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.teredo]
    
    inline def unicast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast = "unicast".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast]
    
    inline def uniqueLocal: typingsJapgolly.ipaddrJs.ipaddrJsStrings.uniqueLocal = "uniqueLocal".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.uniqueLocal]
    
    inline def unspecified: typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified = "unspecified".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback
    - typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved
  */
  trait IPvXRangeDefaults extends StObject
  object IPvXRangeDefaults {
    
    inline def linkLocal: typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal = "linkLocal".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal]
    
    inline def loopback: typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback = "loopback".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback]
    
    inline def multicast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast = "multicast".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast]
    
    inline def reserved: typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved = "reserved".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved]
    
    inline def unicast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast = "unicast".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast]
    
    inline def unspecified: typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified = "unspecified".asInstanceOf[typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified]
  }
  
  type RangeList[T] = StringDictionary[(js.Tuple2[T, Double]) | (js.Array[js.Tuple2[T, Double]])]
}
