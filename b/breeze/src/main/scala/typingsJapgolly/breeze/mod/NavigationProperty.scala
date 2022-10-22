package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.breeze.NavigationPropertyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "NavigationProperty")
@js.native
open class NavigationProperty protected ()
  extends StObject
     with typingsJapgolly.breeze.breeze.NavigationProperty {
  def this(config: NavigationPropertyOptions) = this()
  
  /* CompleteClass */
  var associationName: String = js.native
  
  /* CompleteClass */
  var custom: Any = js.native
  
  /* CompleteClass */
  var displayName: String = js.native
  
  /* CompleteClass */
  var entityType: typingsJapgolly.breeze.breeze.EntityType = js.native
  
  /* CompleteClass */
  var entityTypeName: String = js.native
  
  /* CompleteClass */
  var foreignKeyNames: js.Array[String] = js.native
  
  /* CompleteClass */
  var foreignKeyNamesOnServer: js.Array[String] = js.native
  
  /* CompleteClass */
  var inverse: typingsJapgolly.breeze.breeze.NavigationProperty = js.native
  
  /* CompleteClass */
  var isDataProperty: Boolean = js.native
  
  /* CompleteClass */
  var isNavigationProperty: Boolean = js.native
  
  /* CompleteClass */
  var isScalar: Boolean = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var nameOnServer: String = js.native
  
  /* CompleteClass */
  var parentType: typingsJapgolly.breeze.breeze.EntityType | typingsJapgolly.breeze.breeze.ComplexType = js.native
  
  /* CompleteClass */
  var relatedDataProperties: js.Array[typingsJapgolly.breeze.breeze.DataProperty] = js.native
  
  /* CompleteClass */
  var validators: js.Array[typingsJapgolly.breeze.breeze.Validator] = js.native
}
