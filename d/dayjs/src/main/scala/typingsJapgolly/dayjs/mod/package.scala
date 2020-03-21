package typingsJapgolly.dayjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigType = java.lang.String | scala.Double | js.Date | typingsJapgolly.dayjs.mod.Dayjs
  type OptionType = typingsJapgolly.dayjs.AnonFormat | java.lang.String
  type PluginFunc = js.Function3[
    /* option */ js.Any, 
    /* c */ org.scalablytyped.runtime.Instantiable1[
      js.UndefOr[/* config */ typingsJapgolly.dayjs.mod.ConfigType], 
      typingsJapgolly.dayjs.mod.Dayjs
    ], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dayjs */ /* d */ js.Any, 
    scala.Unit
  ]
}
