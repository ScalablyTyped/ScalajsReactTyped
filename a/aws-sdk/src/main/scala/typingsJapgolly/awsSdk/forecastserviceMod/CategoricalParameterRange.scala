package typingsJapgolly.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoricalParameterRange extends js.Object {
  /**
    * The name of the categorical hyperparameter to tune.
    */
  var Name: typingsJapgolly.awsSdk.forecastserviceMod.Name = js.native
  /**
    * A list of the tunable categories for the hyperparameter.
    */
  var Values: typingsJapgolly.awsSdk.forecastserviceMod.Values = js.native
}

object CategoricalParameterRange {
  @scala.inline
  def apply(Name: Name, Values: Values): CategoricalParameterRange = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CategoricalParameterRange]
  }
}

