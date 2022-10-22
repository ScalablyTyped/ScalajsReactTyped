package typingsJapgolly.zetapushJs

import typingsJapgolly.zetapushJs.mod.AbstractAuthData
import typingsJapgolly.zetapushJs.mod.AsyncMacroServicePublisher
import typingsJapgolly.zetapushJs.mod.ClientOptions
import typingsJapgolly.zetapushJs.mod.CredentialsAuthData
import typingsJapgolly.zetapushJs.mod.CredentialsHandshake
import typingsJapgolly.zetapushJs.mod.SmartClientOptions
import typingsJapgolly.zetapushJs.mod.TokenAuthData
import typingsJapgolly.zetapushJs.mod.TokenHandshake
import typingsJapgolly.zetapushJs.mod.WeakClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ZetaPush {
    
    @JSGlobal("ZetaPush.Authentication")
    @js.native
    open class Authentication ()
      extends typingsJapgolly.zetapushJs.mod.Authentication
    /* static members */
    object Authentication {
      
      @JSGlobal("ZetaPush.Authentication")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(authData: AbstractAuthData): CredentialsHandshake | TokenHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(authData.asInstanceOf[js.Any]).asInstanceOf[CredentialsHandshake | TokenHandshake]
      
      inline def delegating(authData: TokenAuthData): TokenHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("delegating")(authData.asInstanceOf[js.Any]).asInstanceOf[TokenHandshake]
      
      inline def simple(authData: CredentialsAuthData): CredentialsHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")(authData.asInstanceOf[js.Any]).asInstanceOf[CredentialsHandshake]
      
      inline def weak(authData: TokenAuthData): TokenHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("weak")(authData.asInstanceOf[js.Any]).asInstanceOf[TokenHandshake]
    }
    
    @JSGlobal("ZetaPush.Client")
    @js.native
    open class Client protected ()
      extends typingsJapgolly.zetapushJs.mod.Client {
      def this(options: ClientOptions) = this()
    }
    
    @JSGlobal("ZetaPush.SmartClient")
    @js.native
    open class SmartClient protected ()
      extends typingsJapgolly.zetapushJs.mod.SmartClient {
      def this(options: SmartClientOptions) = this()
    }
    
    @JSGlobal("ZetaPush.VERSION")
    @js.native
    val VERSION: String = js.native
    
    @JSGlobal("ZetaPush.WeakClient")
    @js.native
    open class WeakClient protected ()
      extends typingsJapgolly.zetapushJs.mod.WeakClient {
      def this(options: WeakClientOptions) = this()
    }
    
    object services {
      
      @JSGlobal("ZetaPush.services.Macro")
      @js.native
      open class Macro protected ()
        extends typingsJapgolly.zetapushJs.mod.services.Macro {
        def this($publish: AsyncMacroServicePublisher) = this()
      }
      object Macro {
        
        @JSGlobal("ZetaPush.services.Macro")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("ZetaPush.services.Macro.DEFAULT_DEPLOYMENT_ID")
        @js.native
        def DEFAULT_DEPLOYMENT_ID: String = js.native
        inline def DEFAULT_DEPLOYMENT_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_DEPLOYMENT_ID")(x.asInstanceOf[js.Any])
      }
    }
  }
}
