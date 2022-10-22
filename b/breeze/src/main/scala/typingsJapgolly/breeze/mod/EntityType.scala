package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.breeze.EntityTypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "EntityType")
@js.native
open class EntityType protected ()
  extends StObject
     with typingsJapgolly.breeze.breeze.EntityType {
  def this(config: EntityTypeOptions) = this()
  def this(config: typingsJapgolly.breeze.breeze.MetadataStore) = this()
  
  /* CompleteClass */
  var complexProperties: js.Array[typingsJapgolly.breeze.breeze.DataProperty] = js.native
  
  /* CompleteClass */
  var custom: Any = js.native
  
  /* CompleteClass */
  var dataProperties: js.Array[typingsJapgolly.breeze.breeze.DataProperty] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var namespace: String = js.native
  
  /* CompleteClass */
  var shortName: String = js.native
  
  /* CompleteClass */
  var unmappedProperties: js.Array[typingsJapgolly.breeze.breeze.DataProperty] = js.native
  
  /* CompleteClass */
  var validators: js.Array[typingsJapgolly.breeze.breeze.Validator] = js.native
}
