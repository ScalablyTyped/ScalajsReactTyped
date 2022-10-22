package typingsJapgolly.awsSdk.clientsBackupstorageMod

import typingsJapgolly.awsSdk.awsSdkStrings.SHA256
import typingsJapgolly.awsSdk.awsSdkStrings.SUMMARY
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ChunkList = js.Array[Chunk]

type DataChecksumAlgorithm = SHA256 | String

type MaxResults = Double

type MetadataString = String

type ObjectList = js.Array[BackupObject]

type OptionalLong = Double

type PayloadBlob = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type SummaryChecksumAlgorithm = SUMMARY | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-04-10`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type long = Double

type timestamp = js.Date
