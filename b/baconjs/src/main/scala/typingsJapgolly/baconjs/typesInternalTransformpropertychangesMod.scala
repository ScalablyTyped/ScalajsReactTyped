package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesDescribeMod.Desc
import typingsJapgolly.baconjs.typesObservableMod.Property
import typingsJapgolly.baconjs.typesTypesMod.EventStreamDelay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalTransformpropertychangesMod {
  
  @JSImport("baconjs/types/internal/transformpropertychanges", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](property: Property[V], f: EventStreamDelay[V], desc: Desc): Property[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(property.asInstanceOf[js.Any], f.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[Property[V]]
}
