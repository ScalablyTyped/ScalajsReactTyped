package typingsJapgolly.tokenizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Action = js.ThisFunction3[
    /* this */ typingsJapgolly.tokenizr.mod.ActionContext, 
    /* ctx */ typingsJapgolly.tokenizr.mod.ActionContext, 
    /* found */ typingsJapgolly.std.RegExpExecArray, 
    /* rule */ typingsJapgolly.tokenizr.AnonAction, 
    scala.Unit
  ]
  type IToken[T] = typingsJapgolly.tokenizr.mod.Token[T]
  type RuleAction = js.ThisFunction2[
    /* this */ typingsJapgolly.tokenizr.mod.ActionContext, 
    /* ctx */ typingsJapgolly.tokenizr.mod.ActionContext, 
    /* found */ typingsJapgolly.std.RegExpExecArray, 
    scala.Unit
  ]
}
