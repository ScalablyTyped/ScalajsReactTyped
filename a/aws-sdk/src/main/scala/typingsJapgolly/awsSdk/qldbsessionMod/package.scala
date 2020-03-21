package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qldbsessionMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.qldbsessionMod.ClientApiVersions
  type CommitDigest = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.qldbsessionMod.Blob | java.lang.String
  type IonBinary = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.qldbsessionMod.Blob | java.lang.String
  type IonText = java.lang.String
  type LedgerName = java.lang.String
  type PageToken = java.lang.String
  type SessionToken = java.lang.String
  type Statement = java.lang.String
  type StatementParameters = js.Array[typingsJapgolly.awsSdk.qldbsessionMod.ValueHolder]
  type TransactionId = java.lang.String
  type ValueHolders = js.Array[typingsJapgolly.awsSdk.qldbsessionMod.ValueHolder]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-07-11`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.qldbsessionMod._apiVersion | java.lang.String
}
