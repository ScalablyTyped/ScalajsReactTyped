package typingsJapgolly.mockAwsS3.mod

import typingsJapgolly.awsSdk.pollyMod.ClientConfiguration
import typingsJapgolly.awsSdk.presignerMod.Presigner.PresignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Polly ()
  extends typingsJapgolly.awsSdk.mod.Polly {
  def this(options: ClientConfiguration) = this()
}

@JSImport("mock-aws-s3", "Polly")
@js.native
object Polly extends js.Object {
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typingsJapgolly.awsSdk.mod.Polly.Presigner {
    def this(options: PresignerOptions) = this()
  }
  
}

