package typingsJapgolly.inquirerNpmName

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.Inquirer
import typingsJapgolly.inquirer.mod.Question
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inquirer-npm-name", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(name: String, inquirer: Inquirer): js.Promise[StringDictionary[String]] = js.native
  def apply(name: Question[Answers], inquirer: Inquirer): js.Promise[StringDictionary[String]] = js.native
}

