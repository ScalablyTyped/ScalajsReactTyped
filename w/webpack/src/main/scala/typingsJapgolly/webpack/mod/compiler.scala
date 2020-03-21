package typingsJapgolly.webpack.mod

import typingsJapgolly.webpack.mod.Compiler_.Handler
import typingsJapgolly.webpack.mod.Stats.ToJsonOptions
import typingsJapgolly.webpack.mod.Stats.ToStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated */
@JSImport("webpack", "compiler")
@js.native
object compiler extends js.Object {
  /** @deprecated use webpack.Compiler.Handler */
  type CompilerCallback = Handler
  /** @deprecated use webpack.Stats.ToJsonOptions */
  type StatsOptions = ToJsonOptions
  /** @deprecated use webpack.Stats.ToStringOptions */
  type StatsToStringOptions = ToStringOptions
  /** @deprecated use webpack.Compiler.WatchOptions */
  type WatchOptions = typingsJapgolly.webpack.mod.Compiler_.WatchOptions
  /** @deprecated use webpack.Compiler.Watching */
  type Watching = typingsJapgolly.webpack.mod.Compiler_.Watching
}

