package typingsJapgolly.emberData.mod.default

import typingsJapgolly.ember.mod.Ember.Array
import typingsJapgolly.ember.mod.default.ComputedProperty
import typingsJapgolly.emberData.mod.DS.Async
import typingsJapgolly.emberData.mod.DS.RelationshipOptions
import typingsJapgolly.emberData.mod.DS.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "hasMany")
@js.native
object hasMany extends js.Object {
  def apply[K /* <: String */](`type`: K): ComputedProperty[
    typingsJapgolly.emberData.mod.DS.PromiseManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    Array[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
  /**
    * `DS.hasMany` is used to define One-To-Many and Many-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  def apply[K /* <: String */](
    `type`: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with Sync with Async
  ): ComputedProperty[
    typingsJapgolly.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typingsJapgolly.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
}

