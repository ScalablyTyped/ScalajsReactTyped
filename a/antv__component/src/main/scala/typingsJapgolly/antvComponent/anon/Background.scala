package typingsJapgolly.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var animate: Boolean
  
  var animateOption: Appear
  
  var background: Any
  
  var capture: Boolean
  
  var container: Any
  
  var events: Any
  
  var group: Any
  
  var id: String
  
  var isInit: Boolean
  
  var isRegister: Boolean
  
  var isUpdating: Boolean
  
  /**
    * 布局方式： horizontal，vertical
    * @type {String}
    */
  var layout: String
  
  var locationType: String
  
  var name: String
  
  var offsetX: Double
  
  var offsetY: Double
  
  var title: Any
  
  var `type`: String
  
  var updateAutoRender: Boolean
  
  var visible: Boolean
  
  var x: Double
  
  var y: Double
}
object Background {
  
  inline def apply(
    animate: Boolean,
    animateOption: Appear,
    background: Any,
    capture: Boolean,
    container: Any,
    events: Any,
    group: Any,
    id: String,
    isInit: Boolean,
    isRegister: Boolean,
    isUpdating: Boolean,
    layout: String,
    locationType: String,
    name: String,
    offsetX: Double,
    offsetY: Double,
    title: Any,
    `type`: String,
    updateAutoRender: Boolean,
    visible: Boolean,
    x: Double,
    y: Double
  ): Background = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isInit = isInit.asInstanceOf[js.Any], isRegister = isRegister.asInstanceOf[js.Any], isUpdating = isUpdating.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  extension [Self <: Background](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateOption(value: Appear): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: Any): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsInit(value: Boolean): Self = StObject.set(x, "isInit", value.asInstanceOf[js.Any])
    
    inline def setIsRegister(value: Boolean): Self = StObject.set(x, "isRegister", value.asInstanceOf[js.Any])
    
    inline def setIsUpdating(value: Boolean): Self = StObject.set(x, "isUpdating", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateAutoRender(value: Boolean): Self = StObject.set(x, "updateAutoRender", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
