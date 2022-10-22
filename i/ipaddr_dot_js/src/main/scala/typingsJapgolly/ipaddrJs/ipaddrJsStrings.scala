package typingsJapgolly.ipaddrJs

import typingsJapgolly.ipaddrJs.mod.IPv4Range
import typingsJapgolly.ipaddrJs.mod.IPv6Range
import typingsJapgolly.ipaddrJs.mod.IPvXRangeDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipaddrJsStrings {
  
  @js.native
  sealed trait `6to4`
    extends StObject
       with IPv6Range
  inline def `6to4`: `6to4` = "6to4".asInstanceOf[`6to4`]
  
  @js.native
  sealed trait broadcast
    extends StObject
       with IPv4Range
  inline def broadcast: broadcast = "broadcast".asInstanceOf[broadcast]
  
  @js.native
  sealed trait carrierGradeNat
    extends StObject
       with IPv4Range
  inline def carrierGradeNat: carrierGradeNat = "carrierGradeNat".asInstanceOf[carrierGradeNat]
  
  @js.native
  sealed trait ipv4 extends StObject
  inline def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  
  @js.native
  sealed trait ipv4Mapped
    extends StObject
       with IPv6Range
  inline def ipv4Mapped: ipv4Mapped = "ipv4Mapped".asInstanceOf[ipv4Mapped]
  
  @js.native
  sealed trait ipv6 extends StObject
  inline def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  
  @js.native
  sealed trait linkLocal
    extends StObject
       with IPv4Range
       with IPv6Range
       with IPvXRangeDefaults
  inline def linkLocal: linkLocal = "linkLocal".asInstanceOf[linkLocal]
  
  @js.native
  sealed trait loopback
    extends StObject
       with IPv4Range
       with IPv6Range
       with IPvXRangeDefaults
  inline def loopback: loopback = "loopback".asInstanceOf[loopback]
  
  @js.native
  sealed trait multicast
    extends StObject
       with IPv4Range
       with IPv6Range
       with IPvXRangeDefaults
  inline def multicast: multicast = "multicast".asInstanceOf[multicast]
  
  @js.native
  sealed trait `private`
    extends StObject
       with IPv4Range
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait reserved
    extends StObject
       with IPv4Range
       with IPv6Range
       with IPvXRangeDefaults
  inline def reserved: reserved = "reserved".asInstanceOf[reserved]
  
  @js.native
  sealed trait rfc6052
    extends StObject
       with IPv6Range
  inline def rfc6052: rfc6052 = "rfc6052".asInstanceOf[rfc6052]
  
  @js.native
  sealed trait rfc6145
    extends StObject
       with IPv6Range
  inline def rfc6145: rfc6145 = "rfc6145".asInstanceOf[rfc6145]
  
  @js.native
  sealed trait teredo
    extends StObject
       with IPv6Range
  inline def teredo: teredo = "teredo".asInstanceOf[teredo]
  
  @js.native
  sealed trait unicast
    extends StObject
       with IPv4Range
       with IPv6Range
       with IPvXRangeDefaults
  inline def unicast: unicast = "unicast".asInstanceOf[unicast]
  
  @js.native
  sealed trait uniqueLocal
    extends StObject
       with IPv6Range
  inline def uniqueLocal: uniqueLocal = "uniqueLocal".asInstanceOf[uniqueLocal]
  
  @js.native
  sealed trait unspecified
    extends StObject
       with IPv4Range
       with IPv6Range
       with IPvXRangeDefaults
  inline def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
}
