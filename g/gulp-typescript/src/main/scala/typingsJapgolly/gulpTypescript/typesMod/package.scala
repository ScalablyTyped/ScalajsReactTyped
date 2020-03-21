package typingsJapgolly.gulpTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FinalTransformers = js.UndefOr[
    js.Function1[
      /* program */ js.UndefOr[typingsJapgolly.typescript.mod.Program], 
      typingsJapgolly.typescript.mod.CustomTransformers
    ]
  ]
  type GetCustomTransformers = java.lang.String | (js.Function1[
    /* program */ js.UndefOr[typingsJapgolly.typescript.mod.Program], 
    js.UndefOr[typingsJapgolly.typescript.mod.CustomTransformers]
  ])
}
