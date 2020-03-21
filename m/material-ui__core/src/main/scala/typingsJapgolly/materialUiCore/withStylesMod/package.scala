package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withStylesMod {
  type ClassNameMap[ClassKey /* <: java.lang.String */] = typingsJapgolly.std.Record[ClassKey, java.lang.String]
  type StyleRules[ClassKey /* <: java.lang.String */] = typingsJapgolly.std.Record[ClassKey, typingsJapgolly.materialUiCore.withStylesMod.CSSProperties]
  type StyleRulesCallback[ClassKey /* <: java.lang.String */] = js.Function1[
    /* theme */ typingsJapgolly.materialUiCore.createMuiThemeMod.Theme, 
    typingsJapgolly.materialUiCore.withStylesMod.StyleRules[ClassKey]
  ]
}
