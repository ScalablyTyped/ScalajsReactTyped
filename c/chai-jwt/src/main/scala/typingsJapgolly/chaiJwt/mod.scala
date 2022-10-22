package typingsJapgolly.chaiJwt

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.chai.Chai.Property
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-jwt", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        /**
          * Alias of `.property` for JWTs.
          * Asserts that the provided token has a given claim.
          * If value is provided it will also assert the claim value using strict equality.
          */
        def claim(name: String): typingsJapgolly.chai.Chai.Assertion = js.native
        /**
          * Alias of `.property` for JWTs.
          * Asserts that the provided token has a given claim.
          * If value is provided it will also assert the claim value using strict equality.
          */
        def claim(name: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
        /**
          * Alias of `.property` for JWTs.
          * Asserts that the provided token has a given claim.
          * If value is provided it will also assert the claim value using strict equality.
          */
        def claim(name: String, value: Any): typingsJapgolly.chai.Chai.Assertion = js.native
        /**
          * Alias of `.property` for JWTs.
          * Asserts that the provided token has a given claim.
          * If value is provided it will also assert the claim value using strict equality.
          */
        def claim(name: String, value: Any, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
        /**
          * Alias of `.property` for JWTs.
          * Asserts that the provided token has a given claim.
          * If value is provided it will also assert the claim value using strict equality.
          */
        def claim(name: js.Symbol): typingsJapgolly.chai.Chai.Assertion = js.native
        /**
          * Alias of `.property` for JWTs.
          * Asserts that the provided token has a given claim.
          * If value is provided it will also assert the claim value using strict equality.
          */
        def claim(name: js.Symbol, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
        /**
          * Alias of `.property` for JWTs.
          * Asserts that the provided token has a given claim.
          * If value is provided it will also assert the claim value using strict equality.
          */
        def claim(name: js.Symbol, value: Any): typingsJapgolly.chai.Chai.Assertion = js.native
        /**
          * Alias of `.property` for JWTs.
          * Asserts that the provided token has a given claim.
          * If value is provided it will also assert the claim value using strict equality.
          */
        def claim(name: js.Symbol, value: Any, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
        /**
          * Alias of `.property` for JWTs.
          * Asserts that the provided token has a given claim.
          * If value is provided it will also assert the claim value using strict equality.
          */
        @JSName("claim")
        var claim_Original: Property = js.native
        
        /**
          * Asserts that the provided string has a valid format that can be parsed as JWT.
          * _Does not check signature or the provided fields._
          * If succeed, it changes the context to the decoded token.
          */
        var jwt: Assertion = js.native
        
        /**
          * Asserts that the provided token is signed with the provided secret.
          * @param secret - A string or buffer containing either the secret for HMAC algorithms, or the PEM encoded public key for RSA and ECDSA
          */
        def signedWith(secret: String): Assertion = js.native
        def signedWith(secret: Buffer): Assertion = js.native
      }
    }
  }
}
