package typingsJapgolly.riot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentEnhancer = js.Function1[
    /* component */ typingsJapgolly.riot.mod.RiotComponent[js.Any, js.Any], 
    typingsJapgolly.riot.mod.RiotComponent[js.Any, js.Any]
  ]
  type InstalledPluginsSet = typingsJapgolly.std.Set[typingsJapgolly.riot.mod.ComponentEnhancer]
  type PureComponentFactoryFunction[InitialProps, Context] = js.Function1[
    /* hasSlotsAttributesProps */ typingsJapgolly.riot.AnonAttributes[InitialProps], 
    typingsJapgolly.riot.mod.RiotPureComponent[Context]
  ]
  type RegisteredComponentsMap = typingsJapgolly.std.Map[
    java.lang.String, 
    js.Function0[typingsJapgolly.riot.mod.RiotComponent[js.Object, js.Object]]
  ]
}
