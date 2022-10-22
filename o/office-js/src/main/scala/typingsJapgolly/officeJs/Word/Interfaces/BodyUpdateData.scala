package typingsJapgolly.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Body object, for use in `body.set({ ... })`. */
trait BodyUpdateData extends StObject {
  
  /**
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontUpdateData] = js.undefined
  
  /**
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typingsJapgolly.officeJs.Word.Style, typingsJapgolly.officeJs.officeJsStrings.Other, typingsJapgolly.officeJs.officeJsStrings.Normal */ Any
  ] = js.undefined
}
object BodyUpdateData {
  
  inline def apply(): BodyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyUpdateData]
  }
  
  extension [Self <: BodyUpdateData](x: Self) {
    
    inline def setFont(value: FontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltIn(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typingsJapgolly.officeJs.Word.Style, typingsJapgolly.officeJs.officeJsStrings.Other, typingsJapgolly.officeJs.officeJsStrings.Normal */ Any
    ): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
