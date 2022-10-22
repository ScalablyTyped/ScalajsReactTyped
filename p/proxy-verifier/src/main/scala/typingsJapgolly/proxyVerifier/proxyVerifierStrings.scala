package typingsJapgolly.proxyVerifier

import typingsJapgolly.proxyVerifier.mod.AnonymityLevel
import typingsJapgolly.proxyVerifier.mod.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyVerifierStrings {
  
  @js.native
  sealed trait anonymous
    extends StObject
       with AnonymityLevel
  inline def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  
  @js.native
  sealed trait elite
    extends StObject
       with AnonymityLevel
  inline def elite: elite = "elite".asInstanceOf[elite]
  
  @js.native
  sealed trait http
    extends StObject
       with Protocol
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https
    extends StObject
       with Protocol
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait socks4
    extends StObject
       with Protocol
  inline def socks4: socks4 = "socks4".asInstanceOf[socks4]
  
  @js.native
  sealed trait socks5
    extends StObject
       with Protocol
  inline def socks5: socks5 = "socks5".asInstanceOf[socks5]
  
  @js.native
  sealed trait transparent
    extends StObject
       with AnonymityLevel
  inline def transparent: transparent = "transparent".asInstanceOf[transparent]
}
