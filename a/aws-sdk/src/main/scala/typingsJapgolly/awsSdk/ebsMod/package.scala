package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ebsMod {
  type BlockData = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.ebsMod.Blob | java.lang.String | typingsJapgolly.node.streamMod.Readable
  type BlockIndex = scala.Double
  type BlockSize = scala.Double
  type BlockToken = java.lang.String
  type Blocks = js.Array[typingsJapgolly.awsSdk.ebsMod.Block]
  type ChangedBlocks = js.Array[typingsJapgolly.awsSdk.ebsMod.ChangedBlock]
  type Checksum = java.lang.String
  type ChecksumAlgorithm = typingsJapgolly.awsSdk.awsSdkStrings.SHA256 | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.ebsMod.ClientApiVersions
  type DataLength = scala.Double
  type MaxResults = scala.Double
  type PageToken = java.lang.String
  type SnapshotId = java.lang.String
  type TimeStamp = js.Date
  type VolumeSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-11-02`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.ebsMod._apiVersion | java.lang.String
}
