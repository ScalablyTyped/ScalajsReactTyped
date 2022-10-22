package typingsJapgolly.hapiJwt.mod

import typingsJapgolly.hapiHapi.mod.Plugin
import typingsJapgolly.hapiJwt.mod.^
import typingsJapgolly.hapiJwt.mod.hapiJwt.Crypto
import typingsJapgolly.hapiJwt.mod.hapiJwt.Token
import typingsJapgolly.hapiJwt.mod.hapiJwt.Utils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def crypto: Crypto = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto").asInstanceOf[Crypto]
inline def crypto_=(x: Crypto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crypto")(x.asInstanceOf[js.Any])

inline def plugin: Plugin[Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("plugin").asInstanceOf[Plugin[Unit]]
inline def plugin_=(x: Plugin[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugin")(x.asInstanceOf[js.Any])

inline def token: Token = ^.asInstanceOf[js.Dynamic].selectDynamic("token").asInstanceOf[Token]
inline def token_=(x: Token): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("token")(x.asInstanceOf[js.Any])

inline def utils: Utils = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[Utils]
inline def utils_=(x: Utils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
