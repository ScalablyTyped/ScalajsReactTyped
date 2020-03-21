package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object migrationhubconfigMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.migrationhubconfigMod.ClientApiVersions
  type ControlId = java.lang.String
  type DescribeHomeRegionControlsMaxResults = scala.Double
  type DryRun = scala.Boolean
  type HomeRegion = java.lang.String
  type HomeRegionControls = js.Array[typingsJapgolly.awsSdk.migrationhubconfigMod.HomeRegionControl]
  type RequestedTime = js.Date
  type TargetId = java.lang.String
  type TargetType = typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  type Token = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-06-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.migrationhubconfigMod._apiVersion | java.lang.String
}
