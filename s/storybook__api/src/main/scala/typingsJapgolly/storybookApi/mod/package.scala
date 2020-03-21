package typingsJapgolly.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type API = typingsJapgolly.storybookApi.addonsMod.SubAPI with typingsJapgolly.storybookApi.channelMod.SubAPI with typingsJapgolly.storybookApi.initProviderApiMod.SubAPI with typingsJapgolly.storybookApi.storiesMod.SubAPI with typingsJapgolly.storybookApi.layoutMod.SubAPI with typingsJapgolly.storybookApi.notificationsMod.SubAPI with typingsJapgolly.storybookApi.shortcutsMod.SubAPI with typingsJapgolly.storybookApi.versionsMod.SubAPI with typingsJapgolly.storybookApi.urlMod.SubAPI with typingsJapgolly.storybookApi.mod.OtherAPI
  type EventMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.storybookChannels.mod.Listener]
  type OtherAPI = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Props = typingsJapgolly.storybookApi.mod.Children with typingsJapgolly.storybookRouter.routerMod.RenderData with typingsJapgolly.storybookApi.mod.ProviderData with typingsJapgolly.storybookApi.mod.DocsModeData
  type State = typingsJapgolly.storybookApi.mod.Other with typingsJapgolly.storybookApi.layoutMod.SubState with typingsJapgolly.storybookApi.storiesMod.SubState with typingsJapgolly.storybookApi.notificationsMod.SubState with typingsJapgolly.storybookApi.versionsMod.SubState with typingsJapgolly.storybookRouter.routerMod.RenderData with typingsJapgolly.storybookApi.shortcutsMod.SubState
  type StateMerger[S] = js.Function1[/* input */ S, S]
  type SubState = org.scalablytyped.runtime.StringDictionary[js.Any]
}
