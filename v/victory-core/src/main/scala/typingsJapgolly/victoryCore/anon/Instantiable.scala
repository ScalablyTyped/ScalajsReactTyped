package typingsJapgolly.victoryCore.anon

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.Record
import typingsJapgolly.victoryCore.esVictoryUtilAddEventsMod.EventMixinCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable[TProps /* <: EventMixinCommonProps */]
  extends StObject
     with Instantiable1[/* props */ TProps, AddGlobalListener[TProps]] {
  
  var animationWhitelist: js.UndefOr[js.Array[String]] = js.native
  
  var expectedComponents: js.UndefOr[js.Array[String]] = js.native
  
  var getBaseProps: js.UndefOr[js.Function1[/* props */ TProps, Record[String, js.Object]]] = js.native
  
  var getChildren: js.UndefOr[
    js.Function3[
      /* props */ TProps, 
      /* childComponents */ js.UndefOr[js.Array[Node]], 
      /* calculatedProps */ js.UndefOr[TProps], 
      Unit
    ]
  ] = js.native
  
  var role: js.UndefOr[String] = js.native
}
