package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetResponseFiles extends js.Object {
  @JSName("hello_world.py")
  var hello_worldDotpy: GistsGetResponseFilesHelloWorldPy
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsGetResponseFilesHelloWorldRb
  @JSName("hello_world_python.txt")
  var hello_world_pythonDottxt: GistsGetResponseFilesHelloWorldPythonTxt
  @JSName("hello_world_ruby.txt")
  var hello_world_rubyDottxt: GistsGetResponseFilesHelloWorldRubyTxt
}

object GistsGetResponseFiles {
  @scala.inline
  def apply(
    hello_worldDotpy: GistsGetResponseFilesHelloWorldPy,
    hello_worldDotrb: GistsGetResponseFilesHelloWorldRb,
    hello_world_pythonDottxt: GistsGetResponseFilesHelloWorldPythonTxt,
    hello_world_rubyDottxt: GistsGetResponseFilesHelloWorldRubyTxt
  ): GistsGetResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.py")(hello_worldDotpy.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_python.txt")(hello_world_pythonDottxt.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_ruby.txt")(hello_world_rubyDottxt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetResponseFiles]
  }
}

