package typingsJapgolly.wixUiCore.anon

import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompId extends StObject {
  
  var checked: Requireable[Boolean]
  
  var children: Requireable[ReactNodeLike]
  
  var className: Requireable[String]
  
  var compId: Requireable[String]
  
  var label: Requireable[String]
  
  var link: Requireable[String]
  
  var onChange: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var rel: Requireable[String]
  
  var tagIndex: Requireable[Double]
  
  var value: Requireable[String]
}
object CompId {
  
  inline def apply(
    checked: Requireable[Boolean],
    children: Requireable[ReactNodeLike],
    className: Requireable[String],
    compId: Requireable[String],
    label: Requireable[String],
    link: Requireable[String],
    onChange: Requireable[js.Function1[/* repeated */ Any, Any]],
    rel: Requireable[String],
    tagIndex: Requireable[Double],
    value: Requireable[String]
  ): CompId = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], compId = compId.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], tagIndex = tagIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompId]
  }
  
  extension [Self <: CompId](x: Self) {
    
    inline def setChecked(value: Requireable[Boolean]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCompId(value: Requireable[String]): Self = StObject.set(x, "compId", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Requireable[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setRel(value: Requireable[String]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setTagIndex(value: Requireable[Double]): Self = StObject.set(x, "tagIndex", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Requireable[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
