package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesEventMod.Event
import typingsJapgolly.baconjs.typesObservableMod.default
import typingsJapgolly.baconjs.typesPredicateMod.Predicate
import typingsJapgolly.baconjs.typesPredicateMod.PredicateOrProperty
import typingsJapgolly.baconjs.typesReplyMod.Reply
import typingsJapgolly.baconjs.typesTypesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSkipwhileMod {
  
  @JSImport("baconjs/types/skipwhile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](src: typingsJapgolly.baconjs.typesObservableMod.default[V], f: PredicateOrProperty[V]): typingsJapgolly.baconjs.typesObservableMod.default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.default[V]]
  
  inline def skipWhile[V](src: default[V], f: PredicateOrProperty[V]): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V]]
  
  inline def skipWhileT[V](f: Predicate[V]): js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhileT")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply]]
}
