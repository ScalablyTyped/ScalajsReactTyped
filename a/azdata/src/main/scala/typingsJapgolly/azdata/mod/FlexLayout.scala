package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexLayout extends StObject {
  
  /**
    * Matches the align-content CSS property.
    */
  var alignContent: js.UndefOr[AlignContentType] = js.undefined
  
  /**
    * Matches the align-items CSS property.
    */
  var alignItems: js.UndefOr[AlignItemsType] = js.undefined
  
  /**
    * Matches the flex-flow CSS property and its available values.
    * To layout as a vertical view use "column", and for horizontal
    * use "row".
    */
  var flexFlow: js.UndefOr[String] = js.undefined
  
  /**
    *  Matches the flex-wrap CSS property.
    */
  var flexWrap: js.UndefOr[FlexWrapType] = js.undefined
  
  /**
    * Container Height
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Matches the justify-content CSS property.
    */
  var justifyContent: js.UndefOr[JustifyContentType] = js.undefined
  
  /**
    * The position CSS property. Empty by default.
    * This is particularly useful if laying out components inside a FlexContainer and
    * the size of the component is meant to be a fixed size. In this case the position must be
    * set to 'absolute', with the parent FlexContainer having 'relative' position.
    * Without this the component will fail to correctly size itself.
    */
  var position: js.UndefOr[PositionType] = js.undefined
  
  /**
    * Matches the text-align CSS property.
    */
  var textAlign: js.UndefOr[TextAlignType] = js.undefined
  
  /**
    * Container Width
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object FlexLayout {
  
  inline def apply(): FlexLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexLayout]
  }
  
  extension [Self <: FlexLayout](x: Self) {
    
    inline def setAlignContent(value: AlignContentType): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    inline def setAlignItems(value: AlignItemsType): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setFlexFlow(value: String): Self = StObject.set(x, "flexFlow", value.asInstanceOf[js.Any])
    
    inline def setFlexFlowUndefined: Self = StObject.set(x, "flexFlow", js.undefined)
    
    inline def setFlexWrap(value: FlexWrapType): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setJustifyContent(value: JustifyContentType): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTextAlign(value: TextAlignType): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
