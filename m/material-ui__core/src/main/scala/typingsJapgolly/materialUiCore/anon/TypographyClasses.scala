package typingsJapgolly.materialUiCore.anon

import typingsJapgolly.materialUiCore.materialUiCoreStrings.always
import typingsJapgolly.materialUiCore.materialUiCoreStrings.hover
import typingsJapgolly.materialUiCore.materialUiCoreStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypographyClasses extends StObject {
  
  var TypographyClasses: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/Typography/Typography.TypographyProps<'span', {}>['classes'] */ js.Any
  ] = js.undefined
  
  var underline: js.UndefOr[none | hover | always] = js.undefined
}
object TypographyClasses {
  
  inline def apply(): TypographyClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyClasses]
  }
  
  extension [Self <: TypographyClasses](x: Self) {
    
    inline def setTypographyClasses(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/Typography/Typography.TypographyProps<'span', {}>['classes'] */ js.Any
    ): Self = StObject.set(x, "TypographyClasses", value.asInstanceOf[js.Any])
    
    inline def setTypographyClassesUndefined: Self = StObject.set(x, "TypographyClasses", js.undefined)
    
    inline def setUnderline(value: none | hover | always): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
