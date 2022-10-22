package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.breeze.Entity
import typingsJapgolly.breeze.breeze.IProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "PropertyChangedEventArgs")
@js.native
open class PropertyChangedEventArgs ()
  extends StObject
     with typingsJapgolly.breeze.breeze.PropertyChangedEventArgs {
  
  /* CompleteClass */
  var entity: Entity = js.native
  
  /* CompleteClass */
  var newValue: Any = js.native
  
  /* CompleteClass */
  var oldValue: Any = js.native
  
  /* CompleteClass */
  var parent: Any = js.native
  
  /* CompleteClass */
  var property: IProperty = js.native
  
  /* CompleteClass */
  var propertyName: String = js.native
}
