package typingsJapgolly.redisInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PersistenceInfo = typingsJapgolly.redisInfo.mod.BasePersistenceInfo with (typingsJapgolly.redisInfo.mod.PersistenceAOFOnInfo | typingsJapgolly.redisInfo.mod.PersistenceAOFOffInfo) with (typingsJapgolly.redisInfo.mod.PersistenceLoadingOnInfo | typingsJapgolly.redisInfo.mod.PersistenceLoadingOffInfo)
  type RedisInfo = typingsJapgolly.redisInfo.mod.GeneralStats with typingsJapgolly.redisInfo.mod.ServerInfo with typingsJapgolly.redisInfo.mod.ClientsInfo with typingsJapgolly.redisInfo.mod.MemoryInfo with typingsJapgolly.redisInfo.mod.PersistenceInfo with typingsJapgolly.redisInfo.mod.Stats with typingsJapgolly.redisInfo.mod.ReplicationInfo with typingsJapgolly.redisInfo.mod.CPUInfo
  type ReplicationInfo = typingsJapgolly.redisInfo.mod.BaseReplicationInfo with (typingsJapgolly.redisInfo.mod.ReplicationMasterInfo | typingsJapgolly.redisInfo.mod.ReplicationReplicaInfo)
  type ReplicationReplicaInfo = typingsJapgolly.redisInfo.mod.BaseReplicationReplicaInfo with (typingsJapgolly.redisInfo.mod.ReplicationReplicaSyncOnInfo | typingsJapgolly.redisInfo.mod.ReplicationReplicaSyncOffInfo) with (typingsJapgolly.redisInfo.mod.ReplicationReplicaLinkUpInfo | typingsJapgolly.redisInfo.mod.ReplicationReplicaLinkDownInfo)
}
