package typingsJapgolly.objectGetownpropertydescriptors

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.objectGetownpropertydescriptors.objectGetownpropertydescriptorsStrings.^
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object.getownpropertydescriptors", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Returns an object containing all own property descriptors of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  def apply[T](o: T): ^  with T with StringDictionary[js.PropertyDescriptor] = js.native
  def getPolyfill(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getOwnPropertyDescriptors */ js.Any
    ]
  ] = js.native
  def shim(): ReturnType[
    js.Function0[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPolyfill */ js.Any
      ]
    ]
  ] = js.native
  @js.native
  object implementation extends js.Object {
    def apply[T](o: T): typingsJapgolly.objectGetownpropertydescriptors.objectGetownpropertydescriptorsStrings.implementation with T with StringDictionary[js.PropertyDescriptor] = js.native
  }
  
}

