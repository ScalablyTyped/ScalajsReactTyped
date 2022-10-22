package typingsJapgolly.ckeditorCkeditor5Indent

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.IndentEditing
import typingsJapgolly.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.IndentUI
import typingsJapgolly.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.backward
import typingsJapgolly.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.forward
import typingsJapgolly.ckeditorCkeditor5Indent.srcIndenteditingMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Classes extends StObject {
    
    var classes: js.Array[String]
    
    var direction: forward | backward
  }
  object Classes {
    
    inline def apply(classes: js.Array[String], direction: forward | backward): Classes = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes]
    }
    
    extension [Self <: Classes](x: Self) {
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setDirection(value: forward | backward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  trait Direction extends StObject {
    
    var direction: forward | backward
    
    var offset: Double
    
    var unit: String
  }
  object Direction {
    
    inline def apply(direction: forward | backward, offset: Double, unit: String): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    extension [Self <: Direction](x: Self) {
      
      inline def setDirection(value: forward | backward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofIndentEditing
    extends StObject
       with Instantiable0[default] {
    
    val pluginName: IndentEditing = js.native
  }
  
  @js.native
  trait TypeofIndentUI
    extends StObject
       with Instantiable0[typingsJapgolly.ckeditorCkeditor5Indent.srcIndentuiMod.default] {
    
    val pluginName: IndentUI = js.native
  }
}
