package typingsJapgolly.commangular.commangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Command creation configuration
	 * see http://commangular.org/docs/#the-command-config-object
	 */
trait ICommandConfig extends js.Object {
  /**
  		 * This property instruct commangular to keep the value returned by the command in the value
  		 * key passed in 'resultKey'. It has to be a string. It means that after the execution of this
  		 * commands you will be able to inject on the next command using that key and the result of the command will be injected.
  		 */
  var resultKey: String
}

object ICommandConfig {
  @scala.inline
  def apply(resultKey: String): ICommandConfig = {
    val __obj = js.Dynamic.literal(resultKey = resultKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICommandConfig]
  }
}

