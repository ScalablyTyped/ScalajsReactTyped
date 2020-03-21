package typingsJapgolly.awsSdk.codeguruprofilerMod

import typingsJapgolly.awsSdk.configMod.ConfigBase
import typingsJapgolly.awsSdk.errorMod.AWSError
import typingsJapgolly.awsSdk.requestMod.Request
import typingsJapgolly.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGuruProfiler extends Service {
  @JSName("config")
  var config_CodeGuruProfiler: ConfigBase with ClientConfiguration = js.native
  /**
    * Provides the configuration to use for an agent of the profiling group.
    */
  def configureAgent(): Request[ConfigureAgentResponse, AWSError] = js.native
  def configureAgent(callback: js.Function2[/* err */ AWSError, /* data */ ConfigureAgentResponse, Unit]): Request[ConfigureAgentResponse, AWSError] = js.native
  /**
    * Provides the configuration to use for an agent of the profiling group.
    */
  def configureAgent(params: ConfigureAgentRequest): Request[ConfigureAgentResponse, AWSError] = js.native
  def configureAgent(
    params: ConfigureAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigureAgentResponse, Unit]
  ): Request[ConfigureAgentResponse, AWSError] = js.native
  /**
    * Create a profiling group.
    */
  def createProfilingGroup(): Request[CreateProfilingGroupResponse, AWSError] = js.native
  def createProfilingGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateProfilingGroupResponse, Unit]): Request[CreateProfilingGroupResponse, AWSError] = js.native
  /**
    * Create a profiling group.
    */
  def createProfilingGroup(params: CreateProfilingGroupRequest): Request[CreateProfilingGroupResponse, AWSError] = js.native
  def createProfilingGroup(
    params: CreateProfilingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProfilingGroupResponse, Unit]
  ): Request[CreateProfilingGroupResponse, AWSError] = js.native
  /**
    * Delete a profiling group.
    */
  def deleteProfilingGroup(): Request[DeleteProfilingGroupResponse, AWSError] = js.native
  def deleteProfilingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfilingGroupResponse, Unit]): Request[DeleteProfilingGroupResponse, AWSError] = js.native
  /**
    * Delete a profiling group.
    */
  def deleteProfilingGroup(params: DeleteProfilingGroupRequest): Request[DeleteProfilingGroupResponse, AWSError] = js.native
  def deleteProfilingGroup(
    params: DeleteProfilingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfilingGroupResponse, Unit]
  ): Request[DeleteProfilingGroupResponse, AWSError] = js.native
  /**
    * Describe a profiling group.
    */
  def describeProfilingGroup(): Request[DescribeProfilingGroupResponse, AWSError] = js.native
  def describeProfilingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProfilingGroupResponse, Unit]): Request[DescribeProfilingGroupResponse, AWSError] = js.native
  /**
    * Describe a profiling group.
    */
  def describeProfilingGroup(params: DescribeProfilingGroupRequest): Request[DescribeProfilingGroupResponse, AWSError] = js.native
  def describeProfilingGroup(
    params: DescribeProfilingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProfilingGroupResponse, Unit]
  ): Request[DescribeProfilingGroupResponse, AWSError] = js.native
  /**
    * Get the aggregated profile of a profiling group for the specified time range. If the requested time range does not align with the available aggregated profiles, it will be expanded to attain alignment. If aggregated profiles are available only for part of the period requested, the profile is returned from the earliest available to the latest within the requested time range. For instance, if the requested time range is from 00:00 to 00:20 and the available profiles are from 00:15 to 00:25, then the returned profile will be from 00:15 to 00:20.
    */
  def getProfile(): Request[GetProfileResponse, AWSError] = js.native
  def getProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetProfileResponse, Unit]): Request[GetProfileResponse, AWSError] = js.native
  /**
    * Get the aggregated profile of a profiling group for the specified time range. If the requested time range does not align with the available aggregated profiles, it will be expanded to attain alignment. If aggregated profiles are available only for part of the period requested, the profile is returned from the earliest available to the latest within the requested time range. For instance, if the requested time range is from 00:00 to 00:20 and the available profiles are from 00:15 to 00:25, then the returned profile will be from 00:15 to 00:20.
    */
  def getProfile(params: GetProfileRequest): Request[GetProfileResponse, AWSError] = js.native
  def getProfile(
    params: GetProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProfileResponse, Unit]
  ): Request[GetProfileResponse, AWSError] = js.native
  /**
    * List the start times of the available aggregated profiles of a profiling group for an aggregation period within the specified time range.
    */
  def listProfileTimes(): Request[ListProfileTimesResponse, AWSError] = js.native
  def listProfileTimes(callback: js.Function2[/* err */ AWSError, /* data */ ListProfileTimesResponse, Unit]): Request[ListProfileTimesResponse, AWSError] = js.native
  /**
    * List the start times of the available aggregated profiles of a profiling group for an aggregation period within the specified time range.
    */
  def listProfileTimes(params: ListProfileTimesRequest): Request[ListProfileTimesResponse, AWSError] = js.native
  def listProfileTimes(
    params: ListProfileTimesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfileTimesResponse, Unit]
  ): Request[ListProfileTimesResponse, AWSError] = js.native
  /**
    * List profiling groups in the account.
    */
  def listProfilingGroups(): Request[ListProfilingGroupsResponse, AWSError] = js.native
  def listProfilingGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListProfilingGroupsResponse, Unit]): Request[ListProfilingGroupsResponse, AWSError] = js.native
  /**
    * List profiling groups in the account.
    */
  def listProfilingGroups(params: ListProfilingGroupsRequest): Request[ListProfilingGroupsResponse, AWSError] = js.native
  def listProfilingGroups(
    params: ListProfilingGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfilingGroupsResponse, Unit]
  ): Request[ListProfilingGroupsResponse, AWSError] = js.native
  /**
    * Submit profile collected by an agent belonging to a profiling group for aggregation.
    */
  def postAgentProfile(): Request[PostAgentProfileResponse, AWSError] = js.native
  def postAgentProfile(callback: js.Function2[/* err */ AWSError, /* data */ PostAgentProfileResponse, Unit]): Request[PostAgentProfileResponse, AWSError] = js.native
  /**
    * Submit profile collected by an agent belonging to a profiling group for aggregation.
    */
  def postAgentProfile(params: PostAgentProfileRequest): Request[PostAgentProfileResponse, AWSError] = js.native
  def postAgentProfile(
    params: PostAgentProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PostAgentProfileResponse, Unit]
  ): Request[PostAgentProfileResponse, AWSError] = js.native
  /**
    * Update a profiling group.
    */
  def updateProfilingGroup(): Request[UpdateProfilingGroupResponse, AWSError] = js.native
  def updateProfilingGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfilingGroupResponse, Unit]): Request[UpdateProfilingGroupResponse, AWSError] = js.native
  /**
    * Update a profiling group.
    */
  def updateProfilingGroup(params: UpdateProfilingGroupRequest): Request[UpdateProfilingGroupResponse, AWSError] = js.native
  def updateProfilingGroup(
    params: UpdateProfilingGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfilingGroupResponse, Unit]
  ): Request[UpdateProfilingGroupResponse, AWSError] = js.native
}

