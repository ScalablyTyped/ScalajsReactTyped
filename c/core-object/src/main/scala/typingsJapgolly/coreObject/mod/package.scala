package typingsJapgolly.coreObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** The type of options allowed to be passed to `Base.extend()` */
  type ExtendOptions[Base] = typingsJapgolly.coreObject.coreObjectStrings.ExtendOptions with Base with (typingsJapgolly.std.Record[java.lang.String, _])
  /** The `this` type for any methods on the options passed to `Base.extend()` */
  type ExtendThisType[Base, Ext] = typingsJapgolly.std.ThisType[
    (typingsJapgolly.coreObject.utilsMod.Mix[Base, Ext]) with typingsJapgolly.coreObject.AnonSuper[Base]
  ]
}
