package typingsJapgolly.scAuth

import typingsJapgolly.jsonwebtoken.mod.Jwt
import typingsJapgolly.jsonwebtoken.mod.JwtPayload
import typingsJapgolly.jsonwebtoken.mod.Secret
import typingsJapgolly.jsonwebtoken.mod.SignCallback
import typingsJapgolly.jsonwebtoken.mod.SignOptions
import typingsJapgolly.jsonwebtoken.mod.VerifyCallback
import typingsJapgolly.jsonwebtoken.mod.VerifyOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-auth", "AuthEngine")
  @js.native
  open class AuthEngine ()
    extends StObject
       with SCAuthEngine
  
  @js.native
  trait SCAuthEngine extends StObject {
    
    def signToken(token: String, key: Secret): Unit = js.native
    def signToken(token: String, key: Secret, options: Unit, callback: SignCallback): Unit = js.native
    def signToken(token: String, key: Secret, options: SignOptions): Unit = js.native
    def signToken(token: String, key: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    def signToken(token: js.Object, key: Secret): Unit = js.native
    def signToken(token: js.Object, key: Secret, options: Unit, callback: SignCallback): Unit = js.native
    def signToken(token: js.Object, key: Secret, options: SignOptions): Unit = js.native
    def signToken(token: js.Object, key: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    def signToken(token: Buffer, key: Secret): Unit = js.native
    def signToken(token: Buffer, key: Secret, options: Unit, callback: SignCallback): Unit = js.native
    def signToken(token: Buffer, key: Secret, options: SignOptions): Unit = js.native
    def signToken(token: Buffer, key: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    
    def verifyToken(signedToken: String, key: String): Unit = js.native
    def verifyToken(
      signedToken: String,
      key: String,
      options: Unit,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    def verifyToken(signedToken: String, key: String, options: VerifyOptions): Unit = js.native
    def verifyToken(
      signedToken: String,
      key: String,
      options: VerifyOptions,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    def verifyToken(signedToken: String, key: Buffer): Unit = js.native
    def verifyToken(
      signedToken: String,
      key: Buffer,
      options: Unit,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    def verifyToken(signedToken: String, key: Buffer, options: VerifyOptions): Unit = js.native
    def verifyToken(
      signedToken: String,
      key: Buffer,
      options: VerifyOptions,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
  }
}
