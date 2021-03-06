package typingsJapgolly.microsoftSdkSoap.mod._Global_.Sdk.Query

import typingsJapgolly.microsoftSdkSoap.mod._Global_.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the Decimal values to be compared in the query.
  * @param args An array of Decimal values.
  */
@JSGlobal("Sdk.Query.Decimals")
@js.native
class Decimals protected () extends ValueBase {
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
    * Specifies the Decimal values to be compared in the query.
    * @param setValueArgs An array of number values.
    */
  def setValues(setValueArgs: js.Array[Double]): Unit = js.native
}

