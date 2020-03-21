package typingsJapgolly.postmanCollection.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.postmanCollection.AnonCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.VariableScopeDefinition because var conflicts: description, disabled, id, name. Inlined values */ @JSImport("postman-collection", "VariableScope")
@js.native
class VariableScope protected () extends Property[VariableScopeDefinition] {
  def this(definition: js.Array[VariableDefinition]) = this()
  def this(definition: VariableList) = this()
  def this(definition: VariableScopeDefinition) = this()
  def this(definition: js.Array[VariableDefinition], layers: js.Array[VariableList]) = this()
  def this(definition: js.Array[VariableDefinition], layers: VariableList) = this()
  def this(definition: VariableList, layers: js.Array[VariableList]) = this()
  def this(definition: VariableList, layers: VariableList) = this()
  def this(definition: VariableScopeDefinition, layers: js.Array[VariableList]) = this()
  def this(definition: VariableScopeDefinition, layers: VariableList) = this()
  var values: js.UndefOr[js.Array[VariableDefinition]] = js.native
  def addLayer(list: VariableList): Unit = js.native
  def clear(): Unit = js.native
  def get(key: String): js.Any = js.native
  def has(variableName: String): Boolean = js.native
  def set(key: String, value: js.Any, `type`: String): Unit = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition]): js.UndefOr[AnonCreated] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Boolean): js.UndefOr[AnonCreated] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Boolean, prune: Boolean): js.UndefOr[AnonCreated] = js.native
  def syncVariablesTo(): StringDictionary[VariableDefinition] = js.native
  def syncVariablesTo(obj: StringDictionary[VariableDefinition]): StringDictionary[VariableDefinition] = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Boolean): js.Any = js.native
  def unset(key: String): Unit = js.native
  def variables(): StringDictionary[VariableDefinition] = js.native
}

/* static members */
@JSImport("postman-collection", "VariableScope")
@js.native
object VariableScope extends js.Object {
  def isVariableScope(obj: js.Any): Boolean = js.native
}

