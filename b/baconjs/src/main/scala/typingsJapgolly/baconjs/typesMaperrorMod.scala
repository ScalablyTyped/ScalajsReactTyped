package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesTransformMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMaperrorMod {
  
  @JSImport("baconjs/types/maperror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](f: V): Transformer[V, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[Transformer[V, V]]
  inline def default[V](f: js.Function1[/* error */ Any, V]): Transformer[V, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[Transformer[V, V]]
}
