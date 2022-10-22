package typingsJapgolly.wixStyleReact.anon

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeArray
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoTooltipProps extends StObject {
  
  var align: Requireable[String]
  
  var important: Requireable[Boolean]
  
  var infoTooltipProps: Requireable[InferProps[Any]]
  
  var onCellClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var render: Validator[js.Function1[/* repeated */ Any, Any]]
  
  var sortDescending: Requireable[Boolean]
  
  var sortable: Requireable[Boolean]
  
  var stickyActionCell: Requireable[Boolean]
  
  var style: Requireable[js.Object]
  
  var title: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  
  var width: Requireable[String | Double]
}
object InfoTooltipProps {
  
  inline def apply(
    align: Requireable[String],
    important: Requireable[Boolean],
    infoTooltipProps: Requireable[InferProps[Any]],
    onCellClick: Requireable[js.Function1[/* repeated */ Any, Any]],
    render: Validator[js.Function1[/* repeated */ Any, Any]],
    sortDescending: Requireable[Boolean],
    sortable: Requireable[Boolean],
    stickyActionCell: Requireable[Boolean],
    style: Requireable[js.Object],
    title: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray],
    width: Requireable[String | Double]
  ): InfoTooltipProps = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], important = important.asInstanceOf[js.Any], infoTooltipProps = infoTooltipProps.asInstanceOf[js.Any], onCellClick = onCellClick.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], sortDescending = sortDescending.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], stickyActionCell = stickyActionCell.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoTooltipProps]
  }
  
  extension [Self <: InfoTooltipProps](x: Self) {
    
    inline def setAlign(value: Requireable[String]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setImportant(value: Requireable[Boolean]): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setInfoTooltipProps(value: Requireable[InferProps[Any]]): Self = StObject.set(x, "infoTooltipProps", value.asInstanceOf[js.Any])
    
    inline def setOnCellClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onCellClick", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setSortDescending(value: Requireable[Boolean]): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    
    inline def setSortable(value: Requireable[Boolean]): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setStickyActionCell(value: Requireable[Boolean]): Self = StObject.set(x, "stickyActionCell", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
