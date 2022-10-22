package typingsJapgolly.antvUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashGroupByMod {
  
  @JSImport("@antv/util/lib/lodash/group-by", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](data: js.Array[T], condition: String): ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  inline def default[T](data: js.Array[T], condition: js.Function1[/* item */ T, String]): ObjectType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[ObjectType[T]]
  
  type ObjectType[T] = StringDictionary[js.Array[T]]
}
