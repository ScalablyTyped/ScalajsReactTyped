package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesEventMod.Event
import typingsJapgolly.baconjs.typesObservableMod.Property
import typingsJapgolly.baconjs.typesObservableMod.default
import typingsJapgolly.baconjs.typesReplyMod.Reply
import typingsJapgolly.baconjs.typesTypesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMapMod {
  
  @JSImport("baconjs/types/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V, V2](src: typingsJapgolly.baconjs.typesObservableMod.default[V], f: V2): typingsJapgolly.baconjs.typesObservableMod.default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.default[V2]]
  inline def default[V, V2](src: typingsJapgolly.baconjs.typesObservableMod.default[V], f: js.Function1[/* value */ V, V2]): typingsJapgolly.baconjs.typesObservableMod.default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.default[V2]]
  inline def default[V, V2](src: typingsJapgolly.baconjs.typesObservableMod.default[V], f: Property[V2]): typingsJapgolly.baconjs.typesObservableMod.default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.default[V2]]
  
  inline def map[V, V2](src: default[V], f: V2): default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V2]]
  inline def map[V, V2](src: default[V], f: js.Function1[/* value */ V, V2]): default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V2]]
  inline def map[V, V2](src: default[V], f: Property[V2]): default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V2]]
  
  inline def mapT[V, V2](f: V2): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapT")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply]]
  inline def mapT[V, V2](f: js.Function1[/* value */ V, V2]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapT")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply]]
}
