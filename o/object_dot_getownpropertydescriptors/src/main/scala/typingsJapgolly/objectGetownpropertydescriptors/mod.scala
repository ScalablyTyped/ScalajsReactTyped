package typingsJapgolly.objectGetownpropertydescriptors

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns an object containing all own property descriptors of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  inline def apply[T](o: T): (/* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof T ]: std.TypedPropertyDescriptor<T[P]>} */ js.Any) & StringDictionary[js.PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof T ]: std.TypedPropertyDescriptor<T[P]>} */ js.Any) & StringDictionary[js.PropertyDescriptor]]
  
  @JSImport("object.getownpropertydescriptors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPolyfill(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getOwnPropertyDescriptors */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfill")().asInstanceOf[ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getOwnPropertyDescriptors */ js.Any
    ]
  ]]
  
  inline def implementation[T](o: T): (/* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof T ]: std.TypedPropertyDescriptor<T[P]>} */ js.Any) & StringDictionary[js.PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(o.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof T ]: std.TypedPropertyDescriptor<T[P]>} */ js.Any) & StringDictionary[js.PropertyDescriptor]]
  
  inline def shim(): ReturnType[
    js.Function0[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPolyfill */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shim")().asInstanceOf[ReturnType[
    js.Function0[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPolyfill */ js.Any
      ]
    ]
  ]]
}
