package typingsJapgolly.microsoftSdkSoap.mod._Global_.Sdk.Query

import typingsJapgolly.microsoftSdkSoap.mod._Global_.Sdk.Collection
import typingsJapgolly.microsoftSdkSoap.mod._Global_.Sdk.EntityReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the Sdk.EntityReference values to be compared in the query.
  * @param args An array of Sdk.EntityReference values.
  */
@JSGlobal("Sdk.Query.EntityReferences")
@js.native
class EntityReferences protected () extends ValueBase {
  def this(args: js.Array[EntityReference]) = this()
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  /**
    * Returns an Sdk.Collection of Sdk.EntityReference values.
    */
  def getValues(): Collection[Double] = js.native
  /**
    * Specifies the Long values to be compared in the query.
    * @param setValueArgs An array of Sdk.EntityReference values.
    */
  def setValues(setValueArgs: js.Array[EntityReference]): Unit = js.native
}

