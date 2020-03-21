package typingsJapgolly.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamicMod {
  type LoadableComponent[P] = typingsJapgolly.react.mod.ComponentType[P]
  type LoadableFn[P] = js.Function1[
    /* opts */ typingsJapgolly.nextServer.dynamicMod.LoadableOptions[P], 
    typingsJapgolly.react.mod.ComponentType[P]
  ]
  type Loader[P] = js.Function0[typingsJapgolly.nextServer.dynamicMod.LoaderComponent[P]] | typingsJapgolly.nextServer.dynamicMod.LoaderComponent[P]
  type LoaderComponent[P] = js.Promise[
    typingsJapgolly.react.mod.ComponentType[P] | typingsJapgolly.nextServer.AnonDefault[P]
  ]
  type LoaderMap = org.scalablytyped.runtime.StringDictionary[js.Function0[typingsJapgolly.nextServer.dynamicMod.Loader[js.Any]]]
}
