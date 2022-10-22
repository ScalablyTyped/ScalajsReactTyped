package typingsJapgolly.socks.typingsCommonConstantsMod

import typingsJapgolly.socks.anon.Customauthmethod
import typingsJapgolly.socks.socksStrings.host
import typingsJapgolly.socks.socksStrings.ipaddress
import typingsJapgolly.socks.typingsCommonConstantsMod.^
import typingsJapgolly.socks.typingsCommonUtilMod.RequireOnlyOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_TIMEOUT: /* 30000 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_TIMEOUT").asInstanceOf[/* 30000 */ Double]

inline def SOCKS5_CUSTOM_AUTH_END: /* 254 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SOCKS5_CUSTOM_AUTH_END").asInstanceOf[/* 254 */ Double]

inline def SOCKS5_CUSTOM_AUTH_START: /* 128 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SOCKS5_CUSTOM_AUTH_START").asInstanceOf[/* 128 */ Double]

inline def SOCKS5_NO_ACCEPTABLE_AUTH: /* 255 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SOCKS5_NO_ACCEPTABLE_AUTH").asInstanceOf[/* 255 */ Double]

type SocksClientBoundEvent = SocksClientEstablishedEvent

/**
  * Represents a SocksProxy
  */
type SocksProxy = RequireOnlyOne[Customauthmethod, host | ipaddress]
