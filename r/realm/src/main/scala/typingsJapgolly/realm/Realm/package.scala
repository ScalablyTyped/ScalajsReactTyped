package typingsJapgolly.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Realm {
  type CollectionChangeCallback[T] = js.Function2[
    /* collection */ typingsJapgolly.realm.Realm.Collection[T], 
    /* change */ typingsJapgolly.realm.Realm.CollectionChangeSet, 
    scala.Unit
  ]
  /**
    * A function which can be called to migrate a Realm from one version of the schema to another.
    */
  type MigrationCallback = js.Function2[
    /* oldRealm */ typingsJapgolly.realm.Realm, 
    /* newRealm */ typingsJapgolly.realm.Realm, 
    scala.Unit
  ]
  type ObjectChangeCallback = js.Function2[
    /* object */ typingsJapgolly.realm.Realm.Object, 
    /* changes */ typingsJapgolly.realm.Realm.ObjectChangeSet, 
    scala.Unit
  ]
  // object props type
  type ObjectPropsType = org.scalablytyped.runtime.StringDictionary[js.Any]
  // properties types
  type PropertiesTypes = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.realm.Realm.PropertyType | typingsJapgolly.realm.Realm.ObjectSchemaProperty
  ]
  /**
    * PropertyType
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~PropertyType }
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.realm.realmStrings.bool
    - typingsJapgolly.realm.realmStrings.int
    - typingsJapgolly.realm.realmStrings.float
    - typingsJapgolly.realm.realmStrings.double
    - typingsJapgolly.realm.realmStrings.string
    - typingsJapgolly.realm.realmStrings.data
    - typingsJapgolly.realm.realmStrings.date
    - typingsJapgolly.realm.realmStrings.list
    - typingsJapgolly.realm.realmStrings.linkingObjects
  */
  type PropertyType = typingsJapgolly.realm.Realm._PropertyType | java.lang.String
  /**
    * SortDescriptor
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html#~SortDescriptor }
    */
  type SortDescriptor = js.Array[java.lang.String] | (js.Tuple2[java.lang.String, scala.Boolean])
}
