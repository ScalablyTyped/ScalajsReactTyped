package typingsJapgolly.dojo.dijit._editor.range

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/range.ie.html
  *
  * 
  */
trait ie extends js.Object {
  /**
    * 
    */
  var cachedSelection: js.Object
  /**
    * 
    * @param range             
    */
  def decomposeControlRange(range: js.Any): js.Array[_]
  /**
    * 
    * @param range             
    */
  def decomposeTextRange(range: js.Any): js.Array[_]
  /**
    * 
    * @param range             
    * @param end             
    */
  def getEndPoint(range: js.Any, end: js.Any): js.Array[_]
  /**
    * 
    * @param window             
    */
  def selection(window: js.Any): Unit
  /**
    * 
    * @param range             
    * @param container             
    * @param offset             
    */
  def setEndPoint(range: js.Any, container: js.Any, offset: js.Any): js.Any
  /**
    * 
    * @param range             
    * @param startContainer             
    * @param startOffset             
    * @param endContainer             
    * @param endOffset             
    * @param collapsed             
    */
  def setRange(
    range: js.Any,
    startContainer: js.Any,
    startOffset: js.Any,
    endContainer: js.Any,
    endOffset: js.Any,
    collapsed: js.Any
  ): js.Any
}

object ie {
  @scala.inline
  def apply(
    cachedSelection: js.Object,
    decomposeControlRange: js.Any => CallbackTo[js.Array[js.Any]],
    decomposeTextRange: js.Any => CallbackTo[js.Array[js.Any]],
    getEndPoint: (js.Any, js.Any) => CallbackTo[js.Array[js.Any]],
    selection: js.Any => Callback,
    setEndPoint: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    setRange: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Any]
  ): ie = {
    val __obj = js.Dynamic.literal(cachedSelection = cachedSelection.asInstanceOf[js.Any])
    __obj.updateDynamic("decomposeControlRange")(js.Any.fromFunction1((t0: js.Any) => decomposeControlRange(t0).runNow()))
    __obj.updateDynamic("decomposeTextRange")(js.Any.fromFunction1((t0: js.Any) => decomposeTextRange(t0).runNow()))
    __obj.updateDynamic("getEndPoint")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getEndPoint(t0, t1).runNow()))
    __obj.updateDynamic("selection")(js.Any.fromFunction1((t0: js.Any) => selection(t0).runNow()))
    __obj.updateDynamic("setEndPoint")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => setEndPoint(t0, t1, t2).runNow()))
    __obj.updateDynamic("setRange")(js.Any.fromFunction6((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any, t5: js.Any) => setRange(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[ie]
  }
}

