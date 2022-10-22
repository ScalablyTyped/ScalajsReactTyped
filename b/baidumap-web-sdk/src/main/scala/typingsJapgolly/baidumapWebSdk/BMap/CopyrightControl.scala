package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyrightControl
  extends StObject
     with Control {
  
  def addCopyright(copyright: Copyright): Unit
  
  def getCopyright(id: Double): Copyright
  
  def getCopyrightCollection(): js.Array[Copyright]
  
  def removeCopyright(id: Double): Unit
}
object CopyrightControl {
  
  inline def apply(
    addCopyright: Copyright => japgolly.scalajs.react.Callback,
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: CallbackTo[ControlAnchor],
    getContainer: CallbackTo[js.UndefOr[HTMLElement]],
    getCopyright: Double => Copyright,
    getCopyrightCollection: CallbackTo[js.Array[Copyright]],
    getOffset: CallbackTo[Size],
    hide: japgolly.scalajs.react.Callback,
    initialize: Map => HTMLElement,
    isVisible: CallbackTo[Boolean],
    removeCopyright: Double => japgolly.scalajs.react.Callback,
    setAnchor: ControlAnchor => japgolly.scalajs.react.Callback,
    setOffset: Size => japgolly.scalajs.react.Callback,
    show: japgolly.scalajs.react.Callback
  ): CopyrightControl = {
    val __obj = js.Dynamic.literal(addCopyright = js.Any.fromFunction1((t0: Copyright) => addCopyright(t0).runNow()), defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = getAnchor.toJsFn, getContainer = getContainer.toJsFn, getCopyright = js.Any.fromFunction1(getCopyright), getCopyrightCollection = getCopyrightCollection.toJsFn, getOffset = getOffset.toJsFn, hide = hide.toJsFn, initialize = js.Any.fromFunction1(initialize), isVisible = isVisible.toJsFn, removeCopyright = js.Any.fromFunction1((t0: Double) => removeCopyright(t0).runNow()), setAnchor = js.Any.fromFunction1((t0: ControlAnchor) => setAnchor(t0).runNow()), setOffset = js.Any.fromFunction1((t0: Size) => setOffset(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[CopyrightControl]
  }
  
  extension [Self <: CopyrightControl](x: Self) {
    
    inline def setAddCopyright(value: Copyright => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addCopyright", js.Any.fromFunction1((t0: Copyright) => value(t0).runNow()))
    
    inline def setGetCopyright(value: Double => Copyright): Self = StObject.set(x, "getCopyright", js.Any.fromFunction1(value))
    
    inline def setGetCopyrightCollection(value: CallbackTo[js.Array[Copyright]]): Self = StObject.set(x, "getCopyrightCollection", value.toJsFn)
    
    inline def setRemoveCopyright(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeCopyright", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
