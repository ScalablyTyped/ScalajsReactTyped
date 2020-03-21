package typingsJapgolly.otplib

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("otplib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object authenticator
    extends TopLevel[typingsJapgolly.otplib.Authenticator] {
    @js.native
    class Authenticator ()
      extends typingsJapgolly.otplib.Authenticator
    
    @js.native
    class HOTP ()
      extends typingsJapgolly.otplib.HOTP
    
    @js.native
    class TOTP ()
      extends typingsJapgolly.otplib.TOTP
    
  }
  
  @js.native
  object hotp
    extends TopLevel[typingsJapgolly.otplib.HOTP] {
    @js.native
    class HOTP ()
      extends typingsJapgolly.otplib.HOTP
    
  }
  
  @js.native
  object totp
    extends TopLevel[typingsJapgolly.otplib.TOTP] {
    @js.native
    class HOTP ()
      extends typingsJapgolly.otplib.HOTP
    
    @js.native
    class TOTP ()
      extends typingsJapgolly.otplib.TOTP
    
  }
  
}

