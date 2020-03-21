package typingsJapgolly.reduxLittleRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlockCallback = js.Function2[
    /* location */ typingsJapgolly.reduxLittleRouter.mod.Location, 
    /* action */ js.UndefOr[typingsJapgolly.reduxLittleRouter.mod.HistoryAction], 
    java.lang.String
  ]
  type Href = java.lang.String | typingsJapgolly.reduxLittleRouter.mod.Location
  type ListenCallback = js.Function2[
    /* location */ typingsJapgolly.reduxLittleRouter.mod.Location, 
    /* action */ js.UndefOr[typingsJapgolly.reduxLittleRouter.mod.HistoryAction], 
    scala.Unit
  ]
  type ObjectLiteral[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Params = typingsJapgolly.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]
  type Query = typingsJapgolly.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]
  type Routes = typingsJapgolly.reduxLittleRouter.mod.ObjectLiteral[typingsJapgolly.reduxLittleRouter.mod.ObjectLiteral[js.Any]]
  type Unsubscribe = js.Function0[scala.Unit]
}
