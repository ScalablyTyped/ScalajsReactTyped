package typingsJapgolly.gulpSassVariables

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gulpSassVariables.mod.GulpSassVariables.VariableDefinitions
import typingsJapgolly.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-sass-variables", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(variables: VariableDefinitions): ReadWriteStream = js.native
  @js.native
  object GulpSassVariables extends js.Object {
    type VariableDefinitions = StringDictionary[js.Any]
  }
  
}

