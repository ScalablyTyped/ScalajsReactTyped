package typingsJapgolly.dbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DbJs {
  type ErrorListener = js.Function1[/* err */ js.Error, scala.Unit]
  type IndexAccessibleServer = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.dbJs.DbJs.TypedObjectStoreServer[js.Any]]
  type Server = typingsJapgolly.dbJs.DbJs.IndexAccessibleServer with typingsJapgolly.dbJs.DbJs.ObjectStoreServer with typingsJapgolly.dbJs.DbJs.BaseServer
}
