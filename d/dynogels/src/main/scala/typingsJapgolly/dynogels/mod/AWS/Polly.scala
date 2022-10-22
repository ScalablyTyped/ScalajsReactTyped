package typingsJapgolly.dynogels.mod.AWS

import typingsJapgolly.awsSdk.clientsPollyMod.ClientConfiguration
import typingsJapgolly.awsSdk.libPollyPresignerMod.Presigner.PresignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class Polly ()
  extends typingsJapgolly.awsSdk.mod.Polly {
  def this(options: ClientConfiguration) = this()
}
object Polly {
  
  @JSImport("dynogels", "AWS.Polly.Presigner")
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  open class Presigner ()
    extends typingsJapgolly.awsSdk.mod.Polly.Presigner {
    def this(options: PresignerOptions) = this()
  }
}
