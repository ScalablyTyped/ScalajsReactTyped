package typingsJapgolly.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wireMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.openfin.wireMod.ExistingConnectConfig
    - typingsJapgolly.openfin.wireMod.NewConnectConfig
    - typingsJapgolly.openfin.wireMod.ExternalConfig
  */
  type ConnectConfig = typingsJapgolly.openfin.wireMod._ConnectConfig | typingsJapgolly.openfin.wireMod.NewConnectConfig
  type InternalConnectConfig = typingsJapgolly.openfin.wireMod.ExistingConnectConfig | typingsJapgolly.openfin.wireMod.NewConnectConfig
  type NewConnectConfig = typingsJapgolly.openfin.wireMod.ConfigWithUuid with typingsJapgolly.openfin.wireMod.ConfigWithRuntime
  type PortDiscoveryConfig = (typingsJapgolly.openfin.wireMod.ExternalConfig with typingsJapgolly.openfin.wireMod.ConfigWithRuntime) | typingsJapgolly.openfin.wireMod.NewConnectConfig
}
