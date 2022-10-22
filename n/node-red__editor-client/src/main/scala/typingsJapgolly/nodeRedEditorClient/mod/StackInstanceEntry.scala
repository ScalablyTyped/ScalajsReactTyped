package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.nodeRedEditorClient.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackInstanceEntry extends StObject {
  
  def collapse(): js.UndefOr[Boolean]
  
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  var container: JQuery[HTMLDivElement]
  
  var content: JQuery[HTMLDivElement]
  
  var contentWrap: JQuery[HTMLDivElement]
  
  def expand(): js.UndefOr[Boolean]
  
  var header: JQuery[HTMLDivElement]
  
  def isExpanded(): Boolean
  
  var title: JQuery[HTMLDivElement]
  
  def toggle(): Boolean
}
object StackInstanceEntry {
  
  inline def apply(
    collapse: CallbackTo[js.UndefOr[Boolean]],
    container: JQuery[HTMLDivElement],
    content: JQuery[HTMLDivElement],
    contentWrap: JQuery[HTMLDivElement],
    expand: CallbackTo[js.UndefOr[Boolean]],
    header: JQuery[HTMLDivElement],
    isExpanded: CallbackTo[Boolean],
    title: JQuery[HTMLDivElement],
    toggle: CallbackTo[Boolean]
  ): StackInstanceEntry = {
    val __obj = js.Dynamic.literal(collapse = collapse.toJsFn, container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentWrap = contentWrap.asInstanceOf[js.Any], expand = expand.toJsFn, header = header.asInstanceOf[js.Any], isExpanded = isExpanded.toJsFn, title = title.asInstanceOf[js.Any], toggle = toggle.toJsFn)
    __obj.asInstanceOf[StackInstanceEntry]
  }
  
  extension [Self <: StackInstanceEntry](x: Self) {
    
    inline def setCollapse(value: CallbackTo[js.UndefOr[Boolean]]): Self = StObject.set(x, "collapse", value.toJsFn)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setContainer(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContent(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentWrap(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "contentWrap", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: CallbackTo[js.UndefOr[Boolean]]): Self = StObject.set(x, "expand", value.toJsFn)
    
    inline def setHeader(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setIsExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExpanded", value.toJsFn)
    
    inline def setTitle(value: JQuery[HTMLDivElement]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: CallbackTo[Boolean]): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
