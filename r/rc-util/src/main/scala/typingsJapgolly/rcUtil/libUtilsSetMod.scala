package typingsJapgolly.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSetMod {
  
  @JSImport("rc-util/lib/utils/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Entity, Output, Value](entity: Entity, paths: js.Array[String | Double], value: Value): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Output]
  inline def default[Entity, Output, Value](entity: Entity, paths: js.Array[String | Double], value: Value, removeIfUndefined: Boolean): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any], removeIfUndefined.asInstanceOf[js.Any])).asInstanceOf[Output]
}
