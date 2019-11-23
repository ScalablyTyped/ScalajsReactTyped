package typingsJapgolly.atStorybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookApiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.atStorybookApi.Anon_Development
  import typingsJapgolly.atStorybookApi.distModulesAddonsMod.SubAPI
  import typingsJapgolly.atStorybookChannels.atStorybookChannelsMod.Listener
  import typingsJapgolly.atStorybookRouter.distRouterMod.RenderData

  type API = SubAPI with typingsJapgolly.atStorybookApi.distModulesChannelMod.SubAPI with typingsJapgolly.atStorybookApi.distInitDashProviderDashApiMod.SubAPI with typingsJapgolly.atStorybookApi.distModulesStoriesMod.SubAPI with typingsJapgolly.atStorybookApi.distModulesLayoutMod.SubAPI with typingsJapgolly.atStorybookApi.distModulesNotificationsMod.SubAPI with typingsJapgolly.atStorybookApi.distModulesShortcutsMod.SubAPI with typingsJapgolly.atStorybookApi.distModulesVersionsMod.SubAPI with typingsJapgolly.atStorybookApi.distModulesUrlMod.SubAPI with OtherAPI
  type EventMap = StringDictionary[Listener]
  type Module = StoreData with RenderData with ProviderData with Anon_Development
  type OtherAPI = StringDictionary[js.Any]
  type Props = Children with RenderData with ProviderData with DocsModeData
  type State = Other with typingsJapgolly.atStorybookApi.distModulesLayoutMod.SubState with typingsJapgolly.atStorybookApi.distModulesStoriesMod.SubState with typingsJapgolly.atStorybookApi.distModulesNotificationsMod.SubState with typingsJapgolly.atStorybookApi.distModulesVersionsMod.SubState with RenderData with typingsJapgolly.atStorybookApi.distModulesShortcutsMod.SubState
  type StateMerger[S] = js.Function1[/* input */ S, S]
  type SubState = StringDictionary[js.Any]
}
