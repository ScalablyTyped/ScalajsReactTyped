package typingsJapgolly.postmanCollection.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.postmanCollection.anon.Created
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.VariableScopeDefinition because var conflicts: description, disabled, id, name. Inlined values */ @JSImport("postman-collection", "VariableScope")
@js.native
open class VariableScope protected () extends Property[VariableScopeDefinition] {
  def this(definition: js.Array[VariableDefinition]) = this()
  def this(definition: VariableList) = this()
  def this(definition: VariableScopeDefinition) = this()
  def this(definition: js.Array[VariableDefinition], layers: js.Array[VariableList]) = this()
  def this(definition: js.Array[VariableDefinition], layers: VariableList) = this()
  def this(definition: VariableList, layers: js.Array[VariableList]) = this()
  def this(definition: VariableList, layers: VariableList) = this()
  def this(definition: VariableScopeDefinition, layers: js.Array[VariableList]) = this()
  def this(definition: VariableScopeDefinition, layers: VariableList) = this()
  
  def addLayer(list: VariableList): Unit = js.native
  
  def clear(): Unit = js.native
  
  def get(key: String): Any = js.native
  
  def has(variableName: String): Boolean = js.native
  
  def set(key: String, value: Any, `type`: String): Unit = js.native
  
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition]): js.UndefOr[Created] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Boolean): js.UndefOr[Created] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Boolean, prune: Boolean): js.UndefOr[Created] = js.native
  def syncVariablesFrom(obj: StringDictionary[VariableDefinition], track: Unit, prune: Boolean): js.UndefOr[Created] = js.native
  
  def syncVariablesTo(): StringDictionary[VariableDefinition] = js.native
  def syncVariablesTo(obj: StringDictionary[VariableDefinition]): StringDictionary[VariableDefinition] = js.native
  
  def toObject(excludeDisabled: Boolean, caseSensitive: Boolean): Any = js.native
  
  def unset(key: String): Unit = js.native
  
  var values: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  def variables(): StringDictionary[VariableDefinition] = js.native
}
/* static members */
object VariableScope {
  
  @JSImport("postman-collection", "VariableScope")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isVariableScope(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableScope")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
