package typingsJapgolly.awsSdk.servicesGlacierMod

import typingsJapgolly.awsSdk.serviceMod.Service
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/glacier", "GlacierCustomizations")
@js.native
class GlacierCustomizations () extends Service {
  def computeChecksums(data: String): GlacierComputeChecksumsOutput = js.native
  /**
    * Computes the SHA-256 linear and tree hash checksums for a given
    * block of Buffer data. Pass the tree hash of the computed checksums
    * as the checksum input to the {completeMultipartUpload} when performing
    * a multi-part upload.
    */
  def computeChecksums(data: Buffer): GlacierComputeChecksumsOutput = js.native
}

