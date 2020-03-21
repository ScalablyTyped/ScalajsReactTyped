package typingsJapgolly.dojo.dijit._editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/range.html
  *
  * W3C range API
  * 
  */
trait range_ extends js.Object {
  /**
    * 
    */
  var BlockTagNames: js.RegExp
  /**
    * 
    */
  var ie: js.Object
  /**
    * 
    */
  def W3CRange(): Unit
  /**
    * 
    * @param startnode             
    * @param next             
    */
  def adjacentNoneTextNode(startnode: js.Any, next: js.Any): js.Array[_]
  /**
    * 
    * @param container             
    * @param node             
    * @param offset             
    */
  def atBeginningOfContainer(container: HTMLElement, node: HTMLElement, offset: Double): Boolean
  /**
    * 
    * @param container             
    * @param node             
    * @param offset             
    */
  def atEndOfContainer(container: HTMLElement, node: HTMLElement, offset: Double): Boolean
  /**
    * 
    * @param win               Optional            
    */
  def create(win: Window_): js.Any
  /**
    * 
    * @param node             
    * @param regex               Optional            
    * @param root               Optional            
    */
  def getAncestor(node: HTMLElement, regex: js.RegExp, root: HTMLElement): HTMLElement
  /**
    * 
    * @param node             
    * @param regex               Optional            
    * @param root               Optional            
    */
  def getBlockAncestor(node: HTMLElement, regex: js.RegExp, root: HTMLElement): js.Object
  /**
    * 
    * @param n1             
    * @param n2             
    * @param root             
    */
  def getCommonAncestor(n1: js.Any, n2: js.Any, root: js.Any): js.Any
  /**
    * 
    * @param node             
    * @param parent             
    */
  def getIndex(node: HTMLElement, parent: HTMLElement): js.Object
  /**
    * 
    * @param index             
    * @param parent             
    */
  def getNode(index: js.Array[_], parent: HTMLElement): HTMLElement
  /**
    * 
    * @param window             
    * @param ignoreUpdate               Optional            
    */
  def getSelection(window: Window_, ignoreUpdate: Boolean): js.Any
}

object range_ {
  @scala.inline
  def apply(
    BlockTagNames: js.RegExp,
    W3CRange: Callback,
    adjacentNoneTextNode: (js.Any, js.Any) => CallbackTo[js.Array[js.Any]],
    atBeginningOfContainer: (HTMLElement, HTMLElement, Double) => CallbackTo[Boolean],
    atEndOfContainer: (HTMLElement, HTMLElement, Double) => CallbackTo[Boolean],
    create: Window_ => CallbackTo[js.Any],
    getAncestor: (HTMLElement, js.RegExp, HTMLElement) => CallbackTo[HTMLElement],
    getBlockAncestor: (HTMLElement, js.RegExp, HTMLElement) => CallbackTo[js.Object],
    getCommonAncestor: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    getIndex: (HTMLElement, HTMLElement) => CallbackTo[js.Object],
    getNode: (js.Array[js.Any], HTMLElement) => CallbackTo[HTMLElement],
    getSelection: (Window_, Boolean) => CallbackTo[js.Any],
    ie: js.Object
  ): range_ = {
    val __obj = js.Dynamic.literal(BlockTagNames = BlockTagNames.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any])
    __obj.updateDynamic("W3CRange")(W3CRange.toJsFn)
    __obj.updateDynamic("adjacentNoneTextNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => adjacentNoneTextNode(t0, t1).runNow()))
    __obj.updateDynamic("atBeginningOfContainer")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: org.scalajs.dom.raw.HTMLElement, t2: scala.Double) => atBeginningOfContainer(t0, t1, t2).runNow()))
    __obj.updateDynamic("atEndOfContainer")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: org.scalajs.dom.raw.HTMLElement, t2: scala.Double) => atEndOfContainer(t0, t1, t2).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => create(t0).runNow()))
    __obj.updateDynamic("getAncestor")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: js.RegExp, t2: org.scalajs.dom.raw.HTMLElement) => getAncestor(t0, t1, t2).runNow()))
    __obj.updateDynamic("getBlockAncestor")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: js.RegExp, t2: org.scalajs.dom.raw.HTMLElement) => getBlockAncestor(t0, t1, t2).runNow()))
    __obj.updateDynamic("getCommonAncestor")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => getCommonAncestor(t0, t1, t2).runNow()))
    __obj.updateDynamic("getIndex")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: org.scalajs.dom.raw.HTMLElement) => getIndex(t0, t1).runNow()))
    __obj.updateDynamic("getNode")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: org.scalajs.dom.raw.HTMLElement) => getNode(t0, t1).runNow()))
    __obj.updateDynamic("getSelection")(js.Any.fromFunction2((t0: typingsJapgolly.std.Window_, t1: scala.Boolean) => getSelection(t0, t1).runNow()))
    __obj.asInstanceOf[range_]
  }
}

