package typingsJapgolly.postmanCollection.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.postmanCollection.AnonCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "Collection")
@js.native
class Collection () extends ItemGroup[Item] {
  def this(definition: CollectionDefinition) = this()
  def this(definition: CollectionDefinition, environments: js.Array[_]) = this()
  var variables: VariableList = js.native
  var version: js.UndefOr[Version] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition]): js.UndefOr[AnonCreated] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Boolean): js.UndefOr[AnonCreated] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Boolean, prune: Boolean): js.UndefOr[AnonCreated] = js.native
  def syncVariablesTo(): StringDictionary[VariableDefinition] = js.native
  def syncVariablesTo(obj: StringDictionary[VariableDefinition]): StringDictionary[VariableDefinition] = js.native
}

/* static members */
@JSImport("postman-collection", "Collection")
@js.native
object Collection extends js.Object {
  def isCollection(obj: js.Any): Boolean = js.native
}

