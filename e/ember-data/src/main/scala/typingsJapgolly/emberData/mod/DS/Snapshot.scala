package typingsJapgolly.emberData.mod.DS

import typingsJapgolly.emberData.Anon0
import typingsJapgolly.emberData.AnonId
import typingsJapgolly.emberData.AnonIds
import typingsJapgolly.emberData.mod.AttributeMeta
import typingsJapgolly.emberData.mod.AttributesFor
import typingsJapgolly.emberData.mod.ModelKeys
import typingsJapgolly.emberData.mod.RelationshipMeta
import typingsJapgolly.emberData.mod.RelationshipsFor
import typingsJapgolly.emberData.registriesModelMod.ModelRegistry
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "DS.Snapshot")
@js.native
class Snapshot[K /* <: String */] () extends js.Object {
  /**
    * The id of the snapshot's underlying record
    */
  var id: String = js.native
  /**
    * The name of the type of the underlying record for this snapshot, as a string.
    */
  var modelName: K = js.native
  /**
    * The underlying record for this snapshot. Can be used to access methods and
    * properties defined on the record.
    */
  var record: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
  /**
    * The type of the underlying record for this snapshot, as a DS.Model.
    */
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
  /**
    * Returns the value of an attribute.
    */
  def attr[L /* <: AttributesFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L): /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K][L] */ js.Any = js.native
  /**
    * Returns all attributes and their corresponding values.
    */
  def attributes(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ L in keyof ember-data.ember-data/types/registries/model.ModelRegistry[K] ]: ember-data.ember-data/types/registries/model.ModelRegistry[K][L]}
    */ typingsJapgolly.emberData.emberDataStrings.Snapshot with ModelRegistry = js.native
  /**
    * Returns the current value of a belongsTo relationship.
    */
  def belongsTo[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L): js.UndefOr[Snapshot[_] | Null] = js.native
  def belongsTo[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L, options: js.Object): js.UndefOr[Snapshot[_] | Null] = js.native
  def belongsTo[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L, options: AnonId): js.UndefOr[String | Null] = js.native
  /**
    * Returns all changed attributes and their old and new values.
    */
  def changedAttributes(): Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ L in keyof ember-data.ember-data/types/registries/model.ModelRegistry[K] ]: ember-data.ember-data/types/registries/model.ModelRegistry[K][L]}
    */ typingsJapgolly.emberData.emberDataStrings.Snapshot with ModelRegistry
  ] = js.native
  /**
    * Iterates through all the attributes of the model, calling the passed
    * function on each attribute.
    */
  def eachAttribute[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](callback: js.Function2[/* key */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit]): Unit = js.native
  def eachAttribute[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](
    callback: js.Function2[/* key */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit],
    binding: js.Object
  ): Unit = js.native
  /**
    * Iterates through all the relationships of the model, calling the passed
    * function on each relationship.
    */
  def eachRelationship[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](callback: js.Function2[/* key */ ModelKeys[M], /* meta */ RelationshipMeta[M], Unit]): Unit = js.native
  def eachRelationship[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](
    callback: js.Function2[/* key */ ModelKeys[M], /* meta */ RelationshipMeta[M], Unit],
    binding: js.Object
  ): Unit = js.native
  /**
    * Returns the current value of a hasMany relationship.
    */
  def hasMany[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L): js.UndefOr[js.Array[Snapshot[_]]] = js.native
  def hasMany[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L, options: Anon0): js.UndefOr[js.Array[String]] = js.native
  def hasMany[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L, options: AnonIds): js.UndefOr[js.Array[Snapshot[_]]] = js.native
  /**
    * Serializes the snapshot using the serializer for the model.
    */
  def serialize[O /* <: js.Object */](options: O): js.Object = js.native
}

