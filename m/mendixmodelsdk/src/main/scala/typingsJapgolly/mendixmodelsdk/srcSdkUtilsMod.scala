package typingsJapgolly.mendixmodelsdk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkUtilsMod {
  
  object utils {
    
    @JSImport("mendixmodelsdk/src/sdk/utils", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def assertNotNull[T](value: T, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotNull")(value.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def assertNotNull[T](value: T, propertyName: String, listy: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotNull")(value.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], listy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Combines the given `parts` and returns them as an URL, avoiding duplicate slashes.
      */
    inline def combineUrl(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("combineUrl")(parts.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    /**
      * Flattens an array of arrays of items of type `T`, returning a single array
      * that consists of the concatenation of the original arrays.
      */
    inline def flatten[T](array: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
    
    inline def isObject(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Generates a random UUID to set the ID of an element or unit to.
      * There is no intrinsic ID collision detection/avoidance mechanism but it's good enough in practice.
      */
    inline def randomUuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUuid")().asInstanceOf[String]
    
    inline def removeFromArray[T](list: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFromArray")(list.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def shallowEquals(first: js.Array[Any], second: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEquals")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    type IMap[T] = StringDictionary[T]
  }
}
