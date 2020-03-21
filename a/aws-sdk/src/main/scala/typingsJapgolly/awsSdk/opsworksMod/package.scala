package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object opsworksMod {
  type AgentVersions = js.Array[typingsJapgolly.awsSdk.opsworksMod.AgentVersion]
  type AppAttributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.opsworksMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DocumentRoot
    - typingsJapgolly.awsSdk.awsSdkStrings.RailsEnv
    - typingsJapgolly.awsSdk.awsSdkStrings.AutoBundleOnDeploy
    - typingsJapgolly.awsSdk.awsSdkStrings.AwsFlowRubySettings
    - java.lang.String
  */
  type AppAttributesKeys = typingsJapgolly.awsSdk.opsworksMod._AppAttributesKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`aws-flow-ruby`
    - typingsJapgolly.awsSdk.awsSdkStrings.java_
    - typingsJapgolly.awsSdk.awsSdkStrings.rails
    - typingsJapgolly.awsSdk.awsSdkStrings.php_
    - typingsJapgolly.awsSdk.awsSdkStrings.nodejs
    - typingsJapgolly.awsSdk.awsSdkStrings.static__
    - typingsJapgolly.awsSdk.awsSdkStrings.other_
    - java.lang.String
  */
  type AppType = typingsJapgolly.awsSdk.opsworksMod._AppType | java.lang.String
  type Apps = js.Array[typingsJapgolly.awsSdk.opsworksMod.App]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.x86_64_
    - typingsJapgolly.awsSdk.awsSdkStrings.i386
    - java.lang.String
  */
  type Architecture = typingsJapgolly.awsSdk.opsworksMod._Architecture | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.load
    - typingsJapgolly.awsSdk.awsSdkStrings.timer
    - java.lang.String
  */
  type AutoScalingType = typingsJapgolly.awsSdk.opsworksMod._AutoScalingType | java.lang.String
  type BlockDeviceMappings = js.Array[typingsJapgolly.awsSdk.opsworksMod.BlockDeviceMapping]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.opsworksMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ascii
    - typingsJapgolly.awsSdk.awsSdkStrings.big5
    - typingsJapgolly.awsSdk.awsSdkStrings.big5hkscs
    - typingsJapgolly.awsSdk.awsSdkStrings.cp037
    - typingsJapgolly.awsSdk.awsSdkStrings.cp424
    - typingsJapgolly.awsSdk.awsSdkStrings.cp437
    - typingsJapgolly.awsSdk.awsSdkStrings.cp500
    - typingsJapgolly.awsSdk.awsSdkStrings.cp720
    - typingsJapgolly.awsSdk.awsSdkStrings.cp737
    - typingsJapgolly.awsSdk.awsSdkStrings.cp775
    - typingsJapgolly.awsSdk.awsSdkStrings.cp850
    - typingsJapgolly.awsSdk.awsSdkStrings.cp852
    - typingsJapgolly.awsSdk.awsSdkStrings.cp855
    - typingsJapgolly.awsSdk.awsSdkStrings.cp856
    - typingsJapgolly.awsSdk.awsSdkStrings.cp857
    - typingsJapgolly.awsSdk.awsSdkStrings.cp858
    - typingsJapgolly.awsSdk.awsSdkStrings.cp860
    - typingsJapgolly.awsSdk.awsSdkStrings.cp861
    - typingsJapgolly.awsSdk.awsSdkStrings.cp862
    - typingsJapgolly.awsSdk.awsSdkStrings.cp863
    - typingsJapgolly.awsSdk.awsSdkStrings.cp864
    - typingsJapgolly.awsSdk.awsSdkStrings.cp865
    - typingsJapgolly.awsSdk.awsSdkStrings.cp866
    - typingsJapgolly.awsSdk.awsSdkStrings.cp869
    - typingsJapgolly.awsSdk.awsSdkStrings.cp874
    - typingsJapgolly.awsSdk.awsSdkStrings.cp875
    - typingsJapgolly.awsSdk.awsSdkStrings.cp932
    - typingsJapgolly.awsSdk.awsSdkStrings.cp949
    - typingsJapgolly.awsSdk.awsSdkStrings.cp950
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1006
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1026
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1140
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1250
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1251
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1252
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1253
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1254
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1255
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1256
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1257
    - typingsJapgolly.awsSdk.awsSdkStrings.cp1258
    - typingsJapgolly.awsSdk.awsSdkStrings.euc_jp
    - typingsJapgolly.awsSdk.awsSdkStrings.euc_jis_2004
    - typingsJapgolly.awsSdk.awsSdkStrings.euc_jisx0213
    - typingsJapgolly.awsSdk.awsSdkStrings.euc_kr
    - typingsJapgolly.awsSdk.awsSdkStrings.gb2312
    - typingsJapgolly.awsSdk.awsSdkStrings.gbk
    - typingsJapgolly.awsSdk.awsSdkStrings.gb18030
    - typingsJapgolly.awsSdk.awsSdkStrings.hz
    - typingsJapgolly.awsSdk.awsSdkStrings.iso2022_jp
    - typingsJapgolly.awsSdk.awsSdkStrings.iso2022_jp_1
    - typingsJapgolly.awsSdk.awsSdkStrings.iso2022_jp_2
    - typingsJapgolly.awsSdk.awsSdkStrings.iso2022_jp_2004
    - typingsJapgolly.awsSdk.awsSdkStrings.iso2022_jp_3
    - typingsJapgolly.awsSdk.awsSdkStrings.iso2022_jp_ext
    - typingsJapgolly.awsSdk.awsSdkStrings.iso2022_kr
    - typingsJapgolly.awsSdk.awsSdkStrings.latin_1
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_2
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_3
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_4
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_5
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_6
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_7
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_8
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_9
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_10
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_13
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_14
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_15
    - typingsJapgolly.awsSdk.awsSdkStrings.iso8859_16
    - typingsJapgolly.awsSdk.awsSdkStrings.johab
    - typingsJapgolly.awsSdk.awsSdkStrings.koi8_r
    - typingsJapgolly.awsSdk.awsSdkStrings.koi8_u
    - typingsJapgolly.awsSdk.awsSdkStrings.mac_cyrillic
    - typingsJapgolly.awsSdk.awsSdkStrings.mac_greek
    - typingsJapgolly.awsSdk.awsSdkStrings.mac_iceland
    - typingsJapgolly.awsSdk.awsSdkStrings.mac_latin2
    - typingsJapgolly.awsSdk.awsSdkStrings.mac_roman
    - typingsJapgolly.awsSdk.awsSdkStrings.mac_turkish
    - typingsJapgolly.awsSdk.awsSdkStrings.ptcp154
    - typingsJapgolly.awsSdk.awsSdkStrings.shift_jis
    - typingsJapgolly.awsSdk.awsSdkStrings.shift_jis_2004
    - typingsJapgolly.awsSdk.awsSdkStrings.shift_jisx0213
    - typingsJapgolly.awsSdk.awsSdkStrings.utf_32
    - typingsJapgolly.awsSdk.awsSdkStrings.utf_32_be
    - typingsJapgolly.awsSdk.awsSdkStrings.utf_32_le
    - typingsJapgolly.awsSdk.awsSdkStrings.utf_16
    - typingsJapgolly.awsSdk.awsSdkStrings.utf_16_be
    - typingsJapgolly.awsSdk.awsSdkStrings.utf_16_le
    - typingsJapgolly.awsSdk.awsSdkStrings.utf_7
    - typingsJapgolly.awsSdk.awsSdkStrings.utf_8
    - typingsJapgolly.awsSdk.awsSdkStrings.utf_8_sig
    - java.lang.String
  */
  type CloudWatchLogsEncoding = typingsJapgolly.awsSdk.opsworksMod._CloudWatchLogsEncoding | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.start_of_file
    - typingsJapgolly.awsSdk.awsSdkStrings.end_of_file
    - java.lang.String
  */
  type CloudWatchLogsInitialPosition = typingsJapgolly.awsSdk.opsworksMod._CloudWatchLogsInitialPosition | java.lang.String
  type CloudWatchLogsLogStreams = js.Array[typingsJapgolly.awsSdk.opsworksMod.CloudWatchLogsLogStream]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL
    - typingsJapgolly.awsSdk.awsSdkStrings.UTC
    - java.lang.String
  */
  type CloudWatchLogsTimeZone = typingsJapgolly.awsSdk.opsworksMod._CloudWatchLogsTimeZone | java.lang.String
  type Commands = js.Array[typingsJapgolly.awsSdk.opsworksMod.Command]
  type DailyAutoScalingSchedule = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.opsworksMod.Switch]
  type DataSources = js.Array[typingsJapgolly.awsSdk.opsworksMod.DataSource]
  type DateTime = java.lang.String
  type DeploymentCommandArgs = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.opsworksMod.Strings]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.install_dependencies
    - typingsJapgolly.awsSdk.awsSdkStrings.update_dependencies
    - typingsJapgolly.awsSdk.awsSdkStrings.update_custom_cookbooks
    - typingsJapgolly.awsSdk.awsSdkStrings.execute_recipes
    - typingsJapgolly.awsSdk.awsSdkStrings.configure
    - typingsJapgolly.awsSdk.awsSdkStrings.setup_
    - typingsJapgolly.awsSdk.awsSdkStrings.deploy_
    - typingsJapgolly.awsSdk.awsSdkStrings.rollback_
    - typingsJapgolly.awsSdk.awsSdkStrings.start_
    - typingsJapgolly.awsSdk.awsSdkStrings.stop
    - typingsJapgolly.awsSdk.awsSdkStrings.restart
    - typingsJapgolly.awsSdk.awsSdkStrings.undeploy
    - java.lang.String
  */
  type DeploymentCommandName = typingsJapgolly.awsSdk.opsworksMod._DeploymentCommandName | java.lang.String
  type Deployments = js.Array[typingsJapgolly.awsSdk.opsworksMod.Deployment]
  type Double = scala.Double
  type EcsClusters = js.Array[typingsJapgolly.awsSdk.opsworksMod.EcsCluster]
  type ElasticIps = js.Array[typingsJapgolly.awsSdk.opsworksMod.ElasticIp]
  type ElasticLoadBalancers = js.Array[typingsJapgolly.awsSdk.opsworksMod.ElasticLoadBalancer]
  type EnvironmentVariables = js.Array[typingsJapgolly.awsSdk.opsworksMod.EnvironmentVariable]
  type Hour = java.lang.String
  type Instances = js.Array[typingsJapgolly.awsSdk.opsworksMod.Instance]
  type Integer = scala.Double
  type LayerAttributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.opsworksMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EcsClusterArn
    - typingsJapgolly.awsSdk.awsSdkStrings.EnableHaproxyStats
    - typingsJapgolly.awsSdk.awsSdkStrings.HaproxyStatsUrl
    - typingsJapgolly.awsSdk.awsSdkStrings.HaproxyStatsUser
    - typingsJapgolly.awsSdk.awsSdkStrings.HaproxyStatsPassword
    - typingsJapgolly.awsSdk.awsSdkStrings.HaproxyHealthCheckUrl
    - typingsJapgolly.awsSdk.awsSdkStrings.HaproxyHealthCheckMethod
    - typingsJapgolly.awsSdk.awsSdkStrings.MysqlRootPassword
    - typingsJapgolly.awsSdk.awsSdkStrings.MysqlRootPasswordUbiquitous
    - typingsJapgolly.awsSdk.awsSdkStrings.GangliaUrl
    - typingsJapgolly.awsSdk.awsSdkStrings.GangliaUser
    - typingsJapgolly.awsSdk.awsSdkStrings.GangliaPassword
    - typingsJapgolly.awsSdk.awsSdkStrings.MemcachedMemory
    - typingsJapgolly.awsSdk.awsSdkStrings.NodejsVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.RubyVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.RubygemsVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.ManageBundler
    - typingsJapgolly.awsSdk.awsSdkStrings.BundlerVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.RailsStack
    - typingsJapgolly.awsSdk.awsSdkStrings.PassengerVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.Jvm
    - typingsJapgolly.awsSdk.awsSdkStrings.JvmVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.JvmOptions
    - typingsJapgolly.awsSdk.awsSdkStrings.JavaAppServer
    - typingsJapgolly.awsSdk.awsSdkStrings.JavaAppServerVersion
    - java.lang.String
  */
  type LayerAttributesKeys = typingsJapgolly.awsSdk.opsworksMod._LayerAttributesKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`aws-flow-ruby`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ecs-cluster`
    - typingsJapgolly.awsSdk.awsSdkStrings.`java-app`
    - typingsJapgolly.awsSdk.awsSdkStrings.lb_
    - typingsJapgolly.awsSdk.awsSdkStrings.web_
    - typingsJapgolly.awsSdk.awsSdkStrings.`php-app`
    - typingsJapgolly.awsSdk.awsSdkStrings.`rails-app`
    - typingsJapgolly.awsSdk.awsSdkStrings.`nodejs-app`
    - typingsJapgolly.awsSdk.awsSdkStrings.memcached
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-master`
    - typingsJapgolly.awsSdk.awsSdkStrings.`monitoring-master`
    - typingsJapgolly.awsSdk.awsSdkStrings.custom__
    - java.lang.String
  */
  type LayerType = typingsJapgolly.awsSdk.opsworksMod._LayerType | java.lang.String
  type Layers = js.Array[typingsJapgolly.awsSdk.opsworksMod.Layer]
  type LoadBasedAutoScalingConfigurations = js.Array[typingsJapgolly.awsSdk.opsworksMod.LoadBasedAutoScalingConfiguration]
  type MaxResults = scala.Double
  type Minute = scala.Double
  type NextToken = java.lang.String
  type OperatingSystemConfigurationManagers = js.Array[typingsJapgolly.awsSdk.opsworksMod.OperatingSystemConfigurationManager]
  type OperatingSystems = js.Array[typingsJapgolly.awsSdk.opsworksMod.OperatingSystem]
  type Parameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.opsworksMod.String]
  type Permissions = js.Array[typingsJapgolly.awsSdk.opsworksMod.Permission]
  type RaidArrays = js.Array[typingsJapgolly.awsSdk.opsworksMod.RaidArray]
  type RdsDbInstances = js.Array[typingsJapgolly.awsSdk.opsworksMod.RdsDbInstance]
  type ResourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ebs_
    - typingsJapgolly.awsSdk.awsSdkStrings.`instance-store`
    - java.lang.String
  */
  type RootDeviceType = typingsJapgolly.awsSdk.opsworksMod._RootDeviceType | java.lang.String
  type ServiceErrors = js.Array[typingsJapgolly.awsSdk.opsworksMod.ServiceError]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.git_
    - typingsJapgolly.awsSdk.awsSdkStrings.svn
    - typingsJapgolly.awsSdk.awsSdkStrings.archive_
    - typingsJapgolly.awsSdk.awsSdkStrings.s3_
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.opsworksMod._SourceType | java.lang.String
  type StackAttributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.opsworksMod.String]
  type StackAttributesKeys = typingsJapgolly.awsSdk.awsSdkStrings.Color_ | java.lang.String
  type Stacks = js.Array[typingsJapgolly.awsSdk.opsworksMod.Stack]
  type String = java.lang.String
  type Strings = js.Array[typingsJapgolly.awsSdk.opsworksMod.String]
  type Switch = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.opsworksMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.opsworksMod.TagValue]
  type TimeBasedAutoScalingConfigurations = js.Array[typingsJapgolly.awsSdk.opsworksMod.TimeBasedAutoScalingConfiguration]
  type UserProfiles = js.Array[typingsJapgolly.awsSdk.opsworksMod.UserProfile]
  type ValidForInMinutes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.paravirtual
    - typingsJapgolly.awsSdk.awsSdkStrings.hvm
    - java.lang.String
  */
  type VirtualizationType = typingsJapgolly.awsSdk.opsworksMod._VirtualizationType | java.lang.String
  type VolumeConfigurations = js.Array[typingsJapgolly.awsSdk.opsworksMod.VolumeConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.gp2
    - typingsJapgolly.awsSdk.awsSdkStrings.io1
    - typingsJapgolly.awsSdk.awsSdkStrings.standard__
    - java.lang.String
  */
  type VolumeType = typingsJapgolly.awsSdk.opsworksMod._VolumeType | java.lang.String
  type Volumes = js.Array[typingsJapgolly.awsSdk.opsworksMod.Volume]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-02-18`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.opsworksMod._apiVersion | java.lang.String
}
