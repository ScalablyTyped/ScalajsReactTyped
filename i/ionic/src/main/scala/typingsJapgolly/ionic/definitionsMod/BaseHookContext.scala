package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.AnonDir
import typingsJapgolly.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHookContext extends js.Object {
  var argv: js.Array[String]
  var env: ProcessEnv
  var project: AnonDir
}

object BaseHookContext {
  @scala.inline
  def apply(argv: js.Array[String], env: ProcessEnv, project: AnonDir): BaseHookContext = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseHookContext]
  }
}

