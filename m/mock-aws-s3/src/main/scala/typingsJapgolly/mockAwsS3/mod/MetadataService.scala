package typingsJapgolly.mockAwsS3.mod

import typingsJapgolly.awsSdk.metadataServiceMod.MetadataServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "MetadataService")
@js.native
/**
  * Creates a new MetadataService object with a given set of options.
  */
class MetadataService ()
  extends typingsJapgolly.awsSdk.mod.MetadataService {
  def this(options: MetadataServiceOptions) = this()
}

/* static members */
@JSImport("mock-aws-s3", "MetadataService")
@js.native
object MetadataService extends js.Object {
  /**
    * 169.254.169.254
    */
  var host: String = js.native
}

