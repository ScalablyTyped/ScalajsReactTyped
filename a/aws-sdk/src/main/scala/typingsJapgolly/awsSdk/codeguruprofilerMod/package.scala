package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codeguruprofilerMod {
  type AgentProfile = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.codeguruprofilerMod.Blob | java.lang.String
  type AggregatedProfile = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.codeguruprofilerMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.P1D
    - typingsJapgolly.awsSdk.awsSdkStrings.PT1H
    - typingsJapgolly.awsSdk.awsSdkStrings.PT5M
    - java.lang.String
  */
  type AggregationPeriod = typingsJapgolly.awsSdk.codeguruprofilerMod._AggregationPeriod | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.codeguruprofilerMod.ClientApiVersions
  type ClientToken = java.lang.String
  type FleetInstanceId = java.lang.String
  type Integer = scala.Double
  type MaxDepth = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TimestampAscending
    - typingsJapgolly.awsSdk.awsSdkStrings.TimestampDescending
    - java.lang.String
  */
  type OrderBy = typingsJapgolly.awsSdk.codeguruprofilerMod._OrderBy | java.lang.String
  type PaginationToken = java.lang.String
  type Period = java.lang.String
  type ProfileTimes = js.Array[typingsJapgolly.awsSdk.codeguruprofilerMod.ProfileTime]
  type ProfilingGroupArn = java.lang.String
  type ProfilingGroupDescriptions = js.Array[typingsJapgolly.awsSdk.codeguruprofilerMod.ProfilingGroupDescription]
  type ProfilingGroupName = java.lang.String
  type ProfilingGroupNames = js.Array[typingsJapgolly.awsSdk.codeguruprofilerMod.ProfilingGroupName]
  type String = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-07-18`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.codeguruprofilerMod._apiVersion | java.lang.String
}
