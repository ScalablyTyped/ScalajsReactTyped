package typingsJapgolly.fancybox

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyThumbs extends StObject {
  
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.undefined
  
  @JSName("$grid")
  var $grid: js.UndefOr[JQuery] = js.undefined
  
  @JSName("$list")
  var $list: js.UndefOr[JQuery] = js.undefined
  
  def create(): Unit
  
  def focus(duration: Double): Unit
  
  def hide(): Unit
  
  def init(instance: FancyBoxInstance): Unit
  
  var instance: FancyBoxInstance
  
  var isActive: Boolean
  
  var isVisible: Boolean
  
  var opts: FancyThumbsOptions
  
  def show(): Unit
  
  def toggle(): Unit
  
  def update(): Unit
}
object FancyThumbs {
  
  inline def apply(
    create: Callback,
    focus: Double => Callback,
    hide: Callback,
    init: FancyBoxInstance => Callback,
    instance: FancyBoxInstance,
    isActive: Boolean,
    isVisible: Boolean,
    opts: FancyThumbsOptions,
    show: Callback,
    toggle: Callback,
    update: Callback
  ): FancyThumbs = {
    val __obj = js.Dynamic.literal(create = create.toJsFn, focus = js.Any.fromFunction1((t0: Double) => focus(t0).runNow()), hide = hide.toJsFn, init = js.Any.fromFunction1((t0: FancyBoxInstance) => init(t0).runNow()), instance = instance.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], show = show.toJsFn, toggle = toggle.toJsFn, update = update.toJsFn)
    __obj.asInstanceOf[FancyThumbs]
  }
  
  extension [Self <: FancyThumbs](x: Self) {
    
    inline def set$button(value: JQuery): Self = StObject.set(x, "$button", value.asInstanceOf[js.Any])
    
    inline def set$buttonUndefined: Self = StObject.set(x, "$button", js.undefined)
    
    inline def set$grid(value: JQuery): Self = StObject.set(x, "$grid", value.asInstanceOf[js.Any])
    
    inline def set$gridUndefined: Self = StObject.set(x, "$grid", js.undefined)
    
    inline def set$list(value: JQuery): Self = StObject.set(x, "$list", value.asInstanceOf[js.Any])
    
    inline def set$listUndefined: Self = StObject.set(x, "$list", js.undefined)
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setFocus(value: Double => Callback): Self = StObject.set(x, "focus", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setInit(value: FancyBoxInstance => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: FancyBoxInstance) => value(t0).runNow()))
    
    inline def setInstance(value: FancyBoxInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setOpts(value: FancyThumbsOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
