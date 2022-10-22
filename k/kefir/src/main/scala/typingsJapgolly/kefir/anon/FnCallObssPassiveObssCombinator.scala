package typingsJapgolly.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallObssPassiveObssCombinator extends StObject {
  
  def apply[T, S, U](obss: js.Array[typingsJapgolly.kefir.mod.Observable[T, S]]): typingsJapgolly.kefir.mod.Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typingsJapgolly.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typingsJapgolly.kefir.mod.Observable[T, S]]
  ): typingsJapgolly.kefir.mod.Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typingsJapgolly.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typingsJapgolly.kefir.mod.Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): typingsJapgolly.kefir.mod.Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typingsJapgolly.kefir.mod.Observable[T, S]],
    passiveObss: Unit,
    combinator: js.Function1[/* repeated */ T, U]
  ): typingsJapgolly.kefir.mod.Observable[U, S] = js.native
}
