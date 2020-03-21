package typingsJapgolly.webpackBlocksCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigSetter[T /* <: typingsJapgolly.webpackBlocksCore.mod.Context */] = js.Function2[
    /* context */ T, 
    /* util */ typingsJapgolly.webpackBlocksCore.mod.Util, 
    js.Function1[
      /* config */ typingsJapgolly.webpack.mod.Configuration, 
      typingsJapgolly.webpack.mod.Configuration
    ]
  ]
}
