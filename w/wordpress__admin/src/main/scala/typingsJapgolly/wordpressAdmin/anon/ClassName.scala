package typingsJapgolly.wordpressAdmin.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.lodash.mod.TemplateExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  def hide(): Unit
  
  def initialize(): Unit
  
  var options: Uploader
  
  def ready(): Unit
  
  def refresh(): Unit
  
  def show(): Unit
  
  var tagName: String
  
  def template(): String
  def template(data: js.Object): String
  @JSName("template")
  var template_Original: TemplateExecutor
}
object ClassName {
  
  inline def apply(
    className: String,
    hide: Callback,
    initialize: Callback,
    options: Uploader,
    ready: Callback,
    refresh: Callback,
    show: Callback,
    tagName: String,
    template: TemplateExecutor
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], hide = hide.toJsFn, initialize = initialize.toJsFn, options = options.asInstanceOf[js.Any], ready = ready.toJsFn, refresh = refresh.toJsFn, show = show.toJsFn, tagName = tagName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setInitialize(value: Callback): Self = StObject.set(x, "initialize", value.toJsFn)
    
    inline def setOptions(value: Uploader): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: TemplateExecutor): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
