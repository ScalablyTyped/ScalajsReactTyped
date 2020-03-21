package typingsJapgolly.awsSdk.mod

import typingsJapgolly.awsSdk.rdsMod.ClientConfiguration
import typingsJapgolly.awsSdk.rdsSignerMod.Signer.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "RDS")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class RDS ()
  extends typingsJapgolly.awsSdk.allMod.RDS {
  def this(options: ClientConfiguration) = this()
}

@JSImport("aws-sdk", "RDS")
@js.native
object RDS extends js.Object {
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  class Signer ()
    extends typingsJapgolly.awsSdk.allMod.RDS.Signer {
    def this(options: SignerOptions) = this()
  }
  
}

