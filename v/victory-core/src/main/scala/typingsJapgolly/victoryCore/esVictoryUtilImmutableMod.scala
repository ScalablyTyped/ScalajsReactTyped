package typingsJapgolly.victoryCore

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilImmutableMod {
  
  @JSImport("victory-core/es/victory-util/immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es/victory-util/immutable", "IMMUTABLE_ITERABLE")
  @js.native
  val IMMUTABLE_ITERABLE: /* "@@__IMMUTABLE_ITERABLE__@@" */ String = js.native
  
  @JSImport("victory-core/es/victory-util/immutable", "IMMUTABLE_LIST")
  @js.native
  val IMMUTABLE_LIST: /* "@@__IMMUTABLE_LIST__@@" */ String = js.native
  
  @JSImport("victory-core/es/victory-util/immutable", "IMMUTABLE_MAP")
  @js.native
  val IMMUTABLE_MAP: /* "@@__IMMUTABLE_MAP__@@" */ String = js.native
  
  @JSImport("victory-core/es/victory-util/immutable", "IMMUTABLE_RECORD")
  @js.native
  val IMMUTABLE_RECORD: /* "@@__IMMUTABLE_RECORD__@@" */ String = js.native
  
  inline def isImmutable(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIterable(x: Any): /* is victory-core.victory-core/es/victory-util/immutable-types.Iterable<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is victory-core.victory-core/es/victory-util/immutable-types.Iterable<unknown, unknown> */ Boolean]
  
  inline def isList(x: Any): /* is victory-core.victory-core/es/victory-util/immutable-types.List<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isList")(x.asInstanceOf[js.Any]).asInstanceOf[/* is victory-core.victory-core/es/victory-util/immutable-types.List<unknown> */ Boolean]
  
  inline def isMap(x: Any): /* is victory-core.victory-core/es/victory-util/immutable-types.Map<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(x.asInstanceOf[js.Any]).asInstanceOf[/* is victory-core.victory-core/es/victory-util/immutable-types.Map<unknown, unknown> */ Boolean]
  
  inline def isRecord(x: Any): /* is std.Record<string, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecord")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, unknown> */ Boolean]
  
  inline def shallowToJS(x: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowToJS")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def shallowToJS(x: Any, whitelist: Record[String, Boolean | Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowToJS")(x.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[Any]
}
