package typingsJapgolly.inquirerNpmName

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.Question
import typingsJapgolly.inquirerNpmName.anon.Prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(name: String, inquirer: Prompt): js.Promise[StringDictionary[String]] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], inquirer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StringDictionary[String]]]
  inline def apply(name: Question[Answers], inquirer: Prompt): js.Promise[StringDictionary[String]] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], inquirer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StringDictionary[String]]]
  
  @JSImport("inquirer-npm-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
