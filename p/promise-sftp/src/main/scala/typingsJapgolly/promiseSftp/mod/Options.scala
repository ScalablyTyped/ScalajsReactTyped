package typingsJapgolly.promiseSftp.mod

import typingsJapgolly.promiseSftp.anon.Echo
import typingsJapgolly.ssh2.mod.ConnectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for SftpPromise#connect()
  */
trait Options
  extends StObject
     with ConnectConfig {
  
  /**
    * Whether to attempt to automatically reconnect using the existing
    * config if the connection is unexpectedly closed. Auto-reconnection is
    * lazy, and so will wait until a command needs to be issued before
    * attempting to reconnect.
    */
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When using password-based user authentication, set this option to
    * handle password change requests. If this option isn't set, and the
    * server requests a password change, I haven't tested what will happen.
    */
  var changePassword: js.UndefOr[
    js.Function2[/* message */ String, /* language */ String, typingsJapgolly.bluebird.mod.^[String]]
  ] = js.undefined
  
  /** Alias for `readyTimeout` */
  var connTimeout: js.UndefOr[Double] = js.undefined
  
  /** Alias for `keepaliveInterval` */
  var keepalive: js.UndefOr[Double] = js.undefined
  
  /** Alias for `readyTimeout` */
  var pasvTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Path and name of a file containing a private key as would be passed
    * to the privateKey option. If privateKey is also set, priority is
    * given to the privateKey option.
    */
  var privateKeyFile: js.UndefOr[String] = js.undefined
  
  /**
    * Set this option to a function to try keyboard-interactive user
    * authentication if primary user authentication method fails.
    *
    * NOTE: This function may be called more than once, with the same or different prompts.
    * @param name - is generally what you'd use as a header or GUI window
    * title to describe the purpose of the `prompts`
    */
  @JSName("tryKeyboard")
  var tryKeyboard_Options: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* instructions */ String, 
      /* instructionsLang */ String, 
      /* prompts */ js.Array[Echo], 
      (js.Array[String | typingsJapgolly.bluebird.mod.^[String]]) | typingsJapgolly.bluebird.mod.^[js.Array[String]]
    ]
  ] = js.undefined
  
  /** Alias for `username` */
  var user: js.UndefOr[String] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
    
    inline def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
    
    inline def setChangePassword(value: (/* message */ String, /* language */ String) => typingsJapgolly.bluebird.mod.^[String]): Self = StObject.set(x, "changePassword", js.Any.fromFunction2(value))
    
    inline def setChangePasswordUndefined: Self = StObject.set(x, "changePassword", js.undefined)
    
    inline def setConnTimeout(value: Double): Self = StObject.set(x, "connTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnTimeoutUndefined: Self = StObject.set(x, "connTimeout", js.undefined)
    
    inline def setKeepalive(value: Double): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    inline def setPasvTimeout(value: Double): Self = StObject.set(x, "pasvTimeout", value.asInstanceOf[js.Any])
    
    inline def setPasvTimeoutUndefined: Self = StObject.set(x, "pasvTimeout", js.undefined)
    
    inline def setPrivateKeyFile(value: String): Self = StObject.set(x, "privateKeyFile", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyFileUndefined: Self = StObject.set(x, "privateKeyFile", js.undefined)
    
    inline def setTryKeyboard(
      value: (/* name */ String, /* instructions */ String, /* instructionsLang */ String, /* prompts */ js.Array[Echo]) => (js.Array[String | typingsJapgolly.bluebird.mod.^[String]]) | typingsJapgolly.bluebird.mod.^[js.Array[String]]
    ): Self = StObject.set(x, "tryKeyboard", js.Any.fromFunction4(value))
    
    inline def setTryKeyboardUndefined: Self = StObject.set(x, "tryKeyboard", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
