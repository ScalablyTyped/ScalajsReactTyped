package typingsJapgolly.awsSdk.allMod

import typingsJapgolly.awsSdk.pollyMod.ClientConfiguration
import typingsJapgolly.awsSdk.pollyMod.^
import typingsJapgolly.awsSdk.presignerMod.Presigner.PresignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/all", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Polly () extends ^ {
  def this(options: ClientConfiguration) = this()
}

@JSImport("aws-sdk/clients/all", "Polly")
@js.native
object Polly extends js.Object {
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typingsJapgolly.awsSdk.pollyMod.Presigner {
    def this(options: PresignerOptions) = this()
  }
  
}

