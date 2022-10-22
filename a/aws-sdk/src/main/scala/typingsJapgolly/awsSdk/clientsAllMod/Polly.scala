package typingsJapgolly.awsSdk.clientsAllMod

import typingsJapgolly.awsSdk.clientsPollyMod.ClientConfiguration
import typingsJapgolly.awsSdk.clientsPollyMod.^
import typingsJapgolly.awsSdk.libPollyPresignerMod.Presigner.PresignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/all", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class Polly () extends ^ {
  def this(options: ClientConfiguration) = this()
}
object Polly {
  
  @JSImport("aws-sdk/clients/all", "Polly.Presigner")
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  open class Presigner ()
    extends typingsJapgolly.awsSdk.clientsPollyMod.Presigner {
    def this(options: PresignerOptions) = this()
  }
}
