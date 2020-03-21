package typingsJapgolly.apolloEngineReporting.agentMod

import typingsJapgolly.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloEngineReporting.AnonOnlyNames
  - typingsJapgolly.apolloEngineReporting.AnonExceptNames
  - typingsJapgolly.apolloEngineReporting.AnonAll
  - typingsJapgolly.apolloEngineReporting.AnonNone
*/
trait SendValuesBaseOptions extends VariableValueOptions

object SendValuesBaseOptions {
  @scala.inline
  def AnonOnlyNames(onlyNames: js.Array[String]): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
  @scala.inline
  def AnonExceptNames(exceptNames: js.Array[String]): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
  @scala.inline
  def AnonAll(all: `true`): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
  @scala.inline
  def AnonNone(none: `true`): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
}

