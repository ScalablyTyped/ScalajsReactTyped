package typingsJapgolly.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object templateMod {
  type DeclareLocalVarCallback = js.Function2[
    /* scope */ typingsJapgolly.angularCompiler.templateMod.BindingScope, 
    /* relativeLevel */ scala.Double, 
    js.Array[typingsJapgolly.angularCompiler.outputAstMod.Statement]
  ]
}
