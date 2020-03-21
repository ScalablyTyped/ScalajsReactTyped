package typingsJapgolly.microsoftSdkSoap.mod._Global_.Sdk.Query

import typingsJapgolly.microsoftSdkSoap.mod._Global_.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the OptionSet values to be compared in the query.
  * @param args An array of number values.
  */
@JSGlobal("Sdk.Query.OptionSets")
@js.native
class OptionSets protected () extends ValueBase {
  def this(args: js.Array[Double]) = this()
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  /**
    * Returns an Sdk.Collection of number values.
    */
  def getValues(): Collection[Double] = js.native
  /**
    * Specifies the OptionSet values to be compared in the query.
    * @param setValueArgs An array of number values.
    */
  def setValues(setValueArgs: js.Array[Double]): Unit = js.native
}

