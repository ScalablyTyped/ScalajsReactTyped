package typingsJapgolly.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  type EndpointsConfig = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.dockerode.mod.EndpointSettings]
  type MountConfig = js.Array[typingsJapgolly.dockerode.mod.MountSettings]
  type NetworkStats = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.dockerode.AnonRxbytes]
  type PluginInspectInfo = typingsJapgolly.dockerode.mod.PluginInfo
  type PortMap = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.dockerode.mod.PortBinding]]
}
