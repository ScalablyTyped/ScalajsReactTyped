package typingsJapgolly.imperium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Actions = js.Array[java.lang.String] | java.lang.String
  type Context_ = js.Array[
    typingsJapgolly.imperium.imperiumStrings.params | typingsJapgolly.imperium.imperiumStrings.query | typingsJapgolly.imperium.imperiumStrings.headers | typingsJapgolly.imperium.imperiumStrings.body
  ]
  type GetAcl = js.Function1[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    js.Promise[scala.Boolean | js.Object]
  ]
  type RoleParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Roles_ = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.imperium.mod.RoleActions]
}
