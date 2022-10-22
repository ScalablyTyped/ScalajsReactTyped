package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Family
import typingsJapgolly.vexflow.anon.Firstindices
import typingsJapgolly.vexflow.anon.Firstxpx
import typingsJapgolly.vexflow.anon.Lastindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabSlide
  extends StObject
     with TabTie
object TabSlide {
  
  inline def apply(
    createHammeron: Firstindices => TabTie,
    createPulloff: Firstindices => TabTie,
    draw: CallbackTo[Boolean],
    isPartial: CallbackTo[Boolean],
    renderText: (Double, Double) => Callback,
    renderTie: Firstxpx => Callback,
    setContext: IRenderContext => StaveTie,
    setFont: Family => StaveTie,
    setNotes: Lastindices => StaveTie
  ): TabSlide = {
    val __obj = js.Dynamic.literal(createHammeron = js.Any.fromFunction1(createHammeron), createPulloff = js.Any.fromFunction1(createPulloff), draw = draw.toJsFn, isPartial = isPartial.toJsFn, renderText = js.Any.fromFunction2((t0: Double, t1: Double) => (renderText(t0, t1)).runNow()), renderTie = js.Any.fromFunction1((t0: Firstxpx) => renderTie(t0).runNow()), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[TabSlide]
  }
}
