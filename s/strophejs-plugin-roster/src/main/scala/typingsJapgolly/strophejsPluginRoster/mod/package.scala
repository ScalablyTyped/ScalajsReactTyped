package typingsJapgolly.strophejsPluginRoster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IqCallback = js.Function1[/* stanza */ org.scalajs.dom.raw.Element, js.Any]
  type IqID = java.lang.String
  type PresenceRequestCallback = js.Function1[/* from */ java.lang.String, js.Any]
  type RosterUpdateCallback = js.Function3[
    /* items */ js.Array[typingsJapgolly.strophejsPluginRoster.mod.RosterItem], 
    /* item */ typingsJapgolly.strophejsPluginRoster.mod.RosterItem, 
    /* previousItem */ typingsJapgolly.strophejsPluginRoster.mod.RosterItem, 
    js.Any
  ]
}
