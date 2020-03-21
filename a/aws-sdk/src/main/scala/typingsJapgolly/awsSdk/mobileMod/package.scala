package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mobileMod {
  type AttributeKey = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.mobileMod.AttributeValue]
  type Boolean = scala.Boolean
  type BundleDescription = java.lang.String
  type BundleId = java.lang.String
  type BundleList = js.Array[typingsJapgolly.awsSdk.mobileMod.BundleDetails]
  type BundleTitle = java.lang.String
  type BundleVersion = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.mobileMod.ClientApiVersions
  type ConsoleUrl = java.lang.String
  type Contents = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.mobileMod.Blob | java.lang.String
  type Date = js.Date
  type DownloadUrl = java.lang.String
  type Feature = java.lang.String
  type IconUrl = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OSX
    - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
    - typingsJapgolly.awsSdk.awsSdkStrings.LINUX
    - typingsJapgolly.awsSdk.awsSdkStrings.OBJC
    - typingsJapgolly.awsSdk.awsSdkStrings.SWIFT
    - typingsJapgolly.awsSdk.awsSdkStrings.ANDROID
    - typingsJapgolly.awsSdk.awsSdkStrings.JAVASCRIPT
    - java.lang.String
  */
  type Platform = typingsJapgolly.awsSdk.mobileMod._Platform | java.lang.String
  type Platforms = js.Array[typingsJapgolly.awsSdk.mobileMod.Platform]
  type ProjectId = java.lang.String
  type ProjectName = java.lang.String
  type ProjectRegion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NORMAL
    - typingsJapgolly.awsSdk.awsSdkStrings.SYNCING
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORTING
    - java.lang.String
  */
  type ProjectState = typingsJapgolly.awsSdk.mobileMod._ProjectState | java.lang.String
  type ProjectSummaries = js.Array[typingsJapgolly.awsSdk.mobileMod.ProjectSummary]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  type ResourceType = java.lang.String
  type Resources = js.Array[typingsJapgolly.awsSdk.mobileMod.Resource]
  type ShareUrl = java.lang.String
  type SnapshotId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.mobileMod._apiVersion | java.lang.String
}
