package typingsJapgolly.shelljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExecCallback = js.Function3[
    /* code */ scala.Double, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    js.Any
  ]
  type ShellArray = js.Array[java.lang.String] with typingsJapgolly.shelljs.mod.ShellReturnValue
  type ShellString = java.lang.String with typingsJapgolly.shelljs.mod.ShellReturnValue
}
