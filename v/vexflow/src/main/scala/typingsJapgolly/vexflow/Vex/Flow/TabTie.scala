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

trait TabTie
  extends StObject
     with StaveTie {
  
  def createHammeron(notes: Firstindices): TabTie
  
  def createPulloff(notes: Firstindices): TabTie
}
object TabTie {
  
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
  ): TabTie = {
    val __obj = js.Dynamic.literal(createHammeron = js.Any.fromFunction1(createHammeron), createPulloff = js.Any.fromFunction1(createPulloff), draw = draw.toJsFn, isPartial = isPartial.toJsFn, renderText = js.Any.fromFunction2((t0: Double, t1: Double) => (renderText(t0, t1)).runNow()), renderTie = js.Any.fromFunction1((t0: Firstxpx) => renderTie(t0).runNow()), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[TabTie]
  }
  
  extension [Self <: TabTie](x: Self) {
    
    inline def setCreateHammeron(value: Firstindices => TabTie): Self = StObject.set(x, "createHammeron", js.Any.fromFunction1(value))
    
    inline def setCreatePulloff(value: Firstindices => TabTie): Self = StObject.set(x, "createPulloff", js.Any.fromFunction1(value))
  }
}
