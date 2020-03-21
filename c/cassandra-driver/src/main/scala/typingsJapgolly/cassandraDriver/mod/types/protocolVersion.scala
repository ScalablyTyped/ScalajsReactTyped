package typingsJapgolly.cassandraDriver.mod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.protocolVersion")
@js.native
object protocolVersion extends js.Object {
  /* 0x41 */ val dseV1: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion.dseV1 with Double = js.native
  /* 0x42 */ val dseV2: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion.dseV2 with Double = js.native
  /* 0x42 */ val maxSupported: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion.maxSupported with Double = js.native
  /* 0x01 */ val minSupported: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion.minSupported with Double = js.native
  /* 0x01 */ val v1: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion.v1 with Double = js.native
  /* 0x02 */ val v2: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion.v2 with Double = js.native
  /* 0x03 */ val v3: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion.v3 with Double = js.native
  /* 0x04 */ val v4: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion.v4 with Double = js.native
  /* 0x05 */ val v5: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion.v5 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion with Double] = js.native
  def isSupported(version: typingsJapgolly.cassandraDriver.typesMod.types.protocolVersion): Boolean = js.native
}

